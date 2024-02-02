package com.mobileCalculator;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileCalculatorTest {
    public AndroidDriver androidDriver;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid","1496de41");
        desiredCapabilities.setCapability("deviceName","Redmi Note 7S");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("appPackage","com.miui.calculator");
        desiredCapabilities.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
        desiredCapabilities.setCapability("platformVersion","10.0");
        androidDriver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
    }
    @Test
    public void additionMethod(){
        WebElement firstElement = androidDriver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("plus"));
        plusElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.miui.calculator:id/btn_3_s"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("equals"));
        equalElement.click();
    }
    @Test
    public void substractionMethod(){
        WebElement firstElement = androidDriver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("minus"));
        plusElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.miui.calculator:id/btn_3_s"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("equals"));
        equalElement.click();
    }
    @Test
    public void multiplicationMethod(){
        WebElement firstElement = androidDriver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("multiply"));
        plusElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.miui.calculator:id/btn_3_s"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("equals"));
        equalElement.click();
    }
    @Test
    public void divisionMethod(){
        WebElement firstElement = androidDriver.findElement(By.id("com.miui.calculator:id/btn_8_s"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("divide"));
        plusElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("equals"));
        equalElement.click();
    }
    @AfterMethod
    public void tearDown(){
        androidDriver.quit();
    }
}
