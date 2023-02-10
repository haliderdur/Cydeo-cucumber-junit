@regression @smoke
Feature: Library app login feature
  Agile story: As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: For the scenarios in the feature file, user is expected to be already on login page
    Given user is already on login page

  @librarian @wip_halid
  Scenario: Login as librarian
    When user enters valid librarian username
    And user enters valid librarian password
    Then user should see dashboard

  @student
  Scenario: Login as student
    When user enters valid student username
    And user enters valid student password
    Then user should see dashboard

  @admin
  Scenario: Login as admin
    When user enters valid admin username
    And user enters valid admin password
    Then user should see dashboard

    # to add comment in feature file
