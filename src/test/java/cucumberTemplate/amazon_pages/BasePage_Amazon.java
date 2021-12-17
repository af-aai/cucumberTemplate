package cucumberTemplate.amazon_pages;

import cucumberTemplate.stepdefinitions.Hooks;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage_Amazon {
    public BasePage_Amazon() {
        PageFactory.initElements(new AppiumFieldDecorator(Hooks.driver), this);
    }
}
