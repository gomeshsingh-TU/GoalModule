package steps;

import common.CredentialsCSVReader;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pageobjects.MeetingPage;
import testdataobjects.EmployeeProfile;

import java.util.HashMap;

public class MeetingSteps {

    @Steps
    MeetingPage meetingPage;
    public EmployeeProfile omuser;
    public HashMap<String, EmployeeProfile> employeeList;
    static String complianceNumber;
    public static String initialCompliance;
    static String initialDirectReportCompliance;

    @Step("Click On Meeting Icon")
    public void clickOnMeetingIcon() {
        meetingPage.clickMeeting();
    }

    @Step("Verify Meeting Home Page")
    public void verifyHomePage() {
        meetingPage.verifyMeetingHomePage();
    }

    @Step("Verify All Tabs in Meeting Home Page")
    public void verifyAllTabs() {
        Assert.assertTrue("My Team Tab is not displayed", meetingPage.isMyTeamTabDisplayed());
        Assert.assertTrue("My Manager Tab is not displayed", meetingPage.isMyManagerTabDisplayed());
        Assert.assertTrue("1:1 Meeting Tab is not displayed", meetingPage.isOne2OneMeetingsTabDisplayed());
    }

    @Step("Click On create Meeting button")
    public void clickOnCreateMeetingButton() {
        meetingPage.clickCreateMeetingButton();
    }

    @Step("Search for Employee")
    public void searchForAssociate(String empID) {
        meetingPage.enterEmployeeNumberToSearch(empID);
    }

    @Step("Select Matched employee from search result")
    public void selectMatchedSearchedAssociate() {
        meetingPage.clickMatchedEmployee();
    }

    @Step("Select Meeting Date")
    public void selectMeetingDate(String expectedDate) throws InterruptedException {
        meetingPage.selectDate(expectedDate);
    }

    @Step("Select Meeting date with Coverage")
    public void selectMeetingDate(String expectedDate, String endDate) throws InterruptedException {
        meetingPage.selectDate(expectedDate, endDate);
    }


    @Step("Select Meeting Time")
    public void selectMeetingTime(String expectedTime) {
//        meetingPage.setMeetingTime(expectedTime);
        meetingPage.clickCreateNewMeeting();
    }

    @Step("Click on Create Meeting Button")
    public void clickOnCreateNewMeeting() {
        meetingPage.clickCreateNewMeeting();
    }

    @Step("Setup a meeting")
    public void setupAMeeting() {
        meetingPage.enterMeetingTitle("1:1 Meeting");
        meetingPage.selectBehavioralCoachingTag();
        meetingPage.selectWorkPerformanceTag();
        meetingPage.enterManagerAgenda("Test");
        meetingPage.enterMeetingActionItem("Test");
        meetingPage.enterMeetingNotes("Testing");
        meetingPage.clickSaveNotes();
        meetingPage.clickDoneEditing();
    }

    @Step("Update an exiting meeting")
    public void updateMeeting() {
        meetingPage.enterMeetingActionItemByDirectReport("Test");
        meetingPage.enterMeetingNotes("Testing");
        meetingPage.clickDoneEditing();
    }

    @Step("Verify updated field")
    public void verifyUpdatedField() {
        Assert.assertEquals("Status is not matched", "Test", meetingPage.getMeetingActionItemByDirectReport());
    }

    @Step("Click on My Team Tab")
    public void clickMyTeamTabOnHomePage() {
        meetingPage.clickMyTeamTab();
    }

    @Step("Select Direct Report for Meeting")
    public void selectDirectReportForMeeting() throws InterruptedException {
        meetingPage.meetingWithDirectReport(getDirectReportName());
    }

    @Step("Select Direct Report for Meeting from Have Met Section")
    public void selectDirectReportForMeetingFromHaveMetSection() throws InterruptedException {
        meetingPage.meetingWithDirectReportFromHaveMetSection(getDirectReportName());
    }

    @Step("Select Direct Report for Meeting from Have Met Section")
    public void selectDirectReportForMeetingFromHaveNotMetSection() throws InterruptedException {
        meetingPage.meetingWithDirectReportFromHaveNotMetSection(getDirectReportName());
    }

    @Step("Click on Back Button")
    public void clickOnBackButton() {
        meetingPage.clickBackButton();
    }

    @Step("Get meeting status")
    public void getMeetingStatus(String expectedStatus) {
        Assert.assertEquals("Status is not matched", expectedStatus, meetingPage.getStatus(getDirectReportName()));
    }

    @Step("Click on My Manager Tab")
    public void clickMyManagerTabOnHomePage() {
        meetingPage.clickMyManagerTab();
    }

    @Step("Create a meeting with manager")
    public void meetingWithManager() {
        meetingPage.createMeetingWithManager();
    }

    @Step("Acknowledge the meeting")
    public void acknowledgeMeeting() {
        meetingPage.clickAcknowledgeButton();
    }

