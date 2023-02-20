Feature: Wikipedia search functionality
  Agile story: As a user, when I am on Wikipedia page,
  I should be able to search and see relevant results

  #Background: user is already on Wikipedia home page
    #Given user is on Wikipedia homepage

  @wip
  Scenario: Wikipedia search functionality title verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia search functionality header verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main page