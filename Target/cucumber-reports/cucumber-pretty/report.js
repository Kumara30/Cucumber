$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Task/newcustomer.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Demoguru99"
    }
  ]
});
formatter.scenario({
  "name": "Login the gurubank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Demoguru99"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "Lunch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "guru1.lunch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login the  browser with credentials",
  "rows": [
    {
      "cells": [
        "mngr154543",
        "AtEvyzy"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "guru1.login_the_browser_with_credentials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "guru1.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the login  is successful or not",
  "keyword": "Then "
});
formatter.match({
  "location": "guru1.verify_the_login_is_successful_or_not()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat Task.guru1.verify_the_login_is_successful_or_not(guru1.java:44)\r\n\tat ✽.Verify the login  is successful or not(src/Task/newcustomer.feature:11)\r\n",
  "status": "pending"
});
formatter.scenarioOutline({
  "name": "New Customer Details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NewCustomerDetails"
    }
  ]
});
formatter.step({
  "name": "navigate to NewCustomerAccount",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the customer details \"\u003cCustid\u003e\",\"\u003cGender\u003e\",\"\u003cDOB\u003e\",\"\u003cAddress\u003e\",\"\u003cCity\u003e\",\"\u003cState\u003e\",\"\u003cPin\u003e\",\"\u003cPhone\u003e\",\"\u003cEmail\u003e\" and \"\u003cPass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify the details are submitted successfully or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Custid",
        "Gender",
        "DOB",
        "Address",
        "City",
        "State",
        "Pin",
        "Phone",
        "Email",
        "Pass"
      ]
    },
    {
      "cells": [
        "User1",
        "Male",
        "31/12/1989",
        "OMR",
        "Chennai",
        "TamilNadu",
        "600003",
        "9000012345",
        "greens@gmail.com",
        "pass"
      ]
    }
  ]
});
formatter.scenario({
  "name": "New Customer Details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Demoguru99"
    },
    {
      "name": "@NewCustomerDetails"
    }
  ]
});
formatter.step({
  "name": "navigate to NewCustomerAccount",
  "keyword": "Given "
});
formatter.match({
  "location": "guru1.the_user_navigate_to_New_customer_account()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat Task.guru1.the_user_navigate_to_New_customer_account(guru1.java:49)\r\n\tat ✽.navigate to NewCustomerAccount(src/Task/newcustomer.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter the customer details \"User1\",\"Male\",\"31/12/1989\",\"OMR\",\"Chennai\",\"TamilNadu\",\"600003\",\"9000012345\",\"greens@gmail.com\" and \"pass\"",
  "keyword": "When "
});
formatter.match({
  "location": "guru1.enter_the_customer_details_and(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "guru1.click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the details are submitted successfully or not",
  "keyword": "Then "
});
formatter.match({
  "location": "guru1.verify_the_details_are_submitted_successfully_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Edit the Customer Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Demoguru99"
    },
    {
      "name": "@EditCustomerDetails"
    }
  ]
});
formatter.step({
  "name": "navigate to EditCustomer link",
  "keyword": "Given "
});
formatter.match({
  "location": "guru1.navigate_to_EditCustomer_link()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat Task.guru1.navigate_to_EditCustomer_link(guru1.java:82)\r\n\tat ✽.navigate to EditCustomer link(src/Task/newcustomer.feature:26)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter the CustomerId",
  "keyword": "When "
});
formatter.match({
  "location": "guru1.enter_the_CustomerId()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "guru1.click_on_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
});