package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US02_StepDefs_KL {

 LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @Given("user enters email {string}")
    public void user_enters_email(String email) {
        loginPage.emailInput.sendKeys(email);
    }
    @Then("user enters password {string}")
    public void user_enters_password(String password) {
       loginPage.passwordInput.sendKeys(password);
    }
    @Then("user clicks login button")
    public void user_clicks_login_button() {
       loginPage.loginButton.click();
    }
    @Then("user sees account name as {string}")
    public void user_sees_account_name_as(String expectedAccountName) {
        Assert.assertEquals(expectedAccountName, loginPage.accountName.getText());
    }


    @Then("user hits Enter on the keyboard")
    public void user_hits_enter_on_the_keyboard() {
       loginPage.passwordInput.sendKeys(Keys.ENTER);
    }


    @Given("user enters invalid email {string}")
    public void user_enters_invalid_email(String invalidEmail) {
        loginPage.emailInput.sendKeys(invalidEmail);
    }

    @Then("user sees {string} error message")
    public void user_sees_error_message(String expectedErrorMessage) {
       Assert.assertEquals(expectedErrorMessage, loginPage.wrongLoginOrPasswordMessage.getText());
    }



    @Then("user enters invalid password {string}")
    public void user_enters_invalid_password(String invalidPassword) {
       loginPage.passwordInput.sendKeys(invalidPassword);
    }



    @Given("user leaves email and password inputs empty and clicks login")
    public void user_leaves_email_and_password_inputs_empty_and_clicks_login() {
        loginPage.loginButton.click();
    }
    @Then("user sees at least one {string} message")
    public void user_sees_at_least_one_message(String expectedMessage) {
       String validationMessage = loginPage.emailInput.getAttribute("required");
       Assert.assertTrue(validationMessage != null && !validationMessage.isEmpty() && !validationMessage.isBlank());
    }



    @Given("user leaves password input empty and clicks login")
    public void user_leaves_password_input_empty_and_clicks_login() {
       loginPage.loginButton.click();
    }





}
