@homepage
Feature: Homepage

    @sorting-z-to-a
    Scenario: Verify that the user has doing sorting product Name z to a
        Given User is on homepage
        When User click filter button
        And User click spesific filter button z to a
        Then User see filtering data z to a

    @sorting-a-to-z
    Scenario: Verify that the user has doing sorting product Name a to z
        Given User is on homepage
        When User click filter button
        And User click spesific filter button a to z
        Then User see filtering data a to z

    @sorting-price-low-to-high
    Scenario: Verify that the user has doing sorting product price low to high
        Given User is on homepage
        When User click filter button
        And User click spesific filter button price low to high
        Then User see filtering data price low to high

    @sorting-price-high-to-low
    Scenario: Verify that the user has doing sorting product price high to low
        Given User is on homepage
        When User click filter button
        And User click spesific filter button price high to low
        Then User see filtering data price high to low

    @add-cart
    Scenario: Verify that the user succesfully add product to cart
        Given User is on homepage
        When User click add to cart button
        And The cart contain product
        Then The add to cart button change to remove button

    @remove-cart
    Scenario: Verify that the user succesfully remove product from cart
        Given User is on homepage
        When User click remove button
        And The cart is empty
        Then The remove button change to add to cart button
