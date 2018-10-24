Feature: Test tagged hooks

  @First
  Scenario: This is first test
    Given This is first step
    When  This is second step
    Then This is third step

  @Second
  Scenario: This is second test
    Given This is first step
    When  This is second step
    Then This is third step


  @Third
  Scenario: This is third test
    Given This is first step
    When  This is second step
    Then This is third step