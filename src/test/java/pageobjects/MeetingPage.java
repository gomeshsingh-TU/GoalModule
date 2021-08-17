package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MeetingPage extends PageObject {

    @FindBy(xpath = "//a[@href='/meetings']")
    private WebElementFacade meetingIcon;

    @FindBy(xpath = "//div[@class='name' and contains(text(),'Meetings')]")
    private WebElementFacade meetingHomePage;

    @FindBy(xpath = "//button[contains(text(),'Create Meeting')]")
    private WebElementFacade createMeetingButton;

    @FindBy(xpath = "//div[contains(text(),'My Team')]")
    private WebElementFacade myTeamTab;

    @FindBy(xpath = "//div[contains(text(),'My Manager')]")
    private WebElementFacade myManagerTab;

    @FindBy(xpath = "//div[contains(text(),'1:1 Meetings')]")
    private WebElementFacade one2OneMeetingsTab;

    @FindBy(xpath = "//div[@class='sections']/div[1]//child::div[@class='agenda-container']//input")
    private WebElementFacade addManagerAgenda;

    @FindBy(xpath = "//div[@class='sections']/div[1]//child::div[@class='action-item-container']//input")
    private WebElementFacade addManagerActionItems;

    @FindBy(xpath = "//div[@class='sections']/div[2]//child::div[@class='action-item-container']//input")
    private WebElementFacade addDirectReportActionItems;

    @FindBy(xpath = "//div[@class='sections']/div[2]//child::div[@class='action-item-container']//div[@class='text']")
    private WebElementFacade getDirectReportActionItems;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[@class='meeting-card']"),})
    private List<WebElement> meetingsCards;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[contains(text(),'Have Met')]//following-sibling::div[@class='meeting-card']"),})
    private List<WebElement> meetingsCardInHaveMetSection;

    @FindBy(xpath = "//div[@class='tags']//child::div[contains(text(),'Work Performance')]")
    private WebElementFacade workPerformanceTag;

    @FindBy(xpath = "//div[@class='tags']//child::div[contains(text(),'Quick Connect')]")
    private WebElementFacade quickConnectTag;

    @FindBy(xpath = "//div[@class='tags']//child::div[contains(text(),'Relationship Building')]")
    private WebElementFacade relationshipBuildingTag;

    @FindBy(xpath = "//div[@class='tags']//child::div[contains(text(),'Career Development')]")
    private WebElementFacade careerDevelopmentTag;

    @FindBy(xpath = "//div[@class='tags']//child::div[contains(text(),'Product Specific Training')]")
    private WebElementFacade productSpecificTag;

    @FindBy(xpath = "//div[@class='tags']//child::div[contains(text(),'Waived')]")
    private WebElementFacade waivedTag;

    @FindBy(xpath = "//div[@class='tags']//child::div[contains(text(),'Behavioral Coaching')]")
    private WebElementFacade behavioralCoachingTag;

    @FindBy(xpath = "//input[@class='meeting-name']")
    private WebElementFacade meetingTitleInputBox;

    @FindBy(xpath = "//div[@class='options-container']")
    private WebElementFacade optionsContainer;

    @FindBy(xpath = "//div[@id='quill-container']/div[1]")
    private WebElementFacade meetingNotesInputBox;

    @FindBy(xpath = "//div[@class='controls']/div/svg")
    private WebElementFacade visibilityCheckbox;

    @FindBy(xpath = "//button[contains(text(),'Save note')]")
    private WebElementFacade saveNoteButton;

    @FindBy(xpath = "//button[contains(text(),'Done Editing')]")
    private WebElementFacade doneEditingButton;

    @FindBy(xpath = "//div[@class='options']/div[1]")
    private WebElementFacade deleteMeeting;

    @FindBy(xpath = "//div[@class='options']/div[2]")
    private WebElementFacade addToCalendarMeeting;

    @FindBy(xpath = "//div[@class='meetingshistory']/div")
    private WebElementFacade backToMeeting;

    @FindBy(xpath = "//div[@id='create-meeting']/input")
    private WebElementFacade enterEmployeeNumberTextBox;

    @FindBy(xpath = "//*[@class='employee']//following-sibling::span[@class='name']")
    private WebElementFacade matchedEmployee;

    @FindBy(xpath = "//div[@id='create-meeting']//following-sibling::button[contains(text(),'Create')]")
    private WebElementFacade createButton;

    @FindBy(xpath = "//div[@class='action-group']/div[2]")
    private WebElementFacade editMeetingButton;

    @FindBy(xpath = "//div[@class='warning']")
    private WebElementFacade draftMeetingWarning;

    @FindBy(xpath = "(//div[@class='vc-title'])[1]")
    private WebElementFacade calendarTitle;

    @FindBy(xpath = "(//div[@class='vc-select'])[1]/select")
    private WebElementFacade hourTime;

    @FindBy(xpath = "(//div[@class='vc-select'])[2]/select")
    private WebElementFacade minuteTime;

    @FindBy(xpath = "//div[@class='vc-am-pm']/button[1]")
    private WebElementFacade selectAM;

    @FindBy(xpath = "//div[@class='vc-am-pm']/button[2]")
    private WebElementFacade selectPM;

    @FindBy(xpath = "(//div[@class='meeting-card']/div)[1]")
    private WebElementFacade managerCardThreeDots;

    @FindBy(xpath = "//div[@class='option' and contains(text(),'Create Meeting')]")
    private WebElementFacade managerCardCreateMeetingOption;

    @FindBy(xpath = "//div[@class='acknowledgement']/button")
    private WebElementFacade acknowledgeButton;

    @FindBy(xpath = "//div[contains(text(),'Meeting deleted.')]")
    private WebElementFacade meetingDeleteMessage;

    @FindBy(xpath = "//div[@class='tip']//following-sibling::textarea")
    private WebElementFacade enterWaivingReason;

    @FindBy(xpath = "//div[@id='waive-meeting']//following-sibling::button[contains(text(),'Create')]")
    private WebElementFacade createButtonForWaiving;

    @FindBy(xpath = "(//div[@class='meeting-card'])[1]//child::span[@class='clickable']")
    private WebElementFacade managerMeetingStatus;

    @FindBy(xpath = "//div[contains(text(),'Saved successfully!')]")
    private WebElementFacade waivedMeetingMessage;

    @FindBy(xpath = "//div[@id='profile-icon']")
    private WebElementFacade profileIcon;

    @FindBy(xpath = "//*[contains(text(),'Logout')]")
    private WebElementFacade logoutButton;

    @FindBy(xpath = "(//div[@class='meeting-card'])[1]//child::span[@class='clickable']")
    private WebElementFacade managerMeetingAction;

    @FindBy(xpath = "//span[@class='primary']")
    private WebElementFacade complianceNumber;

    @FindBy(xpath = "//span[@class='secondary']")
    private WebElementFacade totalDirectReportsNumberInCompliance;

    @FindBy(xpath = "//*[@data-icon='caret-right']")
    private WebElementFacade complianceNextWeek;

    @FindBy(xpath = "//div[@class='message']")
    private WebElementFacade noDirectReportMessage;

    @FindBy(xpath = "//div[contains(text(),'Editing of a waived record is not allowed.')]")
    private WebElementFacade waivedMeetingEditMessage;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[@class='employee']"),})
    private List<WebElement> myActionEmployees;

    @FindBy(xpath = "//div[@id='create-meeting']//child::div[@class='title']")
    private WebElementFacade headsUpModalTitle;

    @FindBy(xpath = "//*[@class='notification-container']")
    private WebElementFacade notificationBellIcon;

    @FindBy(xpath = "(//div[@class='notification'])[1]//child::div[@class='message']")
    private WebElementFacade notificationTopMessage;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[contains(text(),'Have Not Met')]//following-sibling::div[@class='meeting-card']"),})
    private List<WebElement> meetingsCardInHaveNotMetSection;

    @FindBy(xpath = "//div[@class='controls']//child::button[contains(text(),'Close')]")
    private WebElementFacade modalCloseButton;

    @FindBy(xpath = "//div[@class='controls']//child::button[contains(text(),'See Meeting')]")
    private WebElementFacade modalSeeMeetingButton;

    @FindBy(xpath = "(//div[@class='meeting-card'])[1]//child::label[contains(text(),'Last Meeting')]//following-sibling::div")
    private WebElementFacade lastMeetingDateInManagerCard;

    @FindBy(xpath = "(//div[@class='meeting-card'])[1]//child::label[contains(text(),'Next Meeting')]//following-sibling::div")
    private WebElementFacade nextMeetingDateInManagerCard;


    public void clickMeeting() {
        waitForCondition().until(ExpectedConditions.visibilityOf(meetingIcon));
        meetingIcon.click();
    }

    public void clickManagerMeetingAction() {
        waitForCondition().until(ExpectedConditions.visibilityOf(managerMeetingAction));
        managerMeetingAction.click();
    }

    public void verifyMeetingHomePage() {
        waitForCondition().until(ExpectedConditions.visibilityOf(meetingHomePage));
        assert meetingHomePage.getText().contains("Meetings");
    }

    public boolean isMyTeamTabDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf(myTeamTab));
        return myTeamTab.isDisplayed();
    }

    public void clickMyTeamTab() {
        waitForCondition().until(ExpectedConditions.visibilityOf(myTeamTab));
        myTeamTab.click();
    }

    public boolean isMyManagerTabDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf(myManagerTab));
        return myManagerTab.isDisplayed();
    }

    public void clickMyManagerTab() {
        waitForCondition().until(ExpectedConditions.visibilityOf(myManagerTab));
        myManagerTab.click();
    }

    public boolean isOne2OneMeetingsTabDisplayed() {
        waitForCondition().until(ExpectedConditions.visibilityOf(one2OneMeetingsTab));
        return one2OneMeetingsTab.isDisplayed();
    }

    public void clickCreateMeetingButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(createMeetingButton));
        createMeetingButton.click();
    }

    public void clickCreateNewMeeting() {
        waitForCondition().until(ExpectedConditions.visibilityOf(createButton));
        createButton.click();
    }

    public void clickMatchedEmployee() {
        waitForCondition().until(ExpectedConditions.visibilityOf(matchedEmployee));
        matchedEmployee.click();
    }

    public void enterEmployeeNumberToSearch(String empID) {
        waitForCondition().until(ExpectedConditions.visibilityOf(enterEmployeeNumberTextBox));
        enterEmployeeNumberTextBox.sendKeys(empID);
    }

    public void enterManagerAgenda(String arg) {
        waitForCondition().until(ExpectedConditions.visibilityOf(addManagerAgenda));
        addManagerAgenda.sendKeys(arg);
    }

    public void enterMeetingActionItem(String arg) {
        waitForCondition().until(ExpectedConditions.visibilityOf(addManagerActionItems));
        addManagerActionItems.sendKeys(arg);
    }

    public void enterMeetingActionItemByDirectReport(String arg) {
        waitForCondition().until(ExpectedConditions.visibilityOf(addDirectReportActionItems));
        addDirectReportActionItems.sendKeys(arg);
    }

    public String getMeetingActionItemByDirectReport() {
        waitForCondition().until(ExpectedConditions.visibilityOf(getDirectReportActionItems));
        return getDirectReportActionItems.getText();
    }


    public void enterMeetingNotes(String arg) {
        waitForCondition().until(ExpectedConditions.visibilityOf(meetingNotesInputBox));
        meetingNotesInputBox.sendKeys(arg);
    }

    public void enterMeetingTitle(String arg) {
        waitForCondition().until(ExpectedConditions.visibilityOf(meetingTitleInputBox));
        meetingTitleInputBox.sendKeys(arg);
    }

    public void clickSaveNotes() {
        waitForCondition().until(ExpectedConditions.visibilityOf(saveNoteButton));
        saveNoteButton.click();
    }

    public void clickDoneEditing() {
        waitForCondition().until(ExpectedConditions.visibilityOf(doneEditingButton));
        doneEditingButton.click();
    }

    public void deleteMeeting() throws InterruptedException {
        Thread.sleep(1000);
        waitForCondition().until(ExpectedConditions.visibilityOf(optionsContainer));
        optionsContainer.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(deleteMeeting));
        deleteMeeting.click();
    }

    public void addToCalenderMeeting() throws InterruptedException {
        Thread.sleep(1000);
        waitForCondition().until(ExpectedConditions.visibilityOf(optionsContainer));
        optionsContainer.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(addToCalendarMeeting));
        addToCalendarMeeting.click();
    }

    public void selectWorkPerformanceTag() {
        waitForCondition().until(ExpectedConditions.visibilityOf(workPerformanceTag));
        workPerformanceTag.click();
    }

    public void selectWaivedTag() {
        waitForCondition().until(ExpectedConditions.visibilityOf(waivedTag));
        waivedTag.click();
    }

    public void selectProductSpecificTag() {
        waitForCondition().until(ExpectedConditions.visibilityOf(productSpecificTag));
        productSpecificTag.click();
    }

    public void selectBehavioralCoachingTag() {
        waitForCondition().until(ExpectedConditions.visibilityOf(behavioralCoachingTag));
        behavioralCoachingTag.click();
    }

    public void selectRelationshipBuildingTag() {
        waitForCondition().until(ExpectedConditions.visibilityOf(relationshipBuildingTag));
        relationshipBuildingTag.click();
    }

    public void selectQuickConnectTag() {
        waitForCondition().until(ExpectedConditions.visibilityOf(quickConnectTag));
        quickConnectTag.click();
    }

    public void selectCareerDevelopmentTag() {
        waitForCondition().until(ExpectedConditions.visibilityOf(careerDevelopmentTag));
        careerDevelopmentTag.click();
    }

    public String getDraftMeetingWarning() {
        waitForCondition().until(ExpectedConditions.visibilityOf(draftMeetingWarning));
        return draftMeetingWarning.getText();
    }

    public void selectDate(String expectedDate) throws InterruptedException {
        String[] startingDate = expectedDate.split(" ");
        if (calendarTitle.getText().contains(startingDate[0]) && calendarTitle.getText().contains(startingDate[2])) {
            WebElement day = getDriver().findElement(By.xpath("(//div[@class='vc-pane'])[1]/div[2]//child::span[contains(@aria-label,'" + startingDate[0] + "') and contains(text(),'" + startingDate[1] + "')]"));
            waitForCondition().until(ExpectedConditions.visibilityOf(day));
            day.click();
        } else {
            calendarTitle.click();
            WebElement calendarPopup = getDriver().findElement(By.xpath("//div[@class='vc-nav-container']"));
            waitForCondition().until(ExpectedConditions.visibilityOf(calendarPopup));
            WebElement currentYear = getDriver().findElement(By.xpath("(//div[@class='vc-grid-container'])[1]/div[2]/span"));
            waitForCondition().until(ExpectedConditions.visibilityOf(currentYear));
            String year = currentYear.getText();
            if (Integer.parseInt(year) > Integer.parseInt(startingDate[2])) {
                WebElement previousYear = getDriver().findElement(By.xpath("(//div[@class='vc-grid-container'])[1]/div[1]"));
                waitForCondition().until(ExpectedConditions.visibilityOf(previousYear));
                previousYear.click();
            } else if (Integer.parseInt(year) < Integer.parseInt(startingDate[2])) {
                WebElement nextYear = getDriver().findElement(By.xpath("(//div[@class='vc-grid-container'])[1]/div[3]"));
                waitForCondition().until(ExpectedConditions.visibilityOf(nextYear));
                nextYear.click();
            }
            List<WebElement> months = getDriver().findElements(By.xpath("(//div[@class='vc-grid-container'])[2]/div/span"));
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
        }
    }

    public void setMeetingTime(String expectedTime) {
        String[] time = expectedTime.split("[:\\s]");
        hourTime.selectByVisibleText(time[0]);
        minuteTime.selectByVisibleText(time[1]);
        if (time[2].equalsIgnoreCase("AM")) {
            selectAM.click();
        } else {
            selectPM.click();
        }
    }

    public WebElement getDirectReportCard(String expectedName) {
        WebElement requiredCard = null;
        for (WebElement card : meetingsCards) {
            String actualName = card.findElement(By.xpath(".//div[@class='basic-info']//child::div[@class='name']")).getText();
            if (actualName.contains(expectedName)) {
                requiredCard = card;
                break;
            } else {
                continue;
            }
        }
        return requiredCard;
    }

    public WebElement getDirectReportCardFromHaveMetSection(String expectedName) {
        WebElement requiredCard = null;
        for (WebElement card : meetingsCardInHaveMetSection) {
            String actualName = card.findElement(By.xpath(".//div[@class='basic-info']//child::div[@class='name']")).getText();
            if (actualName.contains(expectedName)) {
                requiredCard = card;
                break;
            } else {
                continue;
            }
        }
        return requiredCard;
    }

    public void meetingWithDirectReport(String expectedName) throws InterruptedException {
        WebElement card = getDirectReportCard(expectedName);
        Thread.sleep(5000);
        waitForCondition().until(ExpectedConditions.visibilityOf(card));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", card.findElement(By.xpath(".//*[@class='clickable']")));
    }

    public void meetingWithDirectReportFromHaveMetSection(String expectedName) throws InterruptedException {
        WebElement card = getDirectReportCardFromHaveMetSection(expectedName);
        Thread.sleep(5000);
        waitForCondition().until(ExpectedConditions.visibilityOf(card));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", card.findElement(By.xpath(".//*[@class='project']")));
    }

    public void meetingWithDirectReportFromHaveNotMetSection(String expectedName) throws InterruptedException {
        WebElement card = getDirectReportCard(expectedName);
        Thread.sleep(5000);
        waitForCondition().until(ExpectedConditions.visibilityOf(card));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", card.findElement(By.xpath(".//*[@class='project']")));
    }

    public String getStatus(String expectedName) {
        WebElement card = getDirectReportCard(expectedName);
        waitForCondition().until(ExpectedConditions.visibilityOf(card.findElement(By.xpath(".//span[@class='clickable']"))));
        return card.findElement(By.xpath(".//span[@class='clickable']")).getText();
    }

    public String getManagerMeetingStatus() {
        waitForCondition().until(ExpectedConditions.visibilityOf(managerMeetingStatus));
        return managerMeetingStatus.getText();
    }

    public void clickBackButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(backToMeeting));
        backToMeeting.click();
    }

    public void createMeetingWithManager() {
        waitForCondition().until(ExpectedConditions.visibilityOf(managerCardThreeDots));
        managerCardThreeDots.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(managerCardCreateMeetingOption));
        managerCardCreateMeetingOption.click();
    }

    public void clickAcknowledgeButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(acknowledgeButton));
        acknowledgeButton.click();
    }

    public String getDeleteMeetingMessage() {
        waitForCondition().until(ExpectedConditions.visibilityOf(meetingDeleteMessage));
        return meetingDeleteMessage.getText();
    }

    public String getWaivedMeetingMessage() {
        waitForCondition().until(ExpectedConditions.visibilityOf(waivedMeetingMessage));
        return waivedMeetingMessage.getText();
    }

    public void clickEditButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(editMeetingButton));
        editMeetingButton.click();
    }

    public void enterWaivingReason() {
        waitForCondition().until(ExpectedConditions.visibilityOf(enterWaivingReason));
        enterWaivingReason.sendKeys("This is for Testing");
    }

    public void clickCreateToWaiveMeeting() {
        waitForCondition().until(ExpectedConditions.visibilityOf(createButtonForWaiving));
        createButtonForWaiving.click();
    }

    public void waiveMeeting(String expectedName) {
        WebElement card = getDirectReportCard(expectedName);
        waitForCondition().until(ExpectedConditions.visibilityOf(card));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", card.findElement(By.xpath(".//div[contains(@class,'meeting-options')]")));
        WebElement waiveMeeting = card.findElement(By.xpath(".//div[@class='options-container']/div[2]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(waiveMeeting));
        js.executeScript("arguments[0].click();", waiveMeeting);
    }

    public void selectDate(String expectedDate, String endDate) throws InterruptedException {
        String[] startingDate = expectedDate.split(" ");
        String[] endingDate = endDate.split(" ");
        if (calendarTitle.getText().contains(startingDate[0]) && calendarTitle.getText().contains(startingDate[2])) {
            WebElement day = getDriver().findElement(By.xpath("(//div[@class='vc-pane'])[1]/div[2]//child::span[contains(@aria-label,'" + startingDate[0] + "') and contains(text(),'" + startingDate[1] + "')]"));
            waitForCondition().until(ExpectedConditions.visibilityOf(day));
            day.click();
            while (true) {
                WebElement currentMonthDisplayed = getDriver().findElement(By.xpath("(//*[@class='vc-title-wrapper']/div)[1]"));
                WebElement nextMonthDisplayed = getDriver().findElement(By.xpath("(//*[@class='vc-title-wrapper']/div)[3]"));
                waitForCondition().until(ExpectedConditions.visibilityOf(currentMonthDisplayed));
                if (currentMonthDisplayed.getText().contains(endingDate[0]) && currentMonthDisplayed.getText().contains(endingDate[2])) {
                    WebElement endDay = getDriver().findElement(By.xpath("(//*[@class='vc-pane'])[1]/div[2]//child::span[contains(@aria-label,'" + endingDate[0] + "') and contains(text(),'" + endingDate[1] + "')]"));
                    waitForCondition().until(ExpectedConditions.visibilityOf(endDay));
                    endDay.click();
                    break;
                } else if (nextMonthDisplayed.getText().contains(endingDate[0]) && nextMonthDisplayed.getText().contains(endingDate[2])) {
                    WebElement endDay = getDriver().findElement(By.xpath("(//*[@class='vc-pane'])[1]/div[2]//child::span[contains(@aria-label,'" + endingDate[0] + "') and contains(text(),'" + endingDate[1] + "')]"));
                    waitForCondition().until(ExpectedConditions.visibilityOf(endDay));
                    endDay.click();
                    break;
                }
                WebElement nextMonth = getDriver().findElement(By.xpath("//*[@class='vc-arrows-container title-center']/div[2]"));
                waitForCondition().until(ExpectedConditions.visibilityOf(nextMonth));
                nextMonth.click();
                Thread.sleep(1000);

            }
        } else {
            calendarTitle.click();
            WebElement calendarPopup = getDriver().findElement(By.xpath("//div[@class='vc-nav-container']"));
            waitForCondition().until(ExpectedConditions.visibilityOf(calendarPopup));
            WebElement currentYear = getDriver().findElement(By.xpath("(//div[@class='vc-grid-container'])[1]/div[2]/span"));
            waitForCondition().until(ExpectedConditions.visibilityOf(currentYear));
            String year = currentYear.getText();
            if (Integer.parseInt(year) > Integer.parseInt(startingDate[2])) {
                WebElement previousYear = getDriver().findElement(By.xpath("(//div[@class='vc-grid-container'])[1]/div[1]"));
                waitForCondition().until(ExpectedConditions.visibilityOf(previousYear));
                previousYear.click();
            } else if (Integer.parseInt(year) < Integer.parseInt(startingDate[2])) {
                WebElement nextYear = getDriver().findElement(By.xpath("(//div[@class='vc-grid-container'])[1]/div[3]"));
                waitForCondition().until(ExpectedConditions.visibilityOf(nextYear));
                nextYear.click();
            }
            List<WebElement> months = getDriver().findElements(By.xpath("(//div[@class='vc-grid-container'])[2]/div/span"));
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
                WebElement currentMonthDisplayed = getDriver().findElement(By.xpath("(//*[@class='vc-title-wrapper']/div)[1]"));
                WebElement nextMonthDisplayed = getDriver().findElement(By.xpath("(//*[@class='vc-title-wrapper']/div)[3]"));
                waitForCondition().until(ExpectedConditions.visibilityOf(currentMonthDisplayed));
                if (currentMonthDisplayed.getText().contains(endingDate[0]) && currentMonthDisplayed.getText().contains(endingDate[2])) {
                    WebElement endDay = getDriver().findElement(By.xpath("(//*[@class='vc-pane'])[1]/div[2]//child::span[contains(@aria-label,'" + endingDate[0] + "') and contains(text(),'" + endingDate[1] + "')]"));
                    waitForCondition().until(ExpectedConditions.visibilityOf(endDay));
                    endDay.click();
                    break;
                } else if (nextMonthDisplayed.getText().contains(endingDate[0]) && nextMonthDisplayed.getText().contains(endingDate[2])) {
                    WebElement endDay = getDriver().findElement(By.xpath("(//*[@class='vc-pane'])[1]/div[2]//child::span[contains(@aria-label,'" + endingDate[0] + "') and contains(text(),'" + endingDate[1] + "')]"));
                    waitForCondition().until(ExpectedConditions.visibilityOf(endDay));
                    endDay.click();
                    break;
                } else {
                    WebElement nextMonth = getDriver().findElement(By.xpath("//*[@class='vc-arrows-container title-center']/div[2]"));
                    waitForCondition().until(ExpectedConditions.visibilityOf(nextMonth));
                    nextMonth.click();
                    Thread.sleep(1000);
                }
            }
        }
    }

    public void logout() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(profileIcon));
        profileIcon.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
        Thread.sleep(2000);
    }

    public String getCompliance() throws InterruptedException {
        Thread.sleep(6000);
        waitForCondition().until(ExpectedConditions.visibilityOf(complianceNumber));
        return complianceNumber.getText();
    }

    public void checkNextWeekCompliance() {
        waitForCondition().until(ExpectedConditions.visibilityOf(complianceNextWeek));
        complianceNextWeek.click();
    }

    public String getNoDirectReportMessage() throws InterruptedException {
        Thread.sleep(2000);
        waitForCondition().until(ExpectedConditions.visibilityOf(noDirectReportMessage));
        return noDirectReportMessage.getText();
    }

    public String getWaivedMeetingEditMessage() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(waivedMeetingEditMessage));
        return waivedMeetingEditMessage.getText();
    }

    public String getHeadsUpModalTitle() throws InterruptedException {
        Thread.sleep(2000);
        waitForCondition().until(ExpectedConditions.visibilityOf(headsUpModalTitle));
        return headsUpModalTitle.getText();
    }

    public String getMyActionEmployee() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(headsUpModalTitle));
        return headsUpModalTitle.getText();
    }

    public String getNextMeetingDate(String expectedName) {
        WebElement card = getDirectReportCard(expectedName);
        waitForCondition().until(ExpectedConditions.visibilityOf(card.findElement(By.xpath(".//label[contains(text(),'Next Meeting')]//following-sibling::div"))));
        return card.findElement(By.xpath(".//label[contains(text(),'Next Meeting')]//following-sibling::div")).getText();
    }

    public String getNotificationMessage() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(notificationBellIcon));
        notificationBellIcon.click();
        Thread.sleep(2000);
        waitForCondition().until(ExpectedConditions.visibilityOf(notificationTopMessage));
        String message = notificationTopMessage.getText();
        waitForCondition().until(ExpectedConditions.visibilityOf(notificationBellIcon));
        notificationBellIcon.click();
        return message;
    }

    public boolean isCardDisplayedInHaveNotMetSection(String expectedName) {
        boolean isDisplayed = false;
        for (WebElement card : meetingsCardInHaveNotMetSection) {
            String actualName = card.findElement(By.xpath(".//div[@class='basic-info']//child::div[@class='name']")).getText();
            if (actualName.contains(expectedName)) {
                isDisplayed = true;
                break;
            } else {
                continue;
            }
        }
        return isDisplayed;
    }

    public boolean isCardDisplayedInHaveMetSection(String expectedName) {
        boolean isDisplayed = false;
        for (WebElement card : meetingsCardInHaveMetSection) {
            String actualName = card.findElement(By.xpath(".//div[@class='basic-info']//child::div[@class='name']")).getText();
            if (actualName.contains(expectedName)) {
                isDisplayed = true;
                break;
            } else {
                continue;
            }
        }
        return isDisplayed;
    }

    public String getTotalNumberDirectReportsInCompliance() throws InterruptedException {
        Thread.sleep(3000);
        waitForCondition().until(ExpectedConditions.visibilityOf(totalDirectReportsNumberInCompliance));
        return totalDirectReportsNumberInCompliance.getText();
    }

    public String getOnlyDirectReportsNumber() throws InterruptedException {
        String[] direct = getTotalNumberDirectReportsInCompliance().split("[(]");
        return direct[0].replaceAll("/", "").trim();
    }

    public void clickClose() {
        waitForCondition().until(ExpectedConditions.visibilityOf(modalCloseButton));
        modalCloseButton.click();
    }

    public void clickSeeMeeting() {
        waitForCondition().until(ExpectedConditions.visibilityOf(modalSeeMeetingButton));
        modalSeeMeetingButton.click();
    }

    public WebElement getMyActionForDirectReport(String expectedName) {
        WebElement requiredAction = null;
        for (WebElement card : myActionEmployees) {
            String actualName = card.findElement(By.xpath(".//child::div[@class='name']")).getText();
            if (actualName.contains(expectedName)) {
                requiredAction = card;
                break;
            } else {
                continue;
            }
        }
        return requiredAction;
    }

    public void checkOffMyAction(String expectedName, String expectedDate) throws InterruptedException {
        String[] startingDate = expectedDate.split(" ");
        WebElement card = getMyActionForDirectReport(expectedName);
        waitForCondition().until(ExpectedConditions.visibilityOf(card));
        card.findElement(By.xpath(".//span[@class='tickbox']")).click();
        Thread.sleep(2000);
        WebElement day = getDriver().findElement(By.xpath("(//div[@class='vc-pane'])[1]/div[2]//child::span[contains(@aria-label,'" + startingDate[0] + "') and contains(text(),'" + startingDate[1] + "')]"));
        waitForCondition().until(ExpectedConditions.visibilityOf(day));
        day.click();
    }

    public boolean isMyActionForDirectReportDisplayed(String expectedName) throws InterruptedException {
        Thread.sleep(3000);
        boolean isDisplayed = false;
        for (WebElement card : myActionEmployees) {
            String actualName = card.findElement(By.xpath(".//child::div[@class='name']")).getText();
            if (actualName.contains(expectedName)) {
                isDisplayed = true;
                break;
            }
        }
        return isDisplayed;
    }

    public void againCreateMeeting(String expectedName) {
        for (WebElement card : meetingsCardInHaveMetSection) {
            String actualName = card.findElement(By.xpath(".//child::div[@class='name']")).getText();
            if (actualName.contains(expectedName)) {
                WebElement cardThreeDots = card.findElement(By.xpath(".//child::div[contains(@class ,'meeting-options')]"));
                waitForCondition().until(ExpectedConditions.visibilityOf(cardThreeDots));
                cardThreeDots.click();
                WebElement selectCreateMeetingOption = card.findElement(By.xpath(".//div[@class='option' and contains(text(),'Create Meeting')]"));
                waitForCondition().until(ExpectedConditions.visibilityOf(selectCreateMeetingOption));
                selectCreateMeetingOption.click();
            }
        }
    }

    public void clickCloseButton() {
        waitForCondition().until(ExpectedConditions.visibilityOf(modalCloseButton));
        modalCloseButton.click();
    }

    public String getLastMeetingDate(String expectedName) {
        WebElement card = getDirectReportCard(expectedName);
        waitForCondition().until(ExpectedConditions.visibilityOf(card.findElement(By.xpath(".//label[contains(text(),'Last Meeting')]//following-sibling::div"))));
        return card.findElement(By.xpath(".//label[contains(text(),'Last Meeting')]//following-sibling::div")).getText();
    }

    public String getLastMeetingDateInManagerCard() {
        waitForCondition().until(ExpectedConditions.visibilityOf(lastMeetingDateInManagerCard));
        return lastMeetingDateInManagerCard.getText();
    }

    public String getNextMeetingDateInManagerCard() {
        waitForCondition().until(ExpectedConditions.visibilityOf(lastMeetingDateInManagerCard));
        return lastMeetingDateInManagerCard.getText();
    }

}
