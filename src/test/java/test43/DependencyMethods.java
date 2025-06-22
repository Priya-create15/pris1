package test43;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

import junit.framework.Assert;

public class DependencyMethods {
	
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(true);
		}
	
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login() {
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods= {"search","login"})
	void AdvanceSearch() {
		Assert.assertTrue(false);
	}
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(false);
	}
}
