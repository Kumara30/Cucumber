#Author: your.email@your.domain.com

@tag
Feature: guru99list
  I want to use this template for my feature file

  @tag1
  Scenario: Login the guru99 using datatable of list
    Given Lunch the guru website
    When Enter the username and password in guru
    |user1|pass1|
    And click on reset button
    Then Validate the user credentials
    
 