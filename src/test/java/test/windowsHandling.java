package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsHandling {

	@Test	
	public void wHandling() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/krishnamoorthy.kasi/OneDrive%20-%20SoftwareONE/Desktop/Selenium%20Original/Selenium.Learning/src/test/java/SeleniumLearningTest/loginPage.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder = 'Enter Username']")).sendKeys("Krishnamoorthy Kasi");
		driver.findElement(By.xpath("//input[@placeholder = 'Enter Password']")).sendKeys("123");
		
		String pAddress = driver.getWindowHandle();
		System.out.println("Parent Window Opaque ID:" + pAddress);
		driver.findElement(By.linkText("Reset Password")).click();
		Set<String> openWindows = driver.getWindowHandles();
		System.out.println("No.of.Windows opened" + " " + openWindows.size());
		
		for(String cWindow : openWindows ) {
			
			if(!(cWindow.equals(pAddress))) {
				
				driver.switchTo().window(cWindow);
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@placeholder = 'Enter Username']")).sendKeys("Krishnamoorthy Kasi");
		driver.findElement(By.xpath("//input[@placeholder='Enter the new  Password']")).sendKeys("123");
		driver.close();
		
				
	}
	
}
