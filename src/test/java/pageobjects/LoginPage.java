package pageobjects;

import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "submit")
    private WebElement loginButton;

    private void enterUser() {
        usernameInput.sendKeys("user123@gmail.com");
    }

    private void enterPassword() {
        passwordInput.sendKeys("user123");
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void fillUsernamePasswordForm() {
        enterUser();
        enterPassword();
    }

    public void navigateToLoginPage(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }
}
