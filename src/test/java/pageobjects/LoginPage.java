package pageobjects;

import configuration.ConfigFileReader;
import configuration.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
    ConfigFileReader configFileReader = new ConfigFileReader();
    WebDriverManager webDriverManager = new WebDriverManager();

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void accesstheURLadress() {
        webDriverManager.getDriver().get(configFileReader.getApplicationUrl());
        System.out.println("AAAAAAAA"+ configFileReader.getApplicationUrl());
    }
}
