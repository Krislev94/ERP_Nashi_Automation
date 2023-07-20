@US14_B29G32_220
Feature: As an Inventory manager, I should be able to access the main modules.

  Background: User already on the Login Page

  Scenario Outline: User logins as an inventory manager with inventory managers credentials
    When User enters "<email>" into email input box and "<password>" into password input box, and clicks log in button
    Then User sees the Inbox Page:
    Examples:
      | email          | password         |
      | imm11@info.com | inventorymanager |
      | imm13@info.com | inventorymanager |
      | imm14@info.com | inventorymanager |


  Scenario: super scenario
    When User enters "imm11@info.com" into email input box and "inventorymanager" into password input box, and clicks log in button
    Then user will click each module and verify Title.
      #| Discuss         |
      #| Calendar        |
      #| Notes           |
      #| Contacts        |
      #| Website         |
      #| Inventory       |
      #| Manufacturing   |
      #| Repairs         |
      #| Invoicing       |
      #| Email Marketing |
      #| Employees       |
      #| Leaves          |
      #| Expenses        |
      #| Lunch           |
      #| Maintenance     |
      #| Dashboards      |

