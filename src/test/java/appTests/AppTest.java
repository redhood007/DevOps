package appTests;

import org.testng.annotations.Test;

import org.testng.Assert;

import login.App;

public class AppTest {
	
	@Test(description="Login with valid details")
	public void loginTest()throws Exception {
		App ap=new App();
		
		boolean status= ap.userLogin("userdemo","password");
		Assert.assertTrue(status);
	}
	
	@Test(description="Login with invalid details")
	public void loginTestInvalid()throws Exception {
		App ap=new App();
		
		boolean status= ap.userLogin("userfake","password");
		Assert.assertFalse(status);
	}
}
