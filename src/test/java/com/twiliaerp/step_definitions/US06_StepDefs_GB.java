package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.InventoryPage_GB;
import com.twiliaerp.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US06_StepDefs_GB {
    LoginPage loginPage=new LoginPage();
    InventoryPage_GB inventoryPageGb=new InventoryPage_GB();

    @Given("the user is already logged in")
    public void theUserIsAlreadyLoggedIn() {
        loginPage.login("posmanager11@info.com", "posmanager");

    }

    @And("user clicks on the Products tab")
    public void userClicksOnTheProductsTab() {
        inventoryPageGb.productsTab.click();

    }

    @Then("user clicks on the Inventory tab")
    public void userClicksOnTheInventoryTab() {
        inventoryPageGb.inventoryTab.click();
    }

    @Then("user clicks on the Create button")
    public void userClicksOnTheCreateButton() {
        inventoryPageGb.createButton.click();
    }

    @Then("user fills out the Product Name input box")
    public void userFillsOutTheProductNameInputBox() {

    }

    @Then("user should see saved product displayed")
    public void userShouldSeeSavedProductDisplayed() {
    }


    @Given("user is on the Products tab")
    public void user_is_on_the_products_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks on any product")
    public void user_clicks_on_any_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks on edit button")
    public void user_clicks_on_edit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user edits the product information in the input box input")
    public void user_edits_the_product_information_in_the_input_box_input() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks on Save button")
    public void user_clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should see the saved changes displayed")
    public void user_should_see_the_saved_changes_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}