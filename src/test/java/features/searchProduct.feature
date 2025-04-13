Feature: search and place the order for products
@offerspage
Scenario Outline: Search Experience for product search in both home and offers page
Given User is on GreenCart Landing Page
When User searched with shortname <Name> and extracted actual name of product
Then User searched for <Name> shortname in offers page
And validate product name in offers page matches with Landing Page

Examples:
|Name|
|Tom|
|Beet|
|Str|