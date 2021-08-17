@Regression @function=Ack_Assessment
Feature: Verify Acknowledge Assessment in Performance review section

  @Ack_QA_01_Boost
  Scenario: Acknowledge by Manager
    Given Boost Login page
    When An Operations Manager user logs in
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on Pending button for Direct Report
    And Click on Acknowledge
    Then Verify Direct Assessment is acknowledged

  @Ack_QA_02_Boost
  Scenario: Acknowledge by Direct Report
    Given Boost Login page
    When A Team Leader user logs in
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on Pending button for Self Assessment
    And Click on Acknowledge
    Then Verify Manager Assessment is acknowledged