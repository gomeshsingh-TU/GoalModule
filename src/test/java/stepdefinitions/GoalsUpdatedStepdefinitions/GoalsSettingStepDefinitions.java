package stepdefinitions.GoalsUpdatedStepdefinitions;

import common.DBHelper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.GoalsSteps;
import steps.GoalsUpdatedSteps.GoalsUpdatedSteps;
import steps.LoginSteps;

public class GoalsSettingStepDefinitions {

    @Steps
    GoalsUpdatedSteps goalsUpdatedSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    GoalsSteps goalsSteps;

    DBHelper dbHelper;


    @Then("Set first quarter on Start Date field")
    public void setFirstQuarterOnStartDateField() {
        goalsUpdatedSteps.selectADateOnStartDateAndEndDateField(GoalsUpdatedSteps.Quarter.First_Quarter,true);
    }

    @Then("Set first quarter on End Date field")
    public void setFirstQuarterOnEndDateField() {
        goalsUpdatedSteps.selectADateOnStartDateAndEndDateField(GoalsUpdatedSteps.Quarter.First_Quarter,false);
    }

    @Then("Set name of quarter as first quarter")
    public void setNameOfQuarterAsFirstQuarter() {
        goalsUpdatedSteps.setQuarterNameAs("First Quarter");
    }

    @Then("Set first quarter status change cutoff date")
    public void setFirstQuarterStatusChangeCutoff() {
        goalsUpdatedSteps.setDateOnStatusChangeCutoff(GoalsUpdatedSteps.Quarter.First_Quarter);
    }

    @Then("Set first quarter edit cutoff date")
    public void setFirstQuarterEditCutoffDate() {
        goalsUpdatedSteps.setFirstQuarterEditCutoffDate(GoalsUpdatedSteps.Quarter.First_Quarter);
    }

    @Then("Select {string} on Is Listed field")
    public void selectOnIsListedField(String yesOrNo) {
        goalsUpdatedSteps.selectOnIsListedField(yesOrNo);
    }

    @Then("click cancel button")
    public void clickCancelButton() {
        goalsUpdatedSteps.clickCancelButton();
    }

    @And("input data in description field")
    public void inputDataInDescriptionField() {
        goalsUpdatedSteps.inputDataInDescriptionField();
    }

    @Then("Verify Cycle Name is not Added in the list")
    public void verifyCycleNameIsNotAddedInTheList() throws InterruptedException {
        goalsUpdatedSteps.verifyCycleNameIsNotAddedInThelist();
    }

    @Then("Verify Cycle Name is Added in the list")
    public void verifyCycleNameIsAddedInTheList() {
        goalsUpdatedSteps.verifyCycleNamePresentInTheList();
    }

    @Given("Clear goal database")
    public void clearWellnessDatabase() {
        dbHelper = new DBHelper();
        dbHelper.truncateGoalTBL();
    }

    @Given("Create prereq data for {string}")
    public void createPrereqDataFor(String testCaseNumber) throws InterruptedException {
        if("QA_BCT_GS-CG_02".equalsIgnoreCase(testCaseNumber)){
            module1tc2();
        }
        if("QA_BCT_GS-VG_01".equalsIgnoreCase(testCaseNumber)){
            module1tc2();
            module3tc1();
        }
    }

    @And("Input data in cycle for the first quarter")
    public void inputDataInCycleForTheFirstQuarter() {
        setNameOfQuarterAsFirstQuarter();
        setFirstQuarterOnStartDateField();
        setFirstQuarterOnEndDateField();
        setFirstQuarterStatusChangeCutoff();
        setFirstQuarterEditCutoffDate();
        selectOnIsListedField("Yes");
    }

    public void module1tc2(){
        clearWellnessDatabase();
        loginSteps.openBoostLoginPage();
        loginSteps.UserLogsIn("Supervisor");
        goalsSteps.clickOnInitials();
        goalsSteps.clickOnManageGoalsOption();
        goalsSteps.clickOnAddCycleOption();
        inputDataInCycleForTheFirstQuarter();
        goalsSteps.clickOnAddCycleButton();
        verifyCycleNameIsAddedInTheList();
        loginSteps.logout();
    }

    public void module3tc1() throws InterruptedException {
        loginSteps.openBoostLoginPage();
        loginSteps.UserLogsIn("DirectReport");
        clickOnGoalsAndSelectACycle();
        clickOnCreateGoal();
        clickOnYourName();
        inputDataInTitleFieldForHimself();
        inputDataInDescriptionField();
        addAKeyResult();
        clickOnCreateGoalSaveButton();
        verifyThatPageIsRedirectedToGoalsPage();
        verifyTheListOfGoalsCreatedForHimself();
        loginSteps.logout();
    }

