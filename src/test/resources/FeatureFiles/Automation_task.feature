Feature: Verify the checkout feature 

  @tag 
  Scenario: Login to the application 
    Given Open the chrome browser 
    And the user navigaties to the url 
    When The user enter the user Name 
    And The user enters the password 
    And The User click on the login button  
  	Given Add a backpack product to cart 
  	And Add Another jacket product to cart 
  	And Add Another light product to cart 
  	Then Click on the add to cart Icon
  	Then click on the checkout button
  	Then Fill the information
  	Then Click on the continue 
  	Then Click on the Finish button 
  	
  	
  	
 
  
   
    
    
    
    
    
    
    
  
  