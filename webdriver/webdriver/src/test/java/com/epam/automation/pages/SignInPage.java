package com.epam.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 */
public class SignInPage {

    @FindBy(id = "login_field")
    private WebElement inputLogin;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement buttonSubmit;

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage signIn(String username, String password){
        inputLogin.sendKeys(username);
        inputPassword.sendKeys(password);
        buttonSubmit.click();
        return new HomePage(driver);
    }
}
