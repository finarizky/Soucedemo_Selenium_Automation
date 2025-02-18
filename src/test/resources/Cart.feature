@cart
Feature: Cart

  @go-to-cart-page
  Scenario: Verify that the user succesfully go to cart page
    Given User doing login with "standard_user" and "secret_sauce"
    When User is on productlist page
    And User click cart button
    Then User is on cart page

  @remove-from-cart
  Scenario: Verify that the user succesfully remove product from cart from cart page
    Given User doing login with "standard_user" and "secret_sauce"
    When User is on productlist page
    And User add cart product Backpack
    And User click cart button
    And User is on cart page
    And User click remove button on cart
    Then User is on cart page

  @continue-shopping
  Scenario: Verify that the user succesfully continue shopping
    Given User doing login with "standard_user" and "secret_sauce"
    When User is on productlist page
    And User click cart button
    And User is on cart page
    And User click continue button
    Then User is on homepage

  @product-detail-from-cart
  Scenario: Verify that the user can see product detail from cart page
    Given User doing login with "standard_user" and "secret_sauce"
    When User is on productlist page
    And User add cart product Backpack
    And User click cart button
    And User is on cart page
    And User click product name on cart
    Then User is on product detail page