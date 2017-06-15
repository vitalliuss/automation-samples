package com.epam.automation.specials;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vitali_Shulha on 14-Jun-17.
 */

@Listeners(ScreenshotOnFailListener.class)
public class ScreenshotTest {
    private static final String USERNAME = "testautomationuser";

    @Test
    public void oneCanTakeScreenshotOnFailureTest() {
        WebDriver driver = DriverSingletone.getWebDriverInstance();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.github.com/");
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(USERNAME);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Time4Death!");
        driver.findElement(By.xpath("//WRONG_LOCATOR']")).click();
        String loggedInUserName = driver.findElement(By.xpath("//button[@aria-label='Switch account context']/span")).getText();
        System.out.println(loggedInUserName);
        org.junit.Assert.assertEquals(USERNAME, loggedInUserName);
        DriverSingletone.closeWebBrowser();
    }
}