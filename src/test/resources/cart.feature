@cart
Feature: Cart

  @go-to-cart-page
  Scenario: Verify that the user succesfully go to cart page
    Given User is on homepage
    When User click cart button
    Then User is on cart page

  @remove-from-cart
  Scenario: Verify that the user succesfully remove product from cart from cart page
    Given User is on cart page
    When User click remove button
    And The selected product is not there
    Then User is on cart page

  @continue-shopping
  Scenario: Verify that the user succesfully continue shopping
    Given User is on cart page
    When User click continue button
    Then User is on homepage

  @product-detail-from-cart
  Scenario: Verify that the user can see product detail from cart page
    Given User is on cart page
    When User click product name
    Then User is on product detail page