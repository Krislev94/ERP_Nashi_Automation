package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.pages.MainModulesPage_BV;

import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class US13_StepDefs_BV {
    LoginPage loginPage = new LoginPage();
    MainModulesPage_BV mainModulesPage_bv = new MainModulesPage_BV();

    @Given("User logged in with valid {string} and {string} for POS manager")
    public void UserLoggedInWithValidAndForPOSManager(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("User sees Discuss page and account name starts with {string}")
    public void userSeesDiscussPageAndAccountNameStartsWith(String username) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Loading']")));
        Assert.assertEquals("active", mainModulesPage_bv.discussModule.getAttribute("class"));
        Assert.assertTrue(mainModulesPage_bv.topBarName.getText().contains("POSManager"));

    }

    @Then("User should be able to access all {int} modules")
    public void userShouldBeAbleToAccessAllModules(int numberOfModules) {

        mainModulesPage_bv.verifyTabsAreClickable(numberOfModules);

    }



}
