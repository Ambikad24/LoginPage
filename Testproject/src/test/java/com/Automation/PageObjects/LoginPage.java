package com.Automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(name="Username")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(id="login")
	WebElement LogIn;
	
	public WebElement setUserName(String uname) 
	{
		return txtUserName;
	}
	
	public WebElement setPassword(String password)
	{
		return txtPassword;
	}
	
	public WebElement setLogin()
	{
		return LogIn;
	}

}
