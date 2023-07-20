package com.twiliaerp.pages;

import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class US14_InventoryModulesPage extends BasePage {
    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//span")
    public List<WebElement> modules;

    @FindBy(xpath = "//*[text()='Loading']")
    public WebElement loadingbar;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement inventoryMngProfile;

    public void verifyIfTabsAreClickable() {
        int count = modules.size();

        while (count > 0) {
            String tabStatus;
            int index = modules.size() - count;//0

            if (index == 4 || index == 13) {
                count--;
                continue;
            }

            if (index == 0) {
                count--;
                continue;
            }
            modules.get(index).click();
            try {
                BrowserUtils.waitForInvisibilityOf(loadingbar);
            } catch (TimeoutException e) {
                e.printStackTrace();
            }


            Driver.getDriver().navigate().back();
            BrowserUtils.waitForInvisibilityOf(loadingbar);

            count--;
        }
    }


}

