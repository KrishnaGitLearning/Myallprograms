package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment {
	
	
	@Test
	public void handlingDropDown() {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement ele = driver.findElement(By.xpath("//p/select"));
		Select select = new Select(ele);
		select.selectByIndex(21);
		
	}
	
	@Test
	public void handlingAlerts() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name ='alert']")).click();
		String output = driver.switchTo().alert().getText();
		System.out.println(output);
		driver.switchTo().alert().accept();
		
	}
	
	
	@Test
	public void tables() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
	
		
		
		
	}	
	
	
}
