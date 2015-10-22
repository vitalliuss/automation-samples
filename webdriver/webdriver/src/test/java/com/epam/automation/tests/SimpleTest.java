package com.epam.automation.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleTest {

    private static final String USERNAME = "testautomationuser";

    @Test
    public void testOneCanLoginGithub(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.github.com/");
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(USERNAME);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Time4Death!");
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        String loggedInUserName = driver.findElement(By.xpath("//button[@aria-label='Switch account context']/span")).getText();
        System.out.println(loggedInUserName);
        Assert.assertEquals(USERNAME, loggedInUserName);
        driver.quit();
    }
}
