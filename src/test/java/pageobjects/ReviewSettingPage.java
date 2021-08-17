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

public class ReviewSettingPage extends PageObject {

    @FindBy(xpath = "//div[@class='controls']//select")
    private WebElementFacade reviewCycleDropdown;

    @FindBy(xpath = "//div[contains(text(),'Review Cycle Name')]//following-sibling::input")
    private WebElementFacade reviewCycleNameInput;

    @FindBy(xpath = "//*[@class='datepicker clickable']/span")
    private WebElementFacade datePicker;

    @FindBy(xpath = "//div[@class='options']/div[1]//child::select")
    private WebElementFacade isActive;

    @FindBy(xpath = "//div[@class='options']/div[2]//child::select")
    private WebElementFacade sharingEnabled;

    @FindBy(xpath = "//div[@class='options']/div[3]//child::select")
    private WebElementFacade isListed;

    @FindBy(xpath = "//button[contains(text(),'Add Review Rating')]")
    private WebElementFacade addReviewRatingButton;

    @FindBy(xpath = "//button[contains(text(),'Add Self-Assessment Question')]")
    private WebElementFacade addSelfAssessmentQuestionButton;

    @FindBy(xpath = "//button[contains(text(),'Add Manager-Assessment Question')]")
    private WebElementFacade addManagerAssessmentQuestionButton;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElementFacade saveButton;

    @FindBy(xpath = "//button[contains(text(),'Back')]")
    private WebElementFacade backButton;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[@class='rating']"),})
    private List<WebElement> reviewRatings;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[contains(text(),'Self-Assessment Questions')]//following-sibling::div[@class='question']"),})
    private List<WebElement> selfAssessmentQuestions;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[contains(text(),'Manager-Assessment Questions')]//following-sibling::div[@class='question']"),})
    private List<WebElement> managerAssessmentQuestions;

    @FindBy(xpath = "//button[contains(text(),'Download Responses')]")
    private WebElementFacade downloadResponseButton;

    @FindBy(xpath = "//button[contains(text(),'Make a copy')]")
    private WebElementFacade makeCopyButton;

    @FindBy(xpath = "//div[@class='toasted toasted-primary error']")
    private WebElementFacade reviewCycleError;

    @FindBy(xpath = "//div[contains(text(),'There should be at least 1 Self-Assessment')]")
    private WebElementFacade selfQuestionsError;

    @FindBy(xpath = "//div[contains(text(),'There should be at least 1 Manager-Assessment')]")
    private WebElementFacade managerQuestionsError;

    @FindBy(xpath = "//div[contains(text(),'There should be at least 2 ratings')]")
    private WebElementFacade reviewRatingsError;

    @FindBy(xpath = "//div[@id='profile-icon']")
    private WebElementFacade profileIcon;

    @FindBy(xpath = "//*[contains(text(),'Manage Reviews')]")
    private WebElementFacade manageReviewsOption;

    @FindBy(xpath = "//div[contains(text(),'Performance Review Saved.')]")
    private WebElementFacade reviewCycleAddedMessage;

    @FindBy(xpath = "//div[contains(text(),'has been duplicated.')]")
    private WebElementFacade duplicateReviewCycleMessage;

    public String[] ratingsText = {"Insufficient", "Below expectations", "Meet expectations, great job", "Exceeded Expectations, outstanding job", "Exceeded expectations by far"};
    public String[] ratingsValue = {"1", "2", "3", "4", "5"};
    public String[] selfAssessmentQue = {"Que1", "Que2", "Que3", "Que4", "Que5"};
    public String[] managerAssessmentQue = {"Que1", "Que2", "Que3", "Que4", "Que5"};

