#Parameterization and data driven
Feature: feature to test login functionality with parameters

  Scenario Outline: Check login is successful with valid credentials
    Given User is on login page
    When User enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home and enter <country>

    Examples: 
      | username | password | country |
      | pallu    |    12345 | India   |
      | Anu      |    12345 | Russia  |
