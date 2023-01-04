 Feature: to test login functionality

  Background: 
    Given launch the browser
    Then enter the url

@smoketest
  Scenario: Login to app with valid credentials
    Then validate home page us displayed or not
    Then enter the un
    And enter the pwd
    Then click on login button
    Then validate home page is displayed or not
    
    
@regressiontest
  Scenario: login to app with customer credentials
    Then validate home page us displayed or not
    Then enter the username "admin"
    Then enter the password "admin"
    Then click on login button
    Then validate home page is displayed or not

   