package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US13_StepDefs_BV {
    LoginPage loginPage = new LoginPage();

    @Given("the user logged in with valid {string} and {string} for POS manager")
    public void the_user_logged_in_with_valid_and_for_pos_manager(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("User should be able to access all {int} modules")
    public void userShouldBeAbleToAccessAllModules(int numberOfModules) {

    }
}
