package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.SummaryStep;

public class SummaryStepDefinitions {
    @Steps
    SummaryStep summaryStep;

    @And("Click on Summary Icon")
    public void ClickOnSummary() {
        summaryStep.clickOnSummaryIcon();
    }

    @And("Get number of Tiles present for Direct Reports")
    public void getTotalTilesPresentInMyTeamTabMeetingModule() {
        summaryStep.getTilesInMeetingModule();
    }

    @And("Verify number of direct reports should be same as My Team Tab")
    public void getTotalDirectReportsPresentInSummaryModule() throws InterruptedException {
        summaryStep.getDirectReportInSummaryModule();
    }

    @And("Verify Compliance for the TL is same as displayed in Meeting Module")
    public void verifyComplianceInSummaryModule() throws InterruptedException {
        summaryStep.verifyComplianceForSpecificTL();
    }

    @And("Click on the 'View Meeting Logs' button for the direct report")
    public void clickOnViewMeetingLogsForSpecificUser() throws InterruptedException {
        summaryStep.clickViewMeetingLogsForSpecificUser();
    }

    @And("Verify Meetings should be displayed of Previous week monday to this week sunday")
    public void verifyMeetingLogsFilterDate() throws InterruptedException {
        summaryStep.verifyFilterDate();
    }

    @And("Select a date {string} in Meeting logs filter")
    public void selectDateInMeetingFilterLog(String expectedDate) throws InterruptedException {
        summaryStep.selectDate(expectedDate, expectedDate);
    }

    @And("Verify meetings displayed for the {string} date only")
    public void verifyMeetingsDisplayedForSelectedDate(String expectedDate) throws InterruptedException {
        summaryStep.verifyMeetingDate(expectedDate);
    }

    @And("Select a TL from the list")
    public void selectTLFromList() throws InterruptedException {
        summaryStep.clickOnTL();
    }

    @And("Click on 'My Team' button")
    public void clickOnMyTeamButton() throws InterruptedException {
        summaryStep.clickOnMyTeam();
    }

    @And("Verify Number of direct reports are same as displayed in Meeting Module")
    public void verifyTotalNumberOfDirectReportForSpecificTL() throws InterruptedException {
        summaryStep.verifyTotalNumberOfDirectReportForSpecificTL();
    }

    @Then("Verify initial compliance")
    public void verifyComplianceForSpecificTL() throws InterruptedException {
        summaryStep.verifyDefaultComplianceForSpecificTL();
    }

    @Then("Verify list of TLs Direct reports are displayed")
    public void verifyDirectReportsDisplayedForSpecificTL() throws InterruptedException {
        summaryStep.verifyDirectReportForSpecificTLDisplayed();
    }

    @And("Get the number of Meetings displayed")
    public void getNumberOfMeetingsInMeetingModule() throws InterruptedException {
        summaryStep.getTotalNumberOfMeetings();
    }

    @And("Verify number of meetings are displayed same as displayed in Meeting module for the same duration")
    public void verifyTotalNumberOfMeetingsInSummaryModule() throws InterruptedException {
        summaryStep.verifyTotalNumberOfMeetingsInSummaryModuleHistory();
    }

    @And("Get Compliance value")
    public void getComplianceValue() throws InterruptedException {
        summaryStep.getInitialComplianceStatus();
    }

    @And("Verify Compliance should be increased")
    public void verifyComplianceValueIncreased() throws InterruptedException {
        summaryStep.verifyComplianceIncreasedByOne();
    }

    @And("Verify Compliance for the TL is same as displayed as {string}")
    public void verifyComplianceInSummaryModule(String message) throws InterruptedException {
        summaryStep.verifyOOOComplianceForSpecificTL(message);
    }

    @And("Setup an out of office")
    public void setupAnOutOffOffice() throws InterruptedException {
        summaryStep.setupOOO();
    }

    @And("Enter reason for ooo and click on Submit button")
    public void enterReasonForOOOAndSubmit() throws InterruptedException {
        summaryStep.enterReasonAndClickSubmitForOOO();
    }
}