    @Then("Verify name of the goal form should be your name")
    public void verifyNameOfTheGoalFormShouldBeYourName() {
        goalsSteps.verifyNameOfTheGoalFormShouldBeYourName();
    }

    @Then("Verify cycle name should be the one selected")
    public void verifyCycleNameShouldBeTheOneSelected() {
        goalsSteps.verifyCycleNameShouldBeTheOneSelected();
    }

    @Then("Verify Date coverage and Due Date")
    public void verifyDateCoverageShouldBeTheStartAndEndOfCycle() {
        goalsSteps.verifyDateCoverageShouldBeTheStartAndEndOfCycle();
    }

    @Then("Verify title and description is free form")
    public void verifyTitleAndDescriptionIsFreeForm() {
        goalsSteps.verifyTitleAndDescriptionIsFreeForm();
    }

    @Then("Click on Initials on right upper corner")
    public void clickOnInitialsOnRightUpperCorner() {
        goalsSteps.clickOnInitials();
    }

    @Then("Click on Manage Goals")
    public void clickOnManageGoals() {
        goalsSteps.clickOnManageGoalsOption();
    }

    @Then("Click Add Cycle")
    public void clickAddCycle() {
        goalsSteps.clickOnAddCycleOption();
    }

    @Then("Fill all the fields")
    public void fillAllTheFields() {
        goalsSteps.fillAllTheFieldsValue();
    }

    @Then("Click on Cancel")
    public void clickOnCancel() {
        goalsSteps.clickOnCancelButton();
    }

    @Then("Click on Add button for Cycle")
    public void clickOnAddButtonForCycle() {
        goalsSteps.clickOnAddCycleButton();
    }

    @Then("Select a Cycle and Update cycle name")
    public void selectACycleAndUpdateCycleName() throws InterruptedException {
        goalsSteps.selectExistingCycleAndUpdate();
    }

    @Then("verify Cycle name should not be updated")
    public void verifyCycleNameShouldNotBeUpdated() throws InterruptedException {
        goalsSteps.verifyCycleNameInTheList();
    }

    @Then("Verify Cycle Name should be updated in the list")
    public void verifyCycleNameShouldBeUpdatedInTheList() {
        goalsSteps.verifyCycleNamePresentInTheList();
    }

    @Then("Select a Cycle")
    public void selectACycle() throws InterruptedException {
        goalsSteps.selectExistingCycle();
    }

    @Then("Update Status Change Cutoff field")
    public void updateStatusChangeCutoffField() throws InterruptedException {
        goalsSteps.EditStatusChangeCutoffField();

    }

    @Then("Update Edit Cutoff field")
    public void updateEditCutoffField() throws InterruptedException {
        goalsSteps.ChangeEditCutoffField();
    }

    @Then("Verify Status Change Cutoff field")
    public void verifyStatusCutoffField() {
        goalsSteps.verifyUpdateInStatusCutoffField();
    }

    @Then("Verify Edit Cutoff field")
    public void verifyEditCutoffField() {
        goalsSteps.verifyUpdateInEditCutoffField();
    }


    /*************************************************************
     * Create Goals Module Step Definition is started here
     */

    @Then("Click on Goals and select a Cycle")
    public void clickOnGoalsAndSelectACycle() throws InterruptedException {
        goalsSteps.clickOnGoalsAndSelectAnyCycle();
    }

    @Then("Click on Create Goal")
    public void clickOnCreateGoal() throws InterruptedException {
        goalsSteps.clickToCreateGoal();
    }

    @Then("Click on your name")
    public void clickOnYourName() {
        goalsSteps.clickOnLoggedInUserName();
    }

    @Then("Verify the Create Goals form contents")
    public void verifyTheCreateFormContents() {
        goalsSteps.verifyCreateGoalFormContents();
    }

    @Then("Click on Create Goal Save button")
    public void clickOnCreateGoalSaveButton() {
        goalsSteps.clickOnCreateGoalsSaveButton();
    }

    @Then("Verify Goal title cannot be left blank")
    public void verifyGoalTitleCannotBeLeftBlank() {
        goalsSteps.verifyGoalTitleBlankFieldError();
    }

    @Then("Input data in Title field")
    public void inputDataInTitleField() {
        goalsSteps.enterDataInTitleField();
    }

    @Then("Input data in Title field for himself")
    public void inputDataInTitleFieldForHimself() {
        goalsSteps.enterDataInTitleFieldForHimself();
    }

    @Then("Input data in Title field for Direct report")
    public void inputDataInTitleFieldForDirectReport() {
        goalsSteps.enterDataInTitleFieldForDirectReport();
    }

