package org.stepDefinition;

import org.baseClass.HelpClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class ScreenShotWhenFaild extends HelpClass {
	@After(order=-1)
	public void screenShot(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot t=(TakesScreenshot)driver;
			byte[] as = t.getScreenshotAs(OutputType.BYTES);
			s.embed(as, "image/png");
			
		}
		
	}

}
