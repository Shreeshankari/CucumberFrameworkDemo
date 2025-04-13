Feature: place the order for products
@placeorder
Scenario Outline: Search Experience for product search in both home and offers page
Given User is on GreenCart Landing Page
When User searched with shortname <Name> and extracted actual name of product
And Added "3" items of selected product to cart
Then User proceeds to checkout and validate the <Name> items in checkoutpage
And verify user has ability to enter promocode and place order
Examples:
|Name|
|Tom|