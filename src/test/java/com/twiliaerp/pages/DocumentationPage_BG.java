package com.twiliaerp.pages;

import com.twiliaerp.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DocumentationPage_BG {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
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

    public  void docVerificationHandler(String str1,String str2,String str3,String str4){
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String eachWindow : windowHandles) {
            if (!eachWindow.equals(Driver.getDriver().getWindowHandle())){
                Driver.getDriver().switchTo().window(eachWindow);
            }
        }

        Assert.assertEquals(user_docs_verify.getText(), str1);
        Assert.assertEquals(install_and_maintain_verify.getText(), str2);
        Assert.assertEquals(developer_verify.getText(), str3);
        Assert.assertEquals(contributing_verify.getText(), str4);





    }
}
