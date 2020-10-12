package org.nhsbsa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {

    private WebDriver driver = null;

    @FindBy(id = "next-button")
    private WebElement btnStart;


    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void start(){
        btnStart.click();
    }

    public void openURL(){
        driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
    }

}
