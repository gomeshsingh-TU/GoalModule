package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pageobjects.HomePage;

public class HomePageSteps {
    @Steps
    HomePage homePage;

    @Step
    public void verifyVersionHistoryPageTitle(){
        homePage.verifyVersionHistoryTitle();
    }

    @Step
    public void verifyPerformanceReviewPageTitle(){
        homePage.verifyPerformanceReviewTitle();
    }

    @Step
    public void clickOnPerformanceReviewIcon(){
        homePage.clickPerformanceReview();
    }
}
