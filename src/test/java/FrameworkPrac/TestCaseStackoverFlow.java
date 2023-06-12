package FrameworkPrac;

import org.testng.annotations.Test;

public class TestCaseStackoverFlow extends BaseClass{
	
	
	
	@Test
	public void tc001_validate_signup_Flow() {
		
		
		SignUp sp = new SignUp();
		sp.SignUp("Krishna", "Krishnaseven@hotmail.com", "password");
		
		
	}
	
}
