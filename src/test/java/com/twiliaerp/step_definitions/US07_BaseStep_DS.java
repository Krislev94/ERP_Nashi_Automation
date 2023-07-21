package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.US07_InboxPage_DS;
import com.twiliaerp.pages.US07_MainPage_DS;
import com.twiliaerp.pages.US07_QuotationsPage_DS;
import com.twiliaerp.pages.US99_CalendarPage_DS;

public abstract class US07_BaseStep_DS {

    private US07_MainPage_DS mainPage;
    private US07_InboxPage_DS inboxPage;
    private US07_QuotationsPage_DS quotationsPage;

    private US99_CalendarPage_DS calendarPage;


    protected US07_MainPage_DS getMainPage() {
        if (mainPage == null) {
            mainPage = new US07_MainPage_DS();
        }
        return mainPage;
    }

    protected US07_QuotationsPage_DS getQuotationPage() {
        if (quotationsPage == null) {
            quotationsPage = new US07_QuotationsPage_DS();
        }
        return quotationsPage;
    }

    protected US07_InboxPage_DS getInboxPage() {
        if (inboxPage == null) {
            inboxPage = new US07_InboxPage_DS();
        }
        return inboxPage;
    }

    protected US99_CalendarPage_DS getCalendarPage() {
        if (calendarPage == null) {
            calendarPage = new US99_CalendarPage_DS();
        }
        return calendarPage;
    }


}
