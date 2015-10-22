package com.epam.automation.specials;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vitali_Shulha on 22-Oct-15.
 */
public class ActionsTest {

    private final String DRAG_AND_DROP_PAGE = "http://luke.breuer.com/tutorial/javascript-drag-and-drop-tutorial.aspx";

    @Test
    public void oneCanDragAndDrop()
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(DRAG_AND_DROP_PAGE);

        WebElement source = driver.findElement(By.xpath("//img[@alt='drag image']"));
        WebElement target = driver.findElement(By.xpath("//h3[text()='Introduction']"));

        highlightElement(driver, source);
        highlightElement(driver, target);

        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.dragAndDrop(source, target).build();
        dragAndDrop.perform();

        highlightElement(driver, source);
        highlightElement(driver, target);

    }

    private void highlightElement(WebDriver driver, WebElement element)
    {
        String bg = element.getCssValue("backgroundColor");
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + "yellow" + "'", element);
        sleep(2000); // just for demo
        js.executeScript("arguments[0].style.backgroundColor = '" + bg + "'", element);
    }

    public void sleep(int millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
