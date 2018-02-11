#Author: hdmail32@gmail.com


Feature: Login and Betting


  Scenario Outline: As a WH Customer I want the ability to place a bet on a English Premier League event

  Given user is already on Login Page
  When Title is Online Betting from William Hill - The Home of Betting
  Then user clicks Login button
  Then user enters username and password 
  And submits credentials  
  Then Opens an English Premier League
  Then Selects first team od English Premier League to Home win
  #Note that bet amount is expected in format of double e.g. 12.0, 
  And Places bet of <bet_amount>
  Then verifies presense of Odds and Retuns elements
  Then Close the browser 
  Examples:
  | bet_amount |
  |0.05        | 
 #|12.0        |
 

