package org.pojo;

import org.baseClass.HelpClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFb extends HelpClass {
	public LoginFb() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "pass")
	private  WebElement password;
	
	@FindBy(xpath = "(//a[@class='button button-orange'])[2]")
	private  WebElement drag;
	
	@FindBy(xpath = "(//li[@class='placeholder'])[2]")
	private  WebElement drop;

	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div[1]/h2")
	private WebElement text;
	
	@FindBy(name = "login")
	private  WebElement click;
	@FindBy(xpath="//strong[(@id='u_0_c_8E')]")
	private WebElement checktext;
	
	
	public WebElement getChecktext() {
		return checktext;
	}


	public WebElement getText() {
		return text;
	}


	public WebElement getDrag() {
		return drag;
	}


	public WebElement getDrop() {
		return drop;
	}
	


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getClick() {
		return click;
	}




	}

