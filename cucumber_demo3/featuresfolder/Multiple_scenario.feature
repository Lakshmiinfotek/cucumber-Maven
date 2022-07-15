Feature: Visiting threee websites

Scenario: Home page of google 
 
    Given user is on Google home page "https://google.com"  
    Then user enters keyword "cucumber java"
    And user submits the page
    Then user waits for 5 seconds for google
    
    Scenario: GitHub Homepage 
    Given user is on GitHub home page "https://github.com" 
    Then user waits for 5 seconds for github 
    
    Scenario: Home Page of Twitter 
    Given user is on Twitter home page "https://twitter.com" 
    And user waits for 5 seconds for twitter