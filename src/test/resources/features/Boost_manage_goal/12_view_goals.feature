@Regression @function=ViewGoals
Feature: To verify that Supervisor and Employee can view Goals created for himself, direct reports and others

  @ViewGoals_QA_01_Boost
  Scenario: To verify that direct report can view the goals he created
    Given Boost Login page
    When A Team mate user logs in
    Then Click on Goals and select a Cycle
    And Verify the List of Goals created for himself

  @ViewGoals_QA_02_Boost
  Scenario: To verify that Immediate Supervisor can view the goal that his Direct Report created for himself
    Given Boost Login page
    When A Team Leader user logs in
    Then Click on Goals and select a Cycle
    And Verify IS can view the Goals created by Direct reports for himself

  @ViewGoals_QA_03_Boost
  Scenario: To verify that Immediate Supervisor can view the goal that he created for his Direct Report
    Given Boost Login page
    When A Team Leader user logs in
    Then Click on Goals and select a Cycle
    And Verify IS can view the goal that he created for his Direct Report

  @ViewGoals_QA_04_Boost
  Scenario: To verify that Direct Report can view the goal that his Immediate Supervisor created for him
    Given Boost Login page
    When A Team mate user logs in
    Then Click on Goals and select a Cycle
    And Verify Direct Report can view the goal that his IS created for him

  @ViewGoals_QA_05_Boost
  Scenario: To verify that Employee can view the goal that he created for an indirect report
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Verify Employee can view the goal that he created for an indirect report

  @ViewGoals_QA_06_Boost
  Scenario: To verify that Indirect Report can view the goal that Employee created for him
    Given Boost Login page
    When A Team mate user logs in
    Then Click on Goals and select a Cycle
    And Verify Indirect Report can view the goal that Employee created for him

  @ViewGoals_QA_07_Boost
  Scenario: To verify that Immediate Supervisor of Indirect Report can view the goal that Employee created for Indirect Report
    Given Boost Login page
    When A Team Leader user logs in
    Then Click on Goals and select a Cycle
    And Verify IS of Indirect Report can view the goal that Employee created for Indirect Report

  @ViewGoals_QA_08_Boost
  Scenario: To verify that goals with due date covered in the current cycle that is marked Completed will no longer be listed in the current cycle (goal was created on the previous cycle)
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Select Previous Cycle "Previous Cycle"
    And Click on Previous Goal and change status to Completed
    And Click on Goals and select a Cycle
    And Select Current Cycle "Current Cycle"
    And Verify Goals with due date covered in the current cycle that is marked Completed will no longer be listed in the current cycle

  @ViewGoals_QA_09_Boost
  Scenario: To verify that goals with due date covered in the current cycle that is not marked Completed will be listed in the current cycle (goal was created on the previous cycle)
    Given Boost Login page
    When An Admin user logs in
    Then Click on Goals and select a Cycle
    And Select Previous Cycle "Previous Cycle"
    And Click on Previous Goal and change status to Open
    And Click on Goals and select a Cycle
    And Select Current Cycle "Current Cycle"
    And Verify Goals with due date covered in the current cycle that is not marked Completed will be listed in the current cycle
