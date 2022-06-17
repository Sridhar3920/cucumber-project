package org.runnerClass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "@D:\\eclipse\\CucumberFramework\\Rerun\\faildTc.txt",
		glue= "org.stepDefinition",
		dryRun=false,
		monochrome=true,
		tags= {"@Login"},
		plugin= {"pretty",
				"html:D:\\eclipse\\CucumberFramework\\report\\htmlReport\\login.html",
				"json:D:\\eclipse\\CucumberFramework\\report\\jsonReport\\login.json",
				"junit:D:\\eclipse\\CucumberFramework\\report\\junitReport\\login.junit",
				"rerun:D:\\eclipse\\CucumberFramework\\Rerun\\faildTc.txt"}
		
		
		
		)

public class ReRun {
	@AfterClass
	public static void jvm() {
		JVMReport.report("D:\\eclipse\\CucumberFramework\\report\\jsonReport\\login.json");
	}

}