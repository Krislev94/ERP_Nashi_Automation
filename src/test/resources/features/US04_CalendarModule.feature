Feature: Calendar - Event Creation and Details

  Scenario Outline: User can create event by clicking on time box
    When user is on the login page
    Given User is logged in with "<username>" and "<password>"
    When User navigates to Calendar module
    And User choose "<time>" and "<day>" and click it.
    And User fills in the event details with "<eventDescription>"
    And User creates the event
    Then "<eventDescription>" is displayed on the calendar

    Examples:
      | username              | password   | time     | day       | eventDescription        |
      | posmanager5@info.com  | posmanager | 07:00:00 | Saturday  | Interview with Kristina |
      | posmanager6@info.com  | posmanager | 09:00:00 | Friday    | Interview with Akylai   |
      | posmanager7@info.com  | posmanager | 10:30:00 | Thursday  | Interview with Behzut   |
      | posmanager8@info.com  | posmanager | 11:00:00 | Wednesday | Interview with Dima     |
      | posmanager9@info.com  | posmanager | 12:00:00 | Friday    | Interview with Gabby    |
      | posmanager10@info.com | posmanager | 13:00:00 | Saturday  | Interview with Regina   |
      | posmanager11@info.com | posmanager | 14:00:00 | Thursday  | Interview with Marko    |


  Scenario Outline: User can see event details when clicking the event on the calendar
  When user is on the login page
    Given User is logged in with "<username>" and "<password>"
    When User navigates to Calendar module
    When User clicks on the "<eventDescription>" on the calendar
    Then Event details with "<time>", and "<eventDescription>" are displayed
    Examples:

      | username              | password   | time     | day       | eventDescription        |
      | posmanager5@info.com  | posmanager | 07:00:00 | Saturday  | Interview with Kristina |
      | posmanager6@info.com  | posmanager | 09:00:00 | Friday    | Interview with Akylai   |
      | posmanager7@info.com  | posmanager | 10:30:00 | Thursday  | Interview with Behzut   |
      | posmanager8@info.com  | posmanager | 11:00:00 | Wednesday | Interview with Dima     |
      | posmanager9@info.com  | posmanager | 12:00:00 | Friday    | Interview with Gabby    |
      | posmanager10@info.com | posmanager | 13:00:00 | Saturday  | Interview with Regina   |
      | posmanager11@info.com | posmanager | 14:00:00 | Thursday  | Interview with Marko    |
