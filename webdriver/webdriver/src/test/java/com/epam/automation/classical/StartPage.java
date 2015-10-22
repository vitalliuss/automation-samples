package com.epam.automation.classical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 */
public class StartPage {


    private final By buttonSignInLocator = By.xpath("//a[text()='Sign in']");

    public static final String BASE_URL = "http://www.github.com";
    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public com.epam.automation.classical.SignInPage invokeSignIn() {
        driver.findElement(buttonSignInLocator).click();
        return new SignInPage(driver);
    }
}
