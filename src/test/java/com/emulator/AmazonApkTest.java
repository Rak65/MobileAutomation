package com.emulator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AmazonApkTest {
    public AndroidDriver androidDriver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        desiredCapabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
        desiredCapabilities.setCapability("platformVersion", "9.0");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void searchMobile() throws InterruptedException {
        androidDriver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();
        Thread.sleep(5000);
        androidDriver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view")).click();
        Thread.sleep(5000);
        WebElement searchbox = androidDriver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
        searchbox.sendKeys("Laptop");
        androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(5000);
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[9]/android.view.View[4]/android.view.View[4]/android.view.View")).click();
    }
}