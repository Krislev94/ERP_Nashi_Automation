Feature: US06 As a PosManager, I should be able to add new products to inventory.

  Background: User is already in the log in page

  @inventoryGB
  Scenario: user can create a new product by filling only the Product Name input box.
  User clicks the save button, the information of the customer
  which the user entered should be displayed.
    Given the user is already logged in
    Then user clicks on the Inventory tab
    And user clicks on the Products tab
    Then user clicks on the Create button
    Then user fills out the Product Name input box
    Then user clicks on Save button
    Then user should see saved product displayed
    Then user clicks on the Products tab
    Then user finds the created element in the product list


  @inventoryGB
  Scenario: when clicking any product and then clicking the edit button all the boxes entered
  information can be editable again.
    Given the user is already logged in
    Then user clicks on the Inventory tab
    Then user clicks on the Products tab
    Then user clicks on any product
    And user clicks on edit button
    And user edits the product information in the input box input
    Then user clicks on Save button
    Then user should see the saved changes displayed
