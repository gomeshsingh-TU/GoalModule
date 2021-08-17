package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.SelfAssessmentSteps;

public class SelfAssessmentStepDefinitions {

    @Steps
    SelfAssessmentSteps selfAssessmentSteps;


    @And("Select Review Cycle")
    public void selectReviewCycle(String arg) {
        selfAssessmentSteps.reviewCycleSelect(arg);
    }

    @And("Click on Complete Assessment button for Self Assessment")
    public void clickOnCompleteAssessmentButton_SA() {
        selfAssessmentSteps.clickOnCompleteAssessmentButton();
    }

    @And("Verify Self Assessment Questionnaires are displayed in LHS")
    public void verifySelfAssessmentQuestionnairesDisplayedAtLHS() throws InterruptedException {
        selfAssessmentSteps.verifyQuestionnaireSide();
    }

    @And("Verify Assessment type as {string}")
    public void verifyAssessmentType(String arg) {
        selfAssessmentSteps.verifySelfAssessmentType(arg);
    }

    @And("Select Overall Rating as {string}")
    public void selectOverallRating(String arg) {
        selfAssessmentSteps.selectOverallRating(arg);
    }

    @And("Answer all the questionnaires")
    public void answerAllQuestionnaires() {
        selfAssessmentSteps.answerQuestionnaires();
    }

    @Then("Verify Complete assessment button is still displayed in Action Column")
    public void verifyCompleteAssessmentButtonStillDisplayed() {
        selfAssessmentSteps.verifyCompleteAssessmentButton();
    }

    @And("Click on Back button")
    public void clickOnBackButton() {
        selfAssessmentSteps.clickOnBackButton();
    }

    @And("Click on Submit button")
    public void clickOnSubmitButton() {
        selfAssessmentSteps.clickOnSubmitButton();
    }

    @And("Click on Save as Draft button")
    public void clickOnSaveAsDraftButton() {
        selfAssessmentSteps.clickOnSaveAsDraftButton();
    }

    @And("Verify Date column has today's date")
    public void verifyDateColumnHasTodayDate() {
        selfAssessmentSteps.verifyDate();
    }

    @And("Verify View button is displayed in Action Column")
    public void verifyViewButtonIsDisplayed() {
        selfAssessmentSteps.verifyViewButton();
    }

    @And("Verify Manager Assessment is not acknowledged")
    public void verifyItIsNotAcknowledged() {
        selfAssessmentSteps.verifyNotAcknowledge();
    }

    @And("Click on View button for Self Assessment")
    public void clickOnViewButton_SA() {
        selfAssessmentSteps.clickOnViewButton();
    }

    @And("Verify that previous answers are same as entered")
    public void verifyPreviousAnswers() {
        selfAssessmentSteps.VerifyEnteredAnswers();
    }

    @And("Click on Pending button for Self Assessment")
    public void clickOnPendingButton_SA() {
        selfAssessmentSteps.clickOnPendingButton();
    }


    @And("Verify Manager Assessment is acknowledged")
    public void verifyAssessmentIsAcknowledged() {
        selfAssessmentSteps.verifyAssessmentIsAcknowledged();
    }
}
