@FunctionalTest
Feature: Free CRM application testing

  @SmokeTest @RegressionTest
  Scenario: Login with correct username and correct password
    Given This is a valid login test

  @RegressionTest
  Scenario: Login with inCorrect username and correct password
    Given This is a invalid login test

  @SmokeTest
  Scenario: Cre@SmokeTest ate a contact
    Given This is a contact test case

  @SmokeTest @RegressionTest
  Scenario: Create a deal
    Given This is a deal test case

  @RegressionTest
  Scenario: Create a task
    Given This is a task test case

  @SmokeTest
  Scenario: Create a case
    Given This is a case test case

  @SmokeTest @RegressionTest
  Scenario: Verify left panel links
    Given Clicking on left panel link

  @SmokeTest
  Scenario: Search a deal
    Given This is a search deal test

  @SmokeTest
  Scenario: Search a contact
    Given This is a search contact test

  @SmokeTest @RegressionTest
  Scenario: Search a case
    Given This is a search case test

  @SmokeTest @RegressionTest
  Scenario: Search a task
    Given This is a search task test

  @SmokeTest @End2End
  Scenario: Search a call
    Given This is a search call test

  @SmokeTest @End2End
  Scenario: Search an email
    Given This is a search email test

  @SmokeTest @End2End
  Scenario: Search a docs
    Given This is a search docs test

  @SmokeTest @End2End
  Scenario: Search a form
    Given This is a search form test

  @End2End
  Scenario: Validate a report
    Given This is a report test

  @End2End
  Scenario: Application logout
    Given This is a logout test

  Scenario: Browser closed
    Given This is a browser close test