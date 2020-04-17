Feature: Google Page
  I want to use this template for my feature file

  Scenario Outline: Test search capability
    Given Open browser and go to google.com
    When I enter some "<testWords>" in serach box.
    Then I validate the outcomes of search.

    Examples: 
      | testWords |
      | apple     |
      | mango     |
      | banana    |
