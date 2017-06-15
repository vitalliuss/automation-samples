package com.epam.automation.tests;


import com.epam.automation.classical.StartPage;
import com.epam.automation.classical.SignInPage;
import com.epam.automation.classical.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 */
public class PageObjectTest {

    private final String USERNAME = "testautomationuser";
    private final String PASSWORD = "Time4Death!";

    @Test
    public void testOneCanLoginGithub(){
        System.setProperty("webdriver.gecko.driver", ".//src/test/resources/geckodriver.exe");
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
