package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.MeetingSteps;

public class MeetingStepDefinitions {
    @Steps
    MeetingSteps meetingSteps;

    @And("Click on the Meeting icon")
    public void clickOnMeetingIcon() {
        meetingSteps.clickOnMeetingIcon();
    }

    @Then("Verify that navigated to Meeting Home Page")
    public void verifyUserNavigatedToMeetingHomePage() {
        meetingSteps.verifyHomePage();
    }

    @And("Verify My Team , My Manager and 1:1 Meetings Tabs are displayed")
    public void verifyAllTabsDisplayedOnMeetingHomePage() {
        meetingSteps.verifyAllTabs();
    }

    @And("Click on 'Create Meeting' button")
    public void clickOnCreateMeetingButtonOnHomePage() {
        meetingSteps.clickOnCreateMeetingButton();
    }

    @And("Search for an associate with EmpID {string} to set up a meeting")
    public void SearchForAnAssociateForSetUpRandomMeeting(String arg) {
        meetingSteps.searchForAssociate(arg);
    }

    @And("Click on the Matched Associate from the search result")
    public void clickOnMatchedAssociate() {
        meetingSteps.selectMatchedSearchedAssociate();
    }

    @And("Set meeting day as {string}")
    public void setMeetingAtGivenDate(String arg) throws InterruptedException {
        meetingSteps.selectMeetingDate(arg);
    }

    @And("Click on create button")
    public void ClickOnCreateButton() {
        meetingSteps.clickOnCreateNewMeeting();
    }

    @And("Setup a meeting")
    public void setupMeeting() {
        meetingSteps.setupAMeeting();
    }

    @Then("Verify Meeting is present in 1:1 Tab")
    public void verifyMeetingIsDisplayedAtOne2OneMeetingTab() {

    }

    @And("Click on My Team Tab")
    public void clickOnMyTeamTab() {
        meetingSteps.clickMyTeamTabOnHomePage();
    }

    @And("Create Meeting with any of the direct report from 'Have not Met' section by click on 'Meeting ->'")
    public void clickOnMeetingForAnyOfTheDirectReport() throws InterruptedException {
        meetingSteps.selectDirectReportForMeeting();
    }


    @And("Navigate back to Home Page")
    public void navigateBackToHomePage() {
        meetingSteps.clickOnBackButton();
    }


    @And("Verify meeting status is {string}")
    public void verifyMeetingStatus(String arg) {
        meetingSteps.getMeetingStatus(arg);
    }


    @And("Verify meeting status is {string} in manager card")
    public void verifyManagerMeetingStatus(String expectedStatus) {
        meetingSteps.verifyMeetingStatusInManagerCard(expectedStatus);
    }

    @And("Click on My Manager Tab")
    public void clickOnMyManagerTab() {
        meetingSteps.clickMyManagerTabOnHomePage();

    }

    @And("Create Meeting with manager by click on '...' on the top left of placeholder")
    public void createMeetingWithManager() {
        meetingSteps.meetingWithManager();
    }

    @And("Acknowledge the meeting")
    public void acknowledgeTheMeeting() {
        meetingSteps.acknowledgeMeeting();
    }

    @And("Take action on manager Meeting")
    public void takeActionOnManagerMeeting() {
        meetingSteps.takeManagerMeetingAction();
    }

    @And("Click on Waive Meeting to any of the direct report")
    public void clickOnWaiveMeetingForDirectReport() {
        meetingSteps.waiveMeetingForDirectReport();
    }

    @And("Set meeting day as {string} to {string}")
    public void setMeetingAtGivenDate(String arg0, String agr1) throws InterruptedException {
        meetingSteps.selectMeetingDate(arg0, agr1);
    }

    @And("Enter reason for Waiving Meeting and click on Create button")
    public void enterWaivingReasonAndClickOnCreateButton() {
        meetingSteps.enterReasonAndClickCreateToWaiveMeeting();
    }

    @And("Select direct report with scheduled meeting from 'Have Met'")
    public void selectDirectReportFromHaveMetSection() throws InterruptedException {
        meetingSteps.selectDirectReportForMeetingFromHaveMetSection();
    }

    @And("Select direct report with scheduled meeting from 'Have Not Met'")
    public void selectDirectReportFromHaveNotMetSection() throws InterruptedException {
        meetingSteps.selectDirectReportForMeetingFromHaveNotMetSection();
    }

    @And("Click on Edit Button of the Scheduled meeting")
    public void clickOnEditButtonOfScheduleMeeting() {
        meetingSteps.clickOnEditButton();

    }

    @And("Update any field and Click on 'Done Editing' button")
    public void updateAnyFieldAndClickOnDoneEditing() {
        meetingSteps.updateMeeting();
    }

    @And("Verify the edited fields is updated")
    public void verifyFieldIsEditedWithNewValue() {
        meetingSteps.verifyUpdatedField();
    }

    @And("Click on ':' Button and select Delete")
    public void clickOnDeleteButton() throws InterruptedException {
        meetingSteps.deleteScheduledMeeting();
    }

    @And("Verify {string} message displayed for deleted Meeting")
    public void VerifyMessageForDeletedMeeting(String arg) {
        meetingSteps.verifyDeleteMeetingMessage(arg);
    }

    @And("Verify {string} message displayed for Waived Meeting")
    public void VerifyMessageForWaivedMeeting(String arg) {
        meetingSteps.verifyWaivedMeetingMessage(arg);
    }

    @And("Setup a meeting without adding Tag and note")
    public void setupMeetingWithoutTagAndNote() {
        meetingSteps.setupAMeetingWithoutTagAndNotes();
    }

