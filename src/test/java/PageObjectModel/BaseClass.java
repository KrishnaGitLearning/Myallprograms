package PageObjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	File file = new File("C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\SELF-PRACTISE\\Configuration.file");
	String browser = null;
	String url = null;
	
	@BeforeMethod
	public void start() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		
		prop.load(fileInput);
		
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		
		
	}
	
	@AfterMethod
	public void stop() {
		
		
		
		
	}
	
	
	
}
