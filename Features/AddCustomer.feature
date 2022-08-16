Feature: Add Customer Details
  

  
  Scenario: Add Item on Customer Page
    Given User launch the browser
    When open browser with url as "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    Then User enters the email as "admin@yourstore.com" and password as "admin"
    And User click on login
    Then Page should be equal to "Dashboard / nopCommerce administration"
    When User click on customer menu
    And User click on customer icon
    Then Page should be equal to "Customers / nopCommerce administration"
    And User click on Addnew icon
    Then Page should be equal to "Add a new customer / nopCommerce administration" 
    When User enter customer info
    And User click oin save button
    Then User can view confirmation message as "The new customer has been added successfully"
    And Close the browser

  
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
