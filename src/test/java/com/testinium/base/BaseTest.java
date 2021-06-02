package com.testinium.base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public static AppiumDriver<MobileElement> appiumDriver;
    protected boolean localAndroid = true;
    protected DesiredCapabilities desiredCapabilities;



    @BeforeScenario
    public void BaseTest() throws MalformedURLException {

        if(localAndroid){

        desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
                    "com.turkishairlines.mobile");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
                    "com.turkishairlines.mobile.ui.ACSplash");
        desiredCapabilities.setCapability(MobileCapabilityType
                .PLATFORM_NAME, MobilePlatform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType
                .DEVICE_NAME,"emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator-2");
        desiredCapabilities.setCapability(MobileCapabilityType
                .NEW_COMMAND_TIMEOUT,"3000");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        appiumDriver = new AndroidDriver(url,desiredCapabilities);

        }

        else{
            System.out.println("IOS");
        }

    }

    @AfterScenario
    public void QuitApp(){

        if(appiumDriver !=null){
            appiumDriver.quit();
        }
    }

}
