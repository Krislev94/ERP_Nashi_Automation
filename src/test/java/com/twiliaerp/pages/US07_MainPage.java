package com.twiliaerp.pages;

import com.twiliaerp.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

public class US07_MainPage extends US07_PageBase {
    @FindBy (css = "#login")
    public WebElement emailInputBox;

    @FindBy (css = "#password")
    public WebElement passwordInputBox;

    @FindBy (css = "[type='submit']")
    public WebElement loginButton;

    public void loginAsPosManager(){
        fillInInputBox(emailInputBox, ConfigurationReader.getProperty("pos.manager.email"));
        fillInInputBox(passwordInputBox, ConfigurationReader.getProperty("pos.manager.password"));
        clickButton(loginButton);
    }

    public void loginAsSalesManager(){
        fillInInputBox(emailInputBox, ConfigurationReader.getProperty("sales.manager.email"));
        fillInInputBox(passwordInputBox, ConfigurationReader.getProperty("sales.manager.password"));
        clickButton(loginButton);
    }









}
