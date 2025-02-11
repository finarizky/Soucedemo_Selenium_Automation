@login
Feature: Login

  @success-login
  Scenario: Login using valid email and password
    Given User is on landing page
    When User input username with "standard_user"
    And User input password with "secret_sauce"
    And User click login button
    Then User is on homepage

  @login-invalid-username
  Scenario: Login using invalid email and password
    Given User is on landing page
    When User input username with "nanabi"
    And User input password with "secret_sauce"
    And User click login button
    Then User is on login page
    And User able to see error message "Epic sadface: Username and password do not match any user in this service"

  @login-invalid-password
  Scenario: Login using invalid email and password
    Given User is on landing page
    When User input username with "standart_user"
    And User input password with "secret_sauce123"
    And User click login button
    Then User is on login page
    And User able to see error message "Epic sadface: Username and password do not match any user in this service"

  @empty-login
  Scenario: Login with empty email and password
    Given User is on landing page
    When User click login button
    And User is on login page
    Then User able to see error message "Epic sadface: Username and password do not match any user in this service"

  @login-doesnt-match
  Scenario: Login using invalid email and password
    Given User is on landing page
    When User input username with "standard_user123"
    And User input password with "secret_sauce123"
    And User click login button
    Then User is on login page
    And User able to see error message "Epic sadface: Username and password do not match any user in this service"