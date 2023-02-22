Feature: Program Overview

  Background:
    Given user with Practice Admin role is logged in to IWA
    When provider clics on Analytics from left window
    Then a new window will open with idep login
    And user enters username and password
    Then user should be authenticated
    And user clicks on Start Exploring and user clicks on Analytics
    And clicks on Administrative Management workbook


  Scenario: Administrative Management workbook
    When user navigates to Program Overview view of this workbook
    Then user can see Session Date
    And user can see Program Type
    And user should be able to see the following dropdowns
    |Device Owner|Building Owner|Service Provider|Programe Owner|Device Model|Program Type|Display Name|User Speciality|Care Location Type|Device Family|
    And user should be able to see the following metrics
    |Program Types|Users|User Specialities|Devices|Buildings|Number of Records|




