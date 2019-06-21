package com.planittesting.PageObjectModel;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTests extends MasterTest{
	
	
	@Test
	public void signIn() throws InterruptedException
	{
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginFunctionality();
	}
}
