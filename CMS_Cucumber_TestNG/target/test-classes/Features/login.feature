#Author: Siddhartha Parida
#Date
#Description
@SmokeScenario
Feature: feature to test login functionality

  @SmokeTest
  Scenario Outline: Verify that login is successful with valid credentials
    Given User is on Log in screen
    When User enters username as <username>
    And User enters password as <userpwd>
    And User clicks on login button
    Then User navigates to Home page

    Examples: 
      | username                   | userpwd   |
      | pvt27032022@mailinator.com | Bolder@12 |
    