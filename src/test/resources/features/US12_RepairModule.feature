@wip
Feature: User repairs module
  Scenario: Verify users can select all the repair orders by clicking the top checkbox
  Given User is on the homepage
    When User clicks Repairs button
    And User clicks Repair Reference checkbox
    Then User selects all repair orders