    @And("Verify that {string} message displayed for draft")
    public void VerifyMessageForDraftedMeeting(String arg) {
        meetingSteps.verifyDraftWarningMessage(arg);
    }

    @And("Click on ':' Button and select Add to Calendar")
    public void clickAddToCalendarButton() throws InterruptedException {
        meetingSteps.addToCalendarScheduledMeeting();
    }


    @And("Logout from the application")
    public void logoutFromBoostApplication() throws InterruptedException {
        meetingSteps.logoutFromBoost();
    }

    @And("Verify Mail calendar is opened in new tab")
    public void verifyMailCalendarOpened() {

    }

    @And("Get Compliance for this Week")
    public void getCompliance() throws InterruptedException {
        meetingSteps.getComplianceThisWeek();
    }

    @And("And Click on '>' of Compliance")
    public void ClickOnNextWeekCompliance() {
        meetingSteps.clickOnNextWeekCompliance();
    }

    @And("Verify compliance is reset")
    public void verifyComplianceIsReset() throws InterruptedException {
        meetingSteps.verifyComplianceReset();
    }

    @And("Verify {string} message displayed in My Team Tab")
    public void verifyNoDirectReportMessageAtMyTeamTab(String arg) throws InterruptedException {
        meetingSteps.verifyNoDirectReportMessage(arg);
    }

    @And("Verify {string} message displayed for Editing a Waived meeting")
    public void verifyWaivedMeetingEditError(String arg) throws InterruptedException {
        meetingSteps.verifyWaivedMeetingEditMessage(arg);
    }

    @And("Get initial Compliance Status")
    public void getInitialCompliance() throws InterruptedException {
        meetingSteps.getInitialComplianceStatus();
    }

    @And("Verify Next Meeting should have {string} date")
    public void verifyNextMeetingDateInCard(String expectedDate) {
        meetingSteps.verifyNextMeetingDate(expectedDate);
    }

    @And("Verify There is no change in the compliance")
    public void verifyNoChangeInCompliance() throws InterruptedException {
        meetingSteps.verifyComplianceIsSame();
    }

    @And("Click on the bell icon and verify the {string} notification message")
    public void verifyNotificationMessageOnHomePage(String expectedMessage) throws InterruptedException {
        meetingSteps.verifyNotificationMessage(expectedMessage);
    }

    @And("Verify Direct Report is moved to 'Have Met' section")
    public void verifyDirectReportCardMovedToHaveMetSection() {
        meetingSteps.verifyCardIsMovedToHaveMetSection();
    }

    @And("Verify Compliance is increased by One")
    public void verifyComplianceIncreased() throws InterruptedException {
        meetingSteps.verifyComplianceIncreasedByOne();
    }

    @And("Verify Direct Report is in 'Have Not Met' section")
    public void verifyDirectReportCardIsInHaveNotMetSection() {
        meetingSteps.verifyCardIsInHaveNotMetSection();
    }

    @And("Get initial total number of Direct Reports in Compliance Status")
    public void getInitialTotalDRInCompliance() throws InterruptedException {
        meetingSteps.getInitialTotalDirectReportsInComplianceStatus();
    }

    @And("Verify total number of DR are same as initial")
    public void verifyDRComplianceIsSameAsInitial() throws InterruptedException {
        meetingSteps.verifyDirectReportsNumberInComplianceIsSame();
    }

    @And("Verify total number of DR are decreased by One")
    public void verifyDRComplianceIsDecreasedByOne() throws InterruptedException {
        meetingSteps.verifyDirectReportsNumberInComplianceDecreasedByOne();
    }

    @And("Verify total number of DR are increased by One")
    public void verifyDRComplianceIsIncreasedByOne() throws InterruptedException {
        meetingSteps.verifyDirectReportsNumberInComplianceIncreasedByOne();
    }

    @And("Verify that Meeting is displayed in My Action list")
    public void verifyMeetingIsDisplayedInMyAction() throws InterruptedException {
        meetingSteps.verifyMeetingIsDisplayedInMyAction();
    }

    @And("Again create Meeting of direct report from 'Have Met'")
    public void againCreateMeetingFromHaveMetSection() throws InterruptedException {
        meetingSteps.againCreateMeeting();
    }

    @And("Verify Title {string} message in the modal")
    public void verifyModalTitle(String modalTitle) throws InterruptedException {
        meetingSteps.verifyHeadsUpModalTitle(modalTitle);
    }

    @And("Click on 'Close' button on the Modal")
    public void clickOnCloseButton() throws InterruptedException {
        meetingSteps.clickOnModalCloseButton();
    }

    @And("Verify Last Meeting should have {string} date")
    public void verifyLastMeetingDateInCard(String expectedDate) {
        meetingSteps.verifyLastMeetingDate(expectedDate);
    }

    @And("Verify Last Meeting should have {string} date in manager card")
    public void verifyLastMeetingDateInManagerCard(String expectedDate) {
        meetingSteps.verifyLastMeetingDateInManagerCard(expectedDate);
    }

    @And("Verify Next Meeting should have {string} date in manager card")
    public void verifyNextMeetingDateInManagerCard(String expectedDate) {
        meetingSteps.verifyNextMeetingDateInManagerCard(expectedDate);
    }

    @And("Verify that Meeting is not displayed in the My Action list")
    public void verifyMeetingIsNotDisplayedInMyActionList() throws InterruptedException {
        meetingSteps.verifyMeetingIsNotDisplayedInMyAction();
    }

    @And("Click on the action Checkbox and Select action date as {string}")
    public void verifyMeetingIsNotDisplayedInMyActionList(String expectedDate) throws InterruptedException {
        meetingSteps.clickAndSelectDateInMyActionList(expectedDate);
    }


}