    @Then("Input data in Title field for Indirect report")
    public void inputDataInTitleFieldForIndirectReport() {
        goalsSteps.enterDataInTitleFieldForIndirectReport();
    }

    @Then("Verify You must provide description to the goal")
    public void verifyYouMustProvideDescriptionToTheGoal() {
        goalsSteps.verifyDescriptionFieldErrorMsg();
    }

    @Then("Verify You must provide at least 1 key result")
    public void verifyYouMustProvideAtleastOneKeyResult() {
        goalsSteps.verifyKeyResultBlankFieldErrorMsg();
    }

    @Then("Add a key result")
    public void addAKeyResult() {
        goalsSteps.enterDataInKeyResultField();
    }

    @Then("Verify Create Goal is saved")
    public void verifyCreateGoalIsSaved() {
        goalsSteps.verifyCreateGoalNewGoalAdded();
    }

    @Then("Verify Create Goal is saved for TM")
    public void verifyCreateGoalIsSavedForTM() {
        goalsSteps.verifyCreateGoalNewGoalAddedForTM();
    }

    @Then("Verify Create Goal is saved for Direct report")
    public void verifyCreateGoalIsSavedForDirectReport() {
        goalsSteps.verifyCreateGoalNewGoalAddedForDirectReport();
    }

    @Then("Verify Create Goal is saved for Indirect report")
    public void verifyCreateGoalIsSavedForIndirectReport() {
        goalsSteps.verifyCreateGoalNewGoalAddedForIndirectReport();
    }

    @Then("Click on Create Goal Cancel button")
    public void clickOnCreateGoalCancelButton() throws InterruptedException {
        goalsSteps.clickCreateGoalCancelButton();
    }

    @Then("Verify User should be redirected to Create Goal module page")
    public void verifyUserShouldBeRedirectedToCreateGoalModulePage() {
        goalsSteps.verifyGoalsHomePageWhenCancel();
    }

    @Then("Click on one of the direct report")
    public void clickOnOneOfTheDirectReport() throws InterruptedException {
        goalsSteps.clickOnTheDirectReport();
    }

    @Then("Enter any employee name or number in Others field")
    public void enterAnyEmployeeNameOrNumberInOthersField() throws InterruptedException {
        goalsSteps.enterAnyEmployeeNameInOthersField();
    }

    @Then("Click on the employee name")
    public void clickOnTheEmployeeName() throws InterruptedException {
        goalsSteps.clickOnTheSearchedEmployeeName();
    }


    /*************************************************************
     * View Goals Module Step Definition is started here
     */


    @Then("Verify the List of Goals created for himself")
    public void verifyTheListOfGoalsCreatedForHimself() {
        goalsSteps.verifyGoalsCreatedForTM();
    }

    @Then("Verify IS can view the Goals created by Direct reports for himself")
    public void verifyISCanViewTheGoalsCreatedByDirectReportsForHimself() {
        goalsSteps.verifyGoalsCreatedForTM();
    }

    @Then("Verify IS can view the goal that he created for his Direct Report")
    public void verifyISCanViewTheGoalThatHeCreatedForHisDirectReport() {
        goalsSteps.verifyGoalsCreatedForDirectReport();
    }

    @Then("Verify Direct Report can view the goal that his IS created for him")
    public void verifyDirectReportCanViewTheGoalThatHisISCreatedForHim() {
        goalsSteps.verifyGoalsCreatedForDirectReport();
    }

    @Then("Verify Employee can view the goal that he created for an indirect report")
    public void verifyEmployeeCanViewTheGoalThatHeCreatedForAnIndirectReport() {
        goalsSteps.verifyGoalsCreatedForIndirectReport();
    }

    @Then("Verify Indirect Report can view the goal that Employee created for him")
    public void verifyIndirectReportCanViewTheGoalThatEmployeeCreatedForHim() {
        goalsSteps.verifyGoalsCreatedForIndirectReport();
    }

    @Then("Verify IS of Indirect Report can view the goal that Employee created for Indirect Report")
    public void verifyISOfIndirectReportCanViewTheGoalThatEmployeeCreatedForIndirectReport() {
        goalsSteps.verifyGoalsCreatedForIndirectReport();
    }

    @Then("Select Previous Cycle {string}")
    public void selectPreviousCycle(String arg) throws InterruptedException {
        goalsSteps.choosePreviousCycle(arg);
    }

    @Then("Click on Previous Goal and change status to Completed")
    public void clickOnPreviousGoalAndChangeStatusToCompleted() throws InterruptedException {
        goalsSteps.clickOnPreviousGoalAndChangeToCompleted();
    }

