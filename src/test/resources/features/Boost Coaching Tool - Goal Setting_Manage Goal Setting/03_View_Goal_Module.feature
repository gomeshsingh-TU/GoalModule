@Regression @function=ViewGoal
Feature: View Goal

@QA_BCT_GS-VG_01
Scenario: To verify that direct report can view the goals he created
  Given Create prereq data for "QA_BCT_GS-VG_01"
  Given Boost Login page
  When A Team mate user logs in
  Then Click on Goals and select a Cycle
  And Verify the List of Goals created for himself

@QA_BCT_GS-VG_02
Scenario: To verify that Immediate Supervisor can view the goal that his Direct Report created for himself
  Given Create prereq data for "QA_BCT_GS-VG_01"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Verify IS can view the Goals created by Direct reports for himself

@QA_BCT_GS-VG_03
Scenario: To verify that Immediate Supervisor can view the goal that he created for his Direct Report
  Given Create prereq data for "QA_BCT_GS-VG_03"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Verify IS can view the goal that he created for his Direct Report

@QA_BCT_GS-VG_04
Scenario: To verify that Direct Report can view the goal that his Immediate Supervisor created for him
  Given Create prereq data for "QA_BCT_GS-VG_03"
  Given Boost Login page
  When A Team mate user logs in
  Then Click on Goals and select a Cycle
  And Verify Direct Report can view the goal that his IS created for him
#
@QA_BCT_GS-VG_05
Scenario: To verify that Employee can view the goal that he created for an indirect report
  Given Create prereq data for "QA_BCT_GS-VG_05"
  Given Boost Login page
  When A Team mate user logs in
  Then Click on Goals and select a Cycle
  And Verify Employee can view the goal that he created for an indirect report

@QA_BCT_GS-VG_06
Scenario: To verify that Indirect Report can view the goal that Employee created for him
  Given Create prereq data for "QA_BCT_GS-VG_05"
  Given Boost Login page
  When A Indirect user logs in
  Then Click on Goals and select a Cycle
  And Verify Indirect Report can view the goal that Employee created for him

@QA_BCT_GS-VG_07
Scenario: To verify that Immediate Supervisor of Indirect Report can view the goal that Employee created for Indirect Report
  Given Create prereq data for "QA_BCT_GS-VG_05"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Verify IS of Indirect Report can view the goal that Employee created for Indirect Report

@QA_BCT_GS-VG_08
Scenario: To verify that goals with due date covered in the current cycle that is marked Completed will no longer be listed in the current cycle (goal was created on the previous cycle)
  Given Create prereq data for "QA_BCT_GS-VG_08"
  Given Boost Login page
  When A Supervisor logs in
  Then Click on Goals and select a Cycle
  And Select Previous Cycle "First Quarter"
  And Validate that completed goal in first quarter is visible
  And Click on Goals and select a Cycle
  And Select Current Cycle "Second Quarter"
  And Validate that goal on first quarter is not visible in second quarter

@QA_BCT_GS-VG_09
Scenario: To verify that goals with due date covered in the current cycle that is not marked Completed will be listed in the current cycle (goal was created on the previous cycle)
  Given Create prereq data for "QA_BCT_GS-VG_09"
  Given Boost Login page
  When An Admin user logs in
  Then Click on Goals and select a Cycle
  And Select Previous Cycle "First Quarter"
  And Verify that goal for second quarter is not visible in first quarter
  And Click on Goals and select a Cycle
  And Select Current Cycle "Second Quater"
  And Verify that open goal for second quarter is visible in second quarter
