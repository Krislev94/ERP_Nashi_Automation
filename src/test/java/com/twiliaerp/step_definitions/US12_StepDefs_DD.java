package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.RepairModulePage_DD;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US12_StepDefs_DD {


    RepairModulePage_DD repairModulePageDd = new RepairModulePage_DD();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get("https://qa.twiliaerp.com/web?#menu_id=115&action=120&active_id=channel_inbox");

    }

    @When("User clicks Repairs button")
    public void user_clicks_repairs_button() {
        repairModulePageDd.repairsButton.click();
    }

    @When("User clicks Repair Reference checkbox")
    public void user_clicks_repair_reference_checkbox() {

    }

    @Then("User selects all repair orders")
    public void user_selects_all_repair_orders() {

    }
}