    @Then("Select Current Cycle {string}")
    public void selectCurrentCycle(String arg) throws InterruptedException {
        goalsSteps.chooseCurrentCycle(arg);
    }

    @Then("Click on Previous Goal and change status to Open")
    public void clickOnPreviousGoalAndChangeStatusToOpen() throws InterruptedException {
        goalsSteps.clickOnPreviousGoalAndChangeToOpen();
    }

    @Then("Verify Goals with due date covered in the current cycle that is marked Completed will no longer be listed in the current cycle")
    public void verifyPreviousCycleCompletedGoalDoesNotShowInCurrentCycle() {
        goalsSteps.verifyPreviousCompletedGoalDoesNotShowInCurrentCycle();
    }

    @Then("Verify Goals with due date covered in the current cycle that is not marked Completed will be listed in the current cycle")
    public void verifyPreviousCycleOpenGoalShowsInCurrentCycle() {
        goalsSteps.verifyPreviousOpenGoalShowsInCurrentCycle();
    }


    /*************************************************************
     * Edit Goals Module Step Definition is started here
     */

    @Then("Click on any Goal")
    public void clickOnAnyGoal() {
        goalsSteps.clickOnFirstGoal();
    }

    @Then("Verify the Goal detailed data")
    public void verifyTheGoalDetailedData() {
        goalsSteps.verifyGoalDetails();
    }

    @Then("Click on Status field and verify List of Status")
    public void clickOnStatusFieldAndVerifyListOfStatus() throws InterruptedException {
        goalsSteps.clickOnStatusFieldAndVerifyStatusList();
    }

    @Then("Click on Status of the goal")
    public void clickOnStatusOfTheGoal() {
        goalsSteps.clickOnDirectReportGoalStatus();
    }

    @Then("Click on same Goal and verify Edit button is available")
    public void clickOnSameGoalAndVerifyEditButtonIsAvailable() throws InterruptedException {
        goalsSteps.clickOnSameGoalAndVerifyEditButtonAvailability();
    }

    @Then("Verify Status should be clickable and current status")
    public void verifyStatusShouldBeClickableAndCurrentStatus() {
        goalsSteps.verifyGoalStatusClickableAndCheckCurrentStatus();
    }

    @Then("Click on Status of the goal for IS")
    public void clickOnStatusOfTheGoalForIS() {
        goalsSteps.clickOnDirectReportGoalStatusForIS();
    }

    @Then("Click on same Goal and verify Edit button is available for IS")
    public void clickOnSameGoalAndVerifyEditButtonIsAvailableForIS() throws InterruptedException {
        goalsSteps.clickOnSameGoalAndVerifyEditButtonAvailabilityForIS();
    }

    @Then("Verify Status should be clickable and current status for IS")
    public void verifyStatusShouldBeClickableAndCurrentStatusForIS() {
        goalsSteps.verifyGoalStatusClickableAndCheckCurrentStatusForIS();
    }

    @Then("Click on Status and should not be clickable created by IS")
    public void statusShouldNotClickableCreatedByIS() {
        goalsSteps.statusShouldNotClickable();
    }

    @Then("Click on same Goal and verify Edit button is not available Goal created by IS")
    public void clickOnSameGoalAndVerifyEditButtonNotAvailableGoalCreatedByIS() throws InterruptedException {
        goalsSteps.clickOnSameGoalAndVerifyEditButtonNotAvailable();
    }

    @Then("Verify Status should not be clickable Goal created by IS")
    public void verifyStatusShouldNotBeClickableGoalCreatedByIS() {
        goalsSteps.verifyStatusShouldNotBeClickable();
    }

    @Then("Click on Status of the goal created for Admin")
    public void clickOnStatusOfTheGoalCreatedForAdmin() {
        goalsSteps.clickOnDirectReportGoalStatusForAdmin();
    }

    @Then("Click on same Goal and verify Edit button is available for Admin")
    public void clickOnSameGoalAndVerifyEditButtonIsAvailableForIndirectReport() throws InterruptedException {
        goalsSteps.clickOnSameGoalAndVerifyEditButtonIsAvailableForAdmin();
    }

    @Then("Verify Status should be clickable and current status for Admin")
    public void verifyStatusShouldBeClickableAndCurrentStatusForAdmin() {
        goalsSteps.verifyGoalStatusClickableAndCheckCurrentStatusForAdmin();
    }

    @Then("Click on Status and should not be clickable goal created by Admin")
    public void statusShouldNotClickableGoalCreatedByAdmin() {
        goalsSteps.statusShouldNotClickableByIndirectReport();
    }

