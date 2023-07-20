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


    @Then("user hits Enter button on the keyboard")
    public void user_hits_enter_button_on_the_keyboard2() throws AWTException {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
    }
    @Then("user sees {string}")
    public void userSees(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage, loginPage.incorrectPasswordMessage.getText());
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

