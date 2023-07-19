package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscussPage_BG {
    public DiscussPage_BG(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Discuss']")
    public WebElement discussPageButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement accountBar;

    @FindBy(xpath = "//a[@data-menu='documentation']")
    public WebElement documentationPagebar;

    
}
