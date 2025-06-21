package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//input[@id='input-email']")
	WebElement emaillogin;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement emailpsswrd;
	
	@FindBy(xpath="//input[@type='submit'][@value='Login']")
	WebElement lgnsbt;
	
	
	
	public void emailLogin(String uname) {
		emaillogin.sendKeys(uname);
	}
	
	public void emailPassword(String pwd) {
		emailpsswrd.sendKeys(pwd);
	}
	
	public void loginSubmit() {
		lgnsbt.click();
	}
	
	
		
	
		
	
}
