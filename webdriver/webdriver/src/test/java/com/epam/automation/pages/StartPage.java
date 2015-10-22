package com.epam.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 */
public class StartPage {

    @FindBy(xpath = "//a[text()='Sign in']")
    private WebElement buttonSignIn;

    public static final String BASE_URL = "http://www.github.com";
    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public SignInPage invokeSignIn() {
        buttonSignIn.click();
        return new SignInPage(driver);
    }
}
