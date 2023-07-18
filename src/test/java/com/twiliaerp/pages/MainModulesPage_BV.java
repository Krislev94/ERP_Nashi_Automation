package com.twiliaerp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainModulesPage_BV extends BasePage {

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> menuTabs;




}
