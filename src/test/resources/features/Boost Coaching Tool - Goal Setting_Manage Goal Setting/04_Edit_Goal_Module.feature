@Regression @function=EditGoal
Feature: Edit Goal

@QA_BCT_GS-EG_01
Scenario: To verify the goal details
  Given Create prereq data for "QA_BCT_GS-VG_03"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on any Goal
  And Verify the Goal detailed data

@QA_BCT_GS-EG_02
Scenario: To verify the status available for the goal
  Given Create prereq data for "QA_BCT_GS-VG_03"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on any Goal
  And Click on Status field and verify List of Status

@QA_BCT_GS-EG_03
Scenario: To verify that Direct Report has the capability to edit or change the status of the goal he created
  Given Create prereq data for "QA_BCT_GS-VG_01"
  Given Boost Login page
  When A Team mate user logs in
  Then Click on Goals and select a Cycle
  And Click on Status of the goal
  And Click on same Goal and verify Edit button is available
  And Verify Status should be clickable and current status

@QA_BCT_GS-EG_04
Scenario: To verify that Immediate Supervisor has the capability to edit or change the status of the goal that he created for the direct report
  Given Create prereq data for "QA_BCT_GS-VG_03"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on Status of the goal for IS
  And Click on same Goal and verify Edit button is available for IS
  And Verify Status should be clickable and current status for IS

@QA_BCT_GS-EG_05
Scenario: To verify that Direct Report has no capability to edit or change the status of the goal that his Immediate Supervisor created for him
  Given Create prereq data for "QA_BCT_GS-VG_03"
  Given Boost Login page
  When A Team mate user logs in
  Then Click on Goals and select a Cycle
  And Click on Status and should not be clickable created by IS
  And Click on same Goal and verify Edit button is not available Goal created by IS
  And Verify Status should not be clickable Goal created by IS

@QA_BCT_GS-EG_06
Scenario: To verify that Employee has the capability to edit or change the status of the goal that he created for the indirect report
  Given Create prereq data for "QA_BCT_GS-VG_05"
  Given Boost Login page
  When A Team mate user logs in
  Then Click on Goals and select a Cycle
  And Click on Status of the goal created for Admin
  And Click on same Goal and verify Edit button is available for Admin
  And Verify Status should be clickable and current status for Admin

@QA_BCT_GS-EG_07
Scenario: To verify that Indirect Report has no capability to edit or change the status of the goal that the employee created for him
  Given Create prereq data for "QA_BCT_GS-VG_05"
  Given Boost Login page
  When A Indirect user logs in
  Then Click on Goals and select a Cycle
  And Click on Status and should not be clickable goal created by Admin
  And Click on same Goal and verify Edit button is not available Goal created by Admin
  And Verify Status should not be clickable Goal created by Admin

@QA_BCT_GS-EG_08
Scenario: To verify that status of the goal can be changed via goal details on or before the Status Updatable date
  Given Create prereq data for "QA_BCT_GS-VG_03"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Select Previous Cycle "First Quarter"
  And Click on Previous Goal and change status to Completed
  Then Click on Goals and select a Cycle
  And Verify the status of the goal can be changed by employee before Status Updatable date

@QA_BCT_GS-EG_09
Scenario: To verify that status of the goal can be changed via goal list on or before the Status Updatable date
  Given Create prereq data for "QA_BCT_GS-VG_03"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Select Previous Cycle "First Quarter"
  And Change the status for Previous Goal to Open
  And Verify the status of the goal can be changed via Goal list by employee before Status Updatable date

#@QA_BCT_GS-EG_10
#Scenario: To verify that status of the goal cannot be changed after the Status Updatable date (change of status is initiated at goal details)
#  Given Create prereq data for "QA_BCT_GS-VG_01"
#  Given Boost Login page
#  When A Supervisor logs in
#  Then Click on Goals and select a Old Cycle "First Quarter"
#  And Click on the Goal employee created
#  And Verify message Status change is beyond cutoff

#@QA_BCT_GS-EG_11
#Scenario: To verify that status of the goal cannot be changed after the Status Updatable date (change of status is initiated at goal list)
#  Given Boost Login page
#  When A Supervisor logs in
#  Then Click on Goals and select a Old Cycle "Q4 2020 Cycle"
#  And Verify message Status change is beyond cutoff on Goal List
#
#@QA_BCT_GS-EG_12
#Scenario: To verify that the goal can be edited on or before the Editable Until date
#  Given Create prereq data for "QA_BCT_GS-VG_03"
#  Given Boost Login page
#  When A Supervisor logs in
#  And Click on Goals and select a Cycle
#  And Click on any Goal
#  And Click on Edit button, Update the necessary field and click on Save
#  And Click on Goals and select a Cycle
#  And Click on any Goal
#  And Verify that the goal is updated on or before the Editable Until date
#
#@QA_BCT_GS-EG_13
#Scenario: To verify that the goal cannot be edited after the Editable Until date
#  Given Boost Login page
#  When A Supervisor logs in
#  And Click on Goals and select a Old Cycle "Old Cycle"
#  And Click on the Goal employee created
#  And Verify goal cannot be edited after the Editable Until date
#
@QA_BCT_GS-EG_14
Scenario: To verify that user can add comment on the goal
  Given Create prereq data for "QA_BCT_GS-VG_03"
  Given Boost Login page
  When A Supervisor logs in
  And Click on Goals and select a Cycle
  And Click on any Goal
  And Enter notes on the comment box
  And Click Add Note and verify the added comment

