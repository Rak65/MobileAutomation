package com.emulator;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {
    public AndroidDriver androidDriver;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("appPackage","com.android.calculator2");
        desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("platformVersion","9.0");
        androidDriver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
    }
    @Test
    public void additionMethod(){
        WebElement firstElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_5"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(By.id("com.android.calculator2:id/op_add"));
        plusElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_3"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(By.id("com.android.calculator2:id/eq"));
        equalElement.click();
    }
    @Test
    public void substractionMethod(){
        WebElement firstElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_5"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(By.id("com.android.calculator2:id/op_sub"));
        plusElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_3"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(By.id("com.android.calculator2:id/eq"));
        equalElement.click();
    }
    @Test
    public void multiplicationMethod(){
        WebElement firstElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_5"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(By.id("com.android.calculator2:id/op_mul"));
        plusElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_3"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(By.id("com.android.calculator2:id/eq"));
        equalElement.click();
    }
    @Test
    public void divisionMethod(){
        WebElement firstElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_15"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(By.id("com.android.calculator2:id/op_div"));
        plusElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_3"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(By.id("com.android.calculator2:id/eq"));
        equalElement.click();
    }
    @AfterMethod
    public void tearDown(){
        androidDriver.quit();
    }
}
