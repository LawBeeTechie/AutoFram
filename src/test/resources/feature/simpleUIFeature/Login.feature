#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.

@tag
Feature: Login Feature for webapplication
As a user of the application I should be able to login
 

  @tag1
  Scenario: Login scenario
    Given the user launches the "chrome" browser and is on login page
    When the user enters the credentials "iamfd" and "password"
    Then the user should see the userName under userIcon
   