package com.epam.patterns.decorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class CustomDriverTest {

    @Test
    public void testCustomDriver(){
        System.setProperty("webdriver.gecko.driver", ".//src/main/resources/geckodriver.exe");
        WebDriver firefoxDriver = new FirefoxDriver();

        WebDriver decoratedDriver = new Decorator(firefoxDriver);
        decoratedDriver.navigate().to("http://www.github.com/");
        decoratedDriver.findElement(By.xpath("//a[text()='Sign in']")).click();
    }
}
