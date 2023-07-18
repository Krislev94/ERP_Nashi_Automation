package com.twiliaerp.step_definitions;

import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US07_StepDefs_DS implements Pages {

    @Given("A Pos manager is logged in")
    public void a_pos_manager_is_logged_in() {
        Pages.mainPage.loginAsPosManager();
    }
    @Given("The user is on the Sales Page")
    public void the_user_is_on_the_sales_page() {
        Pages.salesPage.loadPage();
        Assert.assertEquals(ConfigurationReader.getProperty("sales.page.url"), Driver.getDriver().getCurrentUrl());
    }
    @When("The user enters a valid order number into the search box")
    public void the_user_enters_enters_a_valid_order_number_into_the_search_box() {

    }
    @When("The user clicks the left mouse button on the “Search sale order” menu item")
    public void the_user_clicks_the_left_mouse_button_on_the_search_sale_order_menu_item() {

    }
    @Then("The user should see the table with only the desired order")
    public void the_user_should_see_the_table_with_only_the_desired_order() {


    }

    @Given("A Sales manager is logged in")
    public void a_sales_manager_is_logged_in() {
        Pages.mainPage.loginAsSalesManager();
    }
    @When("The user navigates to the Sales Page")
    public void the_user_navigates_to_the_sales_page() {
       Pages.salesPage.loadPage();
    }

    @Then("The “Quotations” table should display {int} columns")
    public void the_quotations_table_should_display_columns(Integer int1) {
        Assert.assertEquals((Integer)Pages.salesPage.columnTextHeaders.size(),int1);
    }






}
