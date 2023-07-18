Feature: Sale Page table display and search functionality
  Agile Story: B29G32-213 US07 As a POS & sales manager, I should be able to get correct information on the Sales page.

  @wip
  Scenario: Verify "Quotations" Table Columns for Pos Manager
    Given A Pos manager is logged in
    When The user navigates to the Sales Page
    Then The “Quotations” table should display 6 columns

  @wip
  Scenario: Verify "Quotations" Table Columns for Sales Manager
    Given A Sales manager is logged in
    When The user navigates to the Sales Page
    Then The “Quotations” table should display 6 columns

  Scenario: Search Desired Order by Quotation Number for Pos Manager
    Given A Pos manager is logged in
    And The user is on the Sales Page
    When The user enters a valid order number into the search box
    And The user clicks the left mouse button on the “Search sale order” menu item
    Then The user should see the table with only the desired order

  Scenario: Search Desired Order by Quotation Number for Sales Manager
    Given A Sales manager is logged in
    And The user is on the Sales Page
    When The user enters a valid order number into the search box
    And The user clicks the left mouse button on the “Search sale order” menu item
    Then The user should see the table with only the desired order
