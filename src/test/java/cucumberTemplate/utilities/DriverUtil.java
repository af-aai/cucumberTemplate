package cucumberTemplate.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverUtil {
    private DriverUtil() {
    }

    private static AppiumDriver<MobileElement> mobiledriver;

    public static AndroidDriver setup() {
        DesiredCapabilities cap = new DesiredCapabilities();

        if (ConfigurationReader.get("PlatformName").equalsIgnoreCase("Android")) {
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            if (ConfigurationReader.get("Android_PhoneType").equalsIgnoreCase("real")) {
                cap.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigurationReader.get("Android_RealDeviceName"));
                cap.setCapability("udid", ConfigurationReader.get("Android_RealDevice_udid"));
            } else if (ConfigurationReader.get("Android_PhoneType").equalsIgnoreCase("Emulator")) {
                cap.setCapability("avd","Pixel4");
                cap.setCapability("avdLaunchTimeout","180000");
                cap.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigurationReader.get("Android_EmulatorName"));
                cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,ConfigurationReader.get("PlatformVersion"));
                cap.setCapability("udid", ConfigurationReader.get("Android_Emulator_udid"));
            }

            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            cap.setCapability(MobileCapabilityType.APP, ConfigurationReader.get("APP_Path"));
        }
        try {
            mobiledriver = new AndroidDriver<>(new URL(ConfigurationReader.get("url")), cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        return (AndroidDriver<MobileElement>) mobiledriver;
    }

}
