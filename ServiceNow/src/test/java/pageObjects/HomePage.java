package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement usernameinputbox;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordinputbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clkloginbtn;
	
	
	
	
	public void emailUserName(String Uname) {
		usernameinputbox.sendKeys(Uname);
	}
	
	public void emailPassWord(String pname) {
		passwordinputbox.sendKeys(pname);
	}
	
	public void loginButton() {
		clkloginbtn.click();
	}
}
