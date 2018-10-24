Feature:Free CRM Login Feature

#  Without examples keyword
#  Scenario:Free CRM Login Test Scenario
#
#    Given User is already on login page
#    When  Title of login page is Free CRM
#    Then User enters "username" and "password"
#    Then User clicks on login button
#    Then User is on home page
#    Then Close the browser

#  With examples keyword
  Scenario Outline:Free CRM Login Test Scenario

    Given User is already on login page
    When  Title of login page is Free CRM
    Then User enters "<userName>" and "<password>"
    Then User clicks on login button
    Then User is on home page
    Then Close the browser

    Examples:
      | userName | password |
      | naveenk  | test@123 |
      | tom      | test456  |


