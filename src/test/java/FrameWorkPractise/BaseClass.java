package FrameWorkPractise;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;
	
	File file=new File("C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\Selenium.Learning");
	String url=null;
	String browser=null;
	
	@BeforeMethod
	public void start() throws Exception {
		FileInputStream fileInput=new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		if(browser.contentEquals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.get("https://stackoverflow.com/users/login?ssrc=head&returnurl=https%3a%2f%2fstackoverflow.com%2f");
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("https://stackoverflow.com/users/login?ssrc=head&returnurl=https%3a%2f%2fstackoverflow.com%2f");
			
		}
		
		/*else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			
	}*/


		//driver.manage().window().maximize();
		//driver.get(url);
		
		}
	
	
	@AfterMethod
	public void closeUp() {
		driver.quit();
		
	}
	

	
	
}
