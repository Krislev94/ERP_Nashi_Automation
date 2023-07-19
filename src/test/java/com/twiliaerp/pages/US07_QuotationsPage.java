package com.twiliaerp.pages;

import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class US07_QuotationsPage extends US07_PageBase {

    @FindBy(xpath = "//*[text()='Loading']")
    public WebElement loadingBadge;

    @FindBy(xpath = "//th[string-length(text())>0]")
    public List<WebElement> columnTextHeaders;

    @FindBy(xpath = "//thead")
    public WebElement tableHeader;

    @FindBy(xpath = "//*[@class='o_searchview_input']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//em[text()='Sales Order']")
    public WebElement salesOrderSearchBoxDropdownMenuItem;

    @FindBy(xpath = "(//tr[starts-with(@class,'o_data_row')]//td)[2]")
    public WebElement searchResultQuotationNumberCellForSalesOrder;

    public static final String EXPECTED_TITLE = "Quotations - Odoo";


    public void loadPage() {
        BrowserUtils.waitForInvisibilityOf(loadingBadge);
        navigateToMainSection(SALES_TAB_NAME);
        Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Quotations - Odoo"));
    }

    public void fillInSearchBox(String query) {
        fillInInputBox(searchInputBox, query);

    }

    public void runSearchSalesOrder() {
        clickButton(salesOrderSearchBoxDropdownMenuItem);
        BrowserUtils.waitForInvisibilityOf(loadingBadge);
    }


}
