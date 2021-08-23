package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pageobjects.GoalsPage;
import steps.GoalsUpdatedSteps.GoalsUpdatedSteps;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GoalsSteps {

    @Steps
    GoalsPage goalsPage;

    @Steps
    GoalsUpdatedSteps goalsUpdatedSteps;

    @Step("Click on Initials")
    public void clickOnInitials() {
        goalsPage.clickInitialsIconUpperRight();
    }

    @Step("Click on Manage Goals Option")
    public void clickOnManageGoalsOption() {
        goalsPage.clickManageGoalsOption();
    }

    @Step("Click on Add Cycle Option")
    public void clickOnAddCycleOption() {
        goalsPage.clickOnAddCycle();
    }

    @Step("Fill all fields value")
    public void fillAllTheFieldsValue() {
        goalsPage.fillValueInFields();
    }

    @Step("Click on Cancel Button")
    public void clickOnCancelButton() {
        goalsPage.clickOnCreateCycleCancelButton();
    }

    @Step("Verify Cycle Name in The List")
    public void verifyCycleNameInTheList() throws InterruptedException {
        goalsPage.verifyCycleNameNotInTheDropDownList();
    }

    @Step("Verify Cycle Name is in The List")
    public void clickOnAddCycleButton() {
        goalsPage.clickOnCycleAddButton();
    }

    @Step("Verify Cycle Name present in The List")
    public void verifyCycleNamePresentInTheList() {
        goalsPage.verifyCycleNamePresentInDropDownList();
    }

    @Step("Select existing Cycle and update cycle name")
    public void selectExistingCycleAndUpdate() throws InterruptedException {
        goalsPage.selectExistingCycleAndUpdateIt();
    }

    @Step("Select an existing Cycle")
    public void selectExistingCycle() throws InterruptedException {
        goalsPage.selectGoalCycle();
    }

    @Step("Edit Status Change Cutoff Field")
    public void EditStatusChangeCutoffField() throws InterruptedException {
        goalsPage.ChangeDateInStatusChangeCutoffField();
    }

    @Step("Change Edit cutoff Field")
    public void ChangeEditCutoffField() throws InterruptedException {
        goalsPage.ChangeDateInEditCutoffField();
    }

    @Step("verify Update in Status Cutoff Field")
    public void verifyUpdateInStatusCutoffField() {
        goalsPage.verifyStatusCutoffField();
    }

    @Step("verify Update in Edit Cutoff Field")
    public void verifyUpdateInEditCutoffField() {
        goalsPage.verifyEditCutoffField();
    }



    /*************************************************************
     * Create Goals Module Steps is started here
     */

    @Step("Click on Goals and select any Cycle")
    public void clickOnGoalsAndSelectAnyCycle() throws InterruptedException {
        goalsPage.clickOnGoalsOptionAndSelectACycle();
    }

    @Step("Click to Create Goal")
    public void clickToCreateGoal() throws InterruptedException {
        goalsPage.clickOnCreateGoalButton();
    }

    @Step("Click on Logged in user name")
    public void clickOnLoggedInUserName(){
        goalsPage.SelectYourNameForGoal();
    }

    @Step("Verify Create Goals page contents")
    public void verifyCreateGoalFormContents(){
        goalsPage.verifyGoalPageContents();
    }

    @Step("Click on Create Goals Save button")
    public void clickOnCreateGoalsSaveButton() {
        goalsPage.clickCreateGoalsSaveButton();
    }

    @Step("Verify Goal Title field Error for blank value")
    public void verifyGoalTitleBlankFieldError(){
        goalsPage.verifyTitleBlankFieldError();
    }

    @Step("Enter data in Title field")
    public void enterDataInTitleField(){
        goalsPage.FillDataInTitleField();
    }

    @Step("Enter data in Title field for Himself")
    public void enterDataInTitleFieldForHimself(){
        goalsPage.FillDataInTitleFieldForHimself();
    }

    @Step("Enter data in Title field for Direct report")
    public void enterDataInTitleFieldForDirectReport(){
        goalsPage.FillDataInTitleFieldForDirectReport();
    }

    @Step("Enter data in Title field For Indirect Report")
    public void enterDataInTitleFieldForIndirectReport(){
        goalsPage.FillDataInTitleFieldForIndirectReport();
    }

    @Step("Verify Goal Description field Error for blank value")
    public void verifyDescriptionFieldErrorMsg(){
        goalsPage.verifyErrorMsgForGoalDescriptionField();
    }

    @Step("Enter data in Description field")
    public void enterDataInDescriptionField(){
        goalsPage.FillDataInDescriptionField();
    }

    @Step("Verify Goal Key Result field Error for blank value")
    public void verifyKeyResultBlankFieldErrorMsg(){
        goalsPage.verifyErrorMsgForGoalKeyResultField();
    }

    @Step("Enter data in Key Result field")
    public void enterDataInKeyResultField(){
        goalsPage.FillDataInKeyResultField();
    }

    @Step("Verify new goal is added for your name")
    public void verifyCreateGoalNewGoalAdded(){
        goalsPage.verifyNewGoalAdded();
    }

    @Step("Verify new goal is added for your name TM")
    public void verifyCreateGoalNewGoalAddedForTM(){
        goalsPage.verifyNewGoalAddedForTM();
    }

    @Step("Verify new goal is added for your Direct report")
    public void verifyCreateGoalNewGoalAddedForDirectReport(){
        goalsPage.verifyNewGoalAddedForDirectReport();
    }

    @Step("Verify new goal is added for your Indirect report")
    public void verifyCreateGoalNewGoalAddedForIndirectReport(){
        goalsPage.verifyNewGoalAddedForIndirectReport();
    }

    @Step("Click Create Goal Cancel button")
    public void clickCreateGoalCancelButton() throws InterruptedException {
        goalsPage.ClickGoalCancelButton();
    }

    @Step("Verify Goal Home page when cancel")
    public void verifyGoalsHomePageWhenCancel(){
        goalsPage.verifyGoalsHomePageForGoalNotAdded();
    }


    @Step("Enter any employee name in Others field")
    public void enterAnyEmployeeNameInOthersField() throws InterruptedException {
        goalsPage.searchAnyEmployeeNameInOthersField();
    }

    @Step("Click on the searched employee name")
    public void clickOnTheSearchedEmployeeName() throws InterruptedException {
        goalsPage.clickOnSearchedEmployeeName();
    }

    @Step("Click on the direct report")
    public void clickOnTheDirectReport() throws InterruptedException {
        goalsPage.selectDirectReportFromAll();
    }

    /*************************************************************
     * View Goals Module Steps is started here
     */

    @Step("Verify the List of Goals created for TM")
    public void verifyGoalsCreatedForTM()  {
        goalsPage.verifyGoalsListCreatedForTM();
    }

    @Step("Verify the List of Goals created for Direct Report")
    public void verifyGoalsCreatedForDirectReport() {
        goalsPage.verifyGoalsListCreatedForDirectReport();
    }

    @Step("Verify the List of Goals created for Indirect Report")
    public void verifyGoalsCreatedForIndirectReport() {
        goalsPage.verifyGoalsListCreatedForIndirectReport();
    }

    @Step("Select the Previous Cycle")
    public void choosePreviousCycle(String cycleName) throws InterruptedException {
        goalsPage.selectPreviousCycleFromDropdown(cycleName);
    }

    @Step("Click on Previous Goal and change to Completed")
    public void clickOnPreviousGoalAndChangeToCompleted() throws InterruptedException {
        goalsPage.changeStatusToCompletedForPreviousGoal();
    }

    @Step("Select the Current Cycle from dropdown")
    public void chooseCurrentCycle(String currentCycle) throws InterruptedException {
        goalsPage.selectCurrentCycleFromDropdown(currentCycle);
    }

    @Step("Click on Previous Goal and change to Open")
    public void clickOnPreviousGoalAndChangeToOpen() throws InterruptedException {
        goalsPage.changeStatusToOpenForPreviousGoal();
    }

    @Step("Verify Previous Completed goal does not show in Current cycle Goal list")
    public void verifyPreviousCompletedGoalDoesNotShowInCurrentCycle() {
        goalsPage.verifyPreviousCompletedGoalDoesNotShowInCurrentCycleGoalList();
    }

    @Step("Verify Previous Open goal shows in Current cycle Goal list")
    public void verifyPreviousOpenGoalShowsInCurrentCycle() {
        goalsPage.verifyPreviousOpenGoalShowsInCurrentCycleGoalList();
    }

    /*************************************************************
     * Edit Goals Module Steps is started here
     */

    @Step("Click on First Goal")
    public void clickOnFirstGoal() {
        goalsPage.clickOnGoalToSee();
    }

    @Step("Verify Goals Details")
    public void verifyGoalDetails() {
        goalsPage.verifyGoalAllFields();
    }

    @Step("Click on Status field and verify Status List")
    public void clickOnStatusFieldAndVerifyStatusList() throws InterruptedException {
        goalsPage.VerifyStatusList();
    }

    @Step("Click on Direct report Goal Status")
    public void clickOnDirectReportGoalStatus() {
        goalsPage.clickOnGoalCreatedByDirectReportForHimself();
    }

    @Step("Click on same Goal and verify Edit button availability")
    public void clickOnSameGoalAndVerifyEditButtonAvailability() throws InterruptedException {
        goalsPage.clickSameGoalAndVerifyEditButtonAvailability();
    }

    @Step("Verify Goal Status clickable and Check current status")
    public void verifyGoalStatusClickableAndCheckCurrentStatus() {
        goalsPage.verifyGoalStatusIsClickableAndVerifyCurrentStatus();
    }

    @Step("Click on Direct report Goal Status for IS")
    public void clickOnDirectReportGoalStatusForIS() {
        goalsPage.clickOnGoalCreatedByISForDirectReport();
    }

    @Step("Click on same Goal and verify Edit button availability for IS")
    public void clickOnSameGoalAndVerifyEditButtonAvailabilityForIS() throws InterruptedException {
        goalsPage.clickSameGoalAndVerifyEditButtonAvailabilityForIS();
    }

    @Step("Verify Goal Status clickable and Check current status for IS")
    public void verifyGoalStatusClickableAndCheckCurrentStatusForIS() {
        goalsPage.verifyGoalStatusIsClickableAndVerifyCurrentStatusForIS();
    }

    @Step("Status should not be clickable")
    public void statusShouldNotClickable() {
        goalsPage.statusShouldNotClickableByTM();
    }

    @Step("Click on same Goal and verify Edit button is not available")
    public void clickOnSameGoalAndVerifyEditButtonNotAvailable() throws InterruptedException {
        goalsPage.clickOnSameGoalAndVerifyEditButtonNotAvailableByTM();
    }

    @Step("Verify Status should not be clickable")
    public void verifyStatusShouldNotBeClickable() {
        goalsPage.verifyStatusShouldNotBeClickableByTM();
    }

    @Step("Click on Direct report Goal Status for Admin")
    public void clickOnDirectReportGoalStatusForAdmin() {
        goalsPage.clickOnGoalCreatedByAdminForDirectReport();
    }

    @Step("Click on same Goal and verify Edit button availability for Admin")
    public void clickOnSameGoalAndVerifyEditButtonIsAvailableForAdmin() throws InterruptedException {
        goalsPage.clickSameGoalAndVerifyEditButtonAvailabilityForAdmin();
    }

    @Step("Verify Goal Status clickable and Check current status for Admin")
    public void verifyGoalStatusClickableAndCheckCurrentStatusForAdmin() {
        goalsPage.verifyGoalStatusIsClickableAndVerifyCurrentStatusForAdmin();
    }

    @Step("Status should not be clickable by Indirect Report")
    public void statusShouldNotClickableByIndirectReport() {
        goalsPage.statusShouldNotClickableByIR();
    }

    @Step("Click on same Goal and verify Edit button is not available by Indirect Report")
    public void clickOnSameGoalAndVerifyEditButtonNotAvailableForIndirectReport() throws InterruptedException {
        goalsPage.clickOnSameGoalAndVerifyEditButtonNotAvailableByIR();
    }

    @Step("Verify Status should not be clickable by Indirect Report")
    public void verifyStatusShouldNotBeClickableByIndirectReport() {
        goalsPage.verifyStatusShouldNotBeClickableByIR();
    }

    @Step("Enter comments on the comment box")
    public void enterCommentsOnTheCommentBox() {
        goalsPage.writeCommentsOnTheCommentBox();
    }

    @Step("Click Add Note and verify the added comment")
    public void clickAddNoteButtonAndVerifyTheAddedComment() throws InterruptedException {
        goalsPage.clickAddNoteButtonAndVerifyComment();
    }

    @Step("Verify status of the goal before Status Updatable date")
    public void verifyStatusOfTheGoalCanBeChangedBeforeStatusUpdatableDate() {
        goalsPage.verifyStatusOfTheGoalBeforeStatusUpdatableDate();
    }

    @Step("Change the status for Previous Goal to Open")
    public void changeStatusForPreviousGoalToOpen() throws InterruptedException {
        goalsPage.changeStatusForPreviousGoalToOpenFromCompleted();
    }

    @Step("Verify the status of the goal can be changed via Goal list by employee")
    public void verifyTheStatusOfTheGoalCanBeChangedViaGoalListByEmployee() {
        goalsPage.verifyTheStatusOfTheGoalCanBeChangedViaGoalList();
    }

    @Step("Click on Goals and select a Old Cycle by Employee")
    public void clickOnGoalsAndSelectAOldCycleByEmployee(String CycleName) throws InterruptedException {
        goalsPage.clickOnGoalsAndSelectAPreviousCycle(CycleName);
    }

    @Step("Click on the Goal employee created for him")
    public void clickOnTheGoalEmployeeCreatedForHim() throws InterruptedException {
        goalsPage.clickOnTheGoalEmployeeCreatedForSelf();
    }

    @Step("Verify Error message Status change is beyond cutoff")
    public void verifyErrorMessageStatusChangeIsBeyondCutoff() {
        goalsPage.verifyErrorMessage();
    }

    @Step("Verify Error message Status change is beyond cutoff on Goal List")
    public void verifyErrorMessageStatusChangeIsBeyondCutoffOnGoalList() {
        goalsPage.verifyErrorMessageOnGoalList();
    }

    @Step("Click on Previous Goal for Edit")
    public void clickOnPreviousGoalForEdit() {
        goalsPage.clickOnPreviousGoalForEditing();
    }

    @Step("Click Edit button, Update the necessary field and click on Save")
    public void clickEditButtonUpdateTheNecessaryFieldAndClickOnSave() throws InterruptedException {
        goalsPage.updateTheNecessaryFieldAndShouldSave();
    }

    @Step("Verify goal is updated on or before the Editable Until date")
    public void verifyGoalIsUpdatedOnOrBeforeTheEditableUntilDate() {
        goalsPage.verifyGoalIsUpdatedBeforeTheEditableUntilDate();
    }

    @Step("Verify goal is updated on or before the Editable Until date by Employee")
    public void verifyGoalCannotBeEditedAfterTheEditableUntilDateByEmployee() {
        goalsPage.verifyGoalCannotBeEditedAfterEditableUntilDate();
    }

    public void verifyNameOfTheGoalFormShouldBeYourName() {
        goalsPage.verifyNameOfTheGoalFormShouldBeYourName();
    }

    @Step("verifyCycleNameShouldBeTheOneSelected")
    public void verifyCycleNameShouldBeTheOneSelected() {
        goalsPage.verifyCycleNameShouldBeTheOneSelected();
    }

    public void verifyDateCoverageShouldBeTheStartAndEndOfCycle() {
        String cycleName = goalsPage.getCycleName();
        GoalsUpdatedSteps.Quarter quarter = GoalsUpdatedSteps.Quarter.First_Quarter;
        if("First Quarter".equalsIgnoreCase(cycleName)){
            quarter = GoalsUpdatedSteps.Quarter.First_Quarter;
        }

        SimpleDateFormat dtFormatDate = new SimpleDateFormat("MM/dd/YYYY");
        Calendar startDateClndr = goalsUpdatedSteps.getDateToCurrentQuarter(quarter,true);
        Calendar endDateClndr = goalsUpdatedSteps.getDateToCurrentQuarter(quarter,false);
        String cycleStartAndEnd = dtFormatDate.format(startDateClndr.getTime()) + "-"
                + dtFormatDate.format(endDateClndr.getTime());
       Assert.assertTrue("Checking cycle start and end date",goalsPage.verifyDateCoverageShouldBeTheStartAndEndOfCycle(cycleStartAndEnd));
       Assert.assertTrue("Checking Due date",goalsPage.checkDueDate(dtFormatDate.format(endDateClndr.getTime())));
    }

    public void verifyTitleAndDescriptionIsFreeForm() {
        Assert.assertTrue("Verify if title textarea is freeform",goalsPage.isTitleTextareaIsFreeform());
        Assert.assertTrue("Verify if description textarea is freeform",goalsPage.isDescriptionTextareaFreeform());
    }

    public void verifyKeyresultTextboxAndButtonIsDisplayed() {
        Assert.assertTrue("Verify key result textbox is displayed",goalsPage.isKeyResultTextboxDisplayed());
        Assert.assertTrue("Verify key result button",goalsPage.iskeyResultBtnDisplayed());
    }

    public void verifyThatPageIsNotRedirectedToGoalsPage() {
        Assert.assertFalse("Verify that the page is not redirected to goal page",goalsPage.isPageInGoalsPage());
    }

    public void verifyThatPageIsRedirectedToGoalsPage() {
        goalsPage.waitforPageToRedirectTo("https://app1-test.taskus.com/goals");
        Assert.assertTrue("Verify that the page is not redirected to goal page",goalsPage.isPageInGoalsPage());
    }

    public void verifyListOfDirectReportAreDisplayed() {
        goalsPage.verifyListOfDirectReportAreDisplayed();
    }
}
