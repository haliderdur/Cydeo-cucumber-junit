package com.cydeo.step_definitions;

/*
in this class we will be able to pass pre and post conditions
to each scenario and each step
 */

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    // import from io.cucumber.java, not from junit
   // @Before(order = 0)
    public void setupScenario() {
        System.out.println("====> Setting up browser using cucumber @Before");
    }

    //@Before(value = "@login", order = 1)
    public void setupForLoginsScenario() {
        System.out.println("====> This will only apply to scenarios with @login tag");
    }

   // @Before("@database")
    public void setupForDatabaseScenario() {
        System.out.println("====> This will only apply to scenarios with @databese tag");
    }

    @After
    public void tearDownScenario(Scenario scenario) {

        // if scenario failes in feature file, attach screenshot into report
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();

        // System.out.println("====> Closing browser using cucumber @After");
        // System.out.println("====> Scenario ended/Take screenshot if failed");
    }

    //@BeforeStep
    public void setupStep() {
        System.out.println("---------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep() {
        System.out.println("---------> applying tearDown using @AfterStep");
    }
}
