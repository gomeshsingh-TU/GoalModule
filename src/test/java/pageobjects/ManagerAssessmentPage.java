package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ManagerAssessmentPage extends PageObject {

    @FindBy(xpath = "(//div[@class='review-container']/div)[2]/div[1]")
    private WebElementFacade questionnaireAtRightSide;

    @FindBy(xpath = "//*[contains(text(),'Save')]")
    private WebElementFacade saveButton;

    @FindBy(xpath = "//button[contains(text(),'Share')]")
    private WebElementFacade shareButton;

    @FindBy(xpath = "//button[contains(text(),'Acknowledge')]")
    private WebElementFacade acknowledgeButton;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[contains(text(),'Your answer')]//following::div[@class='answer']"),})
    private List<WebElement> enteredAnswerValue;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//*[@class='flex-table']//following::tr"),})
    private List<WebElement> listOfAllDirectReport;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//*[@class='question']/textarea"),})
    private List<WebElement> answerInputTextArea;


    public String getQuestionnaireSide() {
        return questionnaireAtRightSide.getText();
    }

    public void clickOnCompleteAssessment(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement completeAssessmentButton = card.findElement(By.xpath(".//td[@class='col-action']"));
        waitForCondition().until(ExpectedConditions.visibilityOf(completeAssessmentButton));
        completeAssessmentButton.click();
    }

    public void completeAssessmentIsDisplayed(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement completeAssessmentButton = card.findElement(By.xpath(".//td[@class='col-action']"));
        waitForCondition().until(ExpectedConditions.visibilityOf(completeAssessmentButton));
        assert completeAssessmentButton.isDisplayed();
    }

    public void editButtonIsDisplayed(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement editButton = card.findElement(By.xpath(".//td[@class='col-action']//child::span[contains(text(),'Edit')]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(editButton));
        assert editButton.isDisplayed();
    }

    public void shareButtonIsDisplayed(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement shareButton = card.findElement(By.xpath(".//td[@class='col-action']//child::span[contains(text(),'Share')]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(shareButton));
        assert shareButton.isDisplayed();
    }

    public void clickOnEditButton(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement editButton = card.findElement(By.xpath(".//td[@class='col-action']//child::span[contains(text(),'Edit')]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(editButton));
        editButton.click();
    }

    public void clickOnShareButton(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement shareButton = card.findElement(By.xpath(".//td[@class='col-action']//child::span[contains(text(),'Share')]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(shareButton));
        shareButton.click();
    }

    public String getDate(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement dateColumn = card.findElement(By.xpath(".//td[@class='col-date']"));
        waitForCondition().until(ExpectedConditions.visibilityOf(dateColumn));
        return dateColumn.getText();
    }

    public String verifyAcknowledge(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement acknowledgeColumn = card.findElement(By.xpath(".//td[@class='col-acknowledgement']"));
        waitForCondition().until(ExpectedConditions.visibilityOf(acknowledgeColumn));
        return acknowledgeColumn.getText();
    }

    public WebElement getDirectReportRowNumber(String name) {
        WebElement requiredCard = null;
        for (WebElement card : listOfAllDirectReport) {
            String actualName = card.findElement(By.xpath(".//td[@class='col-reviewee']")).getText();
            if (name.equalsIgnoreCase(actualName)) {
                requiredCard = card;
                break;
            } else {
                continue;
            }
        }
        return requiredCard;
    }

    public void clickSaveButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
    }

    public void clickShareButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(shareButton));
        shareButton.click();
    }

    public void clickAcknowledgeButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(acknowledgeButton));
        acknowledgeButton.click();
    }


    public void viewButtonIsDisplayed(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement viewButton = card.findElement(By.xpath(".//td[@class='col-action']//child::span[contains(text(),'View')]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(viewButton));
        assert viewButton.isDisplayed();
    }

    public void clickOnViewButton(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement viewButton = card.findElement(By.xpath(".//td[@class='col-action']//child::span[contains(text(),'View')]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(viewButton));
        viewButton.click();
    }

    public void verifyAnswers() {
        for (WebElement answerField : enteredAnswerValue) {
            Assert.assertEquals("Answer value doesn't match", "Test", answerField.getText());
        }
    }

    public void clickPendingButton(String directReportName) {
        WebElement card = getDirectReportRowNumber(directReportName);
        WebElement pendingButton = card.findElement(By.xpath(".//td[@class='col-acknowledgement']//child::span[contains(text(),'Pending')]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(pendingButton));
        pendingButton.click();
    }

    public boolean shareButtonIsNotDisplayed(String directReportName) {
        boolean flag = false;
        try{
        WebElement card = getDirectReportRowNumber(directReportName);
         WebElement shareButton = card.findElement(By.xpath(".//td[@class='col-action']//child::span[contains(text(),'Share')]"));
            if( shareButton.isDisplayed())
            {
                flag = false;
            }
        } catch (NoSuchElementException e ) {
            flag= true;
        }
        return flag;
    }

    public void setUpdatedAnswers() {
        for (WebElement answerText : answerInputTextArea) {
            answerText.clear();
            answerText.sendKeys("Testing");
        }
    }

    public void verifyUpdatedAnswers() {
        for (WebElement answerField : enteredAnswerValue) {
            Assert.assertEquals("Answer value doesn't match", "Testing", answerField.getText());
        }
    }


}






