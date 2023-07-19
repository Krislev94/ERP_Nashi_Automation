package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage_BG {

    public DocumentationPage_BG(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[normalize-space()='User Docs']")
    public WebElement user_docs_verify;

    @FindBy(xpath = "//div[normalize-space()='Install and Maintain']")
    public WebElement install_and_maintain_verify;

    @FindBy(xpath = "//div[normalize-space()='Developer']")
    public WebElement developer_verify;

    @FindBy(xpath = "//div[normalize-space()='Contributing']")
    public WebElement contributing_verify;
}
