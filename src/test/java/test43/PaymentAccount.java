package test43;

import org.testng.annotations.Test;

public class PaymentAccount {

	@Test(priority=1,groups= {"sanity","regression","functional"})
	void PaymentRupees() {
		System.out.println("This is Sanity and Regression");
		}
	
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void PaymentDollars() {
		System.out.println("This is Sanity and Regression");
		}
	
}
