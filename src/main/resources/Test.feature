Feature: Web Login
  Scenario: User should be able to login with valid credentials
    Given the user is on login page
    When the user enter valid credentials
    And searching cell phone
    And comparing second price
    And comparing third price
    Then Adding new product