package com.automation.commons;

import com.automation.utils.DriverUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logIn extends DriverUtils {
    @Before
    public void setUp(){
        CreateDriver("https://www.saucedemo.com/");
    }

    @Test
    public void logIn() throws InterruptedException {
        WebDriver driver=getDriver();
        WebElement userName= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement login= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();
        Thread.sleep(2000);
    }
    @After
    public void cleanUp(){
            quitDriver();
    }

}
