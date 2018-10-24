Feature: Deal data creation

  Scenario:Free CRM create a new deal Scenario

    Given User is already on login page
    When  Title of login page is Free CRM
    Then User enters userName and passWord
      | username | password |
      | naveenk  | test@123 |
    Then User clicks on login button
    Then User is on home page
    Then user moves to new deal page
#    Then User enters Deal details
#      | title | amount | probability | commition |
#      | test deal | 1000 | 50 | 10 |
#      | test deal | 2000 | 60 | 20 |
#      | test deal | 3000 | 70 | 30 |
    Then Close the browser