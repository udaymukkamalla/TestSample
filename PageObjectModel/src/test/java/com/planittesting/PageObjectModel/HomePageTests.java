package com.planittesting.PageObjectModel;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class HomePageTests extends MasterTest{
	
	
/*	@Test1
	public void newCustomerCreation() throws InterruptedException{
		
	LoginPage loginpage1 = PageFactory.initElements(driver, LoginPage.class);	
	loginpage1.loginFunctionality();
			
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	homepage.clickNewCustomer();
	}*/
	
	@Test
	public void addAccount() throws InterruptedException{
	LoginPage loginpage1 = PageFactory.initElements(driver, LoginPage.class);	
	loginpage1.loginFunctionality();
	
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	homepage.clickAddAccount();
		
	}
}
