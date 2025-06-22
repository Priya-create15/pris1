package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.HomePage;

public class TC001_LoginTest extends BaseClass {
	
	
	
	@Test()
	public void Login() {
		logger.info("**** My test execution starts here ****");
		try
		{
	HomePage hp= new HomePage(driver);	
		hp.emailUserName(p.getProperty("email"));
		hp.emailPassWord(p.getProperty("password"));
		hp.loginButton();
		
	DashboardPage dp=new DashboardPage(driver);
	String confmsg=dp.Dashboard();
	Assert.assertEquals(confmsg, "Dashboard");
		}catch(Exception e)
		{
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();
			
		}
		logger.info("*** Test is completed ****");
		
	}
	
	
	
	
	}
	

