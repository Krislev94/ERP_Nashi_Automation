Feature: calendar feature
  Agile user story: B29G32-210 US04 As a POS manager, I should be able to create events on my calendar from "Calendar" module

  Background: The POS Manager is on the calendar page and have week calendar active
    Given A user is on the main page
    When The user enters valid email "posmanager10@info.com" and password "posmanager"
    And The user clicks the Log in button
    And The user navigates to the Calendar Page
    Then The user clicks “Week” on the calendar display selector


  Scenario Outline: verify if user can create an event
    Given The user sees week calendar with 7 columns for each day and 48 time slots raws
    When The user clicks on the cell for the desired "<Day of the week>" and "<Time>"
    And The user enters "<Event Title>" into the Summary input box
    And The user clicks Create button
    Then The user should be able to see the event on the calendar dashboard for the desired "<Day of the week>" and "<Time>"

    Examples:
      | Day of the week | Time  | Event Title  |
      | Sunday          | 13:00 | Test Event 1 |
      | Monday          | 23:30 | Test Event 2 |
      | Tuesday         | 02:30 | Test Event 3 |
      | Wednesday       | 10:00 | Test Event 4 |
      | Thursday        | 12:00 | Test Event 5 |
      | Friday          | 17:30 | Test Event 6 |
      | Saturday        | 23:00 | Test Event 7 |
