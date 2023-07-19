package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.CalendarPage_BG;
import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class US04_StepDefs_BG {
    LoginPage loginPage = new LoginPage();
    CalendarPage_BG calendarPage_bg = new CalendarPage_BG();

    @Given("User is logged in with {string} and {string}")
    public void user_is_logged_in_with_and(String userName, String password) {
        loginPage.login(userName,password);
    }
    @When("User navigates to Calendar module")
    public void user_navigates_to_calendar_module() {
        calendarPage_bg.CalendarModulePage.click();
    }
    @When("User choose {string} and {string} and click it.")
    public void user_choose_and_and_click_it(String time, String day) {

        CalendarPage_BG.eventHandler(time,day);
    }
    @When("User fills in the event details with {string}")
    public void user_fills_in_the_event_details_with(String eventDetails) {
        calendarPage_bg.eventCreateInputBox.sendKeys(eventDetails);
    }
    @When("User creates the event")
    public void user_creates_the_event() {
        calendarPage_bg.eventCreateButtonclick.click();
    }
    @Then("{string} is displayed on the calendar")
    public void is_displayed_on_the_calendar(String eventDesc) {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[normalize-space()='" + eventDesc +"']")).isDisplayed());
    }

    @Then("Event details with {string}, and {string} are displayed")
    public void eventDetailsWithAndAreDisplayed(String time, String eventDesc) {
        Assert.assertTrue(calendarPage_bg.eventTitle.isDisplayed());
        Assert.assertTrue(calendarPage_bg.startDateTime.isDisplayed());
    }

    @When("User clicks on the {string} on the calendar")
    public void userClicksOnTheOnTheCalendar(String eventDesc) {
        Driver.getDriver().findElement(By.xpath("//div[normalize-space()='" + eventDesc +"']")).click();
    }

    @When("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}


