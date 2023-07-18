package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.pages.RepairModulePage_DD;
import com.twiliaerp.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US12_StepDefs_DD {


    RepairModulePage_DD repairModulePageDd = new RepairModulePage_DD();
    LoginPage loginPage = new LoginPage();


    @Given("User login with {string} and {string}")
    public void userLoginWithAnd(String email, String password) {
        loginPage.login(email,password);
    }



    @When("User clicks Repairs button")
    public void user_clicks_repairs_button() {
        BrowserUtils.sleep(2);
        repairModulePageDd.repairsButton.click();
    }

    @When("User clicks Repair Reference checkbox")
    public void user_clicks_repair_reference_checkbox() {
        BrowserUtils.sleep(3);
        repairModulePageDd.repairReferenceButton.click();



    }

    @Then("User selects all repair orders")
    public void user_selects_all_repair_orders() {
        BrowserUtils.sleep(2);
        for (WebElement each : repairModulePageDd.allRepairs){
           Assert.assertTrue(each.isSelected());
        }


    }



}
