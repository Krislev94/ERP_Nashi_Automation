package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairModulePage_DD {

    public RepairModulePage_DD(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//li[@class='active'])[1]/a")
    public WebElement repairsButton;





}
