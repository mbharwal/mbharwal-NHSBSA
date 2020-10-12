package org.nhsbsa.stepdefs;

import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;
import org.nhsbsa.driverutil.DriverFactory;
import org.nhsbsa.pageobjects.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StepDefs implements En {

    private WebDriver driver;
    StartPage startPage;
    LocationPage locationPage;
    DobPage dobPage;
    PartnerPage partnerPage;
    ClaimPage claimPage;
    UniversalCreditPaidPage universalCreditPaidPage;
    UniversalCreditClaimPage universalCreditClaimPage;
    CreditTakeHomePage creditTakeHomePage;
    ResultPage resultPage;

    public StepDefs() {
        Before((Scenario scenario) -> {
            driver = DriverFactory.getBrowser();
            startPage = new StartPage(driver);
            locationPage = new LocationPage(driver);
            dobPage = new DobPage(driver);
            partnerPage = new PartnerPage(driver);
            claimPage = new ClaimPage(driver);
            universalCreditPaidPage = new UniversalCreditPaidPage(driver);
            universalCreditClaimPage = new UniversalCreditClaimPage(driver);
            creditTakeHomePage = new CreditTakeHomePage(driver);
            resultPage = new ResultPage(driver);
        });

        Given("^I am a person from Wales$", () -> {
            startPage.openURL();
            startPage.start();
            locationPage.chooseLocation();
        });

        When("I put my circumstances into the Checker tool with partner {string}", (String string) -> {
            boolean b = Boolean.parseBoolean(string);
            dobPage.chooseDob();
            partnerPage.chooseRelation(b);
            claimPage.chooseClaim(true);
            universalCreditPaidPage.chooseCredit("UNIVERSAL");
            universalCreditClaimPage.chooseClaim(true);
            creditTakeHomePage.chooseTakeHome(true);
        });


        Then("^I should get a  result of whether I will get help or not$", () -> {
            Assert.assertTrue(resultPage.isResultsPageDisplayed());
        });

        After((Scenario scenario) -> {
            driver.quit();
        });
    }
}
