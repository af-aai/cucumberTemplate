package cucumberTemplate.stepdefinitions;

import cucumberTemplate.amazon_pages.DashBoardPage_Amazon;
import cucumberTemplate.utilities.ActionUtil;
import cucumberTemplate.utilities.AndroidHardkeys;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AmazonStepDefs {
    DashBoardPage_Amazon dashBoardPage_amazon=new DashBoardPage_Amazon();
    @When("user clicks skipButton")
    public void user_clicks_skipButton() {
       dashBoardPage_amazon.skipButton.click();
    }

    @When("user enter {string} in searchBox")
    public void user_enter_in_searchBox(String productName)  {
       dashBoardPage_amazon.searchBox_amazon.sendKeys(productName);
    }

    @When("user clicks Enter Button")
    public void user_clicks_Enter_Button() {
        AndroidHardkeys.PressEnterKey();
    }

    @Then("user is on the product page")
    public void user_is_on_the_product_page() {

    }

    @Then("user scrolls to element By xpath")
    public void user_scrolls_to_element_By_xpath() {
       // ActionUtil.ScrollIntoViewByText1("PUMA Unisex Icra Trainer Sd Trainers");
        ActionUtil.scroll(10,Hooks.driver);
       // ActionUtil.scrollDown(Hooks.driver);
    }

}
