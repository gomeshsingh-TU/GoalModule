package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomePageSteps;

public class HomePageStepDefinitions {

    @Steps
    HomePageSteps homePageStep;

    @Then("User lands on the version history page")
    public void userLandsOnVersionHistoryPage(){
        homePageStep.verifyVersionHistoryPageTitle();
    }

    @Then("Verify user lands on Performance Review page")
    public void userLandsOnPerformanceReviewPage(){
        homePageStep.verifyPerformanceReviewPageTitle();
    }

    @When("User clicks on Performance Review icon")
    public void userClicksOnPerformanceReviewIcon(){
        homePageStep.clickOnPerformanceReviewIcon();
    }


}
