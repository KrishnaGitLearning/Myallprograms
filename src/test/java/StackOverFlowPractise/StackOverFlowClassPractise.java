package StackOverFlowPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StackOverFlowClassPractise {
	
	
	
	
	
	@Test
	public void emailValidation() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/users/signup?ssrc=head&returnurl=https%3a%2f%2fstackoverflow.com%2f");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name = 'display-name']")).sendKeys("krishna");
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Krishnaseven@hotmail.com");
		driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("Dhoni*1981 \n");
		String loc = driver.findElement(By.xpath("//p[contains(text(), 'CAPTCHA response')]")).getText();
		System.out.println(loc);
		String Expected = "CAPTCHA response required.";
		Assert.assertEquals(loc, Expected);
		
	}
	
	@Test
	public void logInFlowValidation() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/users/login?ssrc=head");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[contains(text(), 'Accept all')]")).click();
		//driver.findElement(By.xpath("//input[@name = 'display-name']")).sendKeys("krishna");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Krishnaseven@hotmail.com");
		driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("Dhoni*1981");
		driver.findElement(By.linkText("Log in")).click();
		//String loc = driver.findElement(By.xpath("//p[contains(text(), 'CAPTCHA response')]")).getText();
		//System.out.println(loc);
		//String Expected = "CAPTCHA response required.";
		//Assert.assertEquals(loc, Expected);
		
	}

}
