Feature:Free CRM create contacts


  Scenario Outline:Free CRM create a new contact Scenario

    Given User is already on login page
    When  Title of login page is Free CRM
    Then User enters "<username>" and "<password>"
    Then User clicks on login button
    Then User is on home page
    Then user moves to new contact page
#    Then User enters contact details "<firstName>" and "<lastName>" and "<position>"
    Then Close the browser

    Examples:
      | username | password | firstName | lastName | position |
      | naveenk  | test@123 | Tom       | peter    | Manager  |
      | naveenk  | test@123 | David     | Miller  | Director |