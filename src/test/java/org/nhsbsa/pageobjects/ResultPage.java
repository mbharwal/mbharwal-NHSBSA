package org.nhsbsa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

    private WebDriver driver = null;

    @FindBy(className = "done-panel")
    private WebElement donePanel;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isResultsPageDisplayed(){
        return donePanel.isDisplayed();
    }
}
