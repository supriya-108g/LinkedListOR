/*This code is to check for all the 4 links available in the Type of Linked List Page.
 * The browser here moves out of the application dsalgo to javapoint.com.
 * The links and navigation is test here.
 * An object repository is created at the project level
 * in the application.properties file.All elements are identified using the key value pair from the application.properties file.
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

public class Test_TypesOfLinkListsPage extends Base_Class_LinkedLink {
	

	public void CheckLinks() throws InterruptedException
	{
		
	
	WebElement Types_Of_Linked_List_1 = driver.findElement(parser.getObjectLocator("Types_Of_Linked_List"));
    Types_Of_Linked_List_1.click();
	}
    
	@Test(priority=1)
	public void Single_Link_List_Intro_Page() throws  InterruptedException
	{
	CheckLinks();	
    WebElement Single_Link_List_Intro_Page_1 = driver.findElement(parser.getObjectLocator("Single_Link_List_Intro_Page"));
    Single_Link_List_Intro_Page_1.click();
    String Actual_url_1=driver.getCurrentUrl();
    Assert.assertEquals(Actual_url_1, "https://www.javatpoint.com/singly-linked-list");
	Reporter.log(Actual_url_1+"Sinlgle Linked List Works");
	driver.navigate().back();
    Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void Linked_list_jp() throws  InterruptedException
	{
	//CheckLinks();
    WebElement Linked_list_jp_1= driver.findElement(parser.getObjectLocator("Linked_list_jp"));
    Linked_list_jp_1.click();
    String Actual_url_2=driver.getCurrentUrl();
    Assert.assertEquals(Actual_url_2, "https://www.javatpoint.com/ds-linked-list");
	Reporter.log(Actual_url_2+"DS Linked List Works");
	driver.navigate().back();
    Thread.sleep(2000);
	}
    
	@Test(priority=3)
	public void Double_Link_List_jp() throws  InterruptedException
	{
	//CheckLinks();
    WebElement Double_Link_List_jp_1 = driver.findElement(parser.getObjectLocator("Double_Link_List_jp"));
    Double_Link_List_jp_1.click();
    String Actual_url_3=driver.getCurrentUrl();
    Assert.assertEquals(Actual_url_3, "https://www.javatpoint.com/doubly-linked-list");
	Reporter.log(Actual_url_3+"Doubly Linked Link Works");
	driver.navigate().back();
    Thread.sleep(2000);
    }
	
	@Test(priority=3)
	public void JP_Types_Of_Linked_List() throws  InterruptedException
	{
	//CheckLinks();
    WebElement JP_Types_Of_Linked_List_1 = driver.findElement(parser.getObjectLocator("JP_Types_Of_Linked_List"));
    JP_Types_Of_Linked_List_1.click();
    String Actual_url_4=driver.getCurrentUrl();
    Assert.assertEquals(Actual_url_4, "https://www.javatpoint.com/ds-types-of-linked-list");
	Reporter.log(Actual_url_4+"Types Link Works");
	driver.navigate().back();
    Thread.sleep(2000);
 
    }
	
	@AfterClass
	public void close() throws InterruptedException
	{
		
		WebElement Sign_Out_1= driver.findElement(parser.getObjectLocator("Sign_Out"));
        Sign_Out_1.click();
        driver.quit();
	}
}