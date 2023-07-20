package com.twiliaerp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US07_MainPage extends US07_PageBase {


    @FindBy(css = "#login")
    public WebElement emailInputBox;

    @FindBy(css = "#password")
    public WebElement passwordInputBox;

    @FindBy(css = "[type='submit']")
    public WebElement loginButton;


    public void loginAsPosManager() {
        String posManagerEmail = "posmanager10@info.com";
        String posManagerPassword = "posmanager";
        fillInInputBox(emailInputBox, posManagerEmail);
        fillInInputBox(passwordInputBox, posManagerPassword);
        clickButton(loginButton);
    }

    public void loginAsSalesManager() {
        String salesManagerEmail = "salesmanager10@info.com";
        String salesManagerPassword = "salesmanager";
        fillInInputBox(emailInputBox, salesManagerEmail);
        fillInInputBox(passwordInputBox, salesManagerPassword);
        clickButton(loginButton);
    }


}
