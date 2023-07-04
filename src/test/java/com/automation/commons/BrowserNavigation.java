package com.automation.commons;

import com.automation.utils.DriverUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BrowserNavigation extends DriverUtils {
    @Test
    public void learnBrowserNavigation() throws InterruptedException {
        WebDriver driver=getDriver();
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(5000);
    }
    @Before
    public void setUp()  {
        CreateDriver("https://www.saucedemo.com/");
    }
    @After
    public void cleanUp(){
        quitDriver();
    }



}
