Feature: Add and delete users



  Scenario: Add a user and validate the user has been added to the table
    Given Engr Candidate is on main page
    When Engr Candidate clicks on Add User button
    And Engr Candidate enters firstname, lastname, username, password, select customer, role, enters email, cell phone
    And Engr Candidate clicks on save button option
    Then verify user is added


  Scenario:  Delete user User Name: novak and validate user has been deleted
    When Engr Candidate clicks on the remove X button
    And Engr Candidate clicks on okay button
    Then verify the user is deleted



