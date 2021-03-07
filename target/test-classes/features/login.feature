Feature: Login

@task1
  Scenario: As a user, I should be able to login with valid credentials
    Given user should open login page
    When user click login with facebook
    And user type facebook account credential
    Then should see main page and verify