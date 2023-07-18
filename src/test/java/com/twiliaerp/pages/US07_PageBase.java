package com.twiliaerp.pages;

import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.Utilities;

public abstract class US07_PageBase {
    public US07_PageBase(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    /**
     *  Scrolls to and fills in the provided input box with given text.
     * @param webElement - input box to fill in
     * @param text - text to pass to input box
     */
    public void fillInInputBox(WebElement webElement, String text){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",webElement);
        new Actions(Driver.getDriver()).moveToElement(webElement).click().sendKeys(text).perform();
    }

    /**
     *  Scrolls to and clicks the given web element.
     * @param webElement - input box to fill in
     */
    public void clickButton(WebElement webElement){
        try{
            JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
            js.executeScript("arguments[0].scrollIntoView();",webElement);
            BrowserUtils.waitForVisibility(webElement,10);
            new Actions(Driver.getDriver()).moveToElement(webElement).click().perform();

        } catch (TimeoutException e){
            throw new RuntimeException("Desired element not found on the page by URL:" + Driver.getDriver().getCurrentUrl());
        }
    }





}
