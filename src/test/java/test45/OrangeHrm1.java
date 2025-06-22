package test45;

import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(test45.Mylistener.class) // we will not prefer this as we need implicitly add for each test the @Listeners Annotations, we will prefer only XML Listeners
public class OrangeHrm1 {
	
	

	
		
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
			Assert.assertTrue(false);
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

	
	
	


