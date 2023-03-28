Feature: FMS User Registration Workflow -- IdP login(Windows)

  Scenario: Navigate to http://intouchhealth.com/
    When user navigates to http://intouchhealth.com/
    Then InTouch Health Website will be opened successfully

  Scenario: Click "Register for a Provider Account"



    When user clicks Continue in Browser Button
    When user enters correct credentials in the Username and Password boxes
    And user clicks on Sign In button
    Then user should land on dashboard
