package cucumberTemplate.pages;

import cucumberTemplate.stepdefinitions.Hooks;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Hooks.driver), this);
    }


}

