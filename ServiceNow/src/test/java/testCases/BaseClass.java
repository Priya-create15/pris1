package testCases;

import java.net.URL;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.net.MalformedURLException;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.Logger;

public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	

	@BeforeClass()
	@Parameters({"os","browser"})
	public void setup(String os, String br) throws IOException {
		
		FileReader file= new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		logger=LogManager.getLogger(this.getClass());
		
		//os
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
		DesiredCapabilities cap= new DesiredCapabilities();
		
		if(os.equalsIgnoreCase("windows")) {
			cap.setPlatform(Platform.WIN10);
		}
		else if(os.equalsIgnoreCase("Mac")){
			cap.setPlatform(Platform.MAC);
			} 
		else if(os.equalsIgnoreCase("linux")){
			cap.setPlatform(Platform.LINUX);
			} 
		else{
			System.out.println("Not matching to any platform");
			return;
		}
		
		//browser
			switch(br.toLowerCase())	
			{
			case "chrome": cap.setBrowserName("chrome"); break;
			case "firefox": cap.setBrowserName("firefox"); break;
			case "edge": cap.setBrowserName("edge");break;
			default: System.out.println("No browsers matching");return;
			
			}
			
			try {
			    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			} catch (MalformedURLException e) {
			    e.printStackTrace();
			}
		}
			if(p.getProperty("execution_env").equalsIgnoreCase("local"))
			{
						
				switch(br.toLowerCase()) {
				case "chrome"	: driver= new ChromeDriver(); break;
				case "edge"	: driver= new EdgeDriver(); break;
				case "firefox":driver=new FirefoxDriver();break;
				default:System.out.println("This is invalid browser");return;
				}
				
			}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appUrl1")); // reading url from properties file
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown() {
		
	}

}
