package pageobjects.GoalsUpdatedPageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.*;

public class GoalsPage extends PageObject {

    String randomCycleName;
    Select select;
    String statusCutOffdate;
    String editCutOffdate;
    String goalPageStatusValue;
    String sampleNoteText;
    String goalDetailsStatus;
    String goalListStatus;
    String editGoalDescText;

    @FindBy(css = "svg.name-icon")
    private WebElementFacade initialsIconUpperRight;

    @FindBy(xpath = "//div[@class='option' and text()='Manage Goals']")
    private WebElementFacade profileOptionManageGoalsSetting;

    @FindBy(xpath = "//*[@id=\"cycles\"]")
    private WebElementFacade manageGoalsCycleDropDown;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/button")
    private WebElementFacade manageGoalsAddCycleButton;

    @FindBy(xpath = "//*[@id=\"cycle-editor\"]/div[1]/input")
    private WebElementFacade manageGoalsCycleNameInput;

    @FindBy(xpath = "//*[@id=\"cycle-editor\"]/div[2]/div[1]/div[2]/span/svg")
    private WebElementFacade manageGoalsStartDateIcon;

    @FindBy(xpath = "//*[@id=\"cycle-editor\"]/div[2]/div[1]/div[2]/div")
    private WebElementFacade manageGoalsStartDateField;

    @FindBy(xpath = "//*[@id=\"cycle-editor\"]/div[2]/div[2]/div[2]/span/svg/path")
    private WebElementFacade manageGoalsEndDate;

    @FindBy(xpath = "(//div[@class='slot'])[3]//child::*[@data-icon='calendar-alt']")
    private WebElementFacade manageGoalsStatusChangeCutoff;

    @FindBy(xpath = "(//div[@class='slot'])[4]//child::*[@data-icon='calendar-alt']")
    private WebElementFacade manageGoalsEditCutoff;

    @FindBy(xpath = "//*[@id=\"cycle-editor\"]/div[4]/select")
    private WebElementFacade manageGoalsIsListed;

    @FindBy(xpath = "//*[@id=\"cycle-editor\"]/div[5]/button[1]")
    private WebElementFacade manageGoalsCancelButton;

    @FindBy(xpath = "//*[@id=\"cycle-editor\"]/div[5]/button[2]")
    private WebElementFacade manageGoalsSaveButton;

    @FindBy(xpath = "//*[@id=\"cycles\"]")
    private WebElementFacade manageGoalsCycleNameDropDown;

    @FindBy(xpath = "//div[@class='vc-pane-container']//following::div[@class='vc-arrow'][2]")
    private WebElementFacade statusChangeCutoffNextMonthButton;

    @FindBy(xpath = "//*[contains(@aria-label,'15')]")
    private WebElementFacade statusChangeCutoffNextMonthDatePick;

    @FindBy(xpath = "//div[@class='vc-pane-container']//following::div[@class='vc-arrow'][2]")
    private WebElementFacade EditCutoffNextMonthButton;

    @FindBy(xpath = "//*[contains(@aria-label,'15')]")
    private WebElementFacade EditCutoffNextMonthDatePick;

    @FindBy(xpath = "//*[@id=\"cycle-editor\"]/div[3]/div[1]/div[2]/div")
    private WebElementFacade StatusChangeCutoffDateInput;

    @FindBy(xpath = "//*[@id=\"cycle-editor\"]/div[3]/div[2]/div[2]/div")
    private WebElementFacade EditCutoffDateInput;

    @FindBy(xpath = "//*[@id=\"cycle-editor\"]")
    private WebElementFacade pageClick;

    @FindBy(xpath = "//div[contains(text(),'Start Date')]")
    private WebElementFacade startDate;
    /*************************************************************
     * Create Goals Module locators are started here
     */

    @FindBy(xpath = "//*[@id=\"nav-side\"]/div[5]/a/div[1]/img")
    private WebElementFacade clickOnGoalsOption;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/button")
    private WebElementFacade clickOnCreateGoalButton;

    @FindBy(xpath = "//*[@id=\"participants\"]/div[2]/div[2]/div")
    private WebElementFacade selectYourNameOption;

    @FindBy(xpath = "//div[contains(text(),'Ashish Agrawal')]")
    private WebElementFacade selectDirectReportNameOption;

