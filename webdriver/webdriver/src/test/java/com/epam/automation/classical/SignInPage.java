package com.epam.automation.classical;

import com.epam.automation.classical.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 */
public class SignInPage {

    private final By inputLoginLocator = By.id("login_field");

    private final By inputPasswordLocator = By.id("password");

    private final By buttonSubmitLocator = By.xpath("//input[@value='Sign in']");

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public com.epam.automation.classical.HomePage signIn(String username, String password){
        driver.findElement(inputLoginLocator).sendKeys(username);
        driver.findElement(inputPasswordLocator).sendKeys(password);
        driver.findElement(buttonSubmitLocator).click();
        return new HomePage(driver);
    }
}
