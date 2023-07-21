Feature: Sale Page table display and search functionality
  Agile Story: B29G32-213 US07 As a POS & sales manager, I should be able to get correct information on the Quotations page.

  @wip
  Scenario: Verification of the "Quotations" Table Columns number displayed for POS Manager
    Given A POS manager is logged in
    When The user navigates to the Quotations Page
    Then The “Quotations” table should display 6 columns

  @wip
  Scenario: Verification of the "Quotations" Table Columns number displayed for ales Manager
    Given A Sales manager is logged in
    When The user navigates to the Quotations Page
    Then The “Quotations” table should display 6 columns

  @wip
  Scenario Outline: Search Desired Order by Quotation Number for POS Manager
    Given A POS manager is logged in
    And The user is on the Quotations Page
    When The user enters a valid "<Sales Order number>" into the search box
    And The user clicks the left mouse button on the “Search Sale Order” popup menu item
    Then The user should see the table with the only order matched by its number the searched "<Sales Order number>"

    Examples:
      | Sales Order number |
      | SO150              |
      | SO110              |

  @wip
  Scenario Outline: Search Desired Order by Quotation Number for Sales Manager
    Given A Sales manager is logged in
    And The user is on the Quotations Page
    When The user enters a valid "<Sales Order number>" into the search box
    And The user clicks the left mouse button on the “Search Sale Order” popup menu item
    Then The user should see the table with the only order matched by its number the searched "<Sales Order number>"

    Examples:
      | Sales Order number |
      | SO811              |
      | SO063              |
