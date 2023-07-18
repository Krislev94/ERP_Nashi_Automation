package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.InventoryPage_GB;
import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US06_StepDefs_GB {
    LoginPage loginPage = new LoginPage();
    InventoryPage_GB inventoryPageGb = new InventoryPage_GB();



    @Given("the user is already logged in")
    public void theUserIsAlreadyLoggedIn() {
        loginPage.login("posmanager25@info.com", "posmanager");
    }

    @And("user clicks on the Products tab")
    public void userClicksOnTheProductsTab() {
        inventoryPageGb.productsTab.click();
    }

    @Then("user clicks on the Inventory tab")
    public void userClicksOnTheInventoryTab() {
        BrowserUtils.sleep(1);
        inventoryPageGb.inventoryTab.click();
    }

    @Then("user clicks on the Create button")
    public void userClicksOnTheCreateButton() {
        inventoryPageGb.createButton.click();
    }

    @Then("user fills out the Product Name input box")
    public void userFillsOutTheProductNameInputBox() {
        inventoryPageGb.productNameInput.sendKeys("Golden Doodle");
    }

    @Then("user should see saved product displayed")
    public void userShouldSeeSavedProductDisplayed() {
        Assert.assertTrue(inventoryPageGb.createdProductConfirmation.isDisplayed());
    }


    @Then("user clicks on any product")
    public void user_clicks_on_any_product() {
        BrowserUtils.scrollToElement(inventoryPageGb.findAnyProduct);
        inventoryPageGb.findAnyProduct.click();
    }

    @Then("user clicks on edit button")
    public void user_clicks_on_edit_button() {
        inventoryPageGb.editButton.click();
    }

    @Then("user edits the product information in the input box input")
    public void user_edits_the_product_information_in_the_input_box_input() {
        inventoryPageGb.productNameInput.clear();
        inventoryPageGb.productNameInput.sendKeys("Husky Poodle");
    }

    @Then("user clicks on Save button")
    public void user_clicks_on_save_button() {

        inventoryPageGb.saveButton.click();
    }

    @Then("user should see the saved changes displayed")
    public void user_should_see_the_saved_changes_displayed() {
        Assert.assertTrue(inventoryPageGb.createdProductConfirmation.isDisplayed());
    }

    @Then("user finds the created element in the product list")
    public void userFindsTheCreatedElementInTheProductList() {
        BrowserUtils.scrollToElement(inventoryPageGb.savedElementOnList);
        Assert.assertTrue(inventoryPageGb.savedElementOnList.isDisplayed());
    }
}