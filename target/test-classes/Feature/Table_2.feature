Feature: To read data from cucumber table with maps

  Scenario: To check login functionality
    Given launch the browser
    And enter the url
    When enter the mailid un and pwd
      | mailid          | username | pwd |
      | user1@gmail.com | user1    | 123 |
      | user2@gmail.com | user2    | 456 |
      | user3@gmail.com | user3    | 789 |
    Then click on login btn
