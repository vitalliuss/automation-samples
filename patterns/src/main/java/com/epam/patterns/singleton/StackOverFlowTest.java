package com.epam.patterns.singleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class StackOverFlowTest {

    @Test
    public void testStackOverFlow() {
        WebDriver driver  = WebDriverSingleton.getWebDriverInstance();
        driver.navigate().to("http://www.stackoverflow.com");
    }
}
