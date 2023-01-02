package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.LoginPage;
import utilis.Utilities;

public class CommonSteps extends Utilities {

    @Before
    public void startDriver() {
        initialize();
    }

    @After
    public void terminateDriver() {
        closed();
    }

    @Given("Navigate to {}")
    public void browserNavigate(String url) {
        navigate(url);
    }

    @Given("Wait for {}")
    public void browserNavigate(double duration) {
        waitFor(duration);
    }

}
