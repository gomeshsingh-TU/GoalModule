@Regression @function=PerfReview_MA
Feature: Verify Manager Assessment in Performance review section

  Background:
    Given Boost Login page
    When An Operations Manager user logs in
    Then User lands on the version history page

  @ManagerAssessment_QA_01_Boost
  Scenario: Verify Manager Assessment Questionnaires displayed in RHS
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on Complete Assessment button for Direct report
    And Verify Assessment type as "Manager-Assessment"
    Then Verify Manager Assessment Questionnaires are displayed in RHS

  @ManagerAssessment_QA_02_Boost
  Scenario: Verify Save as Draft functionality
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on Complete Assessment button for Direct report
    And Select Overall Rating as "3 - Meet expectations, great job"
    And Answer all the questionnaires
    And Click on Save as Draft button
    Then Verify Complete assessment button is still displayed in Action Column for Direct Report
    And Verify Date column has today's date for Direct Report

  @ManagerAssessment_QA_03_Boost
  Scenario: Submit Manager Assessment
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on Complete Assessment button for Direct report
    And Click on Submit button
    Then Verify Edit & Share buttons are displayed in Action Column
    And Verify Direct Assessment is not acknowledged

  @ManagerAssessment_QA_04_Boost
  Scenario: Manager Assessment can be edited after submit
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on Edit button for Direct report
    And Update entered answers
    And Click On Save button

  @ManagerAssessment_QA_05_Boost
  Scenario: Manager Assessment can be edited after submit
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on Share button for Direct report
    And Click on Share button
    Then Verify View button is displayed in Action Column for the Direct Report

  @ManagerAssessment_QA_06_Boost
  Scenario: Verify View button functionality
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on View button for Direct Report
    Then Verify the answers are updated one
    And Click on Back button
