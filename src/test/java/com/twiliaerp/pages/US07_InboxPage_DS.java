package com.twiliaerp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US07_InboxPage_DS extends US07_PageBase_DS {

    @FindBy(xpath = "//*[text()='Loading']")
    public WebElement loadingBadge;


}
