@homepage
Feature: Homepage

    @sorting-z-to-a
    Scenario: Verify that the user has doing sorting product Name z to a
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User click filter button
        And User click spesific filter button z to a
        Then User see filtering data z to a

    @sorting-a-to-z
    Scenario: Verify that the user has doing sorting product Name a to z
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User click filter button
        And User click spesific filter button a to z
        Then User see filtering data a to z

    @sorting-price-low-to-high
    Scenario: Verify that the user has doing sorting product price low to high
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User click filter button
        And User click spesific filter button price low to high
        Then User see filtering data price low to high

    @sorting-price-high-to-low
    Scenario: Verify that the user has doing sorting product price high to low
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User click filter button
        And User click spesific filter button price high to low
        Then User see filtering data price high to low

    @add-cart-backpack
    Scenario: Verify that the user succesfully add product to cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart backpack
        And The cart contain product backpack
        Then The add to cart button backpack change to remove button

    @add-cart-light-bike
    Scenario: Verify that the user succesfully add product to cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart light bike
        And The cart contain product light bike
        Then The add to cart button light bike change to remove button

    @add-cart-bolt-tshirt
    Scenario: Verify that the user succesfully add product to cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart bolt tshirt
        And The cart contain product bolt tshirt
        Then The add to cart button bolt tshirt change to remove button

    @add-cart-fleece-jacket
    Scenario: Verify that the user succesfully add product to cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart fleece jacket
        And The cart contain product fleece jacket
        Then The add to cart button fleece jacket change to remove button

    @add-cart-onesie
    Scenario: Verify that the user succesfully add product to cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart onesie
        And The cart contain product onesie
        Then The add to cart button onesie change to remove button

    @add-cart-tshirt-red
    Scenario: Verify that the user succesfully add product to cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart tshirt red
        And The cart contain product tshirt red
        Then The add to cart button tshirt red change to remove button

    @remove-cart-backpack
    Scenario: Verify that the user succesfully remove product from cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart backpack
        And User click remove button backpack
        And The cart is empty
        Then The remove button bp change to add to cart button bp

    @remove-cart-light-bike
    Scenario: Verify that the user succesfully remove product from cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart light bike
        And User click remove button light bike
        And The cart is empty
        Then The remove button lp change to add to cart button lp

    @remove-cart-bolt-tshirt
    Scenario: Verify that the user succesfully remove product from cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart bolt tshirt
        And User click remove button bolt tshirt
        And The cart is empty
        Then The remove button bt change to add to cart button bt

    @remove-cart-fleece-jacket
    Scenario: Verify that the user succesfully remove product from cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart fleece jacket
        And User click remove button fleece jacket
        And The cart is empty
        Then The remove button fj change to add to cart button fj

    @remove-cart-onesie
    Scenario: Verify that the user succesfully remove product from cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart onesie
        And User click remove button onesie
        And The cart is empty
        Then The remove button onesie change to add to cart button onesie

    @remove-cart-tshirt-red
    Scenario: Verify that the user succesfully remove product from cart
        Given User doing login with "standard_user" and "secret_sauce"
        When User is on productlist page
        And User add to cart tshirt red
        And User click remove button tshirt red
        And The cart is empty
        Then The remove button tr change to add to cart button tr