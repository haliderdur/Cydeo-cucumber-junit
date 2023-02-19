package com.cydeo.runners;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features", //feature file path
        glue = "com/cydeo/step_definitions", //step_definitions package path
        dryRun = false,
        // dryRun=true -->turn off the step_definitions - code will not run, check the missing snippet
        // dryRun=false --> turn on the step_definitions exectution - code will run as expected
        tags = "@wip"

)
public class CukesRunner {

}
