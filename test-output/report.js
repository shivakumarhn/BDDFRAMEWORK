$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/hns/IdeaProjects/FreeCrmBddFramework/src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM application test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM Home Page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate the home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 18576002810,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 57238518,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_credentials_username_and_password()"
});
formatter.result({
  "duration": 14179484981,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_the_home_page_title()"
});
formatter.result({
  "duration": 7310353,
  "status": "passed"
});
});