package stepdefinition;

import configuration.ConfigFileReader;
import configuration.WebDriverManager;
import pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepdefs {

    WebDriverManager webDriverManager;
    LoginPage loginPage = new LoginPage(webDriverManager.getDriver());

    ConfigFileReader configFileReader;


    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        System.out.println("User on log page");
        webDriverManager.getDriver().get(configFileReader.getApplicationUrl());

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
