Feature: Analytics workflow login and Dashboard

  Scenario: IWA and Analytics Login
    Given user with Practice Admin role is logged in to IWA
    When provider clics on Analytics from left window
    Then a new window will open with idep login
    And user enters username and password
    Then user should be authenticated

  Scenario: Home Page and workbooks verification
    When user clicks on Start Exploring and user clicks on Analytics
    Then user should be able to see the following these tabs Administrative Management, Appointment Overview, AV Quality Surveys, Program Management, Reliability
      | Administrative Management | Appointment Overview | AV Quality Surveys | Program Management | Reliability |

  Scenario: Navigate to Administrative Management workbook and see what views are in this workbook
    When clicks on Administrative Management workbook
    Then user should see the following tabs
      | Program Overview | Daily Activity | Devices | Users | Care Locations |

  Scenario: Navigate to Appointment Overview workbook and see what views are in this workbook
    When user clicks on Appointment Overview workbook
    Then user should be able to to see the following views:
      | Appointment Status | Duration Analysis | Users | Waiting Rooms | Care Locations |

    # Move the last Scenario to a new Step Defination as cant be implemnted here becasue prior step takes the user to a a different view.

  Scenario: Navigate to AV Quality Surveys workbook and see what views are in this workbook
    When user clicks on AV Quality Surveys workbook
    Then user should be able to see AV Quality Surveys view

  Scenario: Navigate to Program Management workbook and see what views are in this workbook
    When user clicks on Program Management workbook
    Then user should be able to see the following views:
      | Program Management | Users | Care Locations | Program Type |

  Scenario: Navigate to Reliability workbook and see what views are in this workbook
    When user clicks on Reliability workbook
    Then user should be able to see the following tabs:
      | Device Vitals | Survey Ratings |




    # we need to figure out a way to verify a large number of elements located in one page in one feature file rather than verifying them one by one.


