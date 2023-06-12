package FrameworkPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationAssestment extends BaseClass {
	
	
	
	@Test
	public void passwordnumlValidation() throws Exception {
		
		//1 - Tc1-validate the password contains numbers
		
		driver.findElement(By.id("display-name")).sendKeys("Krishna\n");
		driver.findElement(By.id("email")).sendKeys("123@hotmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("12345\n");
		WebElement errorMsg = driver.findElement(By.xpath("//p[contains(text(),'Passwords must contain at least eight characters')]"));
		System.out.println(errorMsg.getText());
		String expected = "Passwords must contain at least eight characters, including at least 1 letter and 1 number.";
		Assert.assertEquals(expected, errorMsg.getText());
		Thread.sleep(5000);
		driver.close();
		
}	
	
	
	
	@Test
	public void passwordCharacterValidation() {
		
		//2- Tc2-validate the password contains character
		
		
		driver.manage().window().maximize();
		WebElement signUp = driver.findElement(By.linkText("Sign up"));
		signUp.click();
		driver.findElement(By.id("display-name")).sendKeys("Krishna\n");
		driver.findElement(By.id("email")).sendKeys("123abc@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Dhoni1\n");
		//driver.findElement(By.id("recaptcha-anchor")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//p[contains(text(),'Must contain at least')]"));
		System.out.println(errorMsg.getText());
		String expected = "Must contain at least 1 more character.";
		Assert.assertEquals(expected, errorMsg.getText());

	}

	
	@Test
	public void passwordCharacterRulesValidation() {
		
		//Tc3 - less then 8 character must contain letter and number
		
		
		driver.findElement(By.id("display-name")).sendKeys("Krishna\n");
		driver.findElement(By.id("email")).sendKeys("123abc@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Dhoni8*\n");
		//driver.findElement(By.id("recaptcha-anchor")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//p[contains(text(),'Must contain at least')]"));
		System.out.println(errorMsg.getText());
		String expected = "Must contain at least 1 more character.";
		Assert.assertEquals(expected, errorMsg.getText());
		driver.close();

	}


	
	@Test
	public void invalidEmailValidation() throws Exception {
		
		//Tc4-invalid email id and check msg
		
		driver.findElement(By.id("display-name")).sendKeys("Krishna\n");
		driver.findElement(By.id("email")).sendKeys("123abc@aaa");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Dhoni100\n");
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("recaptcha-anchor")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class = 'd-flex fd-column gs4 gsy js-auth-item has-error']/p"));
		System.out.println(errorMsg.getText());
		String expected = "123abc@aaa is not a valid email address.";
		Assert.assertEquals(expected, errorMsg.getText());
		
		
	}

	@Test
	public void incorrectCredentialValidation() {
		
		//Tc5- incorrect user name and password
		//doubt
	
		driver.findElement(By.id("display-name")).sendKeys("123\n");
		driver.findElement(By.id("email")).sendKeys("123abc@aaa");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("1234444\n");
		//driver.findElement(By.id("recaptcha-anchor")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//p[contains(text(),'Please add one of the following')]"));
		System.out.println(errorMsg.getText());
		String expected = "Please add one of the following things to make your password stronger:";
		Assert.assertEquals(expected, errorMsg.getText());

	}
	
	@Test
	public void captchaValidation() throws InterruptedException {
		
		//Tc6- dont select captcha and validate te error msg showing to select captcha
		
		driver.findElement(By.id("display-name")).sendKeys("Krishna\n");
		driver.findElement(By.id("email")).sendKeys("123abc@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Dhoni100\n");
		//driver.switchTo().frame(0);
		//Thread.sleep(5000);
		//driver.findElement(By.id("recaptcha-anchor")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//p[@class = 's-input-message m0 p0 js-error-message']"));
		System.out.println(errorMsg.getText());
		String expected = "CAPTCHA response required.";
		Assert.assertEquals(expected, errorMsg.getText());
		Thread.sleep(5000);
		driver.close();
		
	}

	
	
	
}
