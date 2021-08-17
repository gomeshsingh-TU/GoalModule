@Regression @function=Summary
Feature: Verify Summary Module

  Background:
    Given Boost Login page

  @QA_BCT_SUMMARY_01
  Scenario: Verify List of Direct Reports
    Given An Operations Manager user logs in
    When Click on the Meeting icon
    And Click on My Team Tab
    And Get number of Tiles present for Direct Reports
    Then Click on Summary Icon
    And Verify number of direct reports should be same as My Team Tab

  @SUM_QA_02_Boost
  Scenario: Verify Compliance of each Direct Reports
    When A Team Leader user logs in
    When Click on the Meeting icon
    And Click on My Team Tab
    And Get initial Compliance Status
    And Logout from the application
    And An Operations Manager user logs in
    And Click on Summary Icon
    Then Verify Compliance for the TL is same as displayed in Meeting Module

  @SUM_QA_03_Boost
  Scenario: Verify Compliance for Each Direct Report with OOO
    When A Team Leader user logs in
    And Setup an out of office
    And Set meeting day as "Apr 12 2021" to "Apr 14 2021"
    And Enter reason for ooo and click on Submit button
    And Logout from the application
    Given An Operations Manager user logs in
    And Click on Summary Icon
    Then Verify Compliance for the TL is same as displayed as "Out of Office"

  @SUM_QA_04_Boost
  Scenario: Verify View Meeting Logs
    Given An Operations Manager user logs in
    And Click on Summary Icon
    And Click on the 'View Meeting Logs' button for the direct report
    Then Verify Meetings should be displayed of Previous week monday to this week sunday
    And Select a date "Feb 15 2021" in Meeting logs filter
     And Verify meetings displayed for the "Feb 15 2021" date only

  @SUM_QA_05_Boost
  Scenario: Verify Overall Compliance
    Given An Operations Manager user logs in
    And Click on Summary Icon
    And Get Compliance value
    And Logout from the application
    When A Team Leader user logs in
    And Click on the Meeting icon
    And Click on My Team Tab
    And Create Meeting with any of the direct report from 'Have not Met' section by click on 'Meeting ->'
    And Set meeting day as "Apr 12 2021"
    And Click on create button
    And Setup a meeting
    And Navigate back to Home Page
    And Logout from the application
    And A Team mate user logs in
    And Click on the Meeting icon
    And Click on My Manager Tab
    And Take action on manager Meeting
    And Acknowledge the meeting
    And Logout from the application
    Given An Operations Manager user logs in
    And Click on Summary Icon
    Then Verify Compliance should be increased

  @SUM_QA_06_Boost
  Scenario: Verify Traversal on TLs
    Given An Operations Manager user logs in
    And Click on Summary Icon
    And Select a TL from the list
    Then Verify list of TLs Direct reports are displayed
    And Click on 'My Team' button

  @SUM_QA_07_Boost
  Scenario: Verify List of Indirect Reports
    When A Team Leader user logs in
    And Click on the Meeting icon
    And Click on My Team Tab
    And Get number of Tiles present for Direct Reports
    And Logout from the application
    And An Operations Manager user logs in
    And Click on Summary Icon
    And Select a TL from the list
    Then Verify Number of direct reports are same as displayed in Meeting Module


  @SUM_QA_08_Boost
  Scenario: Verify View Meeting Logs
    When A Team Leader user logs in
    And Click on the Meeting icon
    And Click on My Team Tab
    And Select direct report with scheduled meeting from 'Have Not Met'
    And Get the number of Meetings displayed
    And Logout from the application
    And An Operations Manager user logs in
    And Click on Summary Icon
    And Select a TL from the list
    And Click on the 'View Meeting Logs' button for the direct report
    Then Verify number of meetings are displayed same as displayed in Meeting module for the same duration

  @SUM_QA_09_Boost
  Scenario: Verify Overall Compliance for TL
    Given An Operations Manager user logs in
    And Click on Summary Icon
    When Select a TL from the list
    Then Verify initial compliance