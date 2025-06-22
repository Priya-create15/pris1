package test42;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodlevelAnnotation {
	
	@BeforeMethod
	
	void login()
	{
		
		
	}
	
	
	@Test(priority=1)
	void search()
{
		

}
	@Test(priority=2)
	
	void AdvanceSearch()
	{
		
		
	}
	
	@AfterMethod()
 void logout() {
		
	}
	
	}

