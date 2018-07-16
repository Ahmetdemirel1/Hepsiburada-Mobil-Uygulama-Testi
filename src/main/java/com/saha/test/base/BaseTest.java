package com.saha.test.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected AndroidDriver<MobileElement> driver;

    @Before
    public void driverSetup()throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("platformVersion", "Null");
            capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("appPackage","com.pozitron.hepsiburada");
        capabilities.setCapability("appActivity", "com.hepsiburada.ui.startup.SplashActivity");



        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }


    @After
    public void driverQuit(){
        //driver.quit();
    }
}
