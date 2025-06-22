package test44;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParameterizationDataProvider {

	WebDriver driver;
	@BeforeClass
	void setup() {
		
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
		
		
	}
	
	
	@Test(dataProvider="dp")
	void login(String email, String pwd){
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean status=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else
		{
		Assert.fail();
		
		}
		
		
		
	}
	
	
	@AfterClass()
	void teardown() {
		
		driver.close();
		
	}
	
	@DataProvider(name="dp",indices= {0,2,3})
		Object[][] logindata() {
			Object data[][]= 
				{
					{"abc@gmail.com","test@123"},
					{"xyz@gmail.com","test@123"},
					{"ps9@gmail.com","test@123"},
					{"wer@gmail.com","test@12"}
				};
			return data;
		}
		
		
	}
	
	

