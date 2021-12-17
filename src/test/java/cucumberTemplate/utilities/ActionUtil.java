package cucumberTemplate.utilities;

import cucumberTemplate.stepdefinitions.Hooks;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ActionUtil {
    public static TouchAction t= new TouchAction(Hooks.driver);

    public static void ScrollIntoViewByText(String text)  {
        Hooks.driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"))");

    }

    public static void ScrollIntoViewByText2(String text) {
        Hooks.driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0))"));
    }

    public static void ScrollIntoViewById(String id) {
        Hooks.driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceIdMatches(\"" + id+ "\").instance(0))"));
    }

    public static void ScrollIntoViewByIdAndText(String id,String text) {
        Hooks.driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceIdMatches(\"" +id+"\").textMatches(\"" +text+ "\").instance(0))"));
    }
    public static void ScrollIntoViewByTextWithMaximiumSwipe(String text,int maximiumswipeCount) {
        Hooks.driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(\""+maximiumswipeCount+"\").scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0))"));
    }

    public static void tapAction (MobileElement mobileElement) {

        t.tap(TapOptions.tapOptions().withElement(ElementOption.element(mobileElement))).perform();

    }



    public static void longPressAction(MobileElement mobileElement) {
       // TouchAction t = new TouchAction(Hooks.driver);
        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(mobileElement)).withDuration(Duration.ofSeconds(2))).release().perform();
    }
    public static void switchContex(int contextNumber) throws InterruptedException {
        Set<String> contexts = Hooks.driver.getContextHandles();
        for (String contextName : contexts) {
            System.out.println(contextName);
        }
        System.out.println("--------------");
        System.out.println((String) contexts.toArray()[contextNumber]);
        Hooks.driver.context((String) contexts.toArray()[contextNumber]);
        Thread.sleep(3000);
    }

    public static void  scroll( int numofScrollTimes,AndroidDriver driver) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int)(size.width / 2);
        //Swipe up to scroll down
        int startPoint = (int)(size.height -400);
        int endPoint = 100;

        for (int i = 0; i < numofScrollTimes; i++) {
                        t.longPress(PointOption.point(anchor, startPoint)) //.press(point(anchor, startPoint)) if used press need proper waiting time
                        //.waitAction(waitOptions(ofMillis(miliseconds)))
                        .moveTo(PointOption.point(anchor, endPoint)).release().perform();
        }
    }



    public static void swipeByElement(MobileElement element) {
       // JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        int startingX =  Hooks.driver.manage().window().getSize().width / 2;
        int startingY=generateY(element.getLocation());
        t.press(PointOption.point(startingX+300, startingY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(startingX-300, startingY)).release().perform();
    }
        public static int generateX(Point point) {
            int x = point.getX();
            return x;

        }

        public static int generateY(Point point) {
            int y = point.getY();
            return y-200;

        }

    public static void swipeScreen(Direction dir) {
        System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        //  - Android: 300 ms
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 200; // ms

        final int PRESS_TIME = 200; // ms

        int edgeBorder = 100; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = Hooks.driver.manage().window().getSize();

        // init start point = center of screen
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

        switch (dir) {
            case DOWN: // center of footer
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP: // center of header
                pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
                break;
            case LEFT: // center of left side
                pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
                break;
            case RIGHT: // center of right side
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {
            new TouchAction(Hooks.driver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }

    public static List<String> getAndroidElementTextAsList(List<AndroidElement> list) {
        List<String> elementTexts=new ArrayList<>();
        for(MobileElement eachElement: list){
            elementTexts.add(eachElement.getText());
        }
        return  elementTexts;

    }
    public static List<String> getAndroidElementTextByLocator(By locator) {
        List<MobileElement> elements=Hooks.driver.findElements(locator);

        List<String> elementTexts=new ArrayList<>();
        for(MobileElement eachElement: elements){
            elementTexts.add(eachElement.getText());
        }
        return  elementTexts;

    }
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void waitForPresenceOfElement(By locator, int timeInSeconds){
        new WebDriverWait(Hooks.driver,timeInSeconds).until(ExpectedConditions.presenceOfElementLocated(locator));

    }

    }
