package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SelfAssessmentPage extends PageObject {

    @FindBy(xpath = "//div[@class='header top']//select")
    private WebElementFacade reviewCycle;

    @FindBy(xpath = "(//table[@class='flex-table']//following::tr)[1]//*[contains(text(),'Complete Assessment')]")
    private WebElementFacade completeAssessmentButton;

    @FindBy(xpath = "(//div[@class='review-container']/div)[1]/div[1]")
    private WebElementFacade questionnaireAtLeftSide;

    @FindBy(xpath = "//*[@id='form']/div[2]/div[2] | not[contains(text(),'Type')]")
    private WebElementFacade assessmentType;

    @FindBy(xpath = "//*[@id='rating']/select")
    private WebElementFacade selectOverallRating;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//*[@class='question']/textarea"),})
    private List<WebElement> answerInputTextArea;

    @FindBy(xpath = "//button[contains(text(),'Back')]")
    private WebElementFacade backButton;

    @FindBy(xpath = "//button[contains(text(),'Save as Draft')]")
    private WebElementFacade saveAsDraftButton;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElementFacade submitButton;

    @FindBy(xpath = "(//table[@class='flex-table']//following::tr)[1]//td[@class='col-date']")
    private WebElementFacade dateColumn;

    @FindBy(xpath = "(//table[@class='flex-table']//following::tr)[1]//span[contains(text(),'View')]")
    private WebElementFacade viewButton;

    @FindBy(xpath = "(//table[@class='flex-table']//following::tr)[1]//td[@class='col-acknowledgement']/div/span/span")
    private WebElementFacade acknowledgeColumn;

    @FindBy(xpath = "(//table[@class='flex-table']//following::tr)[1]//span[contains(text(),'Pending')]")
    private WebElementFacade pendingButton;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[@class='answer']"),})
    private List<WebElement> enteredAnswerValue;


    public void setReviewCycle(String cycle) {
        reviewCycle.selectByVisibleText(cycle);
    }

    public void clickCompleteAssessment_SA() {
        completeAssessmentButton.click();
    }

    public String getQuestionnaireSide() throws InterruptedException {
        Thread.sleep(3000);
        return questionnaireAtLeftSide.getText();
    }

    public String getAssessmentType() {
        waitForCondition().until(ExpectedConditions.visibilityOf(assessmentType));
        return assessmentType.getText().substring(4).trim();
    }

    public void setOverallRating(String rating) {
        selectOverallRating.selectByVisibleText(rating);
    }

    public void setAnswers() {
        for (WebElement answerText : answerInputTextArea) {
            answerText.sendKeys("Test");
        }

    }

    public void clickBackButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(backButton));
        backButton.click();
    }

    public void clickSubmitButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(submitButton));
        submitButton.click();
    }

    public void clickPendingButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(pendingButton));
        pendingButton.click();
    }

    public void clickSaveAsDraftButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(saveAsDraftButton));
        saveAsDraftButton.click();
    }

    public void verifyCompleteAssessment_SA() {
        waitForCondition().until(ExpectedConditions.visibilityOf(completeAssessmentButton));
        assert completeAssessmentButton.isCurrentlyVisible();
    }

    public String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
        Date date = new Date();
        return formatter.format(date);
    }

    public String getDate() {
        waitForCondition().until(ExpectedConditions.visibilityOf(dateColumn));
        return dateColumn.getText();
    }

    public void viewButtonDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf(viewButton));
        assert viewButton.isCurrentlyVisible();
    }

    public String verifyAcknowledge() {
        waitForCondition().until(ExpectedConditions.visibilityOf(acknowledgeColumn));
        return acknowledgeColumn.getText();
    }

    public void clickViewButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(viewButton));
        viewButton.click();
    }

    public void verifyAnswers() {
        for (WebElement answerField : enteredAnswerValue) {
            Assert.assertEquals("Answer value doesn't match", "Test", answerField.getText());
        }
    }
}
