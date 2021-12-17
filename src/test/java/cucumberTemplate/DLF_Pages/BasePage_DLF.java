package cucumberTemplate.DLF_Pages;

import cucumberTemplate.stepdefinitions.Hooks;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage_DLF {
    public BasePage_DLF() {
        PageFactory.initElements(new AppiumFieldDecorator(Hooks.driver), this);
    }
}
