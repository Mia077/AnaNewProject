package hooks;

import configuration.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.FileReaderManager;

public class Hooks {
    WebDriverManager webDriverManager = new WebDriverManager();

    @Before
    public void browserSetUp() {
        System.out.println("Browser open.");
       // webDriverManager.getDriver().get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    @After
    public void tearDown() {
        System.out.println("Browser is closed.");
        webDriverManager.closeDriver();
    }
}
