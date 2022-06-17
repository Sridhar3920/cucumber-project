package org.stepDefinition;

import org.baseClass.HelpClass;
import org.pojo.LoginFb;

import io.cucumber.java.en.*;

public class ExampleTagSteps extends HelpClass {
	
	@Given("To open the browser")
	public void to_open_the_browser() {
		   chromeBrowser();
		   url("https://www.facebook.com");
 
	}

	@When("To pass the valid {string} and {string}")
	public void to_pass_the_valid_and(String string, String string2) {
		LoginFb l=new LoginFb();
		toText(l.getUsername(), string);
		toText(l.getPassword(), string2);
	}

	@Then("To check login button")
	public void to_check_login_button() {
		LoginFb l=new LoginFb();
		btnClick(l.getClick());
		quit();
	}

}
