package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	
	@Test
	public void regAmazon() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement mouseOver = driver.findElement(By.xpath("//a[@class = 'nav-a nav-a-2   nav-progressive-attribute'][1]"));
		Actions action = new Actions(driver);
		action.moveToElement(mouseOver).perform();
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Start here.")).click();
	
	}
	
}
