@DLF
Feature: various actions

  Scenario:
    Given user is on the home page
    When  user clicks threedot button of the first article
    And   user clicks download button
    And   user reads the article tag
    When  user swipes the first article
    Then  user should be able to see the second article in the same catagory