    @Then("Click on same Goal and verify Edit button is not available Goal created by Admin")
    public void clickOnSameGoalAndVerifyEditButtonNotAvailableForIR() throws InterruptedException {
        goalsSteps.clickOnSameGoalAndVerifyEditButtonNotAvailableForIndirectReport();
    }

    @Then("Verify Status should not be clickable Goal created by Admin")
    public void verifyStatusShouldNotBeClickableGoalCreatedByAdmin() {
        goalsSteps.verifyStatusShouldNotBeClickableByIndirectReport();
    }

    @Then("Enter notes on the comment box")
    public void enterNotesCommentsOnTheCommentBox() {
        goalsSteps.enterCommentsOnTheCommentBox();
    }

    @Then("Click Add Note and verify the added comment")
    public void clickAddNoteAndVerifyTheAddedComment() throws InterruptedException {
        goalsSteps.clickAddNoteButtonAndVerifyTheAddedComment();
    }

    @Then("Verify the status of the goal can be changed by employee before Status Updatable date")
    public void verifyTheStatusOfTheGoalCanBeChangedByEmployeeBeforeStatusUpdatableDate() {
        goalsSteps.verifyStatusOfTheGoalCanBeChangedBeforeStatusUpdatableDate();

    }

    @Then("Change the status for Previous Goal to Open")
    public void changeTheStatusForPreviousGoalToOpen() throws InterruptedException {
        goalsSteps.changeStatusForPreviousGoalToOpen();
    }

    @Then("Verify the status of the goal can be changed via Goal list by employee before Status Updatable date")
    public void verifyTheStatusOfTheGoalCanBeChangedViaGoalListByEmployeeBeforeStatusUpdatableDate() {
        goalsSteps.verifyTheStatusOfTheGoalCanBeChangedViaGoalListByEmployee();

    }

    @Then("Click on Goals and select a Old Cycle {string}")
    public void clickOnGoalsAndSelectAOldCycle(String oldCycle) throws InterruptedException {
        goalsSteps.clickOnGoalsAndSelectAOldCycleByEmployee(oldCycle);
    }

    @Then("Click on the Goal employee created")
    public void clickOnTheGoalEmployeeCreated() throws InterruptedException {
        goalsSteps.clickOnTheGoalEmployeeCreatedForHim();
    }

    @Then("Verify message Status change is beyond cutoff")
    public void verifyMessageStatusChangeIsBeyondCutoff() {
        goalsSteps.verifyErrorMessageStatusChangeIsBeyondCutoff();
    }

    @Then("Verify message Status change is beyond cutoff on Goal List")
    public void verifyMessageStatusChangeIsBeyondCutoffOnGoalList() {
        goalsSteps.verifyErrorMessageStatusChangeIsBeyondCutoffOnGoalList();
    }

    @Then("Click on Previous Goal")
    public void clickOnPreviousGoal() {
        goalsSteps.clickOnPreviousGoalForEdit();
    }

    @Then("Click on Edit button, Update the necessary field and click on Save")
    public void clickOnEditButtonUpdateTheNecessaryFieldAndClickOnSave() throws InterruptedException {
        goalsSteps.clickEditButtonUpdateTheNecessaryFieldAndClickOnSave();
    }

    @Then("Verify that the goal is updated on or before the Editable Until date")
    public void verifyThatTheGoalIsUpdatedOnOrBeforeTheEditableUntilDate() {
        goalsSteps.verifyGoalIsUpdatedOnOrBeforeTheEditableUntilDate();
    }

    @Then("Verify goal cannot be edited after the Editable Until date")
    public void verifyGoalCannotBeEditedAfterTheEditableUntilDate() {
        goalsSteps.verifyGoalCannotBeEditedAfterTheEditableUntilDateByEmployee();

    }

    @Then("Verify keyresult textbox and button are displayed")
    public void verifyKeyresultTextboxAndButtonIsDisplayed() {
        goalsSteps.verifyKeyresultTextboxAndButtonIsDisplayed();
    }

    @Then("Verify that page is not redirected to goals page")
    public void verifyThatPageIsNotRedirectedToGoalsPage() {
        goalsSteps.verifyThatPageIsNotRedirectedToGoalsPage();
    }

    @Then("Verify that page is redirected to goals page")
    public void verifyThatPageIsRedirectedToGoalsPage() {
        goalsSteps.verifyThatPageIsRedirectedToGoalsPage();
    }

    @Then("Verify list of Direct report are displayed")
    public void verifyListOfDirectReportAreDisplayed() {
        goalsSteps.verifyListOfDirectReportAreDisplayed();
    }
}
