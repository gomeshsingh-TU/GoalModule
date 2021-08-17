package steps;

import common.BoostAPIHelper;
import common.CredentialsCSVReader;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pageobjects.LoginPage;
import testdataobjects.EmployeeProfile;

import java.util.HashMap;

public class LoginSteps {
    @Steps
    LoginPage loginPage;
    EmployeeProfile omuser;
    HashMap<String, EmployeeProfile> employeeList;

    @Step("Open the Boost login page")
    public void openBoostLoginPage() {
        employeeList =
                Serenity.sessionVariableCalled("employeeList");
        if (employeeList == null) {
            employeeList = CredentialsCSVReader.readAndLoadCSVData();
            Serenity.setSessionVariable("employeeList").to(employeeList);
        }
        loginPage.getDriver().manage().deleteAllCookies();
        loginPage.open();
        loginPage.getDriver().navigate().refresh();
    }

    public EmployeeProfile UserLogsIn(String user) {
        omuser = employeeList.get(user);
        Serenity.setSessionVariable("omuser").to(omuser);
        Serenity.setSessionVariable("EmpNo").to(omuser.getEmpno());
        BoostAPIHelper boostAPIHelper = new BoostAPIHelper();
        boostAPIHelper.setEmpNumber(omuser.getUsername());
        loginPage.loginWithEmployeeNumber(omuser.getEmpno());
        return omuser;
    }
}
