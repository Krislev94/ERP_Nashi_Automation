package com.twiliaerp.pages;

import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US07_SalesPage extends US07_PageBase {
    @FindBy(xpath = "//*[text()='Loading']")
    public WebElement loadingBadge;

    @FindBy(xpath = "//th[string-length(text())>0]")
    public List<WebElement> columnTextHeaders;

    @FindBy(xpath = "//*[@class='o_searchview_input']")
    public WebElement searchInputBox;


    public void loadPage(){
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("sales.page.url"));
        BrowserUtils.waitForInvisibilityOf(loadingBadge);
    }
}
