package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Feature\\CucumberReport.feature",
glue={"StepDefinition"},
plugin = {"pretty","html:target/cucumber-reports/reports2.html"},monochrome = true,
dryRun = false)
public class TestRunner {

}
