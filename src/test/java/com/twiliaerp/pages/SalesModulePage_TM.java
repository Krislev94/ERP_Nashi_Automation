package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesModulePage_TM {

    public SalesModulePage_TM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement SalesModuleButton;

    @FindBy(xpath = "//a[@data-menu='447']")
    public WebElement CustomersModuleButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement CreateButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement NameField;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement SaveButton;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement NameOnCreatedCustomerForm;

}
