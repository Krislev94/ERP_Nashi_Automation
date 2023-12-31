package com.twiliaerp.pages;


import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="login")
    public WebElement emailInput;

    @FindBy(xpath="//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement accountName;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement incorrectPasswordMessage;
    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginOrPasswordMessage;


    public void login(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
        // verification that we logged
    }

}
