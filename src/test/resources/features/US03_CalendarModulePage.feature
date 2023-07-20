@US03_B29G32
Feature: Calendar Page Display Options
  As a user, I want to see the calendar page as daily, weekly (as a default), and monthly.

  Scenario Outline: User successfully logs in with valid credentials
    Given User enters "<Email>" and "<Password>" on the login page
    When User clicks to Calendar module
    Then User clicks to Day option
    And User should see the calendar displayed as daily
    When User clicks to Week option
    Then User should see the calendar displayed as weekly
    When User clicks to Month option
    And  User should see the calendar displayed as monthly

    Examples:
      | Email                 | Password         |
      | posmanager50@info.com | posmanager       |
      | posmanager155@info.com| posmanager       |
      | imm20@info.com        | inventorymanager |




