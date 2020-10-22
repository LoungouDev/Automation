package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				 "pretty", "html:target/cucumberHtmlReport",
			     "html:target/cucumberHtmlReport.html",     //  for html result
				 "pretty:target/cucumber-json-report.json"   // for json result
			     },
		publish = true,
		features = "src/test/java/features",
		glue= {"stepDefinitions"})



public class TestRunner {

}