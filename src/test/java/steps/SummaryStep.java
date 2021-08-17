package steps;

import common.CredentialsCSVReader;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pageobjects.MeetingPage;
import pageobjects.SummaryPage;
import testdataobjects.EmployeeProfile;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class SummaryStep {
    @Steps
    SummaryPage summaryPage;
    MeetingSteps meetingStep;
    MeetingPage meetingPage;
    static int directReportsTiles;
    EmployeeProfile omuser;
    HashMap<String, EmployeeProfile> employeeList;
    static int initialNumberOfMeetings;
    static String initialCompliance;

    @Step("Click On Summary Icon")
    public void clickOnSummaryIcon() {
        summaryPage.clickSummaryIcon();
    }

    @Step("Get total number of Tiles in Meeting Module ")
    public void getTilesInMeetingModule() {
        directReportsTiles = summaryPage.getTotalNumberOfCardsInMeetingModule();
    }

    //meeting.getOnlyDirectReportsNumber() for split secondary compliance
    @Step("Get total number of Direct Reports in Summary Module ")
    public void getDirectReportInSummaryModule() throws InterruptedException {
        Assert.assertEquals("Number of direct reports are not matching", directReportsTiles, summaryPage.getTotalNumberOfRowsInSummaryModule());
    }

    @Step("Verify Compliance for Specific TL ")
    public void verifyComplianceForSpecificTL() throws InterruptedException {
        Assert.assertEquals("Number of direct reports are not matching", meetingStep.initialCompliance, summaryPage.getPrimaryComplianceForSpecificDirectReport(getDirectReportName()));
    }

    @Step("Click On Summary Icon")
    public void clickViewMeetingLogsForSpecificUser() throws InterruptedException {
        summaryPage.clickViewMeetingLogsForSpecificDirectReport(getDirectReportName());
    }

    @Step("Verify Filter Date")
    public void verifyFilterDate() throws InterruptedException {
        Assert.assertEquals("Filter date is not matching", getExpectedFilterDate(), summaryPage.getFilterDate());
    }

    @Step("Select a Date in Meeting logs")
    public void selectDate(String expectedStartDate, String expectedEndDate) throws InterruptedException {
        summaryPage.clickFilterDate();
        meetingPage.selectDate(expectedStartDate,expectedEndDate);
    }

    @Step("Verify Meeting Date")
    public void verifyMeetingDate(String expectedDate) throws InterruptedException {
        String[] date = expectedDate.split(" ");
        String actualDate = summaryPage.getFirstMeetingDate();
        Assert.assertTrue("Filter date is not matching",actualDate.contains(date[0]) && actualDate.contains(date[1]) && actualDate.contains(date[2]));
    }

    @Step("Click On Specific TL")
    public void clickOnTL() throws InterruptedException {
        summaryPage.clickOnSpecificTL(getTLName());
    }

    @Step("Click On My Team button")
    public void clickOnMyTeam() {
        summaryPage.clickMyTeamButton();
    }

    @Step("Get total number of Direct Reports for Specific TL in Summary Module ")
    public void verifyTotalNumberOfDirectReportForSpecificTL() throws InterruptedException {
        Assert.assertEquals("Number of direct reports are not matching", directReportsTiles, summaryPage.getTotalNumberOfRowsInSummaryModule());
    }

    @Step("Verify Compliance for Specific TL")
    public void verifyDefaultComplianceForSpecificTL() throws InterruptedException {
        Assert.assertTrue("Filter date is not matching",summaryPage.getCompliance().contains("0") && summaryPage.getTotalNumberDirectReportsInCompliance().contains("/0 (--%)"));
    }

    @Step("Get total number of Direct Reports for Specific TL in Summary Module ")
    public void verifyDirectReportForSpecificTLDisplayed() throws InterruptedException {
        Assert.assertTrue("Direct Reports are not displayed", summaryPage.getTotalNumberOfRowsInSummaryModule()!=0);
    }

    @Step("Get total number of Meetings in Meeting Module History ")
    public void getTotalNumberOfMeetings() throws InterruptedException {
        initialNumberOfMeetings = summaryPage.getTotalNumberOfMeetingsInHistory();
    }

    @Step("Verify total number of Meetings in Summary Module History ")
    public void verifyTotalNumberOfMeetingsInSummaryModuleHistory() throws InterruptedException {
        Assert.assertEquals("Number of direct reports are not matching", initialNumberOfMeetings, summaryPage.getTotalNumberOfMeetingsInHistory());
    }

    @Step("Get Initial value of Compliance")
    public void getInitialComplianceStatus() throws InterruptedException {
        initialCompliance = summaryPage.getCompliance();
    }

    @Step("Verify value of Compliance increased by 1")
    public void verifyComplianceIncreasedByOne() throws InterruptedException {
        Assert.assertEquals("Compliance values are not equal", Integer.parseInt(initialCompliance) + 1, Integer.parseInt(summaryPage.getCompliance()));
    }

    @Step("Verify out of office Compliance for Specific TL ")
    public void verifyOOOComplianceForSpecificTL(String expectedMessage) throws InterruptedException {
        Assert.assertEquals("Number of direct reports are not matching", expectedMessage, summaryPage.getOOOMessageForSpecificDirectReport(getDirectReportName()));
    }

    @Step("Setup an out of office")
    public void setupOOO() throws InterruptedException {
        summaryPage.selectOutOfOffice();
    }

    @Step("Enter reason and click submit for OOO")
    public void enterReasonAndClickSubmitForOOO() throws InterruptedException {
        summaryPage.enterOOOReason();
        summaryPage.clickSubmitToOOO();
    }

    @Step("Get Direct Report Name")
    public String getDirectReportName() {
        employeeList = CredentialsCSVReader.readAndLoadCSVData();
        omuser = employeeList.get("TM");
      return  omuser.getFirstName() + " " + omuser.getLastName();
    }

    @Step("Get TL Name")
    public String getTLName() {
        employeeList = CredentialsCSVReader.readAndLoadCSVData();
        omuser = employeeList.get("TL");
        return omuser.getFirstName() + " " + omuser.getLastName();
    }

    @Step ("Get Filter Date")
    public String getExpectedFilterDate(){
        String pattern = "MMM dd, yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayNumber = c.get(Calendar.DAY_OF_WEEK) - c.getFirstDayOfWeek();
        c.add(Calendar.DATE, -dayNumber - 6);
        Date start = c.getTime();
        c.add(Calendar.DATE, 13);
        Date end = c.getTime();
        return simpleDateFormat.format(start) + " - " + simpleDateFormat.format(end);
    }
}

