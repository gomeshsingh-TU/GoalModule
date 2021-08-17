@Regression @function=ManageGoals
Feature: To verify that Admin can create, update and manage cycle name

#  Background:
#    Given Boost Login page
#    When An Admin user logs in
#   Then Click on Initials on right upper corner
#    And Click on Manage Goals

  @ManageGoal_QA_01_Boost
  Scenario: To verify that Admin can create cycle name
    Given Boost Login page
    When An Admin user logs in
    Then Click on Initials on right upper corner
    And Click on Manage Goals
    And Click Add Cycle
    And Fill all the fields
    And Click on Cancel
    And Verify Cycle Name is not added in the list
    And Click Add Cycle
    And Fill all the fields
    And Click on Add button for Cycle
    And Verify Cycle Name is added in the list

  @ManageGoal_QA_02_Boost
  Scenario: To verify that Admin can update the cycle name
    Given Boost Login page
    When An Admin user logs in
    Then Click on Initials on right upper corner
    And Click on Manage Goals
    And Select a Cycle and Update cycle name
    And Click on Cancel
    And verify Cycle name should not be updated
    And Select a Cycle and Update cycle name
    And Click on Add button for Cycle
    And Verify Cycle Name should be updated in the list

  @ManageGoal_QA_03_Boost
  Scenario: To verify that Admin can enable/disable the edit functionality for each cycle
    Given Boost Login page
    When An Admin user logs in
    Then Click on Initials on right upper corner
    And Click on Manage Goals
    And Select a Cycle
    And Update Status Change Cutoff field
    And Update Edit Cutoff field
    And Click on Add button for Cycle
    And Verify Status Change Cutoff field
    And Verify Edit Cutoff field