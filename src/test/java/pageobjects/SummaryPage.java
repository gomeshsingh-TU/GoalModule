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

public class SummaryPage extends PageObject {


    @FindBy(xpath = "//a[@href='/summary']")
    private WebElementFacade summaryIcon;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[@class='meeting-card']"),})
    private List<WebElement> meetingsCards;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//*[@class='flex-table']/tbody/tr"),})
    private List<WebElement> numberOfDirectReports;

    @FindBy(xpath = "//span[@class='primary']")
    private WebElementFacade complianceNumber;

    @FindBy(xpath = "//span[@class='secondary']")
    private WebElementFacade totalDirectReportsNumberInCompliance;

    @FindBy(xpath = "//div[@id='meeting-history']//following-sibling::span[@class='value']/div[1]")
    private WebElementFacade filterDate;

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//div[@class='meeting-form']"),})
    private List<WebElement> meetingsHistory;

    @FindBy(xpath = "//div[@class='crumbs']/div[1]")
    private WebElementFacade myTeamButton;

    @FindBy(xpath = "(//div[@class='meeting-form']//div[@class='meeting-date'])[1]")
    private WebElementFacade firstMeetingDate;

    @FindBy(xpath = "//*[@class='flex-table']/tbody/tr[@class='message']")
    private WebElementFacade summaryPageLoadingMessage;

    @FindBy(xpath = "(//*[@class='bar'])[1]")
    private WebElementFacade complianceBar;

    @FindBy(xpath = "//div[@id='profile-icon']")
    private WebElementFacade profileIcon;

    @FindBy(xpath = "//*[contains(@class,'ooo option')]")
    private WebElementFacade outOfOfficeButton;

    @FindBy(xpath = "//div[@class='tip']//following-sibling::textarea")
    private WebElementFacade enterOOOReason;

    @FindBy(xpath = "//div[@id='ooo']//following-sibling::button[contains(text(),'Submit')]")
    private WebElementFacade submitButtonForOOO;

    public void clickSummaryIcon() {
        waitForCondition().until(ExpectedConditions.visibilityOf(summaryIcon));
        summaryIcon.click();
    }

    public int getTotalNumberOfCardsInMeetingModule() {
        return meetingsCards.size();
    }

    public int getTotalNumberOfRowsInSummaryModule() throws InterruptedException {
        Thread.sleep(3000);
      return numberOfDirectReports.size();
    }

    public WebElement getDirectReportRowByName(String expectedName) throws InterruptedException {
        WebElement requiredCard = null;
        Thread.sleep(5000);
        for (WebElement card : numberOfDirectReports) {
            String actualName = card.findElement(By.xpath(".//*[contains(@class,'name')]")).getText();
            if (actualName.contains(expectedName)) {
                requiredCard = card;
                break;
            }
        }
        return requiredCard;
    }

    public String getPrimaryComplianceForSpecificDirectReport(String expectedName) throws InterruptedException {
        WebElement card = getDirectReportRowByName(expectedName);
        return card.findElement(By.xpath(".//span[@class='primary']")).getText();
    }

    public String getSecondaryComplianceForSpecificDirectReport(String expectedName) throws InterruptedException {
        WebElement card = getDirectReportRowByName(expectedName);
        return card.findElement(By.xpath(".//span[@class='secondary']")).getText();
    }

    public void clickViewMeetingLogsForSpecificDirectReport(String expectedName) throws InterruptedException {
        WebElement card = getDirectReportRowByName(expectedName);
        card.findElement(By.xpath(".//td[contains(text(),'View Meeting Logs')]")).click();
    }

    public void clickOnSpecificDirectReport(String expectedName) throws InterruptedException {
        WebElement card = getDirectReportRowByName(expectedName);
        card.findElement(By.xpath(".//td[1]")).click();
    }

    public String getCompliance() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(complianceNumber));
        return complianceNumber.getText();
    }
    public String getTotalNumberDirectReportsInCompliance() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(totalDirectReportsNumberInCompliance));
        return totalDirectReportsNumberInCompliance.getText();
    }

    public String getFilterDate() throws InterruptedException {
        Thread.sleep(3000);
        waitForCondition().until(ExpectedConditions.visibilityOf(filterDate));
        return filterDate.getText();
    }

    public void clickFilterDate(){
        waitForCondition().until(ExpectedConditions.visibilityOf(filterDate));
        filterDate.click();
    }

    public int getTotalNumberOfMeetingsInHistory() {
        return meetingsHistory.size();
    }

    public void clickMyTeamButton(){
        waitForCondition().until(ExpectedConditions.visibilityOf(myTeamButton));
        myTeamButton.click();
    }

    public String getFirstMeetingDate(){
        waitForCondition().until(ExpectedConditions.visibilityOf(firstMeetingDate));
        return firstMeetingDate.getText();
    }

    public void clickOnSpecificTL(String expectedName) throws InterruptedException {
        WebElement card = getDirectReportRowByName(expectedName);
        card.findElement(By.xpath(".//td[1]")).click();
    }

    public void selectOutOfOffice() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(profileIcon));
        profileIcon.click();
        waitForCondition().until(ExpectedConditions.visibilityOf(outOfOfficeButton));
        outOfOfficeButton.click();
        Thread.sleep(2000);
    }

    public String getOOOMessageForSpecificDirectReport(String expectedName) throws InterruptedException {
        WebElement card = getDirectReportRowByName(expectedName);
        return card.findElement(By.xpath(".//div[@class='message']")).getText();
    }

    public void enterOOOReason() {
        waitForCondition().until(ExpectedConditions.visibilityOf(enterOOOReason));
        enterOOOReason.sendKeys("This is for Testing");
    }

    public void clickSubmitToOOO() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.visibilityOf(submitButtonForOOO));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", submitButtonForOOO);
    }
}
