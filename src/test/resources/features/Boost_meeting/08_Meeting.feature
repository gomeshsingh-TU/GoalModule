@Regression @function=Meeting
Feature: Verify Meeting Module

  Background:
    Given Boost Login page
    When A Team Leader user logs in
    Then User lands on the version history page

  @ME_QA_01_Boost
  Scenario: Verify Home page of the Meeting module
    When Click on the Meeting icon
    Then Verify that navigated to Meeting Home Page
    And Verify My Team , My Manager and 1:1 Meetings Tabs are displayed

  @ME_QA_02_Boost
  Scenario: Create Meeting for any random associate and verify that meeting available in 1:1 Meetings Tab
    When Click on the Meeting icon
    And Click on 'Create Meeting' button
    And Search for an associate with EmpID "3057497" to set up a meeting
    And Click on the Matched Associate from the search result
    And Set meeting day as "Feb 21 2021"
    And Set meeting time as "12:45 AM" and click on create button
    And Setup a meeting

  @ME_QA_03_Boost
  Scenario: Creating Meeting with Manager
    When Click on the Meeting icon
    And Click on My Manager Tab
    And Create Meeting with manager by click on '...' on the top left of placeholder
    And Set meeting day as "Feb 16 2021"
    And Set meeting time as "12:45 PM" and click on create button
    And Setup a meeting
    Then Acknowledge the meeting
    And Navigate back to Home Page

  @ME_QA_04_Boost
  Scenario: Meeting Save as Draft
    When Click on the Meeting icon
    And Click on My Team Tab
    And Create Meeting with any of the direct report from 'Have not Met' section by click on 'Meeting ->'
    And Set meeting day as "Feb 16 2021"
    And Set meeting time as "12:45 AM" and click on create button
    And Setup a meeting without adding Tag and note
    Then Verify that "Meeting is still a draft. Please select a tag and add at least 1 note." message displayed for draft
    And Click on ':' Button and select Delete
    Then Verify "Meeting deleted." message displayed for deleted Meeting

  @ME_QA_05_Boost
  Scenario: Waive meeting for direct report
    When Click on the Meeting icon
    And Click on My Team Tab
    And Click on Waive Meeting to any of the direct report
    And Set meeting day as "Jan 28 2021" to "Jan 30 2021"
    And Enter reason for Waiving Meeting and click on Create button
    Then Verify "Saved successfully!" message displayed for Waived Meeting
    And Select direct report with scheduled meeting from 'Have Met'
    And Click on ':' Button and select Delete
    Then Verify "Meeting deleted." message displayed for deleted Meeting

  @ME_QA_06_Boost
  Scenario:Create Meeting with Direct Report and Acknowledge by Direct Report
    When Click on the Meeting icon
    And Click on My Team Tab
    And Create Meeting with any of the direct report from 'Have not Met' section by click on 'Meeting ->'
    And Set meeting day as "Jan 28 2021"
    And Set meeting time as "12:45 AM" and click on create button
    And Setup a meeting
    And Navigate back to Home Page
    Then Verify meeting status is "Pending Acknowledgement"
    And Logout from the application
    And A Team mate user logs in
    And Click on the Meeting icon
    And Click on My Manager Tab
    And Take action on manager Meeting
    And Acknowledge the meeting

  @ME_QA_07_Boost
  Scenario: Edit the Scheduled meeting
    When Click on the Meeting icon
    And Click on My Team Tab
    And Select direct report with scheduled meeting from 'Have Met'
    And Click on Edit Button of the Scheduled meeting
    Then Update any field and Click on 'Done Editing' button
    And Verify the edited fields is updated

  @ME_QA_08_Boost
  Scenario: Verify Add Meeting to Calendar functionality
    When Click on the Meeting icon
    And Click on My Team Tab
    And Select direct report with scheduled meeting from 'Have Met'
    And Click on ':' Button and select Add to Calendar
    Then Verify Mail calendar is opened in new tab

  @ME_QA_09_Boost
  Scenario: Verify Compliance Functionality functionality
    When Click on the Meeting icon
    And Click on My Team Tab
    And Get Compliance for this Week
    And And Click on '>' of Compliance
    Then Verify compliance is reset








