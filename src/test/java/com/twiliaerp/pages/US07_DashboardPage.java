package com.twiliaerp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US07_DashboardPage extends US07_PageBase {
    @FindBy (xpath = "//*[text()='Loading']")
    WebElement loadingBadge;
}
