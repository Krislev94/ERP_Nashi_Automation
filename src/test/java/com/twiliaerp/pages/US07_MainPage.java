package com.twiliaerp.pages;

import com.twiliaerp.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US07_MainPage extends US07_PageBase {


    @FindBy(css = "#login")
    public WebElement emailInputBox;

    @FindBy(css = "#password")
    public WebElement passwordInputBox;

    @FindBy(css = "[type='submit']")
    public WebElement loginButton;

    private String posManagerEmail = "posmanager10@info.com";
    private String posManagerPassword = "posmanager";

    private String salesManagerEmail = "salesmanager10@info.com";
    private String salesManagerPassword = "salesmanager";


    public void loginAsPosManager() {
        fillInInputBox(emailInputBox, posManagerEmail);
        fillInInputBox(passwordInputBox, posManagerPassword);
        clickButton(loginButton);
    }

    public void loginAsSalesManager() {
        fillInInputBox(emailInputBox, salesManagerEmail);
        fillInInputBox(passwordInputBox, salesManagerPassword);
        clickButton(loginButton);
    }


}
