package com.epam.automation.tests;

import com.epam.automation.pages.HomePage;
import com.epam.automation.pages.SignInPage;
import com.epam.automation.pages.StartPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 */
public class PageFactoryTest {

    private final String USERNAME = "testautomationuser";
    private final String PASSWORD = "Time4Death!";

    @Test
    public void testOneCanLoginGithub(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        StartPage startPage = new StartPage(driver);
        startPage.open();
        SignInPage signInPage = startPage.invokeSignIn();
        HomePage homePage = signInPage.signIn(USERNAME, PASSWORD);
        String loggedInUserName = homePage.getLoggedInUserName();
        Assert.assertEquals(USERNAME, loggedInUserName);
        driver.quit();
    }
}
