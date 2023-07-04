package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverUtils {
    private static WebDriver driver;
    public void CreateDriver(String url){
        System.setProperty("webdriver.chrome.driver","src/test/java/com/automation/driver/chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(co);//object of the interface
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        driver.manage().window().maximize();
    }
    public void quitDriver(){
        driver.close();
        
    }
    public WebDriver getDriver(){return driver;}
}
