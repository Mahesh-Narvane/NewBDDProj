Feature: to test login functionality

  Scenario: Login to app with valid credentials
    Given launch the browser
    Then enter the url
    Then enter the un and pass
      | usn    | pwd   |
      | admin  |   123 |
      | nadmin | 12345 |
    Then click on login btn
