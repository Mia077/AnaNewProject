package hooks;

import configuration.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriverManager webDriverManager = new WebDriverManager();
    @Before
    public void browserSetUp() {
        System.out.println("Browser open.");
        webDriverManager.getDriver();


    }

    @After
    public void tearDown() {
        System.out.println("Browser is closed. ");
       // webDriverManager.closeDriver();
    }
}
