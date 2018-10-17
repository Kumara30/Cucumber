#Author: your.email@your.domain.com
@tag
Feature: To test new customer functionality

  @tag2
  Scenario Outline: To add the customer details
    Given The user is in guru home page
    And The user logged in as manager with "<mngrid>"and "<mngrpass>"
    And The user navigate to New customer account
    When The user should enter the customer details with"<Custid>","<Gender>","<DOB>","<Address>","<City>","State","<Pin>","<Phone>","<Email>"and "<Pass>"
    And The user should reset the customer details
    Then Manager should verify the add new customer message

    Examples: 
      | CustId | Gender | DOB        | Address | City    | State | Pin    | Phone      | Email          | Pass     | mngrid     | mngrpass |
      | java   | male   | 10/12/1989 | OMR     | Chennai | TN    | 600103 | 1517894561 | test@gmail.com | password | mngr154050 | zamynEs  |
