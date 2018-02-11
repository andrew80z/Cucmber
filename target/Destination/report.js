$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("browse.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: hdmail32@gmail.com"
    }
  ],
  "line": 4,
  "name": "Login and Betting",
  "description": "",
  "id": "login-and-betting",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "As a WH Customer I want the ability to place a bet on a English Premier League event",
  "description": "",
  "id": "login-and-betting;as-a-wh-customer-i-want-the-ability-to-place-a-bet-on-a-english-premier-league-event",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Title is Online Betting from William Hill - The Home of Betting",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "submits credentials",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Opens an English Premier League",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Selects first team od English Premier League to Home win",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#Note that bet amount is expected in format of double e.g. 12.0,"
    }
  ],
  "line": 16,
  "name": "Places bet of \u003cbet_amount\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verifies presense of Odds and Retuns elements",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "login-and-betting;as-a-wh-customer-i-want-the-ability-to-place-a-bet-on-a-english-premier-league-event;",
  "rows": [
    {
      "cells": [
        "bet_amount"
      ],
      "line": 20,
      "id": "login-and-betting;as-a-wh-customer-i-want-the-ability-to-place-a-bet-on-a-english-premier-league-event;;1"
    },
    {
      "cells": [
        "0.05"
      ],
      "line": 21,
      "id": "login-and-betting;as-a-wh-customer-i-want-the-ability-to-place-a-bet-on-a-english-premier-league-event;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "As a WH Customer I want the ability to place a bet on a English Premier League event",
  "description": "",
  "id": "login-and-betting;as-a-wh-customer-i-want-the-ability-to-place-a-bet-on-a-english-premier-league-event;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Title is Online Betting from William Hill - The Home of Betting",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "submits credentials",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Opens an English Premier League",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Selects first team od English Premier League to Home win",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#Note that bet amount is expected in format of double e.g. 12.0,"
    }
  ],
  "line": 16,
  "name": "Places bet of 0.05",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verifies presense of Odds and Retuns elements",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 9262256386,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_betting()"
});
formatter.result({
  "duration": 104629250,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_account_button()"
});
formatter.result({
  "duration": 210521117,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 417092806,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.login_submit()"
});
formatter.result({
  "duration": 3756591205,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.open_English_premier_league()"
});
formatter.result({
  "duration": 807569535,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.place_bet_English_premier_league()"
});
formatter.result({
  "duration": 779432865,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 14
    },
    {
      "val": "05",
      "offset": 16
    }
  ],
  "location": "LoginStepDefinition.place_a_bet(int,int)"
});
formatter.result({
  "duration": 679526179,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.check_odds_n_returns()"
});
formatter.result({
  "duration": 95707973,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 786547132,
  "status": "passed"
});
});