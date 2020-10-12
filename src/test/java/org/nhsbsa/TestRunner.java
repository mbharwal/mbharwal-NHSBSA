package org.nhsbsa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features/nhsbsa.feature"},
        glue = {"org.nhsbsa.stepdefs"},
        plugin = {"json:target/cucumber-report.json","html:target/cucumber-html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}