
Feature: User repairs module

  Scenario Outline: Verify users can select all the repair orders by clicking the top checkbox

    Given User login with "<email>" and "<password>"
    When User clicks Repairs button
    And User clicks Repair Reference checkbox
    Then User selects all repair orders
    Examples:
      | email                 | password   |
      | posmanager55@info.com | posmanager |
      | posmanager67@info.com | posmanager |
      | posmanager89@info.com | posmanager |

    Examples:
      | email                   | password     |
      | salesmanager55@info.com | salesmanager |
      | salesmanager67@info.com | salesmanager |
      | salesmanager89@info.com | salesmanager |



