Feature:Adding products to favorites

  Background:
    Given user should open login page
    When user click login with facebook
    And user type facebook account credential
  @task2
  Scenario: User should be  adding products to favorites
    When user hover to "KOZMETİK" categories
    And user click "Parfüm" section
    And user search "Lacoste" product
    And user select "Lacoste" section
    And user click "7" product
    And user add favorites
    And  user go to favorites page
    Then user match product name