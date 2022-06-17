package org.stepDefinition;

import java.util.List;

import org.baseClass.HelpClass;
import org.junit.Assert;
import org.pojo.LoginFb;

import io.cucumber.java.en.*;

public class DataTable extends HelpClass {
	
	
	@Given("To open the Facebook in chromeBrowser")
	public void to_open_the_Facebook_in_chromeBrowser() {
	   launchBrowser("https://www.facebook.com");
	   
	   
	}

	

	@Then("click a login button")
	public void click_a_login_button() {
		LoginFb l=new LoginFb(); 
		btnClick(l.getClick());
		
	}

	@Then("to check successfully login or not")
	public void to_check_successfully_login_or_not() {
		/*LoginFb l=new LoginFb();
		implicitlyWaitSeconds();
		
		checkText(l.getChecktext(), "Two-factor authentication required");
		printGetText(l.getChecktext());*/
	 close();
	  
	}

	@When("Enter the invalid username")
	public void enter_the_invalid_username(io.cucumber.datatable.DataTable d) {
		List<List<String>> a = d.asLists();
		String user = a.get(0).get(0);
		String pass = a.get(0).get(1);
		LoginFb l=new LoginFb(); 
		  toText(l.getUsername(), user);
		    toText(l.getPassword(), pass);
		
		
	   
	}

	@When("Enter the invalid password")
	public void enter_the_invalid_password(io.cucumber.datatable.DataTable d) {
		List<List<String>> a = d.asLists();
		String user = a.get(0).get(0);
		String pass = a.get(0).get(1);
		LoginFb l=new LoginFb(); 
		  toText(l.getUsername(), user);
		    toText(l.getPassword(), pass);
	}
	@When("Enter the valid username and valid password")
	public void enter_the_valid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
	   List<String> a = d.asList();
	  String user = a.get(0);
	  String pass = a.get(1);
	  LoginFb l=new LoginFb(); 
	  toText(l.getUsername(), user);
	  toText(l.getPassword(), pass);
	  
	}

}
