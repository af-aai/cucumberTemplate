package cucumberTemplate.amazon_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DashBoardPage_Amazon extends BasePage_Amazon{
    @AndroidFindBy(xpath ="//android.widget.LinearLayout/android.widget.Button[3]" )
    public MobileElement skipButton;
    @AndroidFindBy(xpath ="(//android.widget.LinearLayout[@content-desc=\"Search\"])[1]/android.widget.LinearLayout/android.widget.TextView" )
    public MobileElement searchBox1;
    @AndroidFindBy(className ="android.widget.EditText" )
    public MobileElement searchBox_amazon;


    @AndroidFindBy(xpath ="(//android.widget.ImageView[@content-desc=\"Öffne zusätzliche Funktionen\"])[1]" )
    public MobileElement threeDotButton0;
}
