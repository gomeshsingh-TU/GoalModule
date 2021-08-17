package steps;

import common.CredentialsCSVReader;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pageobjects.LoginPage;
import pageobjects.ManagerAssessmentPage;
import pageobjects.SelfAssessmentPage;
import testdataobjects.EmployeeProfile;

import java.util.HashMap;

public class ManagerAssessmentSteps {

    @Steps
    LoginPage loginPage;
    EmployeeProfile omuser;
    HashMap<String, EmployeeProfile> employeeList;
    ManagerAssessmentPage managerAssessmentPage;
    SelfAssessmentPage selfAssessmentPage;

    @Step()
    public void verifyQuestionnaireSide() {
        Assert.assertEquals("Questionnaires are not at expected section", "Your Answer", managerAssessmentPage.getQuestionnaireSide());
    }

    @Step()
    public void clickOnCompleteAssessmentForSpecificDirectReport() {
        managerAssessmentPage.clickOnCompleteAssessment(getDirectName());
    }

    @Step()
    public void verifyCompleteAssessmentButton() {
        managerAssessmentPage.completeAssessmentIsDisplayed(getDirectName());
    }

    @Step()
    public void verifyDate() {
        Assert.assertEquals("Date is Mismatch", selfAssessmentPage.getCurrentDate(), managerAssessmentPage.getDate(getDirectName()));
    }

    @Step()
    public void verifyEditAndShareButton() {
        managerAssessmentPage.editButtonIsDisplayed(getDirectName());
        managerAssessmentPage.shareButtonIsDisplayed(getDirectName());
    }

    @Step()
    public void clickOnEditButton() {
        managerAssessmentPage.clickOnEditButton(getDirectName());
    }

    @Step()
    public void clickOnShareButton_MA() {
        managerAssessmentPage.clickOnShareButton(getDirectName());
    }

    @Step()
    public void clickOnSaveButton() {
        managerAssessmentPage.clickSaveButton();
    }

    @Step()
    public void clickOnViewButton() {
        managerAssessmentPage.clickOnViewButton(getDirectName());
    }

    @Step()
    public void verifyViewButton() {
        managerAssessmentPage.viewButtonIsDisplayed(getDirectName());
    }

    @Step()
    public void clickOnShareButton() {
        managerAssessmentPage.clickShareButton();
    }

    @Step()
    public void verifyNotAcknowledge() {
        Assert.assertEquals("It is acknowledged", "---", managerAssessmentPage.verifyAcknowledge(getDirectName()));
    }

    @Step()
    public void clickOnAcknowledgeButton() {
        managerAssessmentPage.clickAcknowledgeButton();
    }

    @Step()
    public void verifyEnteredAnswers() {
        managerAssessmentPage.verifyAnswers();
    }

    @Step()
    public void updateEnteredAnswers() {
        managerAssessmentPage.setUpdatedAnswers();
    }

    @Step()
    public void verifyUpdatedEnteredAnswers() {
        managerAssessmentPage.verifyUpdatedAnswers();
    }

    @Step()
    public void clickOnPendingButton() {
        managerAssessmentPage.clickPendingButton(getDirectName());
    }


    @Step()
    public void verifyAssessmentIsAcknowledged() {
        Assert.assertEquals("Assessment is not acknowledged", "Acknowledged", managerAssessmentPage.verifyAcknowledge(getDirectName()));
    }

    @Step()
    public void verifyShareButton() {
        Assert.assertTrue("Share Button is displayed",managerAssessmentPage.shareButtonIsNotDisplayed(getDirectName()));
    }

    public String getDirectName() {
        employeeList = CredentialsCSVReader.readAndLoadCSVData();
        omuser = employeeList.get("TM");
        String fullName = omuser.getLastName() + ", " + omuser.getFirstName();
        return fullName;
    }

}
