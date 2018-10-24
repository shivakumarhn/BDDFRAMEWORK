Feature: Deal data creation

  Scenario:Free CRM create a new deal Scenario

    Given User is already on login page
    When  Title of login page is Free CRM
    Then User enters username and password
      | naveenk | test@123 |
    Then User clicks on login button
    Then User is on home page
    Then user moves to new deal page
#    Then User enters deal details
#      | test deal | 1000 | 50 | 10 |
    Then Close the browser