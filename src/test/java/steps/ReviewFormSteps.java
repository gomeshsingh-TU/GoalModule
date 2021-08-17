package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pageobjects.ReviewFormPage;
import pageobjects.ReviewSettingPage;

public class ReviewFormSteps {
    @Steps
    ReviewFormPage reviewFormPage;
    ReviewSettingPage reviewSettingPage;

    @Step()
    public void verifyReviewCycleDropdownValues(String option) {
        Assert.assertFalse("Review Cycle Displayed in the Dropdown", reviewFormPage.isReviewCycleDisplayedInDropdown(option));
    }

    @Step()
    public void reviewCycleSelect(String cycle) {
        reviewFormPage.setReviewCycle(cycle);
    }

    @Step()
    public void verifyNotActiveReviewCycleError(String message) {
        Assert.assertEquals("Error message doesn't match", message, reviewFormPage.getNotActiveAssessmentErrorMessage());
    }

    @Step("Verify Successful message of file downloaded")
    public void verifyFileDownloadMessage(String expectedError) throws InterruptedException {
        Assert.assertEquals("Wrong Review Cycle Name error is displayed", expectedError, reviewFormPage.getFileDownloadedMessage());
    }

    @Step("Click on Download Response Button")
    public void clickDownloadResponseButton() {
        reviewFormPage.clickDownloadResponse();
    }

    @Step("Verify all the Self assessment questions")
    public void verifyAllSelfAssessmentQuestions() {
        int i = 0;
        for (WebElement option : reviewFormPage.getSelfAssessmentQuestions()) {
            Assert.assertEquals("Review Rating Options are Mismatched", (i + 1) + ". " + reviewSettingPage.selfAssessmentQue[i], option.getText());
            i++;

        }
    }

    @Step("Verify all the Manager assessment questions")
    public void verifyAllManagerAssessmentQuestions() {
        int i = 0;
        for (WebElement option : reviewFormPage.getManagerAssessmentQuestions()) {
            Assert.assertEquals("Review Rating Options are Mismatched", (i + 1) + ". " + reviewSettingPage.managerAssessmentQue[i], option.getText());
            i++;
        }
    }

    @Step("Verify all Review Rating options")
    public void verifyAllReviewRatingOptions() {
        int i = 1;
        for (WebElement option : reviewFormPage.getReviewRatingOptions()) {
            Assert.assertEquals("Review Rating Options are Mismatched", reviewSettingPage.ratingsValue[i] + " - " + reviewSettingPage.ratingsText[i], option);
            i++;

        }
    }

}
