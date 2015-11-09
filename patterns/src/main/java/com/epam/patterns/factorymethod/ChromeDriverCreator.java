package com.epam.patterns.factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public class ChromeDriverCreator extends WebDriverCreator{

    public static final String PATH_TO_CHROMEDRIVER = "d:\\drivers\\chromedriver.exe";

    @Override
    public WebDriver factoryMethod() {
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(
                new File(PATH_TO_CHROMEDRIVER)).build();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = new ChromeDriver(service);
        return driver;
    }
}
