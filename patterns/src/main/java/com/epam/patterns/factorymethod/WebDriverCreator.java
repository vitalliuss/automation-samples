package com.epam.patterns.factorymethod;

import org.openqa.selenium.WebDriver;

/**
 * Created by Vitali_Shulha on 5/27/2015.
 */
public abstract class WebDriverCreator {

    protected WebDriver driver;

    public abstract WebDriver factoryMethod();
}
