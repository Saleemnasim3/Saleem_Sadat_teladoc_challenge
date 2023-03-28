Feature: Administrative Management Workbook

#  Scenario: IWA and Analytics Login
#    Given user with Practice Admin role is logged in to IWA
#    When provider clics on Analytics from left window
#    Then a new window will open with idep login
#    And user enters username and password
#    Then user should be authenticated
#    And user clicks on Start Exploring and user clicks on Analytics
#    And clicks on Administrative Management workbook

  Scenario: Program Overview
    When user navigates to Program Overview view of this workbook
    Then user can see Program Type
    And user should be able to see the following dropdowns
      | Device Owner | Building Owner | Service Provider | Programe Owner | Device Model | Program Type | Display Name | User Speciality | Care Location Type | Device Family |
    And user should be able to see the following metrics
      | Program Types | Users | User Specialities | Devices | Buildings | Number of Records |

  Scenario: Verify all elements in Daily Activity
    When Navigate to Daily Activity view of this workbook
    And user can see Program Type
    And verify if all expected elements are present and contain some data
      | Device Owner | Building Owner | Service Provider | Program Owner | Device Model | Program Type | Display Name | User Specialty | Care Location Type | Device Family | Session Date |

  Scenario:Administrative Management workbook devices view
    When user navigates to Program devices view
    Then user can see text "Active Devices by Device Family"
    Then user can see the following elements
      | Session Date | Building Owner | Service Provider | Programe Owner | Device Model | Program Type | Display Name | User Speciality | Care Location Type | Device Family |

  Scenario:Administrative Management workbook Users view
    When user navigates to Users view
    Then user can see text here "Active Users by Specialty"
    Then user can see the following elements in this workbook
      | Session Date | Building Owner | Service Provider | Programe Owner | Device Model | Program Type | Display Name | User Speciality | Care Location Type | Device Family |

  Scenario: CareLocation view
    When user navigates to CareLocation view
    Then user can see text that reads "Active Care Locations by Care Location Type"
    Then user should see the following elements in this workbook
      | Session Date | Building Owner | Service Provider | Programe Owner | Device Model | Program Type | Display Name | User Speciality | Care Location Type | Device Family |