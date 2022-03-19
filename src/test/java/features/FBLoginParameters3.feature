Feature: To verify Login functionalities for different users

Background: 
	Given user opens the browser
	When user enters the url


Scenario: To verify multiple data	
	Then Loginpage is displayed
	When user enters the value username and password
	|sruthi@gmail.com|password|
	|pradeep@gmail.com|password123|
	Then user clicks on login button
	
