@checkout
Feature: Checkout

  @go-to-checkout-page
  Scenario: Verify that the user succesfully go to checkout page
    Given User is on cart page
    When User click continue button
    Then User is on checkout page

  @back-to-cart
  Scenario: Verify that the user succesfully can back to cart page
    Given User is on checkout page
    When User click cancel button
    Then User is on cart page

  @checkout-empty-information
  Scenario: Verify that the user has doing checkout without input any Information
    Given User is on checkout page
    When User click continue button
    Then User see error message "Error: First Name is required"

  @checkout-empty-firstname
  Scenario: Verify that the user has doing checkout without input First Name
    Given User is on checkout page
    When User input last name with "osaka"
    And User input portal code with "3234"
    And User click continue button
    Then User see error message "Error: First Name is required"

  @checkout-empty-lastname
  Scenario: Verify that the user has doing checkout without input Last Name
    Given User is on checkout page
    When User input first name with "nanabi"
    And User input portal code with "3234"
    And User click continue button
    Then User see error message "Error: Last Name is required"

  @checkout-empty-zipcode
  Scenario: Verify that the user has doing checkout without input Portal Code
    Given User is on checkout page
    When User input first name with "nanabi"
    And User input last name with "osaka"
    And User click continue button
    Then User see error message "Error: Portal Code is required"

  @checkout-overview-page
  Scenario: Verify that the user succesfully can cancel Checkout process
    Given User is on checkout page
    When User input first name with "nanabi"
    And User input last name with "osaka"
    And User input portal code with "3234"
    And User click continue button
    Then User is on overview page

  @cancel-checkout
  Scenario: Verify that the user cancel Checkout process
    Given User is on overview page
    When User click cancel button
    Then User is on homepage

  @finish-checkout
  Scenario: Verify that the user can Finish the checkout process
    Given User is on overview page
    When User click finish button
    Then User is on checkout complete page

  @checkout-finish-back-to-homepage
  Scenario: Verify that the user can back to Product page after Finish the checkout process
    Given User is on checkout complete page
    When User click back home button
    Then User is on homepage

