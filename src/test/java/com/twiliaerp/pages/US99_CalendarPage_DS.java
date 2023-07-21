package com.twiliaerp.pages;

import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class US99_CalendarPage_DS extends US07_PageBase_DS {


    @FindBy(xpath = "//*[text()='Loading']")
    public WebElement loadingBadge;

    @FindBy(xpath = "//button[text()='Day']")
    public WebElement dayCalendarButton;
    @FindBy(xpath = "//button[text()='Week']")
    public WebElement weekCalendarButton;
    @FindBy(xpath = "//button[text()='Month']")
    public WebElement monthCalendarButton;

    @FindBy(xpath = "//*[starts-with(@class,'fc-day-header fc-widget-header')]")
    public List<WebElement> dayHeaders;

    @FindBy(xpath = "//*[@data-time]")
    public List<WebElement> timeRaws;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement inputBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement createButton;

    @FindBy(xpath = "//button[*='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[*='Ok']")
    public WebElement okButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement eventHeader;

    public static final String CALENDAR_TAB_NAME = "Calendar";
    public static final String CALENDAR_TAB_TITLE = "Meetings - Odoo";

    Actions actions = new Actions(Driver.getDriver());

    public void activateWeekCalender() {
        if (!weekCalendarButton.getAttribute("class").contains("active")) {
            new Actions(Driver.getDriver()).moveToElement(weekCalendarButton).click().perform();
        }
        BrowserUtils.waitForInvisibilityOf(loadingBadge);
    }

    public void activateDayCalender() {
        if (!dayCalendarButton.getAttribute("class").contains("active")) {
            new Actions(Driver.getDriver()).moveToElement(dayCalendarButton).click().perform();
        }
        BrowserUtils.waitForInvisibilityOf(loadingBadge);
    }

    public void activateMonthCalender() {
        if (!monthCalendarButton.getAttribute("class").contains("active")) {
            new Actions(Driver.getDriver()).moveToElement(monthCalendarButton).click().perform();
        }
        BrowserUtils.waitForInvisibilityOf(loadingBadge);
    }

    public void loadPage() {
        BrowserUtils.waitForInvisibilityOf(loadingBadge);
        navigateToMainMenuSection(CALENDAR_TAB_NAME);
        Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs(CALENDAR_TAB_TITLE));
    }


    public void findAndClickCell(String day, String time) {
        int[] coordinates = scrollAndGetCoordinate(day,time);
        actions.moveByOffset(coordinates[0], coordinates[1]).click().perform();
        actions.moveByOffset(-coordinates[0], -coordinates[1]).perform();

    }

    public void verifyIfCellHasEvent(String day, String time) {
        int[] coordinates = scrollAndGetCoordinate(day,time);
        actions.moveByOffset(coordinates[0], coordinates[1]).click().perform();
        BrowserUtils.waitForVisibility(eventHeader,10);
        Assert.assertNotEquals("Create", eventHeader.getText());
        try {
            deleteButton.click();
            BrowserUtils.waitForVisibility(okButton,10);
            okButton.click();
        } catch (NoSuchElementException e){
            e.addInfo("Cause","No event were found!!!");
            e.printStackTrace();
        }

    }

    private int[] scrollAndGetCoordinate(String day, String time){
        time = formatTime(time);

        String xpathDayColumnLocator = "//th[contains(@class,'" + day.toLowerCase().trim().substring(0, 3) + "')]";
        String xpathTimeRawLocator = "//*[@data-time='" + time + ":00']";

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView()", Driver.getDriver().findElement(By.xpath(xpathTimeRawLocator)));

        int xCoordinateToClick = Driver.getDriver().findElement(By.xpath(xpathDayColumnLocator)).getLocation().getX();
        int yCoordinateToClick = Driver.getDriver().findElement(By.xpath(xpathTimeRawLocator)).getLocation().getY();

        return new int[]{xCoordinateToClick,yCoordinateToClick};
    }

    private String formatTime(String time) {

        char[] chars = time.trim().toCharArray();

        if (chars.length < 4) {
            throw new IllegalArgumentException("Desired time value MUST contain 1 or 2 integers for hours, separator, 2 integers for minutes");
        }

        int separatorIndex = -1;
        StringBuilder hours = new StringBuilder();
        StringBuilder minutes = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            boolean isInteger = chars[i] > 47 && chars[i] < 58;
            if (separatorIndex < 0 && isInteger) {
                hours.append(chars[i]);
            } else if (separatorIndex > 0 && isInteger) {
                minutes.append(chars[i]);
            } else {
                if (hours.length() != 0) {
                    separatorIndex = i;
                }
            }
        }

        if (hours.length() > 2 || hours.length() < 1) {
            throw new IllegalArgumentException("Desired hours value MUST contain 1 or 2 integers for hours");
        }

        if (Integer.parseInt(hours.toString()) > 23) {
            throw new IllegalArgumentException("Desired hours value MUST be from range: 0-23");
        }

        if (Integer.parseInt(hours.toString()) < 10 && hours.length() == 1) {
            hours.insert(0, 0);
        }

        result.append(hours).append(":");


        if (minutes.length() > 2 || minutes.length() < 1) {
            throw new IllegalArgumentException("Desired minutes value MUST contain 1 or 2 integers for hours");
        }

        if (Integer.parseInt(minutes.toString()) > 59) {
            throw new IllegalArgumentException("Desired minutes value MUST be from range: 0-59");
        }

        if (Integer.parseInt(minutes.toString()) >= 30) {
            result.append("30");
        } else {
            result.append("00");
        }

        return result.toString();
    }


}
