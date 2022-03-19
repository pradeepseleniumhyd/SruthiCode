Feature: To verify Login functionalities for different users

Background: 
	Given user opens the browser
	When user enters the url


Scenario Outline: To verify multiple data	
	Then Loginpage is displayed
	When user enters "<username>" and "<password>"
	When user clicks on login button
	When user performs click on "<link>"

Examples:
|username|password|link|
|Sruthi@gmail.com|SruthiPassword|Google|
|Pradeep@gmail.com|password123|FB|
|Sruthi1@gmail.com|SruthiPassword|Twitter|
|Pradeep1@gmail.com|password123|FB1|
|Sruthi2@gmail.com|SruthiPassword|Google1|
|Pradeep2@gmail.com|password123|Twitter1|

	
