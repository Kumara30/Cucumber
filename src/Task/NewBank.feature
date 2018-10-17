#Author: Greens
@tag
Feature: To test add new customer functionality
  I want to use this template for my feature file

  Background: 
    Given I want to open demoguru manager login page
    And The User logged in manager id and password
      | managerUserId   | mngr154543 |
      | managerPassword | AtEvyzy    |
      When Enter the login button

  @LoginPage
  Scenario: To Login the manager userId and password
    Then User should see the home page of manager
    And Close a browser

  @NewCustomerNumericValidation
  Scenario: User validate the numerical values
    When The user navigate the new customer page for NumericValidation
    And The user validate the numeric values
      | custName | city | state | pinNumber | email  |
      |      143 |  154 |  7855 |      9655 | 355222 |
    Then User should see the validate numerical information text
    And Close a browser

  @NewCustomerSpecialValidation
  Scenario: User validate the special characters
    When The user navigate the new customer page for SpecialValidation
    And The user validate the special characters
      | custName | Address | city | state | pinno | mobno | email |
      | @&*      | #,*(    | ^$%  | @!*   | -=/   | ()&^  | !#^   |
    Then User should see the validate special character information text
    And Close a browser

  @Newcustomer
  Scenario Outline: New customer registration
    Given The user navigate the new customer page
    And Click on the Submit button
    And Alert the ok button
    When Enter the customer details "<custName>","<gender>","<DOB>","<Address>","<City>","<State>","<PIN>","<mobNo>","<email>" and "<Pass>"
    And User submit the button
    Then User should see the submit successful message
    And Close a browser

    Examples: 
      | custName | gender | DOB        | Address             | City    | State     | PIN    | mobNo      | email           | Pass          |
      #| UserAB | male   | 11/12/1998 | 270 pandiyan street | Chennai | Tamilnadu | 600035 | 9795475126 | userAB@gmail.com | user6password |
      | UserABB | male   | 01/12/1991 | 270 pandiyan street | Chennai | Tamilnadu | 600033 | 9795475026 | userAAB@gmail.com | user7password |

@EditCustomer
Scenario: Edit customer details
Given The user navigate to edit customer page
And Enter the customer id
And click on submit button
When Change the address, city, state and pin
|Omr|HYD|TN|600023|
And click on submit button
Then verify details are submitted or not


@DeleteCustomer
Scenario: Delete the customer record
	Given The user navigate to delete customer page
	When Enter customer id 
	And click on submit button
	Then click ok for conformation
	And Verify record is deleted successfully
