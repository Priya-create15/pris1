package test42;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuitelevelAnnotation {

	@BeforeSuite()
	void suite() {
		
		System.out.println("Before Suite");
	}
	
	@BeforeTest()
	
	void before() {
	System.out.println("Before Test");	
	}
	
	
	@BeforeClass()
	void Beforeclass() {
		System.out.println("Before class");	
	}
	
	@BeforeMethod()
	void login() {
		System.out.println("Before method");	
	}
	
	@Test(priority=1)
	void m1() {
		System.out.println("This is the real Method1");
	}
	
	@Test(priority=2)
	void m2() {
		System.out.println("This is the real Method2");
	}
	
@AfterMethod()
	
	void after() {
	System.out.println("After Method");	
	}
	
	
	@AfterClass()
	void Afterclass() {
		System.out.println("After Class");	
	}
	
	@AfterTest()
	void Afterlogin() {
		System.out.println("After Test");	
	}
	
	@AfterSuite()
	void AfterSuite() {
		System.out.println("After Suite");	
	}
}
