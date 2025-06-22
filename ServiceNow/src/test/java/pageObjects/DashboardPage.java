package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

	public DashboardPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement orangehrmdashboard;
	
	public String Dashboard() {
		try{
			return(orangehrmdashboard.getText());
						}
		catch(Exception e) {
		return(e.getMessage());
		}
	}
	}
	

