package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;
import testdataobjects.EmployeeProfile;

import java.util.HashMap;

public class LoginStepDefinations {

    @Steps
    LoginSteps loginSteps;
    HashMap<String, EmployeeProfile> employeeList;
    EmployeeProfile omuser;

    @Given("Boost Login page")
    public void userAccessTheBoostLoginPage() {
        loginSteps.openBoostLoginPage();
    }

    @When("A Team mate user logs in")
    public void aTeamMateUserLogsIn() throws InterruptedException {
        omuser = loginSteps.UserLogsIn("DirectReport");
    }

    @When("A Team Leader user logs in")
    public void aTeamLeaderUserLogsIn() throws InterruptedException {
        omuser = loginSteps.UserLogsIn("TL");
    }

    @When("An Operations Manager user logs in")
    public void anOMUserLogsIn() throws InterruptedException {
        omuser = loginSteps.UserLogsIn("OM");
    }

    @When("An Admin user logs in")
    public void anAdminUserLogsIn() throws InterruptedException {
        omuser = loginSteps.UserLogsIn("Admin");
    }


    @When("A Supervisor logs in")
    public void aSupervisorLogsIn() {
        omuser = loginSteps.UserLogsIn("Supervisor");
    }
}
