package stepdefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageobjects.Dashboard;

public class DashboardSteps {
    TestContext testContext;
    Dashboard dashboard;

    public DashboardSteps(TestContext context) {
        testContext = context;
        dashboard = testContext.getPageObjectManager().getDashboard();
    }

    @Then("User is logged on the page")
    public void userIsLoggedOnThePage() {
        System.out.println("Sa logat");
        dashboard.logout();
    }
}
