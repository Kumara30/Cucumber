#Author: your.email@your.domain.com

  @tag
Feature: guru99map
  I want to use this template for my feature file

  @tag1
  Scenario: Login the gurudemo using datatable of list
    Given Lunch the gurumap website
    When Enter the username and password in gurumap
    |username|myusername|
    |password|mypassword|
    And click on reset button from gurumap
    Then Validate the user credentials from login page
 