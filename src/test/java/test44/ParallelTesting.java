package test44;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParallelTesting {
	
	WebDriver driver;
	
	@BeforeClass()
	@Parameters({"browser","url"})
	void openapp(String br,String url) throws InterruptedException {
		
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver(); break;
		case "edge":driver= new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default :System.out.println("Invalid browser");return; //return will execute when there is no browser, as there is no
															// browser there is no use of executing commands so it will execute
															//from the switch block
		
	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
	}	
	
	
	@Test(priority=1)
		
		void verifylogo() throws InterruptedException{
		
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
		
	}
	
	@Test(priority=2)
	void testtitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	
	
	@Test(priority=3)
	
	void testurl() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass()
	void teardown() {
		
		
	}
	
}
