Feature: Search Customer Details
  

  
  Scenario: Search Customer By Email
    Given User launch the browser
    When open browser with url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    Then User enters the email as "admin@yourstore.com" and password as "admin"
    And User click on login
    Then Page should be equal to "Dashboard / nopCommerce administration"
    When User click on customer menu
    And User click on customer icon
    Then Page should be equal to "Customers / nopCommerce administration"
    When User Serach customer by enter Email as "email"
    And User click on Search button
    Then Page should be equal to "Customers / nopCommerce administration"
    And User can view Customer Details as "Expected Name"
    And Close the browser
    
    
  Scenario: Search Customer By FirstName
  
    Given User launch the browser
    When open browser with url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    Then User enters the email as "admin@yourstore.com" and password as "admin"
    And User click on login
    Then Page should be equal to "Dashboard / nopCommerce administration"
    When User click on customer menu
    And User click on customer icon
    Then Page should be equal to "Customers / nopCommerce administration"
    When User Serach customer by enter FirstName as "Name"
    And User click on Search button
    Then Page should be equal to "Customers / nopCommerce administration"
    And User can view Customer Details as "Expected Name"
    And Close the browser
    
    
  Scenario: Search Customer By LastName
  
    Given User launch the browser
    When open browser with url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    Then User enters the email as "admin@yourstore.com" and password as "admin"
    And User click on login
    Then Page should be equal to "Dashboard / nopCommerce administration"
    When User click on customer menu
    And User click on customer icon
    Then Page should be equal to "Customers / nopCommerce administration"
    When User Serach customer by enter LastName as "Name"
    And User click on Search button
    Then Page should be equal to "Customers / nopCommerce administration"
    And User can view Customer Details as "Expected Name"
    And Close the browser  
    