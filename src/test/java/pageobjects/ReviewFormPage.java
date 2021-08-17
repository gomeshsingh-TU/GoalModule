package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ReviewFormPage extends PageObject {

    @FindBy(xpath = "//button[@class='tu-button blue']")
    private WebElementFacade downloadResponsesButton;

    @FindBy(xpath = "//*[@id='primary-content']//select")
    private WebElementFacade reviewCycleDropdown;

    @FindBy(xpath = "//div[contains(text(),'Assessment is not active')]")
    private WebElementFacade notActiveAssessmentError;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//*[@id='rating']/select/option"),})
    private List<WebElement> reviewRatingDropdownOptions;

    @FindBy(xpath = "//*[contains(text(),'File generated.')]")
    private WebElementFacade fileDownloadedMessage;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "(//div[@class='review-container']/div)[1]//following::div[@class='question']/div"),})
    private List<WebElement> selfAssessmentQuestions;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "(//div[@class='review-container']/div)[2]//following::div[@class='question']/div"),})
    private List<WebElement> managerAssessmentQuestions;


    public boolean isReviewCycleDisplayedInDropdown(String arg) {
        boolean flag = false;

        Select sel = new Select(getDriver().findElement(By.xpath("//*[@id='primary-content']//select")));
        for (WebElement option : sel.getOptions()) {
            if (arg.equalsIgnoreCase(option.getText())) {
                flag = true;
                break;
            } else {
                continue;
            }
        }
        return flag;
    }

    public String getNotActiveAssessmentErrorMessage() {
        waitForCondition().until(ExpectedConditions.visibilityOf(notActiveAssessmentError));
        return notActiveAssessmentError.getText();
    }

    public List<WebElement> getReviewRatingOptions() {
        return reviewRatingDropdownOptions;
    }

    public List<WebElement> getSelfAssessmentQuestions() {
        return selfAssessmentQuestions;
    }

    public List<WebElement> getManagerAssessmentQuestions() {
        return managerAssessmentQuestions;
    }

    public void setReviewCycle(String cycle) {
        reviewCycleDropdown.selectByVisibleText(cycle);
    }

    public String getFileDownloadedMessage() throws InterruptedException {
        Thread.sleep(3000);
        waitForCondition().until(ExpectedConditions.visibilityOf(fileDownloadedMessage));
        return fileDownloadedMessage.getText();
    }

    public void clickDownloadResponse() {
        waitForCondition().until(ExpectedConditions.visibilityOf(downloadResponsesButton));
        downloadResponsesButton.click();
    }

}
