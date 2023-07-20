@US16_B29G32_222
Feature: As an Expenses manager, I should be able to access the main modules.

  Background: User already on the Login Page

  Scenario Outline: user should be able to click and access all the modules
    When User enters "<email>" into Email input box and "<password>" into Password input box, and clicks log in button
    Then User sees the Inbox Page:
    Then user should click each module and verify accessibility.
    Examples:
      | email                    | password        |
      | expensesmanager50@info.com | expensesmanager |
      | expensesmanager30@info.com | expensesmanager |
      | expensesmanager80@info.com | expensesmanager |




