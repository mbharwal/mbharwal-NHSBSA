package org.nhsbsa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniversalCreditClaimPage {

    private WebDriver driver = null;

    @FindBy(id = "label-yes")
    private WebElement yes;

    @FindBy(id = "label-no")
    private WebElement no;

    @FindBy(id = "next-button")
    private WebElement btnStart;

    public UniversalCreditClaimPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseClaim(boolean claim){
        if(claim)
            yes.click();
        else
            no.click();
        btnStart.click();
    }
}
