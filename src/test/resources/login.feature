@login
Feature: login

  @valid-login
  Scenario: Login using valid email and password
    Given User is on landing page
    When User input username with "standard_user"
    And User input password with "secret_sauce"
    And User click login button
    Then User is on homepage

    @invalid-login
  Scenario: Login using invalid email and password
    Given User is on landing page
    When User input username with "standard_user"
    And User input password with "secret_sauce"
    And User click login button
    Then User is on login page
    And User see error message


