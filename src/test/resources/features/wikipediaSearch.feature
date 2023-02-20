Feature: Wikipedia search functionality
  Agile story: As a user, when I am on Wikipedia page,
  I should be able to search and see relevant results

  #Background: user is already on Wikipedia home page
    #Given user is on Wikipedia homepage


  Scenario: Wikipedia search functionality title verification
    Given User is on Wikipedia home page
    When User types "Elon Musk" in the wiki search box
    And User clicks wiki search button
    Then User sees "Elon Musk" is in the wiki title

  Scenario: Wikipedia search functionality header verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main page

  @ScenarioOutline
  Scenario Outline: Wikipedia search functionality title verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main page

    Examples: search values that we use in this scenario are as below
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley        | Bob Marley         |
      | Marie Curie       | Marie Curie       | Marie Curie        |
      | Lady Gaga         | Lady Gaga         | Lady Gaga          |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       |
      | Kate Winslet      | Kate Winslet      | Kate Winslet       |
      | Antony Hopkins    | Antony Hopkins    | Antony Hopkins     |

