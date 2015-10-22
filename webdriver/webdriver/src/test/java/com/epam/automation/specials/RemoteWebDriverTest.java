package com.epam.automation.specials;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 * @see "https://github.com/SeleniumHQ/selenium/wiki/Grid2"
 */
public class RemoteWebDriverTest {

    private final String SO = "http://www.stackoverflow.com";
    private final String HUB = "http://localhost:4444/wd/hub";

    @Test
    public void oneCanExecuteRemoteTest() throws MalformedURLException
    {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("firefox");
        dc.setPlatform(Platform.WINDOWS);

        WebDriver driver = new RemoteWebDriver(new URL(HUB), dc);

        driver.get(SO);
        driver.findElement(By.id("nav-users")).click();

    }
}
