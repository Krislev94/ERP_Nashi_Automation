package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RepairModulePage_DD {

    public RepairModulePage_DD(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@data-menu='535']")
    public WebElement repairsButton;


    @FindBy(xpath = "//th[@width='1']//input")
    public WebElement repairReferenceButton;


    @FindBy(xpath = "//table//tbody//tr/td[1]//input")
    public List<WebElement> allRepairs;


}
