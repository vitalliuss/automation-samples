package com.epam.automation.specials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Vitali_Shulha on 14-Jun-17.
 */
public class DriverSingletone {
    private static WebDriver driver;

    private DriverSingletone() {}

    public static WebDriver getWebDriverInstance() {
        if (null == driver) {
            System.setProperty("webdriver.gecko.driver", ".//src/test/resources/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void closeWebBrowser(){
        if (null != driver){
            driver.quit();
        }
        driver = null;
    }
}
