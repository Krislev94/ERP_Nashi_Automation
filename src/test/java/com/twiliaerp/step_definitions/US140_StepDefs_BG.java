package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.DiscussPage_BG;
import com.twiliaerp.pages.DocumentationPage_BG;
import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US140_StepDefs_BG {
    LoginPage loginPage = new LoginPage();
    DiscussPage_BG discussPage_bg = new DiscussPage_BG();
    DocumentationPage_BG documentationPage_bg = new DocumentationPage_BG();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @When("user log in with {string} and {string}")
    public void user_log_in_with_and(String email, String password) {
        loginPage.login(email,password);

    }
    @Then("user navigates to Discuss page")
    public void user_navigates_to_discuss_page() {

        wait.until(ExpectedConditions.elementToBeClickable(discussPage_bg.discussPageButton));
        discussPage_bg.discussPageButton.click();
    }
    @Then("User clicks the username on right top corner")
    public void user_clicks_the_username_on_right_top_corner() {
       discussPage_bg.accountBar.click();
    }
    @Then("User should see documentation option in window")
    public void user_should_see_documentation_option_in_window() {
        Assert.assertTrue(discussPage_bg.documentationPagebar.isDisplayed());
    }

    @Then("User clicks documentation option")
    public void user_clicks_documentation_option() {
        discussPage_bg.documentationPagebar.click();
    }
    @Then("user should see {string} {string} {string} {string}")
    public void user_should_see(String string, String string2, String string3, String string4) {
        documentationPage_bg.docVerificationHandler(string,string2,string3,string4);
    }
}
