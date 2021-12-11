/*This code is to test data driven testing for registration page only
No object repository was used for this page*/

package com.automation.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;

import com.automation.pages.RPageObjects;
//import com.automation.utility.ExcelUtils18_dsalgo;
import com.automation.util.ReadExcel;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
public class Test_Registration_Excel_DD extends BaseClass {
	

	@Test(dataProvider="test1data", priority=1)
	public void Rapp(String Username,String Password) throws InterruptedException
	{
	 //To get the page title
	  Reporter.log("Page url : " +driver.getTitle());
	  
	  Thread.sleep(5000);
	  //Abstraction is showing the essential features and hiding the background details
	  
	  //To create instance of the Login Page Objects class   
	  RPageObjects RPageObj = PageFactory.initElements(driver,RPageObjects.class);   
	  RPageObj.Rvalidation(Username, Password);
	  
	  Thread.sleep(5000);
	  
	 } 

@DataProvider(name = "test1data")

public Object[][] getData() throws IOException
{
	
	//String excelpath = "C:\\Users\\Supriya\\eclipse-workspace_202109NN\\SeleniumAutomation\\src\\TestData\\Login.xlsx";
	String excelpath = "C:\\Users\\Supriya\\eclipse-workspace_202109NN\\Linked_List1\\src\\test\\TestData\\DsAlgo Login.xlsx";
	
	String sheetname="Sheet1";
	
	//Call the excel data provider function
	Object data [][] = ReadExcel.read(excelpath,sheetname);
	
	return data; //return the data object
	
}
 

}
 