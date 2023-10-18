package managers;

import org.openqa.selenium.WebDriver;
import pageobjects.Dashboard;
import pageobjects.LoginPage;

public class PageObjectManager {
    private WebDriver driver;
    private LoginPage loginPage;
    private Dashboard dashboard;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public Dashboard getDashboard() {
        return (dashboard == null) ? dashboard = new Dashboard(driver) : dashboard;
    }

}
