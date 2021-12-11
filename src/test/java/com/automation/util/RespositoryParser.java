package com.automation.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class RespositoryParser {

	public FileInputStream stream;
	public String RepositoryFile;
	public static Properties propertyFile = new Properties();
	public static WebDriver driver;
	public RespositoryParser(String fileName) throws IOException
	{
		this.RepositoryFile = fileName;
		stream = new FileInputStream(RepositoryFile);
		propertyFile.load(stream);
		
	}
	
	
	public By getObjectLocator(String locatorName)
	{
		//By locator=null;
		String locatorProperty = propertyFile.getProperty(locatorName);
		System.out.println(locatorProperty.toString());
		//String locatorType = locatorProperty.split(":")[0];
		//String locatorValue = locatorProperty.split(":")[1];
		By locator=null;
		locator = By.xpath(locatorProperty);
		System.out.print("Element Found"+locatorName);
		return locator;

}

}