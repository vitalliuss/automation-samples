package com.epam.patterns.decorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class CustomDriverTest {

    @Test
    public void testCustomDriver(){
        WebDriver driver = new FirefoxDriver();
        driver = new Decorator(driver);
        driver.navigate().to("http://www.github.com/");
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
    }
}
