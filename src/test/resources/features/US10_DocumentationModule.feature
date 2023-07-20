@batu
Feature: Access the Odoo Documentation Page
  As a user, I want to access the Odoo Documentation page.

  Scenario Outline: "Odoo Documentation" message should be displayed in a new window.

    Given user is on the login page
    When user log in with "<username>" and "<password>"
    Then user navigates to Discuss page
    And User clicks the username on right top corner
    Then User should see documentation option in window

    Examples:
      | username             | password   |
      | posmanager5@info.com | posmanager |
      | posmanager6@info.com | posmanager   |

  Scenario Outline: 4 main document topics should be listed.
    Given user is on the login page
    When user log in with "<username>" and "<password>"
    Then user navigates to Discuss page
    And User clicks the username on right top corner
    Then User clicks documentation option
    And user should see "<option1>" "<option2>" "<option3>" "<option4>"

    Examples:

      | username             | password   | option1   | option2              | option3   | option4      |
      | posmanager5@info.com | posmanager | User Docs | Install and Maintain | Developer | Contributing |
      | posmanager6@info.com | posmanager   | User Docs | Install and Maintain | Developer | Contributing |
