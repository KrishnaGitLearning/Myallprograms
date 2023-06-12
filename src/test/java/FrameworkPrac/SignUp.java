package FrameworkPrac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.core.sym.Name;

public class SignUp extends BaseClass {
	

	
	@FindBy(id = "display-name")
	WebElement dName;
	@FindBy(id = "email	")
	WebElement eMail;
	@FindBy(xpath = "//input[contains(@id, 'password')]")
	WebElement pwd;
	
	
	
	public SignUp() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void SignUp(String display_name, String emailid, String pwd ) {
		
		
		this.dName.sendKeys(display_name);
		this.eMail.sendKeys(emailid);
		this.pwd.sendKeys(pwd);

	}
	
}
