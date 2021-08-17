package stepdefinitions.GoalsUpdatedStepdefinitions;

import common.DBHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.GoalsUpdatedSteps.GoalsUpdatedSteps;

public class GoalsSettingStepDefinitions {

    @Steps
    GoalsUpdatedSteps goalsUpdatedSteps;

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

    @Then("input data in description field")
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
}
