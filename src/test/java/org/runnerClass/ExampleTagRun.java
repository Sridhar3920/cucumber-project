package org.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\FeatureFile\\ExampleTag.feature",
		glue="org.stepDefinition"
		
		
		)


public class ExampleTagRun {

}
