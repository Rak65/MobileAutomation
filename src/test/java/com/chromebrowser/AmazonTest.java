package com.chromebrowser;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonTest {
    public AndroidDriver androidDriver;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("appPackage","com.android.chrome");
        desiredCapabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
        desiredCapabilities.setCapability("platformVersion","9.0");
        androidDriver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        androidDriver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
        androidDriver.findElement(By.id("com.android.chrome:id/negative_button")).click();
    }
    @Test
    public void searchProductOnAmazon(){
        WebElement searchAmazon = androidDriver.findElement(By.id("com.android.chrome:id/url_bar"));
        searchAmazon.sendKeys("https://www.amazon.in/");
        WebElement searchItem= androidDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchItem.sendKeys("Laptop");
        WebElement search= androidDriver.findElement(By.xpath("//input[@type='submit']"));
        search.click();
    }
}