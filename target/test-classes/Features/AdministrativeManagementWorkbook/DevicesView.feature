Feature: Devices view

#  Background:
#    Given user with Practice Admin role is logged in to IWA
#    When provider clics on Analytics from left window
#    Then a new window will open with idep login
#    And user enters username and password
#    Then user should be authenticated
#    And user clicks on Start Exploring and user clicks on Analytics
#    And clicks on Administrative Management workbook

  Scenario:Administrative Management workbook devices view
    When user navigates to Program devices view
    Then user can see text "Active Devices by Device Family"
    Then user can see the following elements
    |Session Date|Building Owner|Service Provider|Programe Owner|Device Model|Program Type|Display Name|User Speciality|Care Location Type|Device Family|


