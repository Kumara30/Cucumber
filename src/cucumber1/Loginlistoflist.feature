#Author: your.email@your.domain.com

  @tag
Feature: guru99listlist
  I want to use this template for my feature file

  @tag1
  Scenario: Login the gurudemo using datatable of list of list
    Given Lunch the guru listoflist website
    When Enter the username and password in guru listoflist
    |user1|pass1|
    |user2|pass2|
    |user3|pass3|
    |user4|pass4|
    And click on reset button from guru listoflist
    Then Validate the user credentials from login pag
