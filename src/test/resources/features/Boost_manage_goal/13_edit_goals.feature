@Regression @function=EditGoals
Feature: To verify that TM, IS and Indirect report can Edit the Goal

  @EditGoal_QA_01_Boost
  Scenario: To verify the goal details
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Click on any Goal
    And Verify the Goal detailed data

  @EditGoal_QA_02_Boost
  Scenario: To verify the status available for the goal
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Click on any Goal
    And Click on Status field and verify List of Status

  @EditGoal_QA_03_Boost
  Scenario: To verify that Direct Report has the capability to edit or change the status of the goal he created
    Given Boost Login page
    When A Team mate user logs in
    Then Click on Goals and select a Cycle
    And Click on Status of the goal
    And Click on same Goal and verify Edit button is available
    And Verify Status should be clickable and current status

  @EditGoal_QA_04_Boost
  Scenario: To verify that Immediate Supervisor has the capability to edit or change the status of the goal that he created for the direct report
    Given Boost Login page
    When A Team Leader user logs in
    Then Click on Goals and select a Cycle
    And Click on Status of the goal for IS
    And Click on same Goal and verify Edit button is available for IS
    And Verify Status should be clickable and current status for IS

  @EditGoal_QA_05_Boost
  Scenario: To verify that Direct Report has no capability to edit or change the status of the goal that his Immediate Supervisor created for him
    Given Boost Login page
    When A Team mate user logs in
    Then Click on Goals and select a Cycle
    And Click on Status and should not be clickable created by IS
    And Click on same Goal and verify Edit button is not available Goal created by IS
    And Verify Status should not be clickable Goal created by IS

  @EditGoal_QA_06_Boost
  Scenario: To verify that Employee has the capability to edit or change the status of the goal that he created for the indirect report
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Click on Status of the goal created for Admin
    And Click on same Goal and verify Edit button is available for Admin
    And Verify Status should be clickable and current status for Admin

  @EditGoal_QA_07_Boost
  Scenario: To verify that Indirect Report has no capability to edit or change the status of the goal that the employee created for him
    Given Boost Login page
    When A Team mate user logs in
    Then Click on Goals and select a Cycle
    And Click on Status and should not be clickable goal created by Admin
    And Click on same Goal and verify Edit button is not available Goal created by Admin
    And Verify Status should not be clickable Goal created by Admin

  @EditGoal_QA_08_Boost
  Scenario: To verify that status of the goal can be changed via goal details on or before the Status Updatable date
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Select Previous Cycle "Previous Cycle"
    And Click on Previous Goal and change status to Completed
    And Verify the status of the goal can be changed by employee before Status Updatable date

  @EditGoal_QA_09_Boost
  Scenario: To verify that status of the goal can be changed via goal list on or before the Status Updatable date
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Select Previous Cycle "Previous Cycle"
    And Change the status for Previous Goal to Open
    And Verify the status of the goal can be changed via Goal list by employee before Status Updatable date

  @EditGoal_QA_10_Boost
  Scenario: To verify that status of the goal cannot be changed after the Status Updatable date (change of status is initiated at goal details)
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Old Cycle "Q4 2020 Cycle"
    And Click on the Goal employee created
    And Verify message Status change is beyond cutoff


  @EditGoal_QA_11_Boost
  Scenario: To verify that status of the goal cannot be changed after the Status Updatable date (change of status is initiated at goal list)
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Old Cycle "Q4 2020 Cycle"
    And Verify message Status change is beyond cutoff on Goal List

  @EditGoal_QA_12_Boost
  Scenario: To verify that the goal can be edited on or before the Editable Until date
    Given Boost Login page
    When An Admin user logs in
    And Click on Goals and select a Cycle
    And Select Previous Cycle "Previous Cycle"
    And Click on Previous Goal
    And Click on Edit button, Update the necessary field and click on Save
    And Select Previous Cycle "Previous Cycle"
    And Click on Previous Goal
    And Verify that the goal is updated on or before the Editable Until date

  @EditGoal_QA_13_Boost
  Scenario: To verify that the goal cannot be edited after the Editable Until date
    Given Boost Login page
    When An Admin user logs in
    And Click on Goals and select a Old Cycle "Old Cycle"
    And Click on the Goal employee created
    And Verify goal cannot be edited after the Editable Until date

  @EditGoal_QA_14_Boost
  Scenario: To verify that user can add comment on the goal
    Given Boost Login page
    When An Admin user logs in
    And Click on Goals and select a Cycle
    And Click on any Goal
    And Enter notes on the comment box
    And Click Add Note and verify the added comment
