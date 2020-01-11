$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "Accout summary",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@account_summary"
    }
  ]
});
formatter.scenario({
  "name": "Account summary page should have cash Account, Investment Accounts, Credit Accounts, Loan Accounts.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@account_summary"
    },
    {
      "name": "@account_types"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSummaryStepDeffinations.the_user_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the fallowing account types",
  "rows": [
    {
      "cells": [
        "Cash Accounts"
      ]
    },
    {
      "cells": [
        "Investment Accounts"
      ]
    },
    {
      "cells": [
        "Credit Accounts"
      ]
    },
    {
      "cells": [
        "Loan Accounts"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSummaryStepDeffinations.the_user_should_see_the_fallowing_account_types(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});