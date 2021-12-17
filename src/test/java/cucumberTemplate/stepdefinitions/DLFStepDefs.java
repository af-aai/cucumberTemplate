package cucumberTemplate.stepdefinitions;

import cucumberTemplate.DLF_Pages.DashBoardPage_DLF;
import cucumberTemplate.utilities.ActionUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class DLFStepDefs {
    DashBoardPage_DLF dashBoardPage_dlf=new DashBoardPage_DLF();
    String TextFromFirstArticle;
    @When("user clicks threedot button of the first article")
    public void user_clicks_threedot_button_of_the_first_article() {
    dashBoardPage_dlf.threeDotButton.click();
    }

    @When("user clicks download button")
    public void user_clicks_download_button() throws InterruptedException {
        dashBoardPage_dlf.DownloadButton.click();
        Thread.sleep(4000);
    }

    @When("user reads the article tag")
    public void user_reads_the_article_tag() {
        TextFromFirstArticle=dashBoardPage_dlf.TextFromfirstArticle.getText();
        System.out.println(TextFromFirstArticle);
    }

    @When("user swipes the first article")
    public void user_swipes_the_first_article() {
    ActionUtil.swipeByElement(dashBoardPage_dlf.threeDotButton);
    }

    @Then("user should be able to see the second article in the same catagory")
    public void user_should_be_able_to_see_the_second_article_in_the_same_catagory() {

    }



}
