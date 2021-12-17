package cucumberTemplate.stepdefinitions;

import cucumberTemplate.utilities.ConfigurationReader;
import cucumberTemplate.utilities.DriverUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;
public class Hooks {
    public static AndroidDriver<MobileElement> driver = null;

    @Before
    public static void setup() {

        AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder().usingPort(4723);
        AppiumDriverLocalService server = AppiumDriverLocalService.buildService(serviceBuilder);
        // serviceBuilder.withArgument(GeneralServerFlag.LOCAL_TIMEZONE).withLogFile(new File("/Users/elyarabdullah/Downloads/Selenium/mobileTesting/src/test/java/Apps/appium.log"));
        server.start();
        driver = DriverUtil.setup();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigurationReader.get("implicitlyWaitTime")), TimeUnit.SECONDS);
    }
//    @After
//    public static void close() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}

