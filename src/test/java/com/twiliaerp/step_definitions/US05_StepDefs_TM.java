package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.BasePage;
import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.pages.SalesModulePage_TM;
import com.twiliaerp.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class US05_StepDefs_TM extends BasePage {

    SalesModulePage_TM salesModulePage_tm = new SalesModulePage_TM();
    LoginPage loginPage = new LoginPage();


    @Given("user is on the main page logged in as Sales Manager")
    public void user_is_on_the_main_page_logged_in_as_sales_manager() {
        loginPage.login("salesmanager100@info.com", "salesmanager");


    }

    @When("User clicks Sales button")
    public void user_clicks_sales_button() {
        BrowserUtils.waitForClickablility(salesModulePage_tm.SalesModuleButton,5);
        salesModulePage_tm.SalesModuleButton.click();

    }

    @When("User clicks Customers tab")
    public void user_clicks_customers_tab() {

        salesModulePage_tm.CustomersModuleButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("User clicks Create button")
    public void user_clicks_create_button() {
        BrowserUtils.waitForPresenceOfElement(By.xpath("//div[@class='oe_kanban_details']"),5);
       // BrowserUtils.waitForPresenceOfElement(By.xpath("//button[@accesskey='c']"),5);
        salesModulePage_tm.CreateButton.click();
            }

    @When("User only fills out {string} field")
    public void user_only_fills_out_field(String string) {
        salesModulePage_tm.NameField.click();
        salesModulePage_tm.NameField.sendKeys(string);
            }


    @When("User clicks Save button")
    public void user_clicks_save_button() {
        salesModulePage_tm.SaveButton.click();
            }

    @Then("User sees new customer profile created with same {string}")
    public void user_sees_new_customer_profile_created_with_same(String string) {
        BrowserUtils.waitForClickablility(salesModulePage_tm.NameOnCreatedCustomerForm,5);
        String expectedName = string;
        String actualName = salesModulePage_tm.NameOnCreatedCustomerForm.getText();
        Assert.assertEquals(expectedName,actualName);
            }

}
