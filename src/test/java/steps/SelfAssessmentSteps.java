package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pageobjects.SelfAssessmentPage;

public class SelfAssessmentSteps {
    @Steps
    SelfAssessmentPage selfAssessmentPage;

    @Step()
    public void reviewCycleSelect(String cycle) {
        selfAssessmentPage.setReviewCycle(cycle);
    }

    @Step()
    public void clickOnCompleteAssessmentButton() {
        selfAssessmentPage.clickCompleteAssessment_SA();
    }

    @Step()
    public void verifyQuestionnaireSide() throws InterruptedException {
        Assert.assertEquals("Questionnaires are not at expected section", "Your Answer", selfAssessmentPage.getQuestionnaireSide());
    }

    @Step()
    public void verifySelfAssessmentType(String expectedType) {
        Assert.assertEquals("Assessment Type is not correct", expectedType, selfAssessmentPage.getAssessmentType());
    }

    @Step()
    public void selectOverallRating(String rating) {
        selfAssessmentPage.setOverallRating(rating);
    }

    @Step()
    public void answerQuestionnaires() {
        selfAssessmentPage.setAnswers();
    }

    @Step()
    public void verifyCompleteAssessmentButton() {
        selfAssessmentPage.verifyCompleteAssessment_SA();
    }

    @Step()
    public void clickOnBackButton() {
        selfAssessmentPage.clickBackButton();
    }

    @Step()
    public void clickOnSaveAsDraftButton() {
        selfAssessmentPage.clickSaveAsDraftButton();
    }

    @Step()
    public void clickOnSubmitButton() {
        selfAssessmentPage.clickSubmitButton();
    }

    @Step()
    public void verifyDate() {
        Assert.assertEquals("Date is Mismatch", selfAssessmentPage.getCurrentDate(), selfAssessmentPage.getDate());
    }

    @Step()
    public void verifyViewButton() {
        selfAssessmentPage.viewButtonDisplayed();
    }

    @Step()
    public void verifyNotAcknowledge() {
        Assert.assertEquals("It is acknowledged", "---", selfAssessmentPage.verifyAcknowledge());
    }

    @Step()
    public void clickOnViewButton() {
        selfAssessmentPage.clickViewButton();
    }

    @Step()
    public void VerifyEnteredAnswers() {
        selfAssessmentPage.verifyAnswers();
    }

    @Step()
    public void clickOnPendingButton() {
        selfAssessmentPage.clickPendingButton();
    }

    @Step()
    public void verifyAssessmentIsAcknowledged() {
        Assert.assertEquals("It is acknowledged", "Acknowledged", selfAssessmentPage.verifyAcknowledge());
    }
}
