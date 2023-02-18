package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions // annotation to define the location of feature files, step definitions location through glue, what reporting integrations to use.
(
		features = ".\\src\\test\\java\\Feature\\Login.feature",
		glue = {"StepDefinationFile","hook"},
		dryRun = false,
		tags = " @smoketest and @regressiontest",
		monochrome = true ,   // just clan unwanted info from console 
	    plugin = {"pretty","html:reports/cucumber.html"} // it will print SDF path over along with the statement
		     // to generate html report just add a single line 
		)

        public class runner_Login_1  extends AbstractTestNGCucumberTests {

}
