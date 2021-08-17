@Regression @function=Meeting_Add
Feature: Verify Meeting Module

  Background:
    Given Boost Login page

  @ME_QA_01_Boost @QA_BCT_ME_12
  Scenario: Verify Home page for Direct Report of the Meeting module
    When A Team mate user logs in
    When Click on the Meeting icon
    Then Verify that navigated to Meeting Home Page
    And Verify My Team , My Manager and 1:1 Meetings Tabs are displayed
    And Click on My Team Tab
    And Verify "No direct reports found." message displayed in My Team Tab

  @ME_QA_02_Boost @QA_BCT_ME_13 @QA_BCT_ME_14 @QA_BCT_ME_15
  Scenario: Verify Home page of the Meeting module
    When A Team Leader user logs in
    And Click on the Meeting icon
    And Click on My Team Tab
    And Get initial Compliance Status
    And Create Meeting with any of the direct report from 'Have not Met' section by click on 'Meeting ->'
    And Set meeting day as "Mar 1 2021"
    And Click on create button
    And Setup a meeting
    And Navigate back to Home Page
    Then Verify meeting status is "Pending Acknowledgement"
    And Verify Last Meeting should have "Mar 01, 2021" date
    And Verify There is no change in the compliance
    And Verify that Meeting is displayed in My Action list
    And Logout from the application
    And A Team mate user logs in
    And Click on the Meeting icon
    Then Click on the bell icon and verify the "Please acknowledge your meeting" notification message
    And Click on My Manager Tab
    And Verify Last Meeting should have "Mar 01, 2021" date in manager card
    Then Verify meeting status is "Pending Acknowledgement" in manager card
    And Take action on manager Meeting
    And Acknowledge the meeting
    And Navigate back to Home Page
    Then Verify meeting status is "View" in manager card
    And Logout from the application
    When A Team Leader user logs in
    And Click on the Meeting icon
    Then Click on the bell icon and verify the "acknowledged your meeting." notification message
    And Click on My Team Tab
    And Verify Direct Report is moved to 'Have Met' section
    And Verify meeting status is "View"
    And Verify Compliance is increased by One


  @ME_QA_03_Boost
  Scenario: Verify Heads Up Modal
    When A Team Leader user logs in
    And Click on the Meeting icon
    And Click on My Team Tab
    And Again create Meeting of direct report from 'Have Met'
    And Set meeting day as "Mar 1 2021"
    And Click on create button
    Then Verify Title "Just a heads up" message in the modal
    And Click on 'Close' button on the Modal
    And Select direct report with scheduled meeting from 'Have Met'
    And Click on ':' Button and select Delete
    Then Verify "Meeting deleted." message displayed for deleted Meeting


  @ME_QA_04_Boost @QA_BCT_ME_18  @QA_BCT_ME_19 @QA_BCT_ME_22 @QA_BCT_ME_23
  Scenario: Verify Waived Functionality
    When A Team Leader user logs in
    When Click on the Meeting icon
    And Click on My Team Tab
    And Get initial total number of Direct Reports in Compliance Status
    And Click on Waive Meeting to any of the direct report
    And Set meeting day as "Mar 1 2021" to "Mar 3 2021"
    And Enter reason for Waiving Meeting and click on Create button
    Then Verify "Saved successfully!" message displayed for Waived Meeting
    And Verify Direct Report is moved to 'Have Met' section
    And Verify meeting status is "Waived"
    And Verify total number of DR are decreased by One
    And Select direct report with scheduled meeting from 'Have Met'
    And Click on Edit Button of the Scheduled meeting
    Then Verify "Editing of a waived record is not allowed. Only delete is the allowed action." message displayed for Editing a Waived meeting
    And Logout from the application
    And A Team mate user logs in
    And Click on the Meeting icon
    And Click on My Manager Tab
    Then Verify meeting status is "Waived" in manager card
    And Take action on manager Meeting
    And Click on Edit Button of the Scheduled meeting
    Then Verify "Editing of a waived record is not allowed. Only delete is the allowed action." message displayed for Editing a Waived meeting

  @ME_QA_05_Boost  @QA_BCT_ME_20 @QA_BCT_ME_21
  Scenario: Verify Cancel Waived Functionality
    When A Team Leader user logs in
    And Click on the Meeting icon
    And Click on My Team Tab
    And Get initial total number of Direct Reports in Compliance Status
    And Select direct report with scheduled meeting from 'Have Met'
    And Click on ':' Button and select Delete
    Then Verify "Meeting deleted." message displayed for deleted Meeting
    And Navigate back to Home Page
    And Verify Direct Report is in 'Have Not Met' section
    And Verify meeting status is "Meet"
    And Verify total number of DR are increased by One
    And Logout from the application
    And A Team mate user logs in
    And Click on the Meeting icon
    And Click on My Manager Tab
    Then Verify meeting status is "Meet" in manager card

  @ME_QA_06_Boost @QA_BCT_ME_16 @QA_BCT_ME_17
  Scenario: Verify Draft Functionality
    When A Team Leader user logs in
    And Click on the Meeting icon
    And Click on My Team Tab
    And Get initial Compliance Status
    And Create Meeting with any of the direct report from 'Have not Met' section by click on 'Meeting ->'
    And Set meeting day as "Mar 1 2021"
    And Click on create button
    And Setup a meeting without adding Tag and note
    Then Verify that "Meeting is still a draft. Please select a tag and add at least 1 note." message displayed for draft
    And Navigate back to Home Page
    Then Verify meeting status is "Draft"
    And Verify Last Meeting should have "Mar 01, 2021" date
    And Verify Direct Report is in 'Have Not Met' section
    And Verify There is no change in the compliance
    And Logout from the application
    And A Team mate user logs in
    And Click on the Meeting icon
    And Click on My Manager Tab
    And Verify Last Meeting should have "Mar 01, 2021" date in manager card
    Then Verify meeting status is "Draft" in manager card
    And Take action on manager Meeting
    And Click on ':' Button and select Delete
    Then Verify "Meeting deleted." message displayed for deleted Meeting

  @ME_QA_07_Boost @QA_BCT_ME_24 @QA_BCT_ME_25
  Scenario: Verify My Action of the Meeting module
    When A Team Leader user logs in
    And Click on the Meeting icon
    And Click on My Team Tab
    And Create Meeting with any of the direct report from 'Have not Met' section by click on 'Meeting ->'
    And Set meeting day as "Mar 1 2021"
    And Click on create button
    And Setup a meeting
    And Navigate back to Home Page
    Then Verify meeting status is "Pending Acknowledgement"
    And Verify that Meeting is displayed in My Action list
    And Click on the action Checkbox and Select action date as "Mar 1 2021"
    And Verify that Meeting is not displayed in the My Action list
    And Select direct report with scheduled meeting from 'Have Met'
    And Click on ':' Button and select Delete
    Then Verify "Meeting deleted." message displayed for deleted Meeting