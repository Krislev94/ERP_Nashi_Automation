package com.twiliaerp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainModulesPage_BV extends BasePage {

    //List of WebElements outside the dropdown
    @FindBy(xpath = "//li[@id='menu_more_container']/preceding-sibling::li")
    public List<WebElement> menuTabs;

    //List of WebElements inside the dropdown
    @FindBy(xpath = "//li[@id='menu_more_container']//span")
    public List<WebElement> moreTabs;

    @FindBy(xpath = "(//*[@class='caret'])[1]")
    public WebElement moreDropdown;






}
