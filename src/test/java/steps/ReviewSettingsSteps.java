package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pageobjects.ReviewSettingPage;

public class ReviewSettingsSteps {
    @Steps
    ReviewSettingPage reviewSettingPage;

    @Step("Click")
    public void navigate() throws InterruptedException {
        reviewSettingPage.navigateToReviewSettings();
    }

    @Step("Click")
    public void coverageDate(String expectedStartingDate, String expectedEndDate) throws InterruptedException {
        reviewSettingPage.selectCoverageDate(expectedStartingDate, expectedEndDate);
    }

    @Step("Select Review cycle")
    public void selectReviewCycle(String option) throws InterruptedException {
        reviewSettingPage.selectCycle(option);
    }

    @Step("Enter review cycle name")
    public void enterReviewCycleName(String cycleName) {
        reviewSettingPage.enterCycleName(cycleName);

    }

    @Step("Select IsActive options")
    public void selectIsActiveDropdownOption(String option) {
        reviewSettingPage.selectIsActiveDropdown(option);
    }

    @Step("Select Sharing Enabled options")
    public void selectSharingEnabledDropdownOption(String option) {
        reviewSettingPage.selectSharingEnabledDropdown(option);
    }

    @Step("Select IsListed options")
    public void selectIsListedDropdownOption(String option) {
        reviewSettingPage.selectIsListedDropdown(option);
    }

    @Step("Add Review Ratings")
    public void clickOnReviewRatings(int totalNumberOfRating) {
        int i = 1;
        while (i <= totalNumberOfRating) {
            reviewSettingPage.clickAddReviewRatingButton();
            i++;
        }
    }

    @Step("Add Self Assessment Questions")
    public void clickOnSelfAssessmentQuestions(int totalNumberOfQues) {
        int i = 1;
        while (i <= totalNumberOfQues) {
            reviewSettingPage.clickAddSelfAssessmentQuestionsButton();
            i++;
        }
    }

    @Step("Add Manager Assessment Questions")
    public void clickOnManagerAssessmentQuestions(int totalNumberOfQues) {
        int i = 1;
        while (i <= totalNumberOfQues) {
            reviewSettingPage.clickAddManagerAssessmentQuestionsButton();
            i++;
        }
    }

    @Step("Click on Save Button")
    public void clickOnSaveButton() {
        reviewSettingPage.clickSaveButton();
    }

    @Step("Enter values in Review Ratings")
    public void enterReviewRatings() {
        reviewSettingPage.enterReviewRatings();
    }

    @Step("Enter values in Review Ratings")
    public void enterSelfAssessment() {
        reviewSettingPage.enterSelfAssessmentQuestionnaires();
    }

    @Step("Enter values in Review Ratings")
    public void enterManagerAssessment() {
        reviewSettingPage.enterManagerAssessmentQuestionnaires();
    }

    @Step("Verify Error message for Review Cycle Name")
    public void verifyErrorForReviewCycleName(String expectedError) {
        Assert.assertEquals("Wrong Review Cycle Name error is displayed", expectedError, reviewSettingPage.getReviewCycleNameErrorMessage());
    }

    @Step("Verify Error message for Self Assessment Questions")
    public void verifyErrorForSelfAssessmentQuestions(String expectedError) {
        Assert.assertEquals("Wrong Review Cycle Name error is displayed", expectedError, reviewSettingPage.getSelfAssessmentQuestionsErrorMessage());
    }

    @Step("Verify Error message for Manager Assessment Questions")
    public void verifyErrorForManagerAssessmentQuestions(String expectedError) {
        Assert.assertEquals("Wrong Review Cycle Name error is displayed", expectedError, reviewSettingPage.getManagerAssessmentQuestionsErrorMessage());
    }

    @Step("Verify Error message for Review Rating")
    public void verifyErrorForReviewRating(String expectedError) {
        Assert.assertEquals("Wrong Review Cycle Name error is displayed", expectedError, reviewSettingPage.getReviewRatingErrorMessage());
    }

    @Step("Clear review cycle name")
    public void clearReviewCycleNameField() {
        reviewSettingPage.clearReviewCycleName();
    }

    @Step("Verify message for Review Cycle")
    public void verifyMessageForReviewCycleAdded(String expectedError) {
        Assert.assertEquals("Wrong Review Cycle Name error is displayed", expectedError, reviewSettingPage.getReviewCycleAddedMessage());
    }

    @Step("Click On Make a Copy Button")
    public void clickOnMakeACopyButton() {
        reviewSettingPage.clickMakeACopy();
    }

    @Step("Verify message for duplicate Review Cycle ")
    public void verifyMessageForDuplicateReviewCycle(String expectedError) {
        Assert.assertEquals("Wrong Review Cycle Name error is displayed", expectedError, reviewSettingPage.getDuplicateReviewCycleMessage());
    }
}
