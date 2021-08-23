@Regression @function=CreateGoal
Feature: Create Goal

@QA_BCT_GS-CG_01
Scenario: To verify the Create Goal form contents
Given Boost Login page
When A Supervisor logs in
Then Click on Goals and select a Cycle
And Click on Create Goal
And Click on your name
Then Verify name of the goal form should be your name
Then Verify cycle name should be the one selected
Then Verify Date coverage and Due Date
Then Verify title and description is free form
Then Verify keyresult textbox and button are displayed

@QA_BCT_GS-CG_02
Scenario: To verify that user cannot create a goal if one or more required fields is/are not yet populated
Given Create prereq data for "QA_BCT_GS-CG_02"
Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on Create Goal
  And Click on your name
  And Click on Create Goal Save button
  Then Verify that page is not redirected to goals page
  And Input data in Title field for himself
  And Click on Create Goal Save button
  Then Verify that page is not redirected to goals page
  And input data in description field
  And Click on Create Goal Save button
  Then Verify that page is not redirected to goals page
  And Add a key result
  And Click on Create Goal Save button
  Then Verify that page is redirected to goals page
  And Verify the List of Goals created for himself

@QA_BCT_GS-CG_03
Scenario: To verify that user can create a goal for himself
  Given Create prereq data for "QA_BCT_GS-CG_02"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on Create Goal
  And Click on your name
  And Input data in Title field for himself
  And input data in description field
  And Add a key result
  And Click on Create Goal Cancel button
  Then Verify that page is redirected to goals page
  And Click on Create Goal
  And Click on your name
  And Input data in Title field for himself
  And input data in description field
  And Add a key result
  And Click on Create Goal Save button
  Then Verify that page is redirected to goals page
  And Verify the List of Goals created for himself

@QA_BCT_GS-CG_04
Scenario: To verify that user can create goal for his direct report
  Given Create prereq data for "QA_BCT_GS-CG_02"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on Create Goal
  Then Verify list of Direct report are displayed
  And Click on one of the direct report
  And Input data in Title field for Direct report
  And input data in description field
  And Add a key result
  And Click on Create Goal Save button
  And Verify Create Goal is saved for Direct report

@QA_BCT_GS-CG_05
Scenario: To verify that user can create goal for an indirect report
  Given Create prereq data for "QA_BCT_GS-CG_02"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Click on Create Goal
  And Enter any employee name or number in Others field
  And Click on the employee name
  And Input data in Title field for Indirect report
  And input data in description field
  And Add a key result
  And Click on Create Goal Save button
  And Verify Create Goal is saved for Indirect report

