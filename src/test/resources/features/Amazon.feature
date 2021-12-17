@amazon
Feature: various actions

  Scenario:
    Given user is on the home page
    When  user clicks skipButton
    And   user enter "shoes" in searchBox
    And   user clicks Enter Button
    Then user is on the product page
    And user scrolls to element By xpath


