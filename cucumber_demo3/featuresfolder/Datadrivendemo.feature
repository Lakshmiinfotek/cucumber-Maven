Feature: test scenario to test login for demo site 
Background: 
Given I am on the demo site login "https://admin-demo.nopcommerce.com/login" 

@tag1 

Scenario Outline: Login logout with different credentials 

When I enter userName = "<userName>" and password = "<password>" 
And I click login button 
Then text to display "<text>" text 

Examples: 
| userName             | password | text |
| admin                | admin124 | Dashboard|
| admin@yourstore.com  | admin    | Dashboard|