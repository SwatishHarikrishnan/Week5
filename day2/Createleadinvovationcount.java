package week5.day2;

import org.aopalliance.intercept.Invocation;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Createleadinvovationcount extends BaseClass1 {
	
	@Test(invocationCount = 3)
	public void createleadinvo() 
	{
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Plintron");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swat");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("H");
		driver.findElement(By.name("submitButton")).click();
}
}
