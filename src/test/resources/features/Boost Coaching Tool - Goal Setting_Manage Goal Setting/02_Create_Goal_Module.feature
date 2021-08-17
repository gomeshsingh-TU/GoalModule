@Regression @function=CreateGoal
Feature: Create Goal

@QA_BCT_GS-CG_01
Scenario: To verify the Create Goal form contents
Given Boost Login page
When A Supervisor logs in
Then Click on Goals and select a Cycle
And Click on Create Goal
And Click on your name
#  Verify contents

@QA_BCT_GS-CG_02
Scenario: To verify that user cannot create a goal if one or more required fields is/are not yet populated
Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on Create Goal
  And Click on your name
  And Click on Create Goal Save button
  And Input data in Title field for himself
  And Click on Create Goal Save button
  And Input data in Description field
  And Click on Create Goal Save button
  And Add a key result
  And Click on Create Goal Save button
#  Verify

@QA_BCT_GS-CG_03
Scenario: To verify that user can create a goal for himself
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on Create Goal
  And Click on your name
  And Input data in Title field for himself
  And Input data in Description field
  And Add a key result
  And Click on Create Goal Cancel button
  And Click on Create Goal
  And Click on your name
  And Input data in Title field for himself
  And Input data in Description field
  And Add a key result
  And Click on Create Goal Save button
#  Verify

@QA_BCT_GS-CG_04
Scenario: To verify that user can create goal for his direct report
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on Create Goal
#  Verify list of direct report
  And Click on one of the direct report
  And Input data in Title field for Direct report
  And Input data in Description field
  And Add a key result
  And Click on Create Goal Save button
#  Verify

@QA_BCT_GS-CG_05
Scenario: To verify that user can create goal for an indirect report
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on Create Goal
  And Enter any employee name or number in Others field
  And Click on the employee name
  And Input data in Title field for Indirect report
  And Input data in Description field
  And Add a key result
  And Click on Create Goal Save button
#  Verify
