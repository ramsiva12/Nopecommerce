Feature: order of Sales Details
  

  
  Scenario: Search for Order details
    Given User launch the browser
    When open browser with url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    Then User enters the email as "admin@yourstore.com" and password as "admin"
    And User click on login
    Then Page should be equal to "Dashboard / nopCommerce administration"
    When User click on Sales menu
    And User click on Orders icon
    Then Page should be equal to "Orders / nopCommerce administration"
    When User enter any type of info related to order as "info"
    And User click on ordersearch button
    Then Page should be equal to "Orders / nopCommerce administration"
    When User Directly goto orderinfo as "orderid"
    Then User can view order details 
    And Close the browser