package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.US07_QuotationsPage;
import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US07_StepDefs_DS extends US07_Pages_DS {
    @Given("A POS manager is logged in")
    public void a_pos_manager_is_logged_in() {
        getMainPage().loginAsPosManager();
    }

    @Given("The user is on the Quotations Page")
    public void the_user_is_on_the_quotations_page() {
        getQuotationPage().loadPage();
        Assert.assertEquals(US07_QuotationsPage.EXPECTED_TITLE, Driver.getDriver().getTitle());

    }

    @When("The user clicks the left mouse button on the “Search Sale Order” popup menu item")
    public void the_user_clicks_the_left_mouse_button_on_the_search_sale_order_popup_menu_item() {
        getQuotationPage().runSearchSalesOrder();
    }

    @Given("A Sales manager is logged in")
    public void a_sales_manager_is_logged_in() {
        getMainPage().loginAsSalesManager();
    }

    @When("The user navigates to the Quotations Page")
    public void the_user_navigates_to_the_quotations_page() {
        getQuotationPage().loadPage();
    }

    @Then("The “Quotations” table should display {int} columns")
    public void the_quotations_table_should_display_columns(Integer int1) {
        BrowserUtils.waitForVisibility(getQuotationPage().tableHeader, 10);
        Assert.assertEquals((Integer) getQuotationPage().columnTextHeaders.size(), int1);
    }

    @When("The user enters a valid {string} into the search box")
    public void the_user_enters_a_valid_into_the_search_box(String query) {
        getQuotationPage().fillInSearchBox(query);
    }

    @Then("The user should see the table with the only order matched by its number the searched {string}")
    public void the_user_should_see_the_table_with_the_only_order_matched_by_its_number_the_searched(String expected) {
        BrowserUtils.waitForVisibility(getQuotationPage().searchResultQuotationNumberCellForSalesOrder, 10);
        Assert.assertEquals(expected, getQuotationPage().searchResultQuotationNumberCellForSalesOrder.getText());
    }


}
