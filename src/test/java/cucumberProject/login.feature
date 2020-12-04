Feature: Swag Labs Login Feature

  Scenario: Swag Labs login Test Scenario

    Given user is already on Login Page
    When title of login page is Swag Labs
    Then user enters Username and  Password
    Then user clicks on login button
    And user is on home page
    Then Close the browser