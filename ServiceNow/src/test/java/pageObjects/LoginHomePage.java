package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHomePage extends BasePage {

	public LoginHomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement clklnkAccount;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement clklnkLogin;
	

	public void MyAccount() {
	clklnkAccount.click();
	}
	
	public void Login() {
		clklnkLogin.click();
		}
	
	
	
}
