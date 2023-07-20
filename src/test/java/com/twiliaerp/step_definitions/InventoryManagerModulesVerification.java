package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.InventoryModulesPage;
import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class InventoryManagerModulesVerification {
    InventoryModulesPage inventoryModulesPage = new InventoryModulesPage();
    LoginPage loginPage = new LoginPage();

    @Given("User enters {string} into email input box and {string} into password input box, and clicks log in button")
    public void userEntersIntoEmailInputBoxAndIntoPasswordInputBox(String username, String Password) {

        loginPage.login(username, Password);
        BrowserUtils.waitForInvisibilityOf(inventoryModulesPage.loadingbar);
    }

    @Given("user should be able to access the following expected 16 modules:")
    public void user_should_be_able_to_access_the_following_expected(List<String> modules) {
        BrowserUtils.waitForInvisibilityOf(inventoryModulesPage.loadingbar);
        Assert.assertEquals(modules, inventoryModulesPage.getModules_names());

    }


    @Then("User sees the Inbox Page:")
    public void userSeesTheInboxPage() {
        BrowserUtils.waitForInvisibilityOf(inventoryModulesPage.loadingbar);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[@class='oe_topbar_name']")).isDisplayed());
    }
    @Then("user will click each module and verify Title.")
    public void userWillClickEachModuleAndVerifyTitle() {

inventoryModulesPage.verifyIfTabsAreClickable();

    }


    @Then("User should be able to access the following expected {int} modules:")
    public void userShouldBeAbleToAccessTheFollowingExpectedModules(int arg0) {
    }
}
