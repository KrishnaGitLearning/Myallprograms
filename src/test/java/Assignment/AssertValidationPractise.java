package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertValidationPractise {
	
	@Test
	public void assertVal() {
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		
	}
	
	@Test
	public void validationOfSeleniumPage() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		String Actual = driver.getTitle();
		String Expected = "Selenium";
		System.out.println(Actual);
		if(Actual.equalsIgnoreCase(Expected)) {
			
			System.out.println("The Test Case is Passed");
			
		} else {
			
			
			System.out.println("The test Case is Failed");
		}
			
			
		
	}
	
	
}
