@Regression @function=PerfReview_SA
Feature: Verify Self Assessment in Performance review section

  Background:
    Given Boost Login page
    When A Team Leader user logs in
    Then User lands on the version history page


  @SelfAssessment_QA_01_Boost
  Scenario: Verify User Lands on Performance Review Page
    When User clicks on Performance Review icon
    Then Verify user lands on Performance Review page

  @SelfAssessment_QA_02_Boost
  Scenario: Verify Self Assessment Questionnaires displayed in LHS
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on Complete Assessment button for Self Assessment
    And Verify Assessment type as "Self-Assessment"
    And Select Overall Rating as "3 - Meet expectations, great job"
    Then Verify Self Assessment Questionnaires are displayed in LHS


  @SelfAssessment_QA_03_Boost
  Scenario: Verify Save as Draft functionality
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on Complete Assessment button for Self Assessment
    And Select Overall Rating as "3 - Meet expectations, great job"
    Then Answer all the questionnaires
    And Click on Save as Draft button
    Then Verify Complete assessment button is still displayed in Action Column
    And Verify Date column has today's date


  @SelfAssessment_QA_04_Boost
  Scenario: Submit Self Assessment
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on Complete Assessment button for Self Assessment
    And Click on Submit button
    Then Verify View button is displayed in Action Column
    And Verify Manager Assessment is not acknowledged

  @SelfAssessment_QA_05_Boost
  Scenario: Verify View button functionality
    When User clicks on Performance Review icon
    And Select "Q4 2020 Review Cycle" Review Cycle
    And Click on View button for Self Assessment
    Then Verify that previous answers are same as entered
    And Click on Back button