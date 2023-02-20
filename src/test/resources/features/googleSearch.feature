Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search and then see relevant results

  Scenario: Search page title verification
    When user is on the Google search page
    Then user should see the title is Google


  Scenario: Search functionality result title verification
    Given user is on the Google search page
    And user accepts cookies
    When user types apple and clicks enter
    Then user sees apple in the title


  Scenario: Search functionality result title verification
    Given user is on the Google search page
    And user accepts cookies
    When user types apple and clicks enter
    Then user sees apple in the title

  @wip
  Scenario: Search functionality result title verification
    Given user is on the Google search page
    And user accepts cookies
    When user types "apple" and clicks enter
    Then user sees "apple" in the title




