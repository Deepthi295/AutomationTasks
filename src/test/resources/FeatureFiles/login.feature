Feature: Login Functionality
@mytag
  Scenario: Verify the login functionality is working properly
    Given Open the Chrome browser
    When the user navigates to the URL "https://practice.expandtesting.com/login"
    Then the user enters username as "practice"
    And the user enters password as "SuperSecretPassword!"
    Then us7er is able to close the driver


 @tag2
  Scenario Outline: Verify with invalid data 
    Given I want to write a step with <firstname>
    When I check for the <lastname> in step
    Then I verify the <password> in step
    
login
    Examples: 
      |firstname  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
