package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainModulesPage_BV extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'Discuss')]/../..")
    public WebElement discussModule;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement topBarName;

    //List of WebElements outside the dropdown
    @FindBy(xpath = "//li[@id='menu_more_container']/preceding-sibling::li")
    public List<WebElement> menuTabs;

    //List of WebElements inside the dropdown
    @FindBy(xpath = "//li[@id='menu_more_container']//li")
    public List<WebElement> moreTabs;

    @FindBy(xpath = "//li[@id='menu_more_container']")
    public WebElement moreDropdown;


    public void verifyTabsAreClickable(int numberOfModules){

        Assert.assertEquals(menuTabs.size()+moreTabs.size(), numberOfModules);

        for (WebElement menuTab : menuTabs) {
            //System.out.println(menuTab.getText());
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            menuTab.click();
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Loading']")));
            Driver.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            Assert.assertEquals("active", menuTab.getAttribute("class"));
        }

        for (WebElement moreTab : moreTabs) {
            moreDropdown.click();
            moreTab.click();
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Loading']")));
            Assert.assertEquals("active", moreTab.getAttribute("class"));
        }

    }




}
