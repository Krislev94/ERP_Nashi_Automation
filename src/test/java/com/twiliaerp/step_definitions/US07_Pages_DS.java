package com.twiliaerp.step_definitions;

import com.twiliaerp.pages.US07_InboxPage;
import com.twiliaerp.pages.US07_MainPage;
import com.twiliaerp.pages.US07_QuotationsPage;
import com.twiliaerp.pages.US99_CalendarPage;

public abstract class US07_Pages_DS {

    private US07_MainPage mainPage;
    private US07_InboxPage inboxPage;
    private US07_QuotationsPage quotationsPage;

    private US99_CalendarPage calendarPage;


    protected US07_MainPage getMainPage() {
        if (mainPage == null) {
            mainPage = new US07_MainPage();
        }
        return mainPage;
    }

    protected US07_QuotationsPage getQuotationPage() {
        if (quotationsPage == null) {
            quotationsPage = new US07_QuotationsPage();
        }
        return quotationsPage;
    }

    protected US07_InboxPage getInboxPage() {
        if (inboxPage == null) {
            inboxPage = new US07_InboxPage();
        }
        return inboxPage;
    }

    protected US99_CalendarPage getCalendarPage() {
        if (calendarPage == null) {
            calendarPage = new US99_CalendarPage();
        }
        return calendarPage;
    }


}
