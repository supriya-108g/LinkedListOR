/*This code completely checks the end to end flow from selecting a linked list option to
 * trying the python editor and handling the alert message.An object repository is created at the project level
 * in the application.properties file.All elements are identified using the key value pair from the application.properties file.
 * A RepositoryParser.java class was created where the By abstract class has been used.The idea of creating a repository is
 * to identify the element once and resuse it anywhere for any test-scenario without having to identify it repeatedly*/
 

package com.automation.testcases;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.automation.pages.Base_Class_LinkedLink;


public class TestClass_TryHere extends Base_Class_LinkedLink{
	

public void Try_Here() throws InterruptedException
{
WebElement LL_Intro1_Try_Editor_1 = driver.findElement(parser.getObjectLocator("LL_Intro1_Try_Editor"));
LL_Intro1_Try_Editor_1.click();	
WebElement Python_Code_Box_1= driver.findElement(parser.getObjectLocator("Python_Code_Box_SK"));
Python_Code_Box_1.sendKeys(" Print 5 ");

WebElement Run_Python_1= driver.findElement(parser.getObjectLocator("Run_Python"));
Thread.sleep(1000);
Run_Python_1.click();
Thread.sleep(1000);

 String expectedAlertMessage="SyntaxError: bad input on line 1";
 String actualAlertMessage=driver.switchTo().alert().getText();
 Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
 Reporter.log(actualAlertMessage+"texteditor alert handled");
 driver.switchTo().alert().accept();

 
driver.navigate().back();
WebElement Practice_Questions_1= driver.findElement(parser.getObjectLocator("Practice_Questions"));
Practice_Questions_1.click();
String Actual_url_8=driver.getCurrentUrl();
Assert.assertEquals(Actual_url_8, "http://dsportalapp.herokuapp.com/linked-list/practice");
Reporter.log(Actual_url_8+"Practice Page URL Works");
driver.navigate().back();
Reporter.log(driver.getCurrentUrl());
Thread.sleep(2000);
driver.navigate().back(); 
}

		
		@Test
		public void ChooseIntroduction_LL_Check_Links_On_Page() throws InterruptedException
		{
			
			WebElement Introduction = driver.findElement(parser.getObjectLocator("Introduction1_key"));
			Introduction.click();
		    Try_Here();
		    
		}
			

		@Test
		public void Creating_Linked_List() throws InterruptedException
		{
			
			WebElement Creating_Linked_List_1 = driver.findElement(parser.getObjectLocator("Creating_Linked_List"));
			Creating_Linked_List_1.click();
			Try_Here();
			
		}
		
		
		@Test
		public void Types_Of_Linked_List() throws InterruptedException
		{
			
			WebElement Types_Of_Linked_List_1 = driver.findElement(parser.getObjectLocator("Types_Of_Linked_List"));
			Types_Of_Linked_List_1.click();
			Try_Here();
		}
		
		@Test
		public void Implement_Linked_List_In_Python() throws InterruptedException
		{
			
			WebElement Implement_Linked_List_In_Python_1 = driver.findElement(parser.getObjectLocator("Implement_Linked_List_In_Python"));
			Implement_Linked_List_In_Python_1.click();
			Try_Here();
		}

		@Test
		public void Traversal() throws InterruptedException
		{
			
			WebElement Traversal_1 = driver.findElement(parser.getObjectLocator("Traversal"));
			Traversal_1.click();
			Try_Here();
		}
		
		@Test
		public void Insertion() throws InterruptedException
		{
			
			WebElement Insertion_1 = driver.findElement(parser.getObjectLocator("Insertion"));
			Insertion_1.click();
			Try_Here();
		}
		
		@Test
		public void Deletion() throws InterruptedException
		{
			
			WebElement Deletion_1 = driver.findElement(parser.getObjectLocator("Deletion"));
			Deletion_1.click();
			Try_Here();
		}
		
	

		@AfterTest
		public void close() throws InterruptedException
		{
			
			WebElement Sign_Out_1= driver.findElement(parser.getObjectLocator("Sign_Out"));
	        Sign_Out_1.click();
	        driver.quit();
		}

	}