    @FindBy(xpath = "//*[@id=\"participants\"]/div[4]/div[2]/input")
    private WebElementFacade searchEmployeeNameInputBox;

    @FindBy(xpath = "//*[@id=\"participants\"]/div[4]/div[3]/div")
    private WebElementFacade searchedEmployeeNameSelect;

    @FindBy(xpath = "//*[@id=\"participants\"]/div[5]/button")
    private WebElementFacade newGoalPopupCancelButton;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div/div[3]/input")
    private WebElementFacade createGoalsTitleInput;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div/div[4]/textarea")
    private WebElementFacade createGoalsDescriptionText;

    @FindBy(xpath = "//*[@id=\"action-items\"]/div[3]/textarea")
    private WebElementFacade createGoalsAddKeyResultText;

    @FindBy(xpath = "//*[@id=\"action-items\"]/div[3]/div/button")
    private WebElementFacade createGoalsKeyResultAddSaveButton;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div/div[6]/span/div[1]")
    private WebElementFacade createGoalsDueDate;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div/div[7]/button[1]")
    private WebElementFacade createGoalsCancelButton;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div/div[7]/button[2]")
    private WebElementFacade createGoalsSaveButton;

    // You must provide a title to this goal.
    @FindBy(xpath = "//div[contains(text(),'You must provide a title to this goal.')]")
    private WebElementFacade createGoalsTitleFieldBlankErrorMsg;

    // You must provide description to this goal.
    @FindBy(xpath = "//div[contains(text(),'You must provide description to this goal.')]")
    private WebElementFacade createGoalsDescriptionFieldBlankErrorMsg;

    // You must provide at least 1 key result to this goal.
    @FindBy(xpath = "//div[contains(text(),'You must provide at least 1 key result to this goal.')]")
    private WebElementFacade createGoalsKeyResultFieldBlankErrorMsg;

    @FindBy(xpath = "//span[contains(text(),'Automation Test Goal')]")
    private WebElementFacade createGoalsNewGoalNameAddVerify;

    @FindBy(xpath = "//span[@class='title' and text()='TM Self Goal']")
    private WebElementFacade createGoalsNewGoalNameAddVerifyForTM;

    @FindBy(xpath = "//span[contains(text(),'Direct Report Goal')]")
    private WebElementFacade createGoalsNewGoalNameAddVerifyForDirectReport;

    @FindBy(xpath = "//span[contains(text(),'Indirect Report Goal')]")
    private WebElementFacade createGoalsNewGoalNameAddVerifyForIndirectReport;

    @FindBy(xpath = "//*[@id=\"nav-heading\"]/div")
    private WebElementFacade createGoalsHomePageTitle;


    /*************************************************************
     * View Goals Module locators are started here
     */

    @FindBy(xpath = "//span[contains(text(),'Previous Cycle Goal')]")
    private WebElementFacade viewGoalsSelectPreviousCycleGoal;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[2]/div[2]/div[2]")
    private WebElementFacade viewGoalsPreviousCycleGoalClickOnStatusDropdown;

    @FindBy(xpath = "//*[@id=\"statuses\"]/div[3]")
    private WebElementFacade viewGoalsPreviousCycleGoalSelectCompleted;

    @FindBy(xpath = "//*[@id=\"statuses\"]/div[1]")
    private WebElementFacade viewGoalsPreviousCycleGoalSelectOpen;


    /*************************************************************
     * Edit Goals Module locators are started here
     */

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[2]/div[1]/div[1]/span[1]")
    private WebElementFacade editGoalsClickOnFirstGoal;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[1]/div[1]")
    private WebElementFacade editGoalsPageTitle;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[1]/div[2]")
    private WebElementFacade editGoalsPageDueDate;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[1]/div[3]")
    private WebElementFacade editGoalsPageGoalDescription;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[1]/div[5]/div/textarea")
    private WebElementFacade editGoalsPageAddCommentText;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[1]/div[5]/div/div[2]/button")
    private WebElementFacade editGoalsPageAddNoteButton;

    @FindBy(xpath = "//button[contains(text(),'Back')]")
    private WebElementFacade editGoalsPageBackButton;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[2]/div[1]/button")
    private WebElementFacade editGoalsPageEditButton;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[2]/div[2]/div[2]")
    private WebElementFacade editGoalsPageStatusList;

