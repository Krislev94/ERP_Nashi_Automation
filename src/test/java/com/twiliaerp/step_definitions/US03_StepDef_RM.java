package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.CalendarModulePage_RM;
import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_StepDef_RM {

    CalendarModulePage_RM calendarModulePageRm = new CalendarModulePage_RM();

    LoginPage loginPage = new LoginPage();

    @Given("User enters {string} and {string} on the login page")
    public void user_enters_and_on_the_login_page(String Email, String Password) {
        loginPage.login(Email,Password);

    }
    @When("User clicks to Calendar module")
    public void user_clicks_to_calendar_module() {
        BrowserUtils.waitForVisibility(calendarModulePageRm.calendarOption,3);
        calendarModulePageRm.calendarOption.click();
    }
    @Then("User clicks to Day option")
    public void user_clicks_to_day_option() {
        BrowserUtils.waitForVisibility(calendarModulePageRm.calendarOption,3);
        calendarModulePageRm.dayOption.click();

    }
    @Then("User should see the calendar displayed as daily")
    public void user_should_see_the_calendar_displayed_as_daily() {
        Assert.assertTrue(calendarModulePageRm.dayOption.isDisplayed());

    }
    @When("User clicks to Week option")
    public void user_clicks_to_week_option() {
        BrowserUtils.waitForVisibility(calendarModulePageRm.calendarOption,3);
        calendarModulePageRm.weekOption.click();

    }
    @Then("User should see the calendar displayed as weekly")
    public void user_should_see_the_calendar_displayed_as_weekly() {
        Assert.assertTrue(calendarModulePageRm.weekOption.isDisplayed());

    }
    @When("User clicks to Month option")
    public void user_clicks_to_month_option() {
        BrowserUtils.waitForVisibility(calendarModulePageRm.calendarOption,3);
        calendarModulePageRm.monthOption.click();

    }
    @Then("User should see the calendar displayed as monthly")
    public void user_should_see_the_calendar_displayed_as_monthly() {
        Assert.assertTrue(calendarModulePageRm.monthOption.isDisplayed());

    }


}