    @Step("Take action on Manager's meeting")
    public void takeManagerMeetingAction() {
        meetingPage.clickManagerMeetingAction();
    }

    @Step("Delete a schedule meeting")
    public void deleteScheduledMeeting() throws InterruptedException {
        meetingPage.deleteMeeting();
    }

    @Step("Logout")
    public void logoutFromBoost() throws InterruptedException {
        meetingPage.logout();
    }

    @Step("Add to Calender Meeting")
    public void addToCalendarScheduledMeeting() throws InterruptedException {
        meetingPage.addToCalenderMeeting();
    }

    @Step("Verify Warning Message of Draft Meeting")
    public void verifyDraftWarningMessage(String expectedMessage) {
        Assert.assertEquals("Draft Warning Message is no Matched", expectedMessage, meetingPage.getDraftMeetingWarning());
    }

    @Step("Setup a meeting without Tags and Notes")
    public void setupAMeetingWithoutTagAndNotes() {
        meetingPage.enterMeetingTitle("1:1 Meeting");
        meetingPage.enterManagerAgenda("Test");
        meetingPage.enterMeetingActionItem("Test");
        meetingPage.clickDoneEditing();
    }

    @Step("Verify Delete meeting message")
    public void verifyDeleteMeetingMessage(String expectedMessage) {
        Assert.assertEquals("Delete Message is not Matched", expectedMessage, meetingPage.getDeleteMeetingMessage());
    }

    @Step("Verify Waived meeting message")
    public void verifyWaivedMeetingMessage(String expectedMessage) {
        Assert.assertEquals("Waived Message is not Matched", expectedMessage, meetingPage.getWaivedMeetingMessage());
    }

    @Step("Click on Edit button")
    public void clickOnEditButton() {
        meetingPage.clickEditButton();
    }

    @Step("Enter reason and waive a meeting")
    public void enterReasonAndClickCreateToWaiveMeeting() {
        meetingPage.enterWaivingReason();
        meetingPage.clickCreateToWaiveMeeting();
    }

    @Step("Waive a meeting for Direct Report")
    public void waiveMeetingForDirectReport() {
        meetingPage.waiveMeeting(getDirectReportName());
    }

    @Step("Get Compliance")
    public void getComplianceThisWeek() throws InterruptedException {
        complianceNumber = meetingPage.getCompliance();
    }

    @Step("Click on Next Week '>'")
    public void clickOnNextWeekCompliance() {
        meetingPage.checkNextWeekCompliance();
    }

    @Step("Verify Compliance is Reset")
    public void verifyComplianceReset() throws InterruptedException {
        Assert.assertNotEquals("Compliance for both the weeks are equal", complianceNumber, meetingPage.getCompliance());
    }

    @Step("Get Direct Report Name")
    public String getDirectReportName() {
        employeeList = CredentialsCSVReader.readAndLoadCSVData();
        omuser = employeeList.get("TM");
        String fullName = omuser.getFirstName() + " " + omuser.getLastName();
        return fullName;
    }

    @Step("Verify Message for No Direct Report for Team mate")
    public void verifyNoDirectReportMessage(String expectedMessage) throws InterruptedException {
        Assert.assertEquals("No Direct Report Message mismatched", expectedMessage, meetingPage.getNoDirectReportMessage());
    }

    @Step("Verify Waive meeting edit Message")
    public void verifyWaivedMeetingEditMessage(String expectedMessage) throws InterruptedException {
        Assert.assertEquals("Waived Meeting Edit Message mismatched", expectedMessage, meetingPage.getWaivedMeetingEditMessage());
    }

    @Step("Verify Heads up Title")
    public void verifyHeadsUpTitle(String expectedMessage) throws InterruptedException {
        Assert.assertEquals("Waived Meeting Edit Message mismatched", expectedMessage, meetingPage.getWaivedMeetingEditMessage());
    }

    @Step("Get Initial value of Compliance")
    public void getInitialComplianceStatus() throws InterruptedException {
        initialCompliance = meetingPage.getCompliance();
    }

    @Step("Verify value of Compliance increased by 1")
    public void verifyComplianceIncreasedByOne() throws InterruptedException {
        Assert.assertEquals("Compliance values are not equal", Integer.parseInt(initialCompliance) + 1, Integer.parseInt(meetingPage.getCompliance()));
    }

    @Step("Verify value of Compliance decreased by 1")
    public void verifyComplianceDecreasedByOne() throws InterruptedException {
        Assert.assertEquals("Compliance values are not equal", Integer.parseInt(initialCompliance) - 1, Integer.parseInt(meetingPage.getCompliance()));
    }

    @Step("Verify value of Compliance is same as earlier")
    public void verifyComplianceIsSame() throws InterruptedException {
        Assert.assertEquals("Compliance values are not equal", Integer.parseInt(initialCompliance), Integer.parseInt(meetingPage.getCompliance()));
    }

