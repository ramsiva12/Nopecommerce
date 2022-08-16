
Feature: Login feature

Background: below steps are common for each scenario
    Given User launch the browser
    When open browser with url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    Then User enters the email as "admin@yourstore.com" and password as "admin"
    And User click on login
    Then Page should be equal to "Dashboard / nopCommerce administration"
  

 
  Scenario: Login succesfully with valid credentials
    
    And User click on logout
    Then Page should be equal to "Your store. Login"
    And Close the browser

 
  Scenario Outline: Login with Data Driven
     
    And User click on logout
    Then Page should be equal to "Your store. Login"
    And Close the browser

    Examples: 
      | email  | password |
      | admin@yourstore.com | admin |
      | admin@yourstore.com | Admin | 
