package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;




public class RPageObjects {
	
	WebDriver driver;

//Constructor
public RPageObjects(WebDriver driver)
{
 this.driver = driver;
 PageFactory.initElements(driver, this);

}



//First Step : Defining WebElements
//@FindBy(name = "username" ) WebElement usernameEdit;
@FindBy(id = "id_username" ) WebElement usernameEdit;
@FindBy(id = "id_password1" ) WebElement passwordEdit;
@FindBy(id = "id_password2" ) WebElement confirmationEdit;
@FindBy(xpath = "//input[@value='Register']") WebElement Registerbutton1;
@FindBy(id = "id_password" ) WebElement passwordEdit_Login;

//Step 2: Perform actions
public void Rvalidation(String Username, String Password)
{
 //Enter the value for Username
 usernameEdit.sendKeys(Username);
 Reporter.log("Username value is picked from excel sheet and entered on the registration page");
 
 
 //Enter the value for Password
 passwordEdit.sendKeys(Password);
 Reporter.log("Password value is picked from excel sheet and entered on the registration page");  
 
 confirmationEdit.sendKeys(Password);
 Reporter.log("Password value is entered again for confirmation");  
 
 //Select the Login button
 Registerbutton1.click();
 Reporter.log("Submit button is entered");  
 //driver.findElement(By.xpath("//button[@class='btn']")).click();
 
 if(driver.getPageSource().contains("password_mismatch:The two password fields didn’t match.")) {
		 
		 System.out.println("Invalid Credentials..you will be directed to login page");
		 Reporter.log("Invalid Credentials.You will be directed to login page");
		// Assert.fail("Invalid Credentials..you will be directed to login page");
		 //driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
					driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SupriyaG");
		             driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123@");
					driver.findElement(By.xpath("//input[@value='Login']")).click();
					 driver.findElement(By.xpath("//a[@href='linked-list']")).click();
	 }
	 else {
		 System.out.println("valid Credentials");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 System.out.println("Test1");
		 driver.findElement(By.xpath("//a[@href='linked-list']")).click();
		 System.out.println("Test2");
		 }
 


}
}




  

