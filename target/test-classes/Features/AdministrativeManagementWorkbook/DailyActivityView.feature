Feature: Daily Activity


#  Background:
#    Given user with Practice Admin role is logged in to IWA
#    When provider clics on Analytics from left window
#    Then a new window will open with idep login
#    And user enters username and password
#    Then user should be authenticated
#    And user clicks on Start Exploring and user clicks on Analytics
#    And clicks on Administrative Management workbook

Scenario: Verify all elements in Daily Activity
  When Navigate to Daily Activity view of this workbook
  And user can see Program Type
  And verify if all expected elements are present and contain some data
  |Device Owner|Building Owner|Service Provider|Program Owner|Device Model|Program Type|Display Name|User Specialty|Care Location Type|Device Family|Session Date|

