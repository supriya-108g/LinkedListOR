package com.automation.pages;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.automation.util.BrowserFactory;

public class BaseClass  {
	
	public WebDriver driver;
  
  @BeforeTest
  public void beforeClass() throws InterruptedException
  {  
  driver = BrowserFactory.startApplication(driver, "Chrome", "http://dsportalapp.herokuapp.com/");
  driver.findElement(By.xpath("//button[@class='btn']")).click();
  Reporter.log("Welcome to the home page ");
  driver.findElement(By.xpath("//a[@href='/register']")).click();
  System.out.println("You are on the register page now ");
  Thread.sleep(2000); 
  }

 
  
	  @AfterTest
		public void close() throws InterruptedException
		{
		
			driver.quit();
		}
  }


