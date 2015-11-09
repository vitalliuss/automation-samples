package com.epam.patterns.factorymethod;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class GithubTest {

    @Test
    public void testGithub(){

        WebDriverCreator creator = new ChromeDriverCreator();
        WebDriver driver = creator.factoryMethod();
        driver.navigate().to("http://www.github.com/");
    }
}
