package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:Reports/cucumber_reports/cucumber-reportsTC05.html",
                "json:Reports/json_reports/cucumberTC05.json",
                // json format api lar icin gecerli.
                "junit:Reports/xml_reports//cucumberTC05.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false
)
public class Runner {

}
