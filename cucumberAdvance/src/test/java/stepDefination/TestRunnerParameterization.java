package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/parameterization.feature", glue = {
		"stepDefination" }, monochrome = true, plugin = { "pretty", "html:Reports/htmlReportPara/html",
				"json:Reports/JsonReportPara/Cucumber.json", "junit:Reports/JunitReportPara/report.xml" })

public class TestRunnerParameterization {

}
