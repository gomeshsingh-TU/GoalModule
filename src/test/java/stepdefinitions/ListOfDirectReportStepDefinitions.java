package stepdefinitions;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ListOfDirectReportSteps;

public class ListOfDirectReportStepDefinitions {

    @Steps
    ListOfDirectReportSteps listOfDirectReportSteps;

    @Then("Verify that number of direct report are same in UI and API")
    public void verifyDirectReportsFromAPIAndUI() throws InterruptedException {
        listOfDirectReportSteps.verifyNumberOfDirectReportFromAPIAndUI();
    }
}
