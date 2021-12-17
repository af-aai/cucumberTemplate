package cucumberTemplate.utilities;

import cucumberTemplate.stepdefinitions.Hooks;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.screenrecording.ScreenRecordingUploadOptions;

import java.net.MalformedURLException;
import java.time.Duration;

public class AndroidHardkeys {

    public static void hideKeyboard() {
        Hooks.driver.hideKeyboard();
    }

    public static void PressEnterKey() {
        Hooks.driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
    public static void PressHomeKey() {
        Hooks.driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }

    public static void PressBackKey() {
        Hooks.driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }


    public static void StartScreenRecording(int timeToRecord) {
        ((CanRecordScreen) Hooks.driver).startRecordingScreen(new AndroidStartScreenRecordingOptions()
                        .withTimeLimit(Duration.ofSeconds(timeToRecord))
                        .withUploadOptions(ScreenRecordingUploadOptions.uploadOptions()
                        .withFileFieldName(String.valueOf(Hooks.driver.getDeviceTime()))));
    }
    public static void changeWifiStatus(){
        Hooks.driver.toggleWifi();
        ActionUtil.waitFor(4);

    }
    public static boolean checkIfAppInstalled(String AppPackage) {
      return   Hooks.driver.isAppInstalled(AppPackage);
    }

    public static void runAppInBackground(int timeInSeconds) {
        Hooks.driver.runAppInBackground(Duration.ofSeconds(timeInSeconds));
    }
    public static void closeApp() {
        Hooks.driver.closeApp();
    }

    public static void launchApp() {
        Hooks.driver.launchApp();
    }



}
