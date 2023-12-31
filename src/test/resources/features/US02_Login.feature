@B29G32-258
Feature: Users should be able to login
  US02: As sales and expenses manager, I want to Log in with valid credentials and get my account name.
  AC:
  1. Verify that the user can log in with valid credentials either by clicking on the "Login" button or hitting the "Enter" key on the keyboard.
  2. Verify the "Wrong login/password" error message should be displayed after entering the invalid credentials
  3. Verify that the user gets the "Please fill in this field." message for at least one blank field.

  Background: user already is on the login page
    Given user is on the login page

  @B29G32-227
  Scenario Outline: US02-AC01-TC01 Verify that the user can login with valid credentials by clicking Log in button
    And user enters email "<email>"
    Then user enters password "<password>"
    And user clicks login button
    Then user sees account name as "<name>"


    Examples:
      | email                    | password     | name            |
      | salesmanager105@info.com | salesmanager | SalesManager105 |
      | salesmanager15@info.com  | salesmanager | SalesManager15  |
      | salesmanager55@info.com  | salesmanager | SalesManager55  |


    Examples:
      | email                      | password        | name              |
      | expensesmanager10@info.com | expensesmanager | ExpensesManager10 |
      | expensesmanager65@info.com | expensesmanager | ExpensesManager65 |
      | expensesmanager72@info.com | expensesmanager | ExpensesManager72 |


  @B29G32-228
  Scenario Outline: US02-AC01-TC02 Verify that the user can login with valid credentials by hitting "Enter" key
    And user enters email "<email>"
    Then user enters password "<password>"
    And user hits Enter on the keyboard
    Then user sees account name as "<name>"


    Examples:
      | email                    | password     | name            |
      | salesmanager105@info.com | salesmanager | SalesManager105 |
      | salesmanager15@info.com  | salesmanager | SalesManager15  |
      | salesmanager55@info.com  | salesmanager | SalesManager55  |


    Examples:
      | email                      | password        | name              |
      | expensesmanager10@info.com | expensesmanager | ExpensesManager10 |
      | expensesmanager65@info.com | expensesmanager | ExpensesManager65 |
      | expensesmanager72@info.com | expensesmanager | ExpensesManager72 |


  @B29G32-229
  Scenario: US02-AC02-TC03 Verify "Wrong login/password" error message is displayed when user enters invalid email
    And user enters invalid email "crmmanager55@info.com"
    Then user enters password "eventcrmmanager55"
    And user clicks login button
    Then user sees "Wrong login/password" error message


  @B29G32-230
  Scenario: US02-AC02-TC04 Verify "Wrong login/password" error message is displayed when user enters invalid password
    And user enters email "crmmanager55@info.com"
    Then user enters invalid password "eventcrmmanager55"
    And user clicks login button
    Then user sees "Wrong login/password" error message


  @B29G32-231
  Scenario: US02-AC02-TC05 Verify "Wrong login/password" error message is displayed when user enters invalid email and invalid password
    And user enters invalid email "crmmanager55@info.com"
    Then user enters invalid password "event55"
    And user clicks login button
    Then user sees "Wrong login/password" error message


  @B29G32-232
  Scenario: US02-AC03-TC06 Verify user gets the "Please fill in this field." message for at least one blank field.
    And user leaves email and password inputs empty and clicks login
    Then user sees at least one "Please fill out this field." message


  @B29G32-233
  Scenario: US02-AC01-TC07 Verify user gets "Please fill out this field." message for at least one blank field
    And user enters email "eventcrmmanager55@info.com"
    And user leaves password input empty and clicks login
    Then user sees at least one "Please fill out this field." message