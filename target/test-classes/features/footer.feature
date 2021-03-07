Feature:Check footer link

  Background:
    Given user should open login page
    When user click login with facebook
    And user type facebook account credential
   @task3
  Scenario: User should be able to see footer links on all page
    Given user goto footer section
    When user write footer link on txt file
    And user click "Canlı Yardım" link
    Then user check all link