Feature: POS Manager module access verification
  US13: As a POS manager, I should be able to access the main modules.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify the POS managers access to 22 modules
    Given the user logged in with valid "<email>" and "<password>" for POS manager
    Then User should be able to access all 22 modules

    Examples:
      | email                 | password   |
      | posmanager7@info.com  | posmanager |
     ## | posmanager20@info.com | posmanager |

