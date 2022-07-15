Feature: feature login feature of new website for testing 
Scenario: google Logo display test 
    Given I am on the google page "http://google.com/" 
    When I search for Google Logo webelement
    Then I should get webelement isDisplayed