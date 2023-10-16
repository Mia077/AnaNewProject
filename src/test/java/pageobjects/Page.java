package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {
    WebDriver driver = new ChromeDriver();
    public Page() {
        PageFactory.initElements(driver, this);
    }
}
