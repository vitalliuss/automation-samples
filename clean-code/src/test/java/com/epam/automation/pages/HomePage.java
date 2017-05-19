package com.epam.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 */
public class HomePage {

    public static final String GITHUB_BASE_URL = "http://www.github.com";

    @FindBy(xpath = "//button[@aria-label='Switch account context']/span")
    private WebElement linkLoggedInUser;

    private final WebDriver driver;

    /*
    Constructor
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getLoggedInUserName() {
        return linkLoggedInUser.getText();
    }

    public Integer hasUserLoggedIn(){
        if (linkLoggedInUser.getText() != ""){
            return 1;
        }
        else{
            return -1;
        }
    }
}