    public void navigateToReviewSettings() {
        waitForCondition().until(ExpectedConditions.visibilityOf(profileIcon));
        profileIcon.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(manageReviewsOption));
        manageReviewsOption.click();
    }

    public void selectCycle(String option) throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(reviewCycleDropdown));
        Thread.sleep(500);
        reviewCycleDropdown.selectByVisibleText(option);
    }

    public void enterCycleName(String cycleName) {
        waitForCondition().until(ExpectedConditions.visibilityOf(reviewCycleNameInput));
        reviewCycleNameInput.sendKeys(cycleName);
    }

    public void selectCoverageDate(String expectedStartingDate, String expectedEndDate) throws InterruptedException {

        String[] startingDate = expectedStartingDate.split(" ");
        String[] endDate = expectedEndDate.split(" ");
        waitForCondition().until(ExpectedConditions.visibilityOf(datePicker));
        datePicker.click();
        WebElement calenderTitle = getDriver().findElement(By.xpath("//*[@class='vc-title-wrapper']"));
        waitForCondition().until(ExpectedConditions.visibilityOf(calenderTitle));
        calenderTitle.click();
        WebElement currentYear = getDriver().findElement(By.xpath("//*[@class='vc-nav-container']/div[1]/div[2]/span"));
        waitForCondition().until(ExpectedConditions.visibilityOf(currentYear));
        WebElement nextYear = getDriver().findElement(By.xpath("(//*[@class='vc-nav-container']//child::*[@class='vc-svg-icon'])[2]"));
            waitForCondition().until(ExpectedConditions.visibilityOf(nextYear));
            Thread.sleep(5000);
            nextYear.click();
        List<WebElement> months = getDriver().findElements(By.xpath("(//*[@class='vc-grid-container'])[2]/div/span"));
        for (WebElement month : months) {
            waitForCondition().until(ExpectedConditions.visibilityOf(month));
            if (startingDate[0].contains(month.getText())) {
                month.click();
                break;
            }
        }
        Thread.sleep(1000);
        WebElement day = getDriver().findElement(By.xpath("(//div[@class='vc-pane'])[1]/div[2]//child::span[contains(@aria-label,'" + startingDate[0] + "') and contains(text(),'" + startingDate[1] + "')]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(day));
        day.click();
        while (true) {
            WebElement currentMonthDisplayed = getDriver().findElement(By.xpath("//*[@class='vc-title-wrapper']/div[1]"));
            waitForCondition().until(ExpectedConditions.visibilityOf(currentMonthDisplayed));
            if (currentMonthDisplayed.getText().contains(endDate[0]) && currentMonthDisplayed.getText().contains(endDate[2])) {
                break;
            }
            WebElement nextMonth = getDriver().findElement(By.xpath("//*[@class='vc-arrows-container title-center']/div[2]"));
            waitForCondition().until(ExpectedConditions.visibilityOf(nextMonth));
            nextMonth.click();
            Thread.sleep(1000);
        }
        WebElement endDay = getDriver().findElement(By.xpath("(//*[@class='vc-pane'])[1]/div[2]//child::span[contains(@aria-label,'" + endDate[0] + "') and contains(text(),'" + endDate[1] + "')]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(endDay));
        endDay.click();

    }

    public void selectIsActiveDropdown(String option) {
        waitForCondition().until(ExpectedConditions.visibilityOf(isActive));
        isActive.selectByVisibleText(option);
    }

    public void selectSharingEnabledDropdown(String option) {
        waitForCondition().until(ExpectedConditions.visibilityOf(sharingEnabled));
        sharingEnabled.selectByVisibleText(option);
    }

    public void selectIsListedDropdown(String option) {
        waitForCondition().until(ExpectedConditions.visibilityOf(isListed));
        isListed.selectByVisibleText(option);
    }

    public void clickAddReviewRatingButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(addReviewRatingButton));
        addReviewRatingButton.click();
    }

    public void clickAddSelfAssessmentQuestionsButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(addSelfAssessmentQuestionButton));
        addSelfAssessmentQuestionButton.click();
    }

    public void clickAddManagerAssessmentQuestionsButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(addManagerAssessmentQuestionButton));
        addManagerAssessmentQuestionButton.click();
    }

    public void clickSaveButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
    }

    public void enterReviewRatings() {
        int i = 0;
        for (WebElement rating : reviewRatings) {
            rating.findElement(By.xpath(".//div[@class='form-field']//input")).sendKeys(ratingsText[i]);
            rating.findElement(By.xpath(".//div[@class='rating-value form-field']//input")).sendKeys(ratingsValue[i]);
            i++;
        }
    }

    public void enterSelfAssessmentQuestionnaires() {
        int i = 0;
        for (WebElement selfAssessment : selfAssessmentQuestions) {
            selfAssessment.findElement(By.xpath(".//div[@class='form-field']//input")).sendKeys(selfAssessmentQue[i]);
            Select select = new Select(selfAssessment.findElement(By.xpath(".//div[@class='form-field']//select")));
            select.selectByVisibleText("True");
            i++;
        }
    }

    public void enterManagerAssessmentQuestionnaires() {
        int i = 0;
        for (WebElement managerAssessment : managerAssessmentQuestions) {
            managerAssessment.findElement(By.xpath(".//div[@class='form-field']//input")).sendKeys(managerAssessmentQue[i]);
            Select select = new Select(managerAssessment.findElement(By.xpath(".//div[@class='form-field']//select")));
            select.selectByVisibleText("True");
            i++;
        }
    }

    public String getReviewCycleNameErrorMessage() {
        waitForCondition().until(ExpectedConditions.visibilityOf(reviewCycleError));
        return reviewCycleError.getText();
    }

    public void clearReviewCycleName() {
        waitForCondition().until(ExpectedConditions.visibilityOf(reviewCycleNameInput));
        reviewCycleNameInput.clear();
    }

    public String getSelfAssessmentQuestionsErrorMessage() {
        waitForCondition().until(ExpectedConditions.visibilityOf(selfQuestionsError));
        return selfQuestionsError.getText();
    }

    public String getManagerAssessmentQuestionsErrorMessage() {
        waitForCondition().until(ExpectedConditions.visibilityOf(managerQuestionsError));
        return managerQuestionsError.getText();
    }

    public String getReviewRatingErrorMessage() {
        waitForCondition().until(ExpectedConditions.visibilityOf(reviewRatingsError));
        return reviewRatingsError.getText();
    }

    public String getReviewCycleAddedMessage() {
        waitForCondition().until(ExpectedConditions.visibilityOf(reviewCycleAddedMessage));
        return reviewCycleAddedMessage.getText();
    }

    public void clickMakeACopy() {
        waitForCondition().until(ExpectedConditions.visibilityOf(makeCopyButton));
        makeCopyButton.click();
    }

    public String getDuplicateReviewCycleMessage() {
        waitForCondition().until(ExpectedConditions.visibilityOf(duplicateReviewCycleMessage));
        return duplicateReviewCycleMessage.getText();
    }

}
