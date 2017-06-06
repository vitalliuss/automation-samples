package com.epam.patterns.factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class FirefoxDriverCreator extends WebDriverCreator {


    @Override
    public WebDriver factoryMethod() {
        System.setProperty("webdriver.gecko.driver", ".//src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
