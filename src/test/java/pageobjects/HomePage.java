package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageObject {

    @FindBy(xpath = "//div[@class='name' and contains(text(),'Changelogs')]")
    private WebElementFacade pageTitle;

    @FindBy(xpath = "//div[@class='name' and contains(text(),'Reviews')]")
    private WebElementFacade performanceReviewTitle;

    @FindBy(xpath = "//a[@href='/reviews']")
    private WebElementFacade performanceReviewIcon;

    public void verifyVersionHistoryTitle(){
        assert pageTitle.getText().contains("Changelogs");
    }

    public void verifyPerformanceReviewTitle(){
        waitForCondition().until(ExpectedConditions.visibilityOf(performanceReviewTitle));
        assert performanceReviewTitle.getText().contains("Reviews");
    }

    public void clickPerformanceReview(){
        waitForCondition().until(ExpectedConditions.visibilityOf(performanceReviewIcon));
        performanceReviewIcon.click();
    }

}
