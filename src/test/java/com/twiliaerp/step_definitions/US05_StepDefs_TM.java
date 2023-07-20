package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.BasePage;
import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.pages.SalesModulePage_TM;
import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

public class US05_StepDefs_TM extends BasePage {

    /**
     * US05-AC1: US05 As a Sales Manager, I should be able to create a new customer from "Sales" module
     */

    SalesModulePage_TM salesModulePage_tm = new SalesModulePage_TM();
    LoginPage loginPage = new LoginPage();


    @Given("user is on the main page logged in as Sales Manager")
    public void user_is_on_the_main_page_logged_in_as_sales_manager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("salesmanager100@info.com", "salesmanager");


    }

    @When("User clicks Sales button")
    public void user_clicks_sales_button() {
        BrowserUtils.waitForClickablility(salesModulePage_tm.SalesModuleButton, 5);
        salesModulePage_tm.SalesModuleButton.click();

    }

    @When("User clicks Customers tab")
    public void user_clicks_customers_tab() {

        salesModulePage_tm.CustomersModuleButton.click();
        BrowserUtils.waitFor(2);


    }

    @When("User clicks Create button")
    public void user_clicks_create_button() {
        BrowserUtils.waitForPresenceOfElement(By.xpath("//div[@class='oe_kanban_details']"), 5);
              salesModulePage_tm.CreateButton.click();
    }

    @When("User only fills out {string} field")
    public void user_only_fills_out_field(String string) {
        salesModulePage_tm.EditableNameField.click();
        salesModulePage_tm.EditableNameField.sendKeys(string);
    }


    @When("User clicks Save button")
    public void user_clicks_save_button() {
        salesModulePage_tm.SaveButton.click();
    }

    @Then("User sees new customer profile created with same {string}")
    public void user_sees_new_customer_profile_created_with_same(String string) {
        BrowserUtils.waitForClickablility(salesModulePage_tm.NameOnCreatedCustomerForm, 5);
        String expectedName = string;
        String actualName = salesModulePage_tm.NameOnCreatedCustomerForm.getText();
        Assert.assertEquals(expectedName, actualName);


    }

    @Then("User is able to see new profile {string} in directory")
    public void user_is_able_to_see_new_profile_in_directory(String string) {
        salesModulePage_tm.CustomersModuleButton.click();
        BrowserUtils.waitForPresenceOfElement(By.xpath("//div[@modifiers='{}']"), 5);
        salesModulePage_tm.SearchInputBox.sendKeys(string, Keys.ENTER);
        BrowserUtils.waitFor(2);
        String nameInGeneralDirectory = salesModulePage_tm.CustomerProfileNameInGeneralDirectory.getText();
        String expectedName = string;
        Assert.assertEquals(expectedName, nameInGeneralDirectory);
    }

    /**
     * US05-AC02: The user can create a new customer by filling only the Name input box and after clicking the save button,
     * the information of the customer which the user entered should be displayed.
     */

    @When("User clicks any customer profile")
    public void user_clicks_any_customer_profile() {
        BrowserUtils.waitForPresenceOfElement(By.xpath("//div[@modifiers='{}']"), 5);
        salesModulePage_tm.CustomerProfileTag.click();
    }

    @When("User clicks Edit button")
    public void user_clicks_edit_button() {
        BrowserUtils.waitForPresenceOfElement(By.xpath("//button[@accesskey='a']"), 5);
        salesModulePage_tm.EditButton.click();

    }

    @When("User enters different name")
    public void user_enters_different_name() {
        salesModulePage_tm.EditableNameField.clear();
        salesModulePage_tm.EditableNameField.sendKeys("Dingus Ferguson");

    }

    @Then("User sees new name displayed for that customer")
    public void user_sees_new_name_displayed_for_that_customer() {
        String expectedName = "Dingus Ferguson";
        String actualName = salesModulePage_tm.NameOnCreatedCustomerForm.getText();
        Assert.assertEquals(expectedName, actualName);

    }

}
