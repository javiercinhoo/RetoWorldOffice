@Run

Feature: Test the functionality of user registration on the advantageonlineshopping website.
Scenario Outline: As a user I create a advantageonlineshopping user and validate the Login
    Given I am on the advantageonlineshopping login page
    And click on the create new account button 
    When I enter a <username>,<email>,<password> and <confirmpass>
    And click on the conditions check 
    And click on the register button    
    Then the result match the <username> 

Examples:
    |username|email             |password     |confirmpass |   
    |Javierd  |javierd@yopmail.com|Advant2023   |Advant2023  |
    