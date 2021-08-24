@Regression @function=ManageGoalSetting
Feature: Manage Goal Setting

@QA_BCT_GS-MGS_01
Scenario: To verify that user cannot create a goal if one or more required fields is/are not yet populated
Given Clear goal database
Given Boost Login page
When A Supervisor logs in
Then Click on Initials on right upper corner
And Click on Manage Goals
And Click Add Cycle
And Input data in cycle for the first quarter
Then click cancel button
Then Verify Cycle Name is not Added in the list
And Click Add Cycle
And Input data in cycle for the first quarter
And Click on Add button for Cycle
And Verify Cycle Name is Added in the list

@QA_BCT_GS-MGS_02
Scenario: To verify that user cannot create a goal if one or more required fields is/are not yet populated
Given Create prereq data for "QA_BCT_GS-CG_02"
Given Boost Login page
When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on Create Goal
  And Click on your name
  And Click on Create Goal Save button
  And Input data in Title field for himself
  And Click on Create Goal Save button
  And input data in description field
  And Click on Create Goal Save button
  And Add a key result
  And Click on Create Goal Save button
  Then Verify Create Goal is saved for TM

#
#@QA_BCT_GS-MGS_03
#Scenario: To verify that Admin can enable/disable the edit functionality for each cycle
#Given Boost Login page
#When A Supervisor logs in
#Then Click on Initials on right upper corner
#And Click on Manage Goals
#And Click Add Cycle
#Then Set name of quarter as first quarter
#Then Set first quarter on Start Date field
#Then Set first quarter on End Date field
#Then Set first quarter status change cutoff date
#Then Set first quarter edit cutoff date
#Then Select "Yes" on Is Listed field
#And Click on Add button for Cycle
##  Verify
