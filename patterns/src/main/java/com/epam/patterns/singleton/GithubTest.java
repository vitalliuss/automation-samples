package com.epam.patterns.singleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class GithubTest {

    @Test
    public void testGithub() {
        WebDriver driver  = WebDriverSingleton.getWebDriverInstance();
        driver.navigate().to("http://www.github.com");
    }
}
