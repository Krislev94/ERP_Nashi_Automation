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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US13_StepDefs_BV {
    LoginPage loginPage = new LoginPage();
    MainModulesPage_BV mainModulesPage_bv = new MainModulesPage_BV();

    @Given("the user logged in with valid {string} and {string} for POS manager")
    public void the_user_logged_in_with_valid_and_for_pos_manager(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("User should be able to access all {int} modules")
    public void userShouldBeAbleToAccessAllModules(int numberOfModules) {
        System.out.println(mainModulesPage_bv.menuTabs.size());
        //mainModulesPage_bv.menuTabs.forEach(webElement -> webElement.click());
        for (WebElement menuTab : mainModulesPage_bv.menuTabs) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Loading']")));
            menuTab.click();
        }
        for (WebElement moreTab : mainModulesPage_bv.moreTabs) {
            mainModulesPage_bv.moreDropdown.click();
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Loading']")));
            moreTab.click();
            }
            // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
            // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Loading']")));
            Assert.assertEquals(mainModulesPage_bv.menuTabs.size(), numberOfModules);

        }
    }
