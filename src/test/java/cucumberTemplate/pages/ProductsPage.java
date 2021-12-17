package cucumberTemplate.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class ProductsPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text='ADD TO CART']")
    public List<MobileElement> AddToCartButton;


    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    public MobileElement CartIcon;


    public void clickAddToCartButton() {
        AddToCartButton.get(0).click();
        // DriverUtil.waitfor(5);
    }
}