    @Step("Get initial Total number of Direct Reports in Compliance")
    public void getInitialTotalDirectReportsInComplianceStatus() throws InterruptedException {
        initialDirectReportCompliance = meetingPage.getOnlyDirectReportsNumber();
    }

    @Step("Verify Notification Message")
    public void verifyNotificationMessage(String expectedMessage) throws InterruptedException {
        Assert.assertTrue("Notification message is not correct", meetingPage.getNotificationMessage().contains(expectedMessage));
    }

    @Step("Verify Total number of Direct Reports are same as earlier in compliance")
    public void verifyDirectReportsNumberInComplianceIsSame() throws InterruptedException {
        Assert.assertEquals("Compliance values are not equal", Integer.parseInt(initialDirectReportCompliance), Integer.parseInt(meetingPage.getOnlyDirectReportsNumber()));
    }

    @Step("Verify Total number of Direct Reports are decreased by 1 in compliance")
    public void verifyDirectReportsNumberInComplianceDecreasedByOne() throws InterruptedException {
        Assert.assertEquals("Compliance values are not equal", Integer.parseInt(initialDirectReportCompliance) - 1, Integer.parseInt(meetingPage.getOnlyDirectReportsNumber()));
    }

    @Step("Verify Total number of Direct Reports are increased by 1 in compliance")
    public void verifyDirectReportsNumberInComplianceIncreasedByOne() throws InterruptedException {
        Assert.assertEquals("Compliance values are not equal", Integer.parseInt(initialDirectReportCompliance) + 1, Integer.parseInt(meetingPage.getOnlyDirectReportsNumber()));
    }

    @Step("Verify Next Meeting label date in card")
    public void verifyNextMeetingDate(String expectedDate) {
        Assert.assertEquals("Next Meeting Date is not matching", expectedDate, meetingPage.getNextMeetingDate(getDirectReportName()));
    }

    @Step("Verify Card is moved to 'Have Met' Section")
    public void verifyCardIsMovedToHaveMetSection() {
        Assert.assertTrue("Card is not displayed in 'Have Met' Section", meetingPage.isCardDisplayedInHaveMetSection(getDirectReportName()));
    }

    @Step("Verify Card is present in 'Have Not Met' Section")
    public void verifyCardIsInHaveNotMetSection() {
        Assert.assertTrue("Card is not displayed in 'Have Not Met' Section", meetingPage.isCardDisplayedInHaveNotMetSection(getDirectReportName()));
    }

    @Step("Verify meeting is displayed in My Action List")
    public void verifyMeetingIsDisplayedInMyAction() throws InterruptedException {
        Assert.assertTrue("Meeting is not displayed in 'My action List' Section", meetingPage.isMyActionForDirectReportDisplayed(getDirectReportName()));
    }

    @Step("Again setup meeting")
    public void againCreateMeeting() throws InterruptedException {
        meetingPage.againCreateMeeting(getDirectReportName());
    }

    @Step("Verify Title of Heads Up Modal")
    public void verifyHeadsUpModalTitle(String expectedModalTitle) throws InterruptedException {
        Assert.assertEquals("Waived Meeting Edit Message mismatched", expectedModalTitle, meetingPage.getHeadsUpModalTitle());
    }

    @Step("Click on Modal Closed Button")
    public void clickOnModalCloseButton() throws InterruptedException {
        meetingPage.clickCloseButton();
    }

    @Step("Verify Last Meeting label date in card")
    public void verifyLastMeetingDate(String expectedDate) {
        Assert.assertEquals("Next Meeting Date is not matching", expectedDate, meetingPage.getLastMeetingDate(getDirectReportName()));
    }


    @Step("Verify Meeting status in manager Card")
    public void verifyMeetingStatusInManagerCard(String expectedStatus) {
        Assert.assertEquals("Status is not matched", expectedStatus, meetingPage.getManagerMeetingStatus());
    }

    @Step("Verify Last Meeting label date in manager card")
    public void verifyLastMeetingDateInManagerCard(String expectedDate) {
        Assert.assertEquals("Next Meeting Date is not matching", expectedDate, meetingPage.getLastMeetingDateInManagerCard());
    }

    @Step("Verify Next Meeting label date in manager card")
    public void verifyNextMeetingDateInManagerCard(String expectedDate) {
        Assert.assertEquals("Next Meeting Date is not matching", expectedDate, meetingPage.getNextMeetingDateInManagerCard());
    }

    @Step("Verify Meeting is not displayed in My action list")
    public void verifyMeetingIsNotDisplayedInMyAction() throws InterruptedException {
        Assert.assertFalse("Meeting is displayed in 'My action List' Section", meetingPage.isMyActionForDirectReportDisplayed(getDirectReportName()));
    }

    @Step("Click and Select Date from My action List")
    public void clickAndSelectDateInMyActionList(String expectedDate) throws InterruptedException {
        meetingPage.checkOffMyAction(getDirectReportName(), expectedDate);
    }
}
