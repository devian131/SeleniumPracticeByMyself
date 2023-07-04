package com.automation.commons;

import com.automation.utils.DriverUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DayTwo  extends DriverUtils {

        @Before
        public void setUp(){
            CreateDriver("https://www.saucedemo.com/");
        }

        @Test
        public void login() throws InterruptedException {

            WebDriver driver=getDriver();
            WebElement usernameInput= driver.findElement(By.id("user-name"));
            WebElement passwordInput= driver.findElement(By.id("password"));
            WebElement loginButton= driver.findElement(By.id("login-button"));
            //Login
            usernameInput.sendKeys("standard_user");
            passwordInput.sendKeys("secret_sauce");
            loginButton.click();
            Thread.sleep(500);
            //We are on the product page -
            WebElement productPageTitle= driver.findElement(By.className("title"));
            Assert.assertTrue("Not on product page", productPageTitle.isDisplayed());
            Thread.sleep(500);

            List<WebElement> inventoryItemsDescriptions= driver.findElements(By.className("inventory_item_desc"));
            for(WebElement webElement :inventoryItemsDescriptions){
                System.out.println(webElement.getText());
                System.out.println("===========");
            }



        }




        @After
        public void cleanUp(){
            quitDriver();
        }
    }


