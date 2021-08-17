package stepdefinitions;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import steps.ReviewSettingsSteps;

public class ReviewSettingsStepDefinitions {
    @Steps
    ReviewSettingsSteps reviewSettingsSteps;

    @And("Navigate to Review Setting page")
    public void navigateToReviewSetting() throws InterruptedException {
        reviewSettingsSteps.navigate();
    }

    @And("Select {string} and {string} as Duration")
    public void selectCoverageDate(String expectedStartingDate, String expectedEndDate) throws InterruptedException {
        reviewSettingsSteps.coverageDate(expectedStartingDate, expectedEndDate);
    }

    @And("Select {string} in review cycle dropdown")
    public void selectReviewCycleDropDown(String option) throws InterruptedException {
        reviewSettingsSteps.selectReviewCycle(option);
    }

    @And("Enter {string} as review cycle name")
    public void enterReviewCycleName(String cycleName) {
        reviewSettingsSteps.enterReviewCycleName(cycleName);
    }

    @And("Select {string} in Is Active option")
    public void selectIsActiveOption(String option) {
        reviewSettingsSteps.selectIsActiveDropdownOption(option);
    }

    @And("Select {string} in Sharing Enabled option")
    public void selectSharingEnabledOption(String option) {
        reviewSettingsSteps.selectSharingEnabledDropdownOption(option);
    }

    @And("Select {string} in Is Listed option")
    public void selectIsListedOption(String option) {
        reviewSettingsSteps.selectIsListedDropdownOption(option);
    }

    @And("Add {int} Review Ratings")
    public void addReviewRations(int totalNumberOfRating) {
        reviewSettingsSteps.clickOnReviewRatings(totalNumberOfRating);
    }

    @And("Add {int} Self-Assessment questions")
    public void addSelfAssessmentQuestions(int totalNumberOfQues) {
        reviewSettingsSteps.clickOnSelfAssessmentQuestions(totalNumberOfQues);
    }

    @And("Add {int} Manager-Assessment questions")
    public void addManagerAssessmentQuestions(int totalNumberOfQues) {
        reviewSettingsSteps.clickOnManagerAssessmentQuestions(totalNumberOfQues);
    }

    @And("Click on Save button")
    public void clickOnSave() {
        reviewSettingsSteps.clickOnSaveButton();
    }

    @And("Enter Texts and Values to added Review Ratings")
    public void enterTextAndValuesToReviewRatings() {
        reviewSettingsSteps.enterReviewRatings();
    }

    @And("Enter Texts and IsRequired to added Self-Assessment questions")
    public void enterSelfAssessmentQuestions() {
        reviewSettingsSteps.enterSelfAssessment();
    }

    @And("Enter Texts and IsRequired to added Manager-Assessment questions")
    public void enterManagerAssessmentQuestions() {
        reviewSettingsSteps.enterManagerAssessment();
    }

    @And("Verify {string} error message displayed for review cycle name")
    public void reviewCycleNameErrorMessage(String expectedError) {
        reviewSettingsSteps.verifyErrorForReviewCycleName(expectedError);
    }

    @And("Verify {string} error message displayed for SA que")
    public void selfAssessmentErrorMessage(String expectedError) {
        reviewSettingsSteps.verifyErrorForSelfAssessmentQuestions(expectedError);
    }

    @And("Verify {string} error message displayed for MA que")
    public void managerAssessmentErrorMessage(String expectedError) {
        reviewSettingsSteps.verifyErrorForManagerAssessmentQuestions(expectedError);
    }

    @And("Verify {string} error message displayed for Review Rating")
    public void reviewRatingErrorMessage(String expectedError) {
        reviewSettingsSteps.verifyErrorForReviewRating(expectedError);
    }

    @And("Delete review cycle name")
    public void deleteReviewCycleName() {
        reviewSettingsSteps.clearReviewCycleNameField();
    }

    @And("verify Review cycle added and {string} message displayed")
    public void reviewCycleAddedMessage(String expectedError) {
        reviewSettingsSteps.verifyMessageForReviewCycleAdded(expectedError);
    }

    @And("click On Make a copy button")
    public void makeACopyOfReviewCycle() {
        reviewSettingsSteps.clickOnMakeACopyButton();
    }

    @And("Verify {string} message is displayed for duplicate Cycle creation")
    public void verifyDuplicateReviewCycleMessage(String expectedError) {
        reviewSettingsSteps.verifyMessageForDuplicateReviewCycle(expectedError);
    }

}
