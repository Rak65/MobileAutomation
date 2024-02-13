package com.emulator;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FlipkartSearchAndBuyApkTest {
    AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("appPackage", "com.flipkart.android");
        capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public void selectLanguageAndContinue() throws InterruptedException {
        Thread.sleep(6000);
        WebElement  languageSelect = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView[1]"));
        languageSelect.click();
        Thread.sleep(3000);
        WebElement procced = driver.findElement(By.id("com.flipkart.android:id/select_btn"));
        procced.click();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void skipLogin() throws InterruptedException {
        Thread.sleep(3000);
        WebElement cutButton = driver.findElement(By.id("com.flipkart.android:id/custom_back_icon"));
        cutButton.click();
        Thread.sleep(8000);
    }
    @Test(priority = 3)
    public void searchProduct() throws InterruptedException {
        Thread.sleep(8000);
        WebElement clickSearchField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]"));
        clickSearchField.click();
        Thread.sleep(3000);
        WebElement enterProductName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText"));
        enterProductName.sendKeys("Puma");
        Thread.sleep(3000);
        WebElement select = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]"));
        select.click();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void allowLocation() throws InterruptedException {
        WebElement allowLocation = driver.findElement(By.id("com.flipkart.android:id/allow_button"));
        allowLocation.click();
        Thread.sleep(2000);
        WebElement allow = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
        allow.click();
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void selectProduct() throws InterruptedException {
        WebElement selectShoes = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView"));
        selectShoes.click();
        Thread.sleep(3000);
    }
    @Test(priority = 6)
    public void buyProduct() throws InterruptedException {
        Thread.sleep(3000);
        WebElement buyNow = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
        buyNow.click();
        Thread.sleep(3000);
        WebElement shoeSize = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup"));
        shoeSize.click();
        Thread.sleep(5000);
        WebElement continueToBuy = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup"));
        continueToBuy.click();
        Thread.sleep(3000);
        TouchAction touch = new TouchAction(driver);
        touch.tap(PointOption.point(663,2032));
        Thread.sleep(1000);
        touch.tap(PointOption.point(396,2181));
        Thread.sleep(1000);
        touch.tap(PointOption.point(128,1727));
        Thread.sleep(1000);
        touch.tap(PointOption.point(128,1727));
        Thread.sleep(1000);
        touch.tap(PointOption.point(390,2032));
        Thread.sleep(1000);
        touch.tap(PointOption.point(396,1727));
        Thread.sleep(1000);
        touch.tap(PointOption.point(134,1882));
        Thread.sleep(1000);
        touch.tap(PointOption.point(396,2181));
        Thread.sleep(1000);
        touch.tap(PointOption.point(396,2181));
        Thread.sleep(1000);
        touch.tap(PointOption.point(134,1882));
        Thread.sleep(1000);
        WebElement continueToLogin = driver.findElement(By.id("com.flipkart.android:id/button"));
        continueToLogin.click();
        Thread.sleep(15000);
        WebElement verify = driver.findElement(By.id("com.flipkart.android:id/button"));
        verify.click();
        Thread.sleep(3000);
        WebElement continueToPayment = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
        continueToPayment.click();
        Thread.sleep(3000);
    }
}