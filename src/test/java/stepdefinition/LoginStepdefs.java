package stepdefinition;

import configuration.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import org.junit.jupiter.api.Assertions;

public class LoginStepdefs {
    WebDriverManager webDriverManager = new WebDriverManager();

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        System.out.println("User accessed the url");
        webDriverManager.getDriver().get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
        String expectedResult = FileReaderManager.getInstance().getConfigReader().getApplicationUrl();
        String actualResult = webDriverManager.getDriver().getCurrentUrl();
        System.out.println("expectedResult:" + expectedResult);
        System.out.println("actualResult:" + actualResult);
        Assertions.assertEquals(expectedResult, actualResult);
    }


    @When("User introduce the right id an password")
    public void userIntroduceTheRightIdAnPassword() {
        System.out.println("Pune password");
    }

    @Then("User is logged on the page")
    public void userIsLoggedOnThePage() {
        System.out.println("Sa logat");
    }


}
