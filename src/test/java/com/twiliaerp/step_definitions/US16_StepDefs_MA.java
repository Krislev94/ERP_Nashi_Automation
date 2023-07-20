package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.pages.US16_MainPage_MA;
import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;


public class US16_StepDefs_MA {
    US16_MainPage_MA us16MainPageMa = new US16_MainPage_MA();
    LoginPage loginPage = new LoginPage();

    @When("User enters {string} into Email input box and {string} into Password input box, and clicks log in button")
    public void userEntersIntoEmailInputBoxAndIntoPasswordInputBoxAndClicksLogInButton(String email, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            loginPage.login(email, password);
            BrowserUtils.waitForInvisibilityOf(us16MainPageMa.loadingbar);
        }

    @Then("User sees the Main Page:")
    public void user_Sees_The_Inbox_Page() {
        BrowserUtils.waitForInvisibilityOf(us16MainPageMa.loadingbar);
        Assert.assertTrue(loginPage.accountName.isDisplayed());
    }
    @Then("user should click each module and verify accessibility.")
    public void user_Will_Click_Each_Module_And_Verify_Title() {
        us16MainPageMa.verifyIfTabsAreClickable();
    }

}




