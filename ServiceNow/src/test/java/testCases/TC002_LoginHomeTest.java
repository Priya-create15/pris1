package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AccountSuccessPage;
import pageObjects.LoginHomePage;
import pageObjects.LoginPage;

public class TC002_LoginHomeTest extends BaseClass {
	
	@Test()
	public void Login() {
		
		logger.info("*** Test Execution Starts here***");
		try {
	LoginHomePage lhp= new LoginHomePage(driver);
		lhp.MyAccount();
		lhp.Login();
		
	LoginPage lp=new LoginPage(driver);
	lp.emailLogin(p.getProperty("email"));
	lp.emailPassword(p.getProperty("password"));
	lp.loginSubmit();

	AccountSuccessPage asp=new AccountSuccessPage(driver);
	boolean target=asp.isAccountDispalyed();
	
	asp.logout();
	
	Assert.assertTrue(target);
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		
		logger.info("*** Test Execution completes here***");
	}
		
	
	
	
	
	
	

}
