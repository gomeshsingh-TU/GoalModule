package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ReviewFormSteps;

public class ReviewFormStepDefinitions {
    @Steps
    ReviewFormSteps reviewFormSteps;

    @And("Verify {string} no available as option")
    public void getReviewCycleDropdownOptions(String option) {
        reviewFormSteps.verifyReviewCycleDropdownValues(option);
    }

    @And("Select {string} Review Cycle")
    public void selectReviewCycle(String cycle) {
        reviewFormSteps.reviewCycleSelect(cycle);
    }

    @And("Verify {string} message displayed for not active review cycle")
    public void errorMessageForNotActiveReviewCycle(String message) {
        reviewFormSteps.verifyNotActiveReviewCycleError(message);
    }

    @Then("Verify {string} message is displayed on Successfully download")
    public void successfulDownloadedFile(String message) throws InterruptedException {
        reviewFormSteps.verifyFileDownloadMessage(message);
    }

    @And("click on Download Response button")
    public void clickOnDownloadResponseButton() {
        reviewFormSteps.clickDownloadResponseButton();
    }

    @And("Verify all the questions of Self Assessment")
    public void verifySelfAssessmentQuestions() {
        reviewFormSteps.verifyAllSelfAssessmentQuestions();
    }

    @And("Verify all the questions of Manager Assessment")
    public void verifyManagerAssessmentQuestions() {
        reviewFormSteps.verifyAllManagerAssessmentQuestions();
    }

    @And("Verify all the options are available for Review Ratings")
    public void verifyAllOptionsForReviewRatings() {
        reviewFormSteps.verifyAllReviewRatingOptions();
    }
}
