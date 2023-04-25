Feature: Teladochealth front page feauteres

  @smoke
  Scenario: Verify all the tabs on the front page
    Given user is on the front page
    Then user should be able to see the following tabs
    |Expert Care|For Individuals|For Organizations|
    And user scrols down and scrols up
    And user should see text "Complete care to help you get well. And live well." on the uper left of the page.
    And user scrols down to and can click on the right and left arrow to view a team memebr.










