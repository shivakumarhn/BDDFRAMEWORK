Feature: Free CRM app test

  Scenario: Free CRM create deal test
    Given User is on deal page
    When  User fills the deals form
    Then deal is created

  Scenario: Free CRM create contact test
    Given User is on contact page
    When  User fills the contact form
    Then Contact is created

  Scenario Outline:Free CRM create mail test
    Given User is on mail page
    When  User fills mail form
    Then Mail is created

    Examples:
      | Mail1 |
      | Mail2 |
      | mail3 |
