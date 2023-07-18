package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage_GB {

    public InventoryPage_GB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Inventory']")
    public WebElement inventoryTab;

    @FindBy(xpath = "//a[@class='oe_menu_leaf' and @data-menu='378']/span[@class='oe_menu_text' and normalize-space()='Products']")
    public WebElement productsTab;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@placeholder='Product Name']")
    public WebElement productNameInput;








}

//"//span[normalize-space()='Products' and contains(@class, 'oe_menu_text')]"
