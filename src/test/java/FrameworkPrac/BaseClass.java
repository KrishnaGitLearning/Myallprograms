package FrameworkPrac;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static ChromeDriver driver;
	
	File file = new File("C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\SELF-PRACTISE\\Configuration.file");
	String url = null;
	String browser = null;
	
	@BeforeMethod
	public void start() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		if(browser.contentEquals("chrome")){
		//	driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/users/signup?ssrc=head");
		driver.manage().window().maximize();
		}else if (browser.contentEquals("firefox")) {
			driver.get("https://stackoverflow.com/users/signup?ssrc=head");
			driver.manage().window().maximize();
			
		}else if (browser.contentEquals("edge")) {
			
			driver.get("https://stackoverflow.com/users/signup?ssrc=head");
			driver.manage().window().maximize();
			
		}
		
		
	}
	
	@AfterMethod
	
	public void close () {
		
		driver.quit();
		
		
		
	}
	
}
