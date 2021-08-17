@Regression @function=PerfReviewForm
Feature: Verify review Setting section

  Background:
    Given Boost Login page

  @PRF_QA_01_Boost
  Scenario: Verify Download Response functionality
    When An Admin user logs in
    When Navigate to Review Setting page
    And Select "Automation Test Cycle" in review cycle dropdown
    And click on Download Response button
    Then Verify "File generated." message is displayed on Successfully download

  @PRF_QA_02_Boost
  Scenario: Verify Self Assessment Questionnaires
    When An Operations Manager user logs in
    And User clicks on Performance Review icon
    And Select "Automation Test Cycle" Review Cycle
    And Click on Complete Assessment button for Self Assessment
    Then Verify all the questions of Self Assessment

  @PRF_QA_03_Boost
  Scenario: Verify Manager Assessment Questionnaires
    When An Operations Manager user logs in
    And User clicks on Performance Review icon
    And Select "Automation Test Cycle" Review Cycle
    And Click on Complete Assessment button for Direct report
    Then Verify all the questions of Manager Assessment

  @PRF_QA_04_Boost
  Scenario: Verify Review Cycle is not displayed when marked "Sharing Enabled" No
    Given An Admin user logs in
    When Navigate to Review Setting page
    And Select "Automation Test Cycle" in review cycle dropdown
    And Select "No" in Sharing Enabled option
    And Click on Save button
    And Logout from the application
    And An Operations Manager user logs in
    And User clicks on Performance Review icon
    And Select "Automation Test Cycle" Review Cycle
    And Click on Complete Assessment button for Direct report
    And Select Overall Rating as "3 - Meet expectations, great job"
    And Answer all the questionnaires
    And Click on Submit button
    Then Verify Share button is not displayed in Action Column

  @PRF_QA_05_Boost
  Scenario: Verify Review Cycle is not displayed when marked "Is Active" No
    Given An Admin user logs in
    When Navigate to Review Setting page
    When Select "Automation Test Cycle" in review cycle dropdown
    And Select "No" in Is Active option
    And Click on Save button
    When User clicks on Performance Review icon
    And Select "Automation Test Cycle" Review Cycle
    And Click on Complete Assessment button for Self Assessment
    Then Verify "Assessment is not active." message displayed for not active review cycle

  @PRF_QA_06_Boost
  Scenario: Verify Review Cycle is not displayed when marked "Is Listed" No
    Given An Admin user logs in
    And Navigate to Review Setting page
    When Select "Automation Test Cycle" in review cycle dropdown
    And Select "No" in Is Listed option
    And Click on Save button
    When User clicks on Performance Review icon
    Then Verify "Automation Test Cycle" no available as option
















