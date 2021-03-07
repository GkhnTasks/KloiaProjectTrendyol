$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/footer.feature");
formatter.feature({
  "name": "Check footer link",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should open login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDef.user_should_open_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login with facebook",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDef.user_click_login_with_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user type facebook account credential",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDef.user_type_facebook_account_credential()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to see footer links on all page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@task3"
    }
  ]
});
formatter.step({
  "name": "user goto footer section",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.FooterStepDef.user_goto_footer_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write footer link on txt file",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.FooterStepDef.user_write_footer_link_on_txt_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click \"Canlı Yardım\" link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FooterStepDef.user_click_link(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check all link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.FooterStepDef.user_check_al_link()"
});
formatter.result({
  "status": "passed"
});
});