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

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//p[text()='Product Template created']")
    public WebElement createdProductConfirmation;

    @FindBy(xpath = "//div[@class='oe_kanban_details']")
    public WebElement findAnyProduct;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

    @FindBy(xpath = "//strong[@class='o_kanban_record_title' and span/text()='Golden Doodle']")
    public WebElement savedElementOnList;
}

//"//span[normalize-space()='Products' and contains(@class, 'oe_menu_text')]"

//"//strong[@class='o_kanban_record_title' and span/text()='Golden Doodle']"
