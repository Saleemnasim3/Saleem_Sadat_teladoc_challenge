##This project is about adding and deleting data in a dynamic web table


##Task: 
  Feature:
  As an Engr. Candidate
  I need to automate http://www.way2automation.com/angularjs-protractor/webtables/ 
  So I can show my awesome automation skills
  
  - Scenario: Add a user and validate the user has been added to the table
  - Scenario: Delete user User Name: novak and validate user has been delete
 
 ##Summary of the Task:
 
 I should be able to add a new user to the the dynamically changing table 
 Then I should be verify the user is added 
 I should then delete a specific user and verify that user is deleted.
 
 ##Solution:
 
 The task is completed using Java with Cucumber Maven framework followed by page object model (POM) with PageFactory. The framework contains: Utils Classes that contains reusable methods, 
 AddDelete class that stores all the locaters initialized by PageFactory, Feature file that contains cucumbers steps using that implements Behavioral Driven Development (BDD) 
 using Gherkin lanaguage and a Runner Class that will help you run the test. 
 
 ##Use 
 
 Clone this project and and use the Runner Class to execute the test case.
