Feature: Login to the Application

Scenario: Login to the Application with Valid Credentials
    Given Launch browser
    When open the URL
    Then Enter the valid Username
    And Enter the valid Password
    Then Click on Login
    And close the browser
    
    Scenario: Login to the Application with Valid Credentials
    Given Launch browser
    When open the URL "http://localhost:8888/"
    Then Enter the valid Username "admin"
    And Enter the valid Password "admin"
    Then Click on Login
    And close the browser
    
    Scenario: Login to the Application with Invalid Credentials
    Given Launch browser
    When open the URL "http://localhost:8888/"
    Then Enter the valid Username "Akhil"
    And Enter the valid Password "admin"
    Then Click on Login
    And close the browser

