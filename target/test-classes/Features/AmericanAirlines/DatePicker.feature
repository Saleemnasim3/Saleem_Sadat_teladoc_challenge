Feature: Calendar
  Scenario: User can pick a month year and day
    Given user is on American Airline booking page
    When user clicks on Calendar on the depart section
    Then user should be able to select any month and day and year
    Then user should be able to click on departture calendar
    Then user should be able to navigate to any year and month



