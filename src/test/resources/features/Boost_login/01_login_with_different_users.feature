@Regression @function=Boostlogin
Feature: Verify that users of different levels can login to Boost

@Login_QA_01_Boost
Scenario: Users are able to login successfully into Boost application
Given Boost Login page
When A Team mate user logs in
Then User lands on the version history page
