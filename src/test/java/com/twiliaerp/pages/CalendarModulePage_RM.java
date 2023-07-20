package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarModulePage_RM {

   public CalendarModulePage_RM(){
       PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@href='/web#menu_id=120&action=136']")
    public WebElement calendarOption;

   @FindBy(xpath = "//button[.='Day']")
    public WebElement dayOption;

   @FindBy(xpath = "//button[.='Week']")
    public WebElement weekOption;

   @FindBy(xpath = "//button[.='Month']")
    public WebElement monthOption;





}
