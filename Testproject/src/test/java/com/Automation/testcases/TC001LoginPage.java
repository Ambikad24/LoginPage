package com.Automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC001LoginPage extends BaseClass {
	
	public static void main (String[]args)
	
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id=\"form_submit_btn\"]")).click();
	}
	
	
}
