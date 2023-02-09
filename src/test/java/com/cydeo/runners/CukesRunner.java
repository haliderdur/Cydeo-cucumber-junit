package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //feature file path
        glue = "com/cydeo/step_definitions", //step_definitions package path
        dryRun = true //turns off the step_definitions
)
public class CukesRunner {}
