Feature: To  verify FB Login page

Background:
   Given user opens the browser
    When user enters the url
    Then user verifies the current url and title of the page
    When user enters username and password in textbox
    And user clicks on signin button

  Scenario: To verify fb url
    Then user verifies Home page is displayed
    And user checks login page
    
     Scenario: To verify fb url1
    Then user verifies Home page is displayed
    When user clicks on logout button
    Then user navigates to login page