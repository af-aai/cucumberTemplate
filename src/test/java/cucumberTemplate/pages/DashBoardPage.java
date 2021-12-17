package cucumberTemplate.pages;

import cucumberTemplate.stepdefinitions.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class DashBoardPage extends BasePage {
    @AndroidFindBy(className ="android.widget.EditText" )
    public MobileElement SearchBox;

    @AndroidFindBy(xpath ="//*[@text='Female']" )
    public MobileElement FemaleRadioButton;

    @AndroidFindBy(id ="android:id/text1" )
    public MobileElement CountryDropdown;

    @AndroidFindBy(id ="com.androidsample.generalstore:id/btnLetsShop" )
    public MobileElement LetsShopButton;


    public void SelectCountry(String CountryName)  {
        Hooks.driver.findElement(By.xpath("//*[@text='"+CountryName+"']")).click();
    }

}
