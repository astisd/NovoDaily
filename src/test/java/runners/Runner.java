package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports-try.html",
                "json:target/json-reports/cucumberTry.json",
                // json format api lar icin gecerli.
                "junit:target/xml-report/cucumberTry.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@try",
        dryRun = false
)
public class Runner {



}
