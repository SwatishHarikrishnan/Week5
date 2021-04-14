package week5.day2;

import java.io.IOException;

import org.aopalliance.intercept.Invocation;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.cli.Main;

public class CreateleadDataProvider extends BaseClass2 {
	
	//Sending a value for a global variable named excelfilename
	@BeforeTest
	public void setexcelfilename()
	{
		ExcelFilename="Createlead";
	}
	
	@Test(dataProvider = "senddata")
	public void createleadinvo(String companyName, String firstName, String lastName) throws IOException 
	{
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
		
	}
		
	
}