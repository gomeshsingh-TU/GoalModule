package steps;

import common.BoostAPIHelper;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;
import pageobjects.ListOfDirectReportPage;

import java.util.List;

public class ListOfDirectReportSteps {

    @Steps
    ListOfDirectReportPage listOfDirectReportPage;
    private EnvironmentVariables environmentVariables;


    @Step("verify Direct report with API & UI")
    public void verifyNumberOfDirectReportFromAPIAndUI() throws InterruptedException {
        String webserviceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("webservices.base.url");
        String apiKey = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("apiKey");
        BoostAPIHelper boostAPIHelper = new BoostAPIHelper();
        String empNumber = boostAPIHelper.getEmpNumber();
        int empId = boostAPIHelper.getEmployeeIDOfLoggedInUser(webserviceEndpoint, apiKey, empNumber);
        List<String> listOfDirectReportFetchedFromAPI = boostAPIHelper.getUserDirectReportInfo(webserviceEndpoint, apiKey, empId);
        Assert.assertEquals("Number of Direct reports are mismatched", listOfDirectReportFetchedFromAPI.size(), listOfDirectReportPage.getTotalListDirectReportFromUI());
    }
}
