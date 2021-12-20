package cucumberTemplate.stepdefinitions;

import cucumberTemplate.pages.DashBoardPage;
import cucumberTemplate.pages.ProductsPage;
import cucumberTemplate.pages.PurchasedProductPage;
import cucumberTemplate.utilities.ActionUtil;
import cucumberTemplate.utilities.AndroidHardkeys;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.net.MalformedURLException;

public class CompeleteTransactionStepDefs {
    DashBoardPage dashBoardPage = new DashBoardPage();
    ProductsPage productsPage = new ProductsPage();
    PurchasedProductPage purchasedProductPage = new PurchasedProductPage();
    int globalPurchasedProductsCount;

    public CompeleteTransactionStepDefs() throws MalformedURLException {
    }

    @Given("user is on the home page")
    public void user_is_on_the_home_page() throws InterruptedException {
        System.out.println("App is opened!");

    }

    @When("user enters {string}")
    public void user_enters(String username) {
        dashBoardPage.SearchBox.sendKeys(username);
    }

    @When("user hides keyboard")
    public void user_hides_keyboard() throws MalformedURLException {

        AndroidHardkeys.hideKeyboard();
    }

    @Then("user selects gender female")
    public void user_selects_gender_female() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dashBoardPage.FemaleRadioButton.click();
    }

    @When("user clicks  country dropdown")
    public void user_clicks_country_dropdown() {
        dashBoardPage.CountryDropdown.click();
    }

    @When("user scrolls until user sees the country {string}")
    public void user_scrolls_until_user_sees_the_country(String CountryName) {
        ActionUtil.ScrollIntoViewByText(CountryName);
    }

    @Then("user clicks the country {string}")
    public void user_clicks_the_country(String CountryName) throws MalformedURLException {
        dashBoardPage.SelectCountry(CountryName);
    }

    @When("User clicks letsshop button")
    public void user_clicks_letsshop_button() {
        dashBoardPage.LetsShopButton.click();
    }

    @Then("user is on the product list page")
    public void user_is_on_the_product_list_page() {

    }

    @Then("user selects the top {int} products")
    public void user_selects_the_top_products(int NumberOfproductsPurchased) {
        globalPurchasedProductsCount = NumberOfproductsPurchased;
        while (NumberOfproductsPurchased > 0) {
            productsPage.clickAddToCartButton();
            NumberOfproductsPurchased--;
        }
    }

    @When("user clicks Cart Icon button")
    public void user_clicks_Cart_Icon_button() {
        productsPage.CartIcon.click();
    }

    @Then("user is on the {string} page")
    public void user_is_on_the_page(String string) {
        System.out.println("this is step 12");
    }

    @Then("user should see the selected products")
    public void user_should_see_the_selected_products() {
        int actualNumberOfPurchasedProduct = purchasedProductPage.productPrices.size();
        Assert.assertEquals(actualNumberOfPurchasedProduct, globalPurchasedProductsCount);

    }

    @Then("user checks if the total price of the selected products is correct")
    public void user_checks_if_the_total_price_of_the_selected_products_is_correct() {
        System.out.println("this is step 14");
        Assert.assertEquals(purchasedProductPage.GetSumOfPurchasedProductPrices(), purchasedProductPage.GetResultTotalPrice());

    }

    @Then("user clicks  sendMeEmail checkbox button")
    public void user_clicks_sendMeEmail_checkbox_button() {
        System.out.println("this is step 15");
        ActionUtil.tapAction(purchasedProductPage.checkBox);
    }

    @When("user longpress text {string}")
    public void user_longpress_text(String ConditionMessage) {
        System.out.println("this is step 16");
        ActionUtil.longPressAction(purchasedProductPage.ConditionWithText(ConditionMessage));

    }

    @Then("user should see the conditions message")
    public void user_should_see_the_conditions_message() {
        System.out.println("this is step 17");
    }

    @Then("user clicks close button")
    public void user_clicks_close_button() {
        System.out.println("this is step 18");
        purchasedProductPage.closeButton.click();
    }

    @When("user clicks the link button that directs to product website")
    public void user_clicks_the_link_button_that_directs_to_product_website() {
        System.out.println("this is step 19");
        purchasedProductPage.preceedButton.click();
    }

    @Then("googles security window pops up")
    public void googles_security_window_pops_up() throws InterruptedException {
        System.out.println("this is step 20");
        ActionUtil.switchContex(0);
        Thread.sleep(4000);
    }

    @Then("user agrees with the google security alert")
    public void user_agrees_with_the_google_security_alert() throws InterruptedException {
        System.out.println("this is step 21");
        purchasedProductPage.el1.click();
        Thread.sleep(4000);
        purchasedProductPage.el2.click();

        System.out.println("Test is finished");
    }

}
