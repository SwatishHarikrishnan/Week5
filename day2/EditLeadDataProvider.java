package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadDataProvider extends BaseClass2 {
	
	@BeforeTest
	public void setfilename()
	{
		ExcelFilename="Editlead";
	}

	@Test(dataProvider = "senddata")
	public void rundeditlead(String phonenumber, String companyname) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Find Leads")).click();	
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.name("submitButton")).click();
}
}






