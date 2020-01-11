@login
Feature: Login

  @successful_login
  Scenario: Authorized user should be able to login
    Given  the user is on the login page
    When  the user enters valid credentials
    And click on signin button
    And the page title should be "Zero - Account Summary"