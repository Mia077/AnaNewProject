package stepdefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class LoginSteps {

    TestContext testContext;
    LoginPage loginPage;

    public LoginSteps(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }


    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        System.out.println("User accessed the url");
//        String expectedResult = FileReaderManager.getInstance().getConfigReader().getApplicationUrl();
//        String actualResult = driver.getCurrentUrl();
//        System.out.println("expectedResult:" + expectedResult);
//        System.out.println("actualResult:" + actualResult);
//        Assertions.assertEquals(expectedResult, actualResult);
        loginPage.navigateToLoginPage();
    }

    @When("User introduce the right id an password")
    public void userIntroduceTheRightIdAnPassword() {
        System.out.println("Pune password");
        loginPage.fillUsernamePasswordForm();
        loginPage.clickLoginButton();
    }

}
