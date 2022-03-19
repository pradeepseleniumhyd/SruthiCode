Feature: To verify Login functionalities for different users

Background: 
	Given user opens the browser
	When user enters the url


Scenario: To verify multiple data	
	Then Loginpage is displayed
	When user enters "Sruthi@gmail.com" and "password"
	
Scenario: To verify multiple data	
	Then Loginpage is displayed
	When user enters "Pradeep@gmail.com" and "password123"