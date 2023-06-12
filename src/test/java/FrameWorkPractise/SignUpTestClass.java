package FrameWorkPractise;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTestClass extends BaseClass {
	
	
	@Test
	public void tc001_validate_signup_Flow(){
		
		SignUpPage sp = new SignUpPage();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		sp.signup("Krishna", "Krishna7591@gmail.com", "test@123");
		
		Assert.assertEquals("HomePage", driver.getTitle());
		
	}

}
