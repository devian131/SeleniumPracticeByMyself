package com.automation.commons;

import com.automation.utils.DriverUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserSynchronization extends DriverUtils {
    @Before
    public void setUp()  {
        CreateDriver("https://demoqa.com/progress-bar");


    }
    @After
    public void cleanUp(){
        quitDriver();
    }
    @Test
    public void learnWaits()  {
        WebDriver driver=getDriver();
        WebElement startButton= getDriver().findElement(By.cssSelector("#startStopButton"));
        WebElement progressBar= driver.findElement(By.cssSelector("#progressBar div.progress-bar"));
        WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(30));
        startButton.click();
        driverWait.until(ExpectedConditions.textToBePresentInElement(progressBar,"100%"));
        Assert.assertTrue("Value does not match", progressBar.getText().contains("100"));



    }

}
