package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US01_StepDefs_YN {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @Then("user enters email {string}")
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

    // @B29G32-271
    @Then("user enters invalid password {string}")
    public void user_enters_invalid_password(String invalidPassword) {
        loginPage.passwordInput.sendKeys(invalidPassword);
    }

    @Then("user hits Enter button on the keyboard")
    public void user_hits_enter_button_on_the_keyboard() throws AWTException {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
    }
    @Then("user sees {string}")
    public void userSees(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage, loginPage.incorrectPasswordMessage.getText());
    }


    //@B29G32-273
    @Given("user leaves email and password inputs empty and clicks login")
    public void user_leaves_email_and_password_inputs_empty_and_clicks_login() {
loginPage.loginButton.click();
    }

    @Then("user sees at least one {string} message")
    public void user_sees_at_least_one_message(String expectedMessage) {
        String warningMessage = loginPage.passwordInput.getAttribute("required");
Assert.assertTrue(warningMessage != null && !warningMessage.isEmpty() && !warningMessage.isBlank());
    }

    //@B29G32-226
    @Given("user enters invalid email {string}")
    public void user_enters_invalid_email(String invalidEmail) {
loginPage.emailInput.sendKeys(invalidEmail);
    }

    //@B29G32-274
    @Given("user leaves email input empty")
    public void user_leaves_email_input_empty(String password) {
loginPage.passwordInput.sendKeys(password);
    }

    @Given("user enters password {string} and clicks login")
    public void user_enters_password_and_clicks_login(String password) {
    loginPage.passwordInput.sendKeys(password);
    }



}

