@product-detail
Feature: Product Detail

  @see-product-detail
  Scenario: Verify that the user can see product detail
    Given User is on homepage
    When User click product name
    Then User is on product detail page

  @add-to-cart-from-product-detail
  Scenario: Verify that the user can add to cart product from Product Detail Page
    Given User is on product detail page
    When User click add to cart button
    And The cart contain product
    Then The add to cart button change to remove button

  @remove-product-from-cart
  Scenario: Verify that the user succesfully remove product from cart from Product Detail Page
    Given User is on product detail page
    When User click remove button
    And The cart is empty
    Then The remove button change to add to cart button

  @back-to-homepage
  Scenario: Verify that the user can back to Product list page
    Given User is on product detail page
    When User click back to products button
    Then User is on homepage