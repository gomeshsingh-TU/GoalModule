@Regression @function=listOfDirectReport
Feature: Verify Total Number of Direct Report of Manager with API

  Background:
    Given Boost Login page
    When A Team Leader user logs in
    Then User lands on the version history page


  @MLODR_QA_01_Boost
  Scenario: Verify API and UI list of Direct Report
    When User clicks on Performance Review icon
    Then Verify that number of direct report are same in UI and API

