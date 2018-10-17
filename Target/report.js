$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Task/NewBank.feature");
formatter.feature({
  "name": "To test add new customer functionality",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I want to open demoguru manager login page",
  "keyword": "Given "
});
formatter.match({
  "location": "newclass.i_want_to_open_demoguru_manager_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User logged in manager id and password",
  "rows": [
    {
      "cells": [
        "managerUserId",
        "mngr154543"
      ]
    },
    {
      "cells": [
        "managerPassword",
        "AtEvyzy"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "newclass.the_User_logged_in_manager_id_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the login button",
  "keyword": "When "
});
formatter.match({
  "location": "newclass.enter_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To Login the manager userId and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@LoginPage"
    }
  ]
});
formatter.step({
  "name": "User should see the home page of manager",
  "keyword": "Then "
});
formatter.match({
  "location": "newclass.user_should_see_the_home_page_of_manager()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close a browser",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.Close_a_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I want to open demoguru manager login page",
  "keyword": "Given "
});
formatter.match({
  "location": "newclass.i_want_to_open_demoguru_manager_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User logged in manager id and password",
  "rows": [
    {
      "cells": [
        "managerUserId",
        "mngr154543"
      ]
    },
    {
      "cells": [
        "managerPassword",
        "AtEvyzy"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "newclass.the_User_logged_in_manager_id_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the login button",
  "keyword": "When "
});
formatter.match({
  "location": "newclass.enter_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User validate the numerical values",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@NewCustomerNumericValidation"
    }
  ]
});
formatter.step({
  "name": "The user navigate the new customer page for NumericValidation",
  "keyword": "When "
});
formatter.match({
  "location": "newclass.the_user_navigate_the_new_customer_page_for_NumericValidation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user validate the numeric values",
  "rows": [
    {
      "cells": [
        "custName",
        "city",
        "state",
        "pinNumber",
        "email"
      ]
    },
    {
      "cells": [
        "143",
        "154",
        "7855",
        "9655",
        "355222"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "newclass.the_user_validate_the_numeric_values(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the validate numerical information text",
  "keyword": "Then "
});
formatter.match({
  "location": "newclass.user_should_see_the_validate_numerical_information_text()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close a browser",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.Close_a_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I want to open demoguru manager login page",
  "keyword": "Given "
});
formatter.match({
  "location": "newclass.i_want_to_open_demoguru_manager_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User logged in manager id and password",
  "rows": [
    {
      "cells": [
        "managerUserId",
        "mngr154543"
      ]
    },
    {
      "cells": [
        "managerPassword",
        "AtEvyzy"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "newclass.the_User_logged_in_manager_id_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the login button",
  "keyword": "When "
});
formatter.match({
  "location": "newclass.enter_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User validate the special characters",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@NewCustomerSpecialValidation"
    }
  ]
});
formatter.step({
  "name": "The user navigate the new customer page for SpecialValidation",
  "keyword": "When "
});
formatter.match({
  "location": "newclass.the_user_navigate_the_new_customer_page_for_SpecialValidation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user validate the special characters",
  "rows": [
    {
      "cells": [
        "custName",
        "Address",
        "city",
        "state",
        "pinno",
        "mobno",
        "email"
      ]
    },
    {
      "cells": [
        "@\u0026*",
        "#,*(",
        "^$%",
        "@!*",
        "-\u003d/",
        "()\u0026^",
        "!#^"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "newclass.the_user_validate_the_special_characters(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the validate special character information text",
  "keyword": "Then "
});
formatter.match({
  "location": "newclass.user_should_see_the_validate_special_character_information_text()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close a browser",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.Close_a_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "New customer registration",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Newcustomer"
    }
  ]
});
formatter.step({
  "name": "The user navigate the new customer page",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on the Submit button",
  "keyword": "And "
});
formatter.step({
  "name": "Alert the ok button",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the customer details \"\u003ccustName\u003e\",\"\u003cgender\u003e\",\"\u003cDOB\u003e\",\"\u003cAddress\u003e\",\"\u003cCity\u003e\",\"\u003cState\u003e\",\"\u003cPIN\u003e\",\"\u003cmobNo\u003e\",\"\u003cemail\u003e\" and \"\u003cPass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User submit the button",
  "keyword": "And "
});
formatter.step({
  "name": "User should see the submit successful message",
  "keyword": "Then "
});
formatter.step({
  "name": "Close a browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "custName",
        "gender",
        "DOB",
        "Address",
        "City",
        "State",
        "PIN",
        "mobNo",
        "email",
        "Pass"
      ]
    },
    {
      "cells": [
        "UserABB",
        "male",
        "01/12/1991",
        "270 pandiyan street",
        "Chennai",
        "Tamilnadu",
        "600033",
        "9795475026",
        "userAAB@gmail.com",
        "user7password"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I want to open demoguru manager login page",
  "keyword": "Given "
});
formatter.match({
  "location": "newclass.i_want_to_open_demoguru_manager_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User logged in manager id and password",
  "rows": [
    {
      "cells": [
        "managerUserId",
        "mngr154543"
      ]
    },
    {
      "cells": [
        "managerPassword",
        "AtEvyzy"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "newclass.the_User_logged_in_manager_id_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the login button",
  "keyword": "When "
});
formatter.match({
  "location": "newclass.enter_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "New customer registration",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Newcustomer"
    }
  ]
});
formatter.step({
  "name": "The user navigate the new customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "newclass.the_user_navigate_the_new_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.click_on_the_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Alert the ok button",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.alert_the_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the customer details \"UserABB\",\"male\",\"01/12/1991\",\"270 pandiyan street\",\"Chennai\",\"Tamilnadu\",\"600033\",\"9795475026\",\"userAAB@gmail.com\" and \"user7password\"",
  "keyword": "When "
});
formatter.match({
  "location": "newclass.enter_the_customer_details_and(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User submit the button",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.user_submit_the_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the submit successful message",
  "keyword": "Then "
});
formatter.match({
  "location": "newclass.user_should_see_the_submit_successful_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close a browser",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.Close_a_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I want to open demoguru manager login page",
  "keyword": "Given "
});
formatter.match({
  "location": "newclass.i_want_to_open_demoguru_manager_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User logged in manager id and password",
  "rows": [
    {
      "cells": [
        "managerUserId",
        "mngr154543"
      ]
    },
    {
      "cells": [
        "managerPassword",
        "AtEvyzy"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "newclass.the_User_logged_in_manager_id_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the login button",
  "keyword": "When "
});
formatter.match({
  "location": "newclass.enter_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Edit customer details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@EditCustomer"
    }
  ]
});
formatter.step({
  "name": "The user navigate to edit customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "newclass.the_user_navigate_to_edit_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the customer id",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.enter_the_customer_id()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Change the address, city, state and pin",
  "rows": [
    {
      "cells": [
        "Omr",
        "HYD",
        "TN",
        "600023"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "newclass.change_the_address_city_state_and_pin(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify details are submitted or not",
  "keyword": "Then "
});
formatter.match({
  "location": "newclass.verify_details_are_submitted_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I want to open demoguru manager login page",
  "keyword": "Given "
});
formatter.match({
  "location": "newclass.i_want_to_open_demoguru_manager_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The User logged in manager id and password",
  "rows": [
    {
      "cells": [
        "managerUserId",
        "mngr154543"
      ]
    },
    {
      "cells": [
        "managerPassword",
        "AtEvyzy"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "newclass.the_User_logged_in_manager_id_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the login button",
  "keyword": "When "
});
formatter.match({
  "location": "newclass.enter_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Delete the customer record",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@DeleteCustomer"
    }
  ]
});
formatter.step({
  "name": "The user navigate to delete customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "newclass.the_user_navigate_to_delete_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter customer id",
  "keyword": "When "
});
formatter.match({
  "location": "newclass.enter_customer_id()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click ok for conformation",
  "keyword": "Then "
});
formatter.match({
  "location": "newclass.click_ok_for_conformation()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify record is deleted successfully",
  "keyword": "And "
});
formatter.match({
  "location": "newclass.verify_record_is_deleted_successfully()"
});
formatter.result({
  "status": "skipped"
});
});