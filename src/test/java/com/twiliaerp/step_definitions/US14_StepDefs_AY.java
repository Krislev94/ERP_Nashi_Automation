package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.US14_InventoryModulesPage;
import com.twiliaerp.pages.LoginPage;
import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.*;

public class US14_StepDefs_AY {
    US14_InventoryModulesPage inventoryModulesPage = new US14_InventoryModulesPage();
    LoginPage loginPage = new LoginPage();

    @Given("User enters {string} into email input box and {string} into password input box, and clicks log in button")
    public void userEntersIntoEmailInputBoxAndIntoPasswordInputBox(String username, String Password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(username, Password);
        BrowserUtils.waitForInvisibilityOf(inventoryModulesPage.loadingbar);
    }

    @Then("User sees the Inbox Page:")
    public void userSeesTheInboxPage() {
        BrowserUtils.waitForInvisibilityOf(inventoryModulesPage.loadingbar);
        Assert.assertTrue(inventoryModulesPage.inventoryMngProfile.isDisplayed());
    }

    @Then("user will click each module and verify accessibility.")
    public void userWillClickEachModuleAndVerifyTitle() {

        inventoryModulesPage.verifyIfTabsAreClickable();

    }


}
