Feature: Patient with Dental Issues: Triaged by UPR Dentistry Staff

  @checkInURL
  Scenario: Setup check-in URL:
    Given user is logged in to UPR Practice as a Practice Admin
    When user clicks on dropdown on the uper right corner to select Practice Admin
    And user licks on Dental Clinic Coordinator use Case 1 service from middle panel
    And user copies the service url from the right panel and open in browser
    And user clicks continue in browser
    Then Teladoc Health Check In page will be displayed


