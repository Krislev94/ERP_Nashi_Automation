package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.pages.RepairModulePage_DD;
import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US12_StepDefs_DD {


    RepairModulePage_DD repairModulePageDd = new RepairModulePage_DD();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get("https://qa.twiliaerp.com/web?#view_type=list&model=mrp.repair&menu_id=535&action=723");
        loginPage.emailInput.sendKeys("posmanager57@info.com");
        loginPage.passwordInput.sendKeys("posmanager");
        loginPage.loginButton.click();

    }

    @When("User clicks Repairs button")
    public void user_clicks_repairs_button() {
        repairModulePageDd.repairsButton.click();
    }

    @When("User clicks Repair Reference checkbox")
    public void user_clicks_repair_reference_checkbox() {
        BrowserUtils.sleep(5);
        repairModulePageDd.repairReferenceButton.click();



    }

    @Then("User selects all repair orders")
    public void user_selects_all_repair_orders() {
        for (WebElement each : repairModulePageDd.allRepairs){
           Assert.assertTrue(each.isSelected());
        }


    }
}
