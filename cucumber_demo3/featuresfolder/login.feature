Feature: feature login feature of new website for testing 
Scenario: login test for new website 
Given I am on the demo website "https://admin-demo.nopcommerce.com/login" 
When I type login = "admin@yourstore.com" and password = "admin" 
And I click sign-in button 
Then I should get "Dashboard" text