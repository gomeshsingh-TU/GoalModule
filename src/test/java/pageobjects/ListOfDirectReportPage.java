package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;

import java.util.List;

public class ListOfDirectReportPage extends PageObject {

    @FindAll({@org.openqa.selenium.support.FindBy(xpath = "//table[@class='flex-table']/tbody/tr"),})
    private List<WebElement> totalNumberOfDirectReports;

    public int getTotalListDirectReportFromUI() throws InterruptedException {
        Thread.sleep(500);
        return (totalNumberOfDirectReports.size()-1);
    }
}
