package com.emulator;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AlarmTest {
    public AndroidDriver androidDriver;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("appPackage","com.google.android.deskclock");
        desiredCapabilities.setCapability("appActivity","com.android.deskclock.DeskClock");
        desiredCapabilities.setCapability("platformVersion","9.0");
        androidDriver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
    }
    @Test
    public void setAlarm(){
        WebElement alarm=androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/za[1]/android.widget.TextView"));
        alarm.click();
        WebElement clickOnTime= androidDriver.findElement(By.id("com.google.android.deskclock:id/digital_clock"));
        clickOnTime.click();
        WebElement selectHour= androidDriver.findElement(new AppiumBy.ByAccessibilityId("6"));
        selectHour.click();
        WebElement selectMin= androidDriver.findElement(new AppiumBy.ByAccessibilityId("30"));
        selectMin.click();
        WebElement setPm= androidDriver.findElement(By.id("android:id/pm_label"));
        setPm.click();
        WebElement setAm= androidDriver.findElement(By.id("android:id/am_label"));
        setAm.click();
        WebElement clickOk= androidDriver.findElement(By.id("android:id/button1"));
        clickOk.click();
        WebElement selectDay= androidDriver.findElement(new AppiumBy.ByAccessibilityId("Saturday"));
        selectDay.click();
    }
}
