package cucumberTemplate.pages;

import cucumberTemplate.stepdefinitions.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.util.List;

public class PurchasedProductPage extends BasePage {

    @AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
    public List<MobileElement> productPrices;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/totalAmountLbl")
    public MobileElement ResultTotalPrices;

    @AndroidFindBy(className = "android.widget.CheckBox")
    public MobileElement checkBox;

    @AndroidFindBy(xpath = "//*[@text='Please read our terms of conditions']")
    public MobileElement ConditionButton;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement closeButton;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
    public MobileElement preceedButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.app.Dialog/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]")
    public MobileElement el1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.app.Dialog/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.widget.Button[2]")
    public MobileElement el2;


    public double GetSumOfPurchasedProductPrices() {
        int count = productPrices.size();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            String amount1 = productPrices.get(i).getText();
            double amount = getAmount(amount1);
            sum = sum + amount;//280.97+116.97
        }
        System.out.println(sum + "    sum of products");
        return sum;
    }

    public double GetResultTotalPrice() {
        double ResultTotalPrice = getAmount(ResultTotalPrices.getText());
        return ResultTotalPrice;
    }

    public static double getAmount(String value) {
        value = value.substring(1);
        double amount2value = Double.parseDouble(value);
        return amount2value;
    }

    public MobileElement ConditionWithText(String conditionMessage) {
        return Hooks.driver.findElementByXPath("//*[@text='" + conditionMessage + "']");
    }

}
