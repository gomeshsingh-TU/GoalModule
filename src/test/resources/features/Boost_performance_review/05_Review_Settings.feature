@Regression @function=reviewSetting
Feature: Verify review Setting section

  Background:
    Given Boost Login page
    When An Admin user logs in
    Then User lands on the version history page

  @RS_QA_01_Boost
  Scenario: Verify Required field while creating a new review cycle
    Given Navigate to Review Setting page
    When Select "Create new cycle" in review cycle dropdown
    And Click on Save button
    And Verify "Invalid review name." error message displayed for review cycle name
    And Enter "Automation Test Cycle" as review cycle name
    And Click on Save button
    And Verify "There should be at least 1 Self-Assessment question in a review." error message displayed for SA que
    And Add 1 Self-Assessment questions
    And Click on Save button
    And Verify "There should be at least 1 Manager-Assessment question in a review." error message displayed for MA que
    And Add 1 Manager-Assessment questions
    And Click on Save button
    Then Verify "There should be at least 2 ratings in a review." error message displayed for Review Rating

  @RS_QA_02_Boost
  Scenario: Verify that user able to create new review cycle
    Given Navigate to Review Setting page
    When Select "Create new cycle" in review cycle dropdown
    And Enter "Automation Test Cycle" as review cycle name
    And Select "Feb 16 2020" and "Feb 22 2021" as Duration
    And Select "Yes" in Is Active option
    And Select "Yes" in Sharing Enabled option
    And Select "Yes" in Is Listed option
    And Add 5 Review Ratings
    And Enter Texts and Values to added Review Ratings
    And Add 4 Self-Assessment questions
    And Enter Texts and IsRequired to added Self-Assessment questions
    And Add 4 Manager-Assessment questions
    And Enter Texts and IsRequired to added Manager-Assessment questions
    And Click on Save button
    Then verify Review cycle added and "Performance Review Saved." message displayed

  @RS_QA_03_Boost
  Scenario: Verify that required fields while updating a review cycle
    Given Navigate to Review Setting page
    When Select "Automation Test Cycle" in review cycle dropdown
    And Delete review cycle name
    And Click on Save button
    Then Verify "Invalid review name." error message displayed for review cycle name

  @RS_QA_04_Boost
  Scenario: Verify Make a copy functionality
    Given Navigate to Review Setting page
    When Select "Automation Test Cycle" in review cycle dropdown
    When click On Make a copy button
    Then Verify "Automation Test Cycle has been duplicated." message is displayed for duplicate Cycle creation