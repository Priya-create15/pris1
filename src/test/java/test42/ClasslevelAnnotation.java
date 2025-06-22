package test42;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClasslevelAnnotation {
	
	
	@BeforeClass
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
	
	@AfterClass()
 void logout() {
		
	}
	

}
