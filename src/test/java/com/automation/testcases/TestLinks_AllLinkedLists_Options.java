/*This code tests the different links in the linked list module available
 * and their back and forth navigation
 * An object repository is created at the project level
 * in the application.properties file.All elements are identified using the key value pair from the .properties file.
 * A RepositoryParser.java class was created where the By abstract class has been used.The idea of creating a repository is
 * to identify the element once and resuse it anywhere for any test-scenario without having to identify it repeatedly*/
  

package com.automation.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.automation.pages.Base_Class_LinkedLink;


public class TestLinks_AllLinkedLists_Options extends Base_Class_LinkedLink {
	


		@Test
	public void Introduction_Check() throws InterruptedException
		{
			
			WebElement Introduction = driver.findElement(parser.getObjectLocator("Introduction1_key"));
			Introduction.click();
			String Actual_url=driver.getCurrentUrl();
			Assert.assertEquals(Actual_url, "http://dsportalapp.herokuapp.com/linked-list/introduction/");
			Reporter.log("The Introduction Link Navigation Works"+Actual_url);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        
		}
		
		@Test
		public void Creating_Linked_List_Check() throws InterruptedException
			{
	        WebElement Creating_Linked_List_1 = driver.findElement(parser.getObjectLocator("Creating_Linked_List"));
	        Creating_Linked_List_1.click();
			String Actual_url_2=driver.getCurrentUrl();
			Assert.assertEquals(Actual_url_2, "http://dsportalapp.herokuapp.com/linked-list/creating-linked-list/");
			Reporter.log("Creating_Linked_List Navigation Works"+Actual_url_2);
	        driver.navigate().back();
	        Thread.sleep(2000); 
			}
		
		@Test
		public void Types_Of_Linked_List() throws InterruptedException
		{
	        WebElement Types_Of_Linked_List_1 = driver.findElement(parser.getObjectLocator("Types_Of_Linked_List"));
	        Types_Of_Linked_List_1.click();
			String Actual_url_3=driver.getCurrentUrl();
			Assert.assertEquals(Actual_url_3, "http://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/");
			Reporter.log("Types Link Navigation Works"+Actual_url_3);
			driver.navigate().back();
	        Thread.sleep(2000);
		}
		
		
		@Test
		public void Implement_Linked_List_In_Python() throws InterruptedException
		{     
	        WebElement Implement_Linked_List_In_Python_1= driver.findElement(parser.getObjectLocator("Implement_Linked_List_In_Python"));
	        Implement_Linked_List_In_Python_1.click();
			String Actual_url_4=driver.getCurrentUrl();
			Assert.assertEquals(Actual_url_4, "http://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/");
			Reporter.log("Implemented Linked Lists Links Navigation Works "+Actual_url_4);
			driver.navigate().back();
	        Thread.sleep(2000);
		}
	      
		@Test
		public void Traversal() throws InterruptedException
		{ 
	        WebElement Traversal_1 = driver.findElement(parser.getObjectLocator("Traversal"));
            Traversal_1.click();
			String Actual_url_5=driver.getCurrentUrl();
			Assert.assertEquals(Actual_url_5, "http://dsportalapp.herokuapp.com/linked-list/traversal/");
			Reporter.log("Traversal Link Navigation Works"+Actual_url_5);
			driver.navigate().back();
	        Thread.sleep(2000);
		}
		
		
		@Test
		public void Insertion() throws InterruptedException
		{ 
	        WebElement Insertion_1 = driver.findElement(parser.getObjectLocator("Insertion"));
	        Insertion_1.click();
			String Actual_url_6=driver.getCurrentUrl();
			Assert.assertEquals(Actual_url_6, "http://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/");
			Reporter.log("Insertion Link Navigation Works"+Actual_url_6);
			driver.navigate().back();
	        Thread.sleep(2000); 
		}
		

		@Test
		public void Deletion() throws InterruptedException
		{ 
	        WebElement Deletion_1 = driver.findElement(parser.getObjectLocator("Deletion"));
	        Deletion_1.click();
			String Actual_url_7=driver.getCurrentUrl();
			Assert.assertEquals(Actual_url_7, "http://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/");
			Reporter.log("Deletion Link Navigation Works"+Actual_url_7);
			driver.navigate().back();
	        Thread.sleep(2000);
	        
		}
	      
 

		@AfterClass
		public void close() throws InterruptedException
		{
			
			WebElement Sign_Out_1= driver.findElement(parser.getObjectLocator("Sign_Out"));
	        Sign_Out_1.click();
	        
	         String expectedAlertMessage_2="Logged out successfully";
			 WebElement Message1=driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
			 String actualAlertMessage=Message1.getText();
			 Assert.assertEquals(expectedAlertMessage_2,actualAlertMessage);
			 Reporter.log(actualAlertMessage+"Status of LogOut");
			 Thread.sleep(2000);
			driver.quit();
		}
}