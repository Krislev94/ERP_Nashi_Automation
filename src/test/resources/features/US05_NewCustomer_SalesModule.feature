Feature: US05 As a Sales Manager, I should be able to create a new customer from "Sales" module

  Background: User is a already logged in as a Sales Manager
    Given user is on the main page logged in as Sales Manager


  @WIP_TIM
  Scenario Outline: The user can create a new customer by filling only the Name input box and after clicking the save button,
  the information of the customer which the user entered should be displayed.

    When User clicks Sales button
    And User clicks Customers tab
    And User clicks Create button
    And User only fills out "<Name>" field
    And User clicks Save button
    Then User sees new customer profile created with same "<Name>"

    Examples:
      | Name            |
      | Crystal Metheny |
      | Edward Cocaine  |
      | Forget-Me Phill |

  @WIP_TIM
  Scenario: When clicking any customer and then clicking the edit button all the boxes entered information
  can be editable again.