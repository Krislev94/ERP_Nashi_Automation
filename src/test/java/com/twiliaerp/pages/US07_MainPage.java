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

    public static final String URL = ConfigurationReader.getProperty("url");


    public void loginAsPosManager() {
        String posManagerEmail = "posmanager10@info.com";
        String posManagerPassword = "posmanager";
        fillInCredentials(posManagerEmail,posManagerPassword);
        clickLoginButton();
    }

    public void loginAsSalesManager() {
        String salesManagerEmail = "salesmanager10@info.com";
        String salesManagerPassword = "salesmanager";
        fillInCredentials(salesManagerEmail,salesManagerPassword);
        clickLoginButton();
    }

    public void fillInCredentials(String username, String password){
        fillInInputBox(emailInputBox, username);
        fillInInputBox(passwordInputBox, password);
    }

    public void clickLoginButton(){
        clickButton(loginButton);
    }


}
