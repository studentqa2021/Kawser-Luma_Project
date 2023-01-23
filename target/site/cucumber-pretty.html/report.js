$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Login%20Test.feature");
formatter.feature({
  "name": "Login function test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "As a city bank Luma application user, login should success with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Positive"
    },
    {
      "name": "@S29-10"
    }
  ]
});
formatter.step({
  "name": "go to application URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.getSetup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.clickLoginBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Put username",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.putUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Put password",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.addPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.clickSignInBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validation login status",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.validation()"
});
formatter.result({
  "status": "passed"
});
});