    @FindBy(xpath = "//*[@id=\"tippy-1\"]/div")
    private WebElementFacade editGoalsPageStatus;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[2]/div[3]/div[2]")
    private WebElementFacade editGoalsPageCycleName;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[2]/div[4]/div[1]")
    private WebElementFacade editGoalsPageEditableUntilField;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[2]/div[5]/div[1]")
    private WebElementFacade editGoalsPageStatusUpdatableUntil;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[2]/div[1]/div[1]/div")
    private WebElementFacade editGoalsPageStatusButton;

    @FindBy(xpath = "//span[@class='title' and text()='TM Self Goal']")
    private WebElementFacade editGoalsTMSelfGoal;

    @FindBy(xpath = "//span[contains(text(),'Direct Report Goal')]")
    private WebElementFacade editGoalsISGoalForTM;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[2]/div[4]/div[1]/div")
    private WebElementFacade editGoalsPageStatusButtonForIS;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[2]/div[1]/div[2]")
    private WebElementFacade editGoalsPageStatusButtonNotClickable;

    @FindBy(xpath = "//span[contains(text(),'Indirect Report Goal')]")
    private WebElementFacade editGoalsAdminGoalForIndirectReport;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[2]/div[1]/div[1]/div")
    private WebElementFacade editGoalsPageStatusButtonForAdmin;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[2]/div[5]/div[1]/div")
    private WebElementFacade editGoalsPageStatusButtonForIR;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[1]/div[5]/div/textarea")
    private WebElementFacade editGoalsPageAddNoteTextArea;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[1]/div[5]/div/div[2]/button")
    private WebElementFacade editGoalsPageAddCommentButton;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[1]/div[5]/div[2]/div[2]")
    private WebElementFacade editGoalsPageVerifyAddedCommentText;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[2]/div[1]/div[1]/div")
    private WebElementFacade editGoalsPageClickOnStatusOnGoalList;

    @FindBy(xpath = "//*[@id=\"statuses\"]/div[1]")
    private WebElementFacade editGoalsPageSelectStatusOnGoalList;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[2]/div[1]/div[1]/span[1]")
    private WebElementFacade editGoalsPageOldGoal;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[2]/div[2]/div[2]")
    private WebElementFacade editGoalsPageOldGoalDetailsStatusButton;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[2]/div[1]/div[1]/div")
    private WebElementFacade editGoalsPageOldGoalListStatusButton;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div/div[4]/textarea")
    private WebElementFacade editGoalsPageGoalDescriptionText;

    @FindBy(xpath = "//*[@id=\"primary-content\"]/div[1]/div[1]/div[3]")
    private WebElementFacade editGoalsPageGoalListDescText;

    @FindBy(xpath = "//div[contains(text(),'Status change is beyond cutoff.')]")
    private WebElementFacade statusChangeErrorStatusButton;

    @FindBy(xpath = "//div[contains(text(),'Edit is beyond cutoff.')]")
    private WebElementFacade editIsBeyondCutoffErrorEditButton;


    public void clickInitialsIconUpperRight() {
        initialsIconUpperRight.click();
    }

    public void clickManageGoalsOption() {
        profileOptionManageGoalsSetting.click();
    }

    public void clickOnAddCycle() {
        manageGoalsAddCycleButton.click();
    }

    public void fillValueInFields() {
        //cycle name value
        Random random = new Random();
        int randomInt = random.nextInt(999);
        randomCycleName = "AutoTest" + randomInt;
        manageGoalsCycleNameInput.sendKeys(randomCycleName);
    }

    public void clickOnCreateCycleCancelButton() {
        manageGoalsCancelButton.click();
    }

    public void verifyCycleNameNotInTheDropDownList() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(manageGoalsCycleDropDown));
        Thread.sleep(500);
        select = new Select(manageGoalsCycleNameDropDown);
        List<WebElement> all_options = select.getOptions();
        boolean found = false;
        for (WebElement cycleName : all_options) {
            if (randomCycleName.equalsIgnoreCase(cycleName.getText())) {
                found = true;
                break;
            }
        }
        Assert.assertFalse(found);
    }

    public void clickOnCycleAddButton() {
        waitABit(3000);
        manageGoalsSaveButton.click();
        waitABit(3000);
    }

    public void verifyCycleNamePresentInDropDownList() {

        select = new Select(manageGoalsCycleNameDropDown);
        List<WebElement> all_options = select.getOptions();
        boolean found = false;
        for (WebElement cycleName : all_options) {
            if (randomCycleName.equalsIgnoreCase(cycleName.getText().trim())) {
                found = true;
                break;
            }
        }

        Assert.assertTrue("Cycle Name is not Present in the Dropdown", found);
    }

    public void selectExistingCycleAndUpdateIt() throws InterruptedException {

        waitForCondition().until(ExpectedConditions.visibilityOf(manageGoalsCycleDropDown));
        Thread.sleep(500);
        String cycleName = manageGoalsCycleDropDown.getSelectOptions().get(2).trim();
        manageGoalsCycleDropDown.selectByVisibleText(cycleName);

        // updating Cycle Name
        manageGoalsCycleNameInput.clear();
        Random random = new Random();
        int randomInt = random.nextInt(999);
        randomCycleName = cycleName + randomInt;
        manageGoalsCycleNameInput.sendKeys(randomCycleName);
    }

    public void selectGoalCycle() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(manageGoalsCycleDropDown));
        Thread.sleep(500);

        String cycleName = manageGoalsCycleDropDown.getSelectOptions().get(2).trim();
        manageGoalsCycleDropDown.selectByVisibleText(cycleName);
        Thread.sleep(500);
        pageClick.waitUntilClickable();
        pageClick.setWindowFocus();
        pageClick.waitUntilPresent();
        pageClick.waitUntilVisible();

    }

    public void ChangeDateInStatusChangeCutoffField() throws InterruptedException {
        manageGoalsStatusChangeCutoff.click();
        statusChangeCutoffNextMonthButton.click();
        Thread.sleep(2000);
        statusChangeCutoffNextMonthDatePick.click();
        statusCutOffdate = StatusChangeCutoffDateInput.getText();
    }


    public void ChangeDateInEditCutoffField() throws InterruptedException {
        manageGoalsEditCutoff.click();
        EditCutoffNextMonthButton.click();
        Thread.sleep(2000);
        EditCutoffNextMonthDatePick.click();
        editCutOffdate = EditCutoffDateInput.getText();
    }

    public void verifyStatusCutoffField() {
        String updatedStatusCutoffDate = StatusChangeCutoffDateInput.getText();
        assert updatedStatusCutoffDate.equalsIgnoreCase(statusCutOffdate);
    }


    public void verifyEditCutoffField() {
        String updatedEditCutoffDate = EditCutoffDateInput.getText();
        assert updatedEditCutoffDate.equalsIgnoreCase(editCutOffdate);
    }


    /*************************************************************
     * Create Goals Module Page is started here
     */

    public void clickOnGoalsOptionAndSelectACycle() throws InterruptedException {
        clickOnGoalsOption.click();

        waitForCondition().until(ExpectedConditions.visibilityOf(manageGoalsCycleDropDown));
        Thread.sleep(500);
        String cycleName = manageGoalsCycleDropDown.getSelectOptions().get(3).trim();
        manageGoalsCycleDropDown.selectByVisibleText(cycleName);
        Thread.sleep(500);
    }

    public void clickOnCreateGoalButton() throws InterruptedException {
        clickOnCreateGoalButton.click();
        Thread.sleep(1000);
    }

    public void SelectYourNameForGoal() {
        selectYourNameOption.click();
    }

    public void verifyGoalPageContents() {
        assert createGoalsTitleInput.isVisible();
        assert createGoalsDescriptionText.isVisible();
        assert createGoalsAddKeyResultText.isVisible();
        assert createGoalsKeyResultAddSaveButton.isVisible();
        assert createGoalsDueDate.isVisible();
        assert createGoalsCancelButton.isVisible();
        assert createGoalsSaveButton.isVisible();
    }

    public void clickCreateGoalsSaveButton() {
        createGoalsSaveButton.click();
        //Thread.sleep(2000);
    }

    public void verifyTitleBlankFieldError() {
        waitForCondition().until(ExpectedConditions.visibilityOf(createGoalsTitleFieldBlankErrorMsg));
        Assert.assertEquals("Compare Error message", "You must provide a title to this goal.", createGoalsTitleFieldBlankErrorMsg.getText());
    }

    public void FillDataInTitleField() {
        waitForAngularRequestsToFinish();
        createGoalsTitleInput.sendKeys("Automation Test Goal");
    }

    public void FillDataInTitleFieldForHimself() {
        waitForAngularRequestsToFinish();
        createGoalsTitleInput.sendKeys("TM Self Goal");
    }

    public void FillDataInTitleFieldForDirectReport() {
        waitForAngularRequestsToFinish();
        createGoalsTitleInput.sendKeys("Direct Report Goal");
    }

    public void FillDataInTitleFieldForIndirectReport() {
        waitForAngularRequestsToFinish();
        createGoalsTitleInput.sendKeys("Indirect Report Goal");
    }

    public void verifyErrorMsgForGoalDescriptionField() {
        waitForCondition().until(ExpectedConditions.visibilityOf(createGoalsDescriptionFieldBlankErrorMsg));
        Assert.assertEquals("Compare Error message", "You must provide description to this goal.", createGoalsDescriptionFieldBlankErrorMsg.getText());
    }

    public void FillDataInDescriptionField() {
        waitForAngularRequestsToFinish();
        createGoalsDescriptionText.sendKeys("Automation Test Sample Text");
    }

    public void verifyErrorMsgForGoalKeyResultField() {
        waitForCondition().until(ExpectedConditions.visibilityOf(createGoalsKeyResultFieldBlankErrorMsg));
        Assert.assertEquals("Compare Error message", "You must provide at least 1 key result to this goal.", createGoalsKeyResultFieldBlankErrorMsg.getText());
    }

    public void FillDataInKeyResultField() {
        createGoalsAddKeyResultText.sendKeys("Automation Test Sample Key Result");
        createGoalsKeyResultAddSaveButton.click();
        waitForAngularRequestsToFinish();

    }

    public void verifyNewGoalAdded() {
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Compare Goals addition", "Automation Test Goal", createGoalsNewGoalNameAddVerify.getText());
    }

    public void verifyNewGoalAddedForTM() {
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Compare Goals addition", "TM Self Goal", createGoalsNewGoalNameAddVerifyForTM.getText());
    }

    public void verifyNewGoalAddedForDirectReport() {
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Compare Goals addition", "Direct Report Goal", createGoalsNewGoalNameAddVerifyForDirectReport.getText());
    }

    public void verifyNewGoalAddedForIndirectReport() {
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Compare Goals addition", "Indirect Report Goal", createGoalsNewGoalNameAddVerifyForIndirectReport.getText());
    }

    public void ClickGoalCancelButton() throws InterruptedException {
        createGoalsCancelButton.click();
        Thread.sleep(2000);
    }

    public void verifyGoalsHomePageForGoalNotAdded() {
        Assert.assertEquals("Check Goal Home Page", "Goals", createGoalsHomePageTitle.getText());
    }

    public void searchAnyEmployeeNameInOthersField() throws InterruptedException {
        searchEmployeeNameInputBox.sendKeys("Ashish Agrawal");
        Thread.sleep(2000);
    }

    public void clickOnSearchedEmployeeName() throws InterruptedException {
        searchedEmployeeNameSelect.click();
        Thread.sleep(1000);
    }

    public void selectDirectReportFromAll() throws InterruptedException {
        selectDirectReportNameOption.click();
        Thread.sleep(1000);
    }


    /*************************************************************
     * View Goals Module Page is started here
     */

    public void verifyGoalsListCreatedForTM() {
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Compare Goals addition", "TM Self Goal", createGoalsNewGoalNameAddVerifyForTM.getText());
    }

    public void verifyGoalsListCreatedForDirectReport() {
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Compare Goals addition", "Direct Report Goal", createGoalsNewGoalNameAddVerifyForDirectReport.getText());
    }

    public void verifyGoalsListCreatedForIndirectReport() {
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Compare Goals addition", "Indirect Report Goal", createGoalsNewGoalNameAddVerifyForIndirectReport.getText());
    }

    public void selectPreviousCycleFromDropdown(String previousCycleName) throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(manageGoalsCycleDropDown));
        Thread.sleep(500);
        //String cycleName = manageGoalsCycleDropDown.getSelectOptions().get(4).trim();
        manageGoalsCycleDropDown.selectByVisibleText(previousCycleName);
        Thread.sleep(500);
    }

    public void changeStatusToCompletedForPreviousGoal() throws InterruptedException {
        viewGoalsSelectPreviousCycleGoal.click();
        viewGoalsPreviousCycleGoalClickOnStatusDropdown.click();
        Thread.sleep(500);
        viewGoalsPreviousCycleGoalSelectCompleted.click();
        Thread.sleep(1000);
        goalDetailsStatus = viewGoalsPreviousCycleGoalClickOnStatusDropdown.getText();
        goalDetailsStatus = goalDetailsStatus.substring(2);
    }

    public void selectCurrentCycleFromDropdown(String currentCycleName) throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(manageGoalsCycleDropDown));
        Thread.sleep(500);
        //String cycleName = manageGoalsCycleDropDown.getSelectOptions().get(2).trim();
        manageGoalsCycleDropDown.selectByVisibleText(currentCycleName);
        Thread.sleep(500);

    }

    public void verifyPreviousCompletedGoalDoesNotShowInCurrentCycleGoalList() {
        Assert.assertFalse("Check Completed Goal", viewGoalsSelectPreviousCycleGoal.isPresent());
    }

    public void changeStatusToOpenForPreviousGoal() throws InterruptedException {
        viewGoalsSelectPreviousCycleGoal.click();
        viewGoalsPreviousCycleGoalClickOnStatusDropdown.click();
        viewGoalsPreviousCycleGoalSelectOpen.click();
        Thread.sleep(1000);
    }

    public void verifyPreviousOpenGoalShowsInCurrentCycleGoalList() {
        Assert.assertTrue("Check Open Goal", viewGoalsSelectPreviousCycleGoal.isPresent());
    }


    /*************************************************************
     * Edit Goals Module Page is started here
     */

    public void clickOnGoalToSee() {
        editGoalsClickOnFirstGoal.click();
    }

    public void verifyGoalAllFields() {
        Assert.assertTrue("Check Page Title", editGoalsPageTitle.isDisplayed());
        Assert.assertTrue("Check Due date", editGoalsPageDueDate.isDisplayed());
        Assert.assertTrue("Check Goal Description", editGoalsPageGoalDescription.isDisplayed());
        Assert.assertTrue("Check Add Comment", editGoalsPageAddCommentText.isDisplayed());
        Assert.assertTrue("Check Add Note button", editGoalsPageAddNoteButton.isVisible());
        Assert.assertTrue("Check Page Edit button", editGoalsPageEditButton.isPresent());
        Assert.assertTrue("Check Status List", editGoalsPageStatusList.isDisplayed());
        Assert.assertTrue("Check Cycle Name", editGoalsPageCycleName.isDisplayed());
        Assert.assertTrue("Check Editable Until Field", editGoalsPageEditableUntilField.isDisplayed());
        Assert.assertTrue("Check Status Updatable Until", editGoalsPageStatusUpdatableUntil.isDisplayed());
        Assert.assertTrue("Check Back button", editGoalsPageBackButton.isDisplayed());

    }

    public void VerifyStatusList() {
        editGoalsPageStatusList.click();
        String getStatusListContent = editGoalsPageStatus.getTextContent();
        String statusListSCharRemove = getStatusListContent.replaceAll("\\W", " ");
        String statusListSpaceRemove = statusListSCharRemove.replaceAll("   ", ",");
        String statusListString = statusListSpaceRemove.substring(2);
        List<String> statusListSplit = Arrays.asList(statusListString.split(","));

        List<String> allStatusValue = Arrays.asList("Open", "In Progress", "Completed", "Not Completed", "Partially Completed", "Deferred ");
        assert statusListSplit.equals(allStatusValue);
    }

    public void clickOnGoalCreatedByDirectReportForHimself() {
        if (editGoalsTMSelfGoal.isDisplayed()) {
            goalPageStatusValue = editGoalsPageStatusButton.getText();
            Assert.assertTrue("Check Status button", editGoalsPageStatusButton.isDisplayed());
        }
    }

    public void clickSameGoalAndVerifyEditButtonAvailability() throws InterruptedException {
        editGoalsTMSelfGoal.click();
        Thread.sleep(1000);
        Assert.assertTrue("Check Edit button", editGoalsPageEditButton.isPresent());
    }

    public void verifyGoalStatusIsClickableAndVerifyCurrentStatus() {
        Assert.assertTrue("Check Status Button", editGoalsPageStatusList.isDisplayed());
        String statusFieldValue = editGoalsPageStatusList.getText();
        assert goalPageStatusValue.equalsIgnoreCase(statusFieldValue);
    }

    public void clickOnGoalCreatedByISForDirectReport() {
        if (editGoalsISGoalForTM.isDisplayed()) {
            goalPageStatusValue = editGoalsPageStatusButtonForIS.getText();
            Assert.assertTrue("Check Status button", editGoalsPageStatusButton.isDisplayed());
        }
    }

    public void clickSameGoalAndVerifyEditButtonAvailabilityForIS() throws InterruptedException {
        editGoalsISGoalForTM.click();
        Thread.sleep(1000);
        Assert.assertTrue("Check Edit button for IS", editGoalsPageEditButton.isPresent());
    }

    public void verifyGoalStatusIsClickableAndVerifyCurrentStatusForIS() {
        Assert.assertTrue("Check Edit button for IS", editGoalsPageStatusList.isDisplayed());
        String statusFieldValue = editGoalsPageStatusList.getText();
        assert goalPageStatusValue.equalsIgnoreCase(statusFieldValue);
    }

    public void statusShouldNotClickableByTM() {
        if (editGoalsISGoalForTM.isDisplayed()) {
            Assert.assertTrue("Check Edit option for TM", editGoalsPageStatusButton.isDisplayed());
        }
    }

    public void clickOnSameGoalAndVerifyEditButtonNotAvailableByTM() throws InterruptedException {
        editGoalsISGoalForTM.click();
        Thread.sleep(1000);
        Assert.assertFalse("Check Edit button", editGoalsPageEditButton.isPresent());
    }

    public void verifyStatusShouldNotBeClickableByTM() {
        Assert.assertFalse("Check Status button", editGoalsPageStatusButtonNotClickable.isSelected());
    }

    public void clickOnGoalCreatedByAdminForDirectReport() {
        if (editGoalsAdminGoalForIndirectReport.isDisplayed()) {
            goalPageStatusValue = editGoalsPageStatusButtonForAdmin.getText();
            Assert.assertTrue("Check Status button for Admin", editGoalsPageStatusButton.isDisplayed());
        }
    }

    public void clickSameGoalAndVerifyEditButtonAvailabilityForAdmin() throws InterruptedException {
        editGoalsAdminGoalForIndirectReport.click();
        Thread.sleep(1000);
        Assert.assertTrue("Check Edit button for Admin", editGoalsPageEditButton.isPresent());
    }

    public void verifyGoalStatusIsClickableAndVerifyCurrentStatusForAdmin() {
        Assert.assertTrue("Check Status list for Admin", editGoalsPageStatusList.isDisplayed());
        String statusFieldValue = editGoalsPageStatusList.getText();
        assert goalPageStatusValue.equalsIgnoreCase(statusFieldValue);
    }

    public void statusShouldNotClickableByIR() {
        if (editGoalsAdminGoalForIndirectReport.isDisplayed()) {
            Assert.assertTrue("Check Status button for IR", editGoalsPageStatusButtonForIR.isDisplayed());
        }
    }

    public void clickOnSameGoalAndVerifyEditButtonNotAvailableByIR() throws InterruptedException {
        editGoalsAdminGoalForIndirectReport.click();
        Thread.sleep(1000);
        Assert.assertFalse("Check Edit button", editGoalsPageEditButton.isPresent());
    }

    public void verifyStatusShouldNotBeClickableByIR() {
        Assert.assertFalse("Check Status button", editGoalsPageStatusButtonNotClickable.isSelected());
    }

    public void writeCommentsOnTheCommentBox() {
        sampleNoteText = "Sample Note";
        editGoalsPageAddNoteTextArea.sendKeys(sampleNoteText);
    }

    public void clickAddNoteButtonAndVerifyComment() throws InterruptedException {
        editGoalsPageAddCommentButton.click();
        Thread.sleep(1000);
        Assert.assertEquals(sampleNoteText, editGoalsPageVerifyAddedCommentText.getText());
    }

    public void verifyStatusOfTheGoalBeforeStatusUpdatableDate() {
        Assert.assertEquals("Completed", goalDetailsStatus);
    }

    public void changeStatusForPreviousGoalToOpenFromCompleted() throws InterruptedException {
        editGoalsPageClickOnStatusOnGoalList.click();
        editGoalsPageSelectStatusOnGoalList.click();
        Thread.sleep(1000);
        goalListStatus = editGoalsPageClickOnStatusOnGoalList.getText();
        goalListStatus = goalListStatus.substring(2);
    }

    public void verifyTheStatusOfTheGoalCanBeChangedViaGoalList() {
        Assert.assertEquals("Open", goalListStatus);
    }

    public void clickOnGoalsAndSelectAPreviousCycle(String oldCycle) throws InterruptedException {
        clickOnGoalsOption.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(manageGoalsCycleDropDown));
        Thread.sleep(1000);
        //String cycleName = manageGoalsCycleDropDown.getSelectOptions().get(23).trim();
        manageGoalsCycleDropDown.selectByVisibleText(oldCycle);
        Thread.sleep(1000);
    }

    public void clickOnTheGoalEmployeeCreatedForSelf() throws InterruptedException {
        editGoalsPageOldGoal.click();
        Thread.sleep(1000);
    }

    public void verifyErrorMessage() {
        editGoalsPageOldGoalDetailsStatusButton.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(statusChangeErrorStatusButton));
        Assert.assertEquals("Compare Status Error Message", "Status change is beyond cutoff.", statusChangeErrorStatusButton.getText());

    }

    public void verifyErrorMessageOnGoalList() {
        editGoalsPageOldGoalListStatusButton.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(statusChangeErrorStatusButton));
        Assert.assertEquals("Compare Status Error Message", "Status change is beyond cutoff.", statusChangeErrorStatusButton.getText());

    }

    public void clickOnPreviousGoalForEditing() {
        viewGoalsSelectPreviousCycleGoal.click();
    }

    public void updateTheNecessaryFieldAndShouldSave() throws InterruptedException {
        editGoalsPageEditButton.click();
        Thread.sleep(1000);
        editGoalsPageGoalDescriptionText.clear();
        editGoalDescText = "Old Goal";
        editGoalsPageGoalDescriptionText.sendKeys((editGoalDescText));
        createGoalsSaveButton.click();
        Thread.sleep(1000);
    }

    public void verifyGoalIsUpdatedBeforeTheEditableUntilDate() {

        Assert.assertEquals(editGoalDescText, editGoalsPageGoalListDescText.getText());
    }

    public void verifyGoalCannotBeEditedAfterEditableUntilDate() {
        editGoalsPageEditButton.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(editIsBeyondCutoffErrorEditButton));
        Assert.assertEquals("Compare Edit Error Message", "Edit is beyond cutoff.", editIsBeyondCutoffErrorEditButton.getText());
    }

    public void clickOnDateIcon(String dateName) {
        List<WebElement> elements;
        do{
            Actions action = new Actions(this.getDriver());
            WebElement element = find(By.xpath("//div[contains(text(),'"+dateName+"')]//following-sibling::div/span"));
            action.moveToElement(element).moveByOffset(-50,0).click().perform();
            elements = getDriver().findElements(By.xpath("//div[@class='vc-popover-content-wrapper is-interactive']"));
        }while(elements == null || elements.size() == 0);
    }

    public void clickOnDateIcon(Boolean isStartDate) {
        clickOnDateIcon(isStartDate ? "Start Date" : "End Date");
    }

    public void selectFromModalDate(String date) {
        WebElement element = find(By.xpath("//span[@aria-label='"+date+"']"));
        element.click();
    }


    public void clickOnModalHeader() {
        waitForAngularRequestsToFinish();
        WebElement element = find(By.xpath("//div[@class='vc-title-wrapper']"));
        element.click();
    }

    public void clickOnModalMonth(String month) {
        WebElement element = find(By.xpath("//span[contains(text(),'"+month+"')]"));
        element.click();
    }

    public void setQuarterNameAs(String quarterName) {
        randomCycleName = quarterName;
        manageGoalsCycleNameInput.sendKeys(quarterName);
    }

    public void selectOnIsListedField(String yesOrNo) {
        WebElement element = find(By.xpath("//option[contains(text(),'"+yesOrNo+"')]"));
        element.click();
    }

    public void clickCancelButton() {
        WebElement element = find(By.xpath("//button[contains(text(),'Cancel')]"));
        element.click();
    }

    public void inputDataInDescriptionField() {
        createGoalsDescriptionText.sendKeys("Automation Test Sample Text");
    }
}