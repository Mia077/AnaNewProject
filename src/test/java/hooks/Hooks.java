package hooks;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void browserSetUp() {
        System.out.println("Browser open.");
        testContext.getWebDriverManager().getDriver();
    }

    @After
    public void tearDown() {
        System.out.println("Browser is closed.");
       // testContext.getWebDriverManager().closeDriver();
    }
}
