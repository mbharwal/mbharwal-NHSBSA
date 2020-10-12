package org.nhsbsa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniversalCreditPaidPage {

    private WebDriver driver = null;

    @FindBy(css = "[for='yes-universal']")
    private WebElement yesUniversal;

    @FindBy(css = "[for='not-yet']")
    private WebElement notYet;

    @FindBy(css = "[for='different-benefit']")
    private WebElement diffBenefit;

    @FindBy(id = "next-button")
    private WebElement btnStart;

    public UniversalCreditPaidPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseCredit(String credit){
        switch (credit){
            case "UNIVERSAL":
                yesUniversal.click();
                break;
            case "NOTYET":
                notYet.click();
                break;
            default:
                diffBenefit.click();
                break;
        }
        btnStart.click();
    }
}
