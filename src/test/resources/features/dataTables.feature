Feature: Examples of Cucumber data table implementations

  @wip
  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |
      | cucumber    |
      | banana      |
      | orange      |
      | pomegranate |
      | mango       |
      | grape       |

