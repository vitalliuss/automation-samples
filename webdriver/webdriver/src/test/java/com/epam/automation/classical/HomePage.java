package com.epam.automation.classical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 */
public class HomePage {

    private final By linkLoggedInUserLocator = By.xpath("//button[@aria-label='Switch account context']/span");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoggedInUserName() {
        return driver.findElement(linkLoggedInUserLocator).getText();
    }
}
