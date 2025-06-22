package test43;

import org.testng.annotations.Test;

public class SigninAccount {

	@Test(priority=1,groups= {"regression"})
	void Signfacebook() {
		System.out.println("This is Regression1");
	}
	
	@Test(priority=2,groups= {"regression"})
	void SignEmail() {
		System.out.println("This is Regression2");
		
	}
	
	@Test(priority=3,groups= {"regression"})
	void twitter() {
		System.out.println("This is Regression3");
		
	}
}
