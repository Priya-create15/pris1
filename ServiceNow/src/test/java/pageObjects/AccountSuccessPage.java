package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSuccessPage extends BasePage{

	public AccountSuccessPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement accountSuccessPage;
	
	@FindBy(xpath="//a[@class='list-group-item'][text()='Logout']")
	WebElement logoutpage;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement continuelp;
	
	public boolean isAccountDispalyed() {
		try {
		return(accountSuccessPage.isDisplayed());
		}catch(Exception e) {
			
			return false;
			
		}
	}
	
	public void logout() {
		logoutpage.click();
	}
	
	public void continuelogout() {
		logoutpage.click();
	}

}
