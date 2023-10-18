Feature: login functionality

  Scenario: check if login works successfully
    Given the user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home screen
