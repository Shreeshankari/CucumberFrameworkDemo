Feature: search and place the order for products
@offerspage
Scenario: enter makemytrip URL search for any hotel in dubai Select any date
Given user is on maketrip page
When user clicks hotel and search hotel room availablity in dubai in selected date
Then verify, room availability
