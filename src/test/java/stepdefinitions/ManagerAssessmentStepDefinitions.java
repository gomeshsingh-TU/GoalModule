package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pageobjects.SelfAssessmentPage;
import steps.ManagerAssessmentSteps;

public class ManagerAssessmentStepDefinitions {

    @Steps
    ManagerAssessmentSteps managerAssessmentSteps;
    SelfAssessmentPage selfAssessmentPage;

    @Then("Verify Manager Assessment Questionnaires are displayed in RHS")
    public void verifyManagerAssessmentQuestionnaireSide() {
        managerAssessmentSteps.verifyQuestionnaireSide();
    }


    @And("Click on Complete Assessment button for Direct report")
    public void clickOnCompleteAssessmentButton_MA() {
        managerAssessmentSteps.clickOnCompleteAssessmentForSpecificDirectReport();
    }

    @And("Verify Complete assessment button is still displayed in Action Column for Direct Report")
    public void verifyCompleteAssessmentButtonDisplayed_MA() {
        managerAssessmentSteps.verifyCompleteAssessmentButton();
    }

    @And("Verify Date column has today's date for Direct Report")
    public void verifyDateColumnForDirectReport() {
        managerAssessmentSteps.verifyDate();
    }

    @And("Verify Edit & Share buttons are displayed in Action Column")
    public void verifyEditAndShareButtonDisplayed() {
        managerAssessmentSteps.verifyEditAndShareButton();
    }

    @And("Click on Edit button for Direct report")
    public void clickOnEditButton_MA() {
        managerAssessmentSteps.clickOnEditButton();
    }

    @And("Click on Share button for Direct report")
    public void clickOnShareButton_MA() {
        managerAssessmentSteps.clickOnShareButton_MA();
    }

    @And("Verify Direct Assessment is not acknowledged")
    public void verifyAssessmentIsNotAcknowledged() {
        managerAssessmentSteps.verifyNotAcknowledge();
    }

    @And("Click On Save button")
    public void clickOnSaveButton_MA() {
        managerAssessmentSteps.clickOnSaveButton();
    }

    @And("Click on Share button")
    public void clickOnShareButton() {
        managerAssessmentSteps.clickOnShareButton();
    }

    @And("Verify View button is displayed in Action Column for the Direct Report")
    public void verifyViewButton_MA() {
        managerAssessmentSteps.verifyViewButton();
    }

    @And("Click on View button for Direct Report")
    public void clickOnViewButton() {
        managerAssessmentSteps.clickOnViewButton();
    }

    @And("Verify that previous answers are same as entered by Manager")
    public void verifyPreviousAnswers() {
        managerAssessmentSteps.verifyEnteredAnswers();
    }

    @And("Click on Pending button for Direct Report")
    public void clickOnPendingButton_MA() {
        managerAssessmentSteps.clickOnPendingButton();
    }

    @And("Click on Acknowledge")
    public void clickOnAcknowledge() {
        managerAssessmentSteps.clickOnAcknowledgeButton();
    }

    @And("Verify Direct Assessment is acknowledged")
    public void verifyAssessmentIsAcknowledged() {
        managerAssessmentSteps.verifyAssessmentIsAcknowledged();
    }

    @And("Verify Share button is not displayed in Action Column")
    public void VerifyShareButtonNotDisplayed() {
        managerAssessmentSteps.verifyShareButton();
    }

    @And("Update entered answers")
    public void updateAlreadyEnteredAnswers() {
        managerAssessmentSteps.updateEnteredAnswers();
    }

    @And("Verify the answers are updated one")
    public void VerifyAnswersAreUpdated() {
        managerAssessmentSteps.verifyUpdatedEnteredAnswers();
    }

}
