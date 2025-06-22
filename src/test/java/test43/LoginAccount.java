package test43;

import org.testng.annotations.Test;

public class LoginAccount {

	@Test(priority=1,groups= {"sanity"})
	void facebook() {
		System.out.println("This is Sanity1");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void Email() {
		System.out.println("This is Sanity2");
		
	}
	
	@Test(priority=3,groups= {"sanity"})
	void twitter() {
		System.out.println("This is Sanity3");
		
	}
}
	
	
	
	
	

