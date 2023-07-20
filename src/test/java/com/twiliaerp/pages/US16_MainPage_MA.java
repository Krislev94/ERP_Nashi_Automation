package com.twiliaerp.pages;

import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class US16_MainPage_MA extends  BasePage{

        @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//span")
        public List<WebElement> modules;

        @FindBy(xpath = "//*[text()='Loading']")
        public WebElement loadingbar;

        @FindBy(xpath = "//a[@data-menu='logout']")
         public WebElement logOutButton;
        public void verifyIfTabsAreClickable() {
            int count = modules.size();

            while (count > 0) {
                String tabStatus;
                int index = modules.size() - count;//0

                if (index == 4 || index == 9) {
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
//            logOutButton.click();

        }


    }

