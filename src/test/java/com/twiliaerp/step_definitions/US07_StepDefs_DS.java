package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.US07_MainPage;
import com.twiliaerp.pages.US07_QuotationsPage;
import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @When("The user navigates to the Calendar Page")
    public void the_user_navigates_to_the_calendar_page() {
        getCalendarPage().loadPage();
    }

    @Given("A user is on the main page")
    public void a_pos_manager_is_on_the_main_page() {
        Assert.assertEquals(US07_MainPage.URL,Driver.getDriver().getCurrentUrl());

    }
    @When("The user enters valid email {string} and password {string}")
    public void the_user_enters_valid_email_and_password(String email, String password) {
        getMainPage().fillInCredentials(email,password);
    }
    @When("The user clicks the Log in button")
    public void the_user_clicks_the_log_in_button() {
        getMainPage().clickLoginButton();
    }
    @Then("The user clicks “Week” on the calendar display selector")
    public void the_user_clicks_week_on_the_calendar_display_selector() {
        getCalendarPage().activateWeekCalender();
    }
    @Given("The user sees week calendar with {int} columns for each day and {int} time slots raws")
    public void the_user_sees_week_calendar_with_columns_for_each_day_and_time_slots_raws(int columnsNum, int rawsNum) {
        Assert.assertEquals(columnsNum,getCalendarPage().dayHeaders.size());
        Assert.assertEquals(rawsNum,getCalendarPage().timeRaws.size());
    }
    @When("The user clicks on the cell for the desired {string} and {string}")
    public void the_user_clicks_on_the_cell_for_the_desired_and(String day, String time) {
        getCalendarPage().findAndClickCell(day,time);
    }
    @When("The user enters {string} into the Summary input box")
    public void the_user_enters_text_into_the_summary_input_box(String eventTitle) {
        getCalendarPage().inputBox.sendKeys(eventTitle);

    }
    @When("The user clicks Create button")
    public void the_user_clicks_create_button() {
        getCalendarPage().createButton.click();
        BrowserUtils.waitForInvisibilityOf(getCalendarPage().loadingBadge);

    }

    @Then("The user should be able to see the event on the calendar dashboard for the desired {string} and {string}")
    public void the_user_should_be_able_to_see_the_event_on_the_calendar_dashboard_for_the_desired_and(String day, String time) {
        getCalendarPage().verifyIfCellHasEvent(day,time);
    }

}
