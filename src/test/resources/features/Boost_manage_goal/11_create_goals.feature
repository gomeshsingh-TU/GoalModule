@Regression @function=CreateGoals
Feature: To verify that User can create Goals for himself, direct reports and others

  @CreateGoal_QA_01_Boost
  Scenario: To verify the Create Goal form contents
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Click on Create Goal
    And Click on your name
    And Verify the Create Goals form contents

  @CreateGoal_QA_02_Boost
  Scenario: To verify that user cannot create a goal if one or more required fields is/are not yet populated
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Click on Create Goal
    And Click on your name
    And Click on Create Goal Save button
    And Verify Goal title cannot be left blank
    And Input data in Title field
    And Click on Create Goal Save button
    And Verify You must provide description to the goal
    And Input data in Description field
    And Click on Create Goal Save button
    And Verify You must provide at least 1 key result
    And Add a key result
    And Click on Create Goal Save button
    And Verify Create Goal is saved

  @CreateGoal_QA_03_Boost
  Scenario: To verify that user can create a goal for himself
    Given Boost Login page
    When A Team mate user logs in
    Then Click on Goals and select a Cycle
    And Click on Create Goal
    And Click on your name
    And Input data in Title field
    And Input data in Description field
    And Add a key result
    And Click on Create Goal Cancel button
    And Verify User should be redirected to Create Goal module page
    And Click on Goals and select a Cycle
    And Click on Create Goal
    And Click on your name
    And Input data in Title field for himself
    And Input data in Description field
    And Add a key result
    And Click on Create Goal Save button
    And Verify Create Goal is saved for TM

  @CreateGoal_QA_04_Boost
  Scenario: To verify that user can create goal for his direct report
    Given Boost Login page
    When A Team Leader user logs in
    Then Click on Goals and select a Cycle
    And Click on Create Goal
    And Click on one of the direct report
    And Input data in Title field for Direct report
    And Input data in Description field
    And Add a key result
    And Click on Create Goal Save button
    And Verify Create Goal is saved for Direct report

  @CreateGoal_QA_05_Boost
  Scenario: To verify that user can create goal for an indirect report
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Click on Create Goal
    And Enter any employee name or number in Others field
    And Click on the employee name
    And Input data in Title field for Indirect report
    And Input data in Description field
    And Add a key result
    And Click on Create Goal Save button
    And Verify Create Goal is saved for Indirect report

