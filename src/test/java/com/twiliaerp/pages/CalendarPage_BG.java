package com.twiliaerp.pages;


import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage_BG {
    LoginPage loginPage = new LoginPage();
    public CalendarPage_BG(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[normalize-space()='Calendar']")
    public WebElement CalendarModulePage;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement eventCreateInputBox;

    @FindBy(xpath = "//span[normalize-space()='Create']")
    public WebElement eventCreateButtonclick;

    @FindBy(xpath = "//span[@name='start_datetime']")
    public WebElement startDateTime;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement eventTitle;



    /**
     * This method is designed to move the mouse cursor to a specific date and time within the calendar module of the twiliaerp.com website.
     * Once the method execution is completed, a window will open to create an event.
     * For the subsequent steps, data input is required on the opened page.
     * However, this method will not provide the data necessary to create the event.
     * This method accepts TimeValue and DayValue as String data types.
     * TimeValue must be in the following format: HH:MM:SS
     * DayValue only accepts these days, other inputs may cause issues: "Saturday", "Friday", "Thursday", "Wednesday"
     * DayValue must be in this format: Day (e.g., "Wednesday", "Friday")
     * @param TimeValue
     * @param dayValue
     */
    public static void eventHandler(String TimeValue,String dayValue){
        Actions action = new Actions(Driver.getDriver());
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement timeRow = Driver.getDriver().findElement(By.cssSelector("tr[data-time='" + TimeValue + "']"));

        WebElement elementToBeScrolledToUp = Driver.getDriver().findElement(By.xpath("//tr[@data-time='00:00:00']"));
        WebElement elementToBeScrolledToDown = Driver.getDriver().findElement(By.xpath("//tr[@data-time='23:00:00']"));

        int xOffset = timeRow.getSize().getWidth();
        int yOffset = timeRow.getSize().getHeight();

        String[] timeParts = TimeValue.split(":");
        int hour = Integer.parseInt(timeParts[0]);


        if (hour < 5) {
            js.executeScript("arguments[0].scrollIntoView(true)",elementToBeScrolledToUp);
        }
        if (hour > 20) {
            js.executeScript("arguments[0].scrollIntoView(true)",elementToBeScrolledToDown);
        }

        switch (dayValue){
            case "Saturday":
               xOffset = (xOffset / 2);
                action.moveToElement(timeRow, xOffset, yOffset).click().perform();
               break;
            case "Friday":
                xOffset = (xOffset / 4);
                action.moveToElement(timeRow, xOffset, yOffset).click().perform();
                break;
            case "Thursday":
                xOffset = (xOffset / 6);
                action.moveToElement(timeRow, xOffset, yOffset).click().perform();
                break;
            case "Wednesday":
                xOffset = (xOffset / 12);
                action.moveToElement(timeRow, xOffset, yOffset).click().perform();
                break;

            }
        }

    }




