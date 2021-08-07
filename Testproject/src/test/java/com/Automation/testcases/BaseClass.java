package com.Automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static String url="https://accounts.datoms.io/login";
	public static String uname="ambikad1997@gmail.com";
	public static String password="Elbow@123";
	public static WebDriver driver;
	/**
	 * TestNgFramework
	 */
	@BeforeTest
	public void setUp()
	{
		driver.setProperty("Webdriver.chrome.driver","C://Users//CHARAN//eclipse-workspace//Testproject//Drivers//chromedriver.exe");
	}
	
	@AfterTest
	public void quit()
	{
		driver.close();
	}

}
