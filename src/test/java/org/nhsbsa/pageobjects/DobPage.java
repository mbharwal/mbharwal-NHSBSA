package org.nhsbsa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DobPage {

    private WebDriver driver = null;

    @FindBy(id = "dob-day")
    private WebElement day;

    @FindBy(id = "dob-month")
    private WebElement month;

    @FindBy(id = "dob-year")
    private WebElement year;

    @FindBy(id = "next-button")
    private WebElement btnStart;

    public DobPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseDob(){
        day.sendKeys("31");
        month.sendKeys("07");
        year.sendKeys("1961");
        btnStart.click();
    }

}
