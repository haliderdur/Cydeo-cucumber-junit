Feature: User should be able to login with using correct credentials

  Background: user is on the login page
    Given user is on login page of webTable app

  Scenario: Positive login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks login button
    Then user should see URL contains orders


  Scenario: Positive login scenario
    When user enters username "Test" password "Tester" and logins
    Then user should see URL contains orders


  Scenario: User should be able to see all 12 months in months dropdown
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then user should see URL contains orders