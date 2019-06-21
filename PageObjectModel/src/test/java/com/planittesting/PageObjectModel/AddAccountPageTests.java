package com.planittesting.PageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddAccountPageTests extends MasterTest{
	
@Test
public void addAccount() throws InterruptedException{
{
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.loginFunctionality();
	
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	homepage.clickAddAccount();
	
	AddAccountPage addaccountpage = PageFactory.initElements(driver, AddAccountPage.class);
	addaccountpage.createNewAccount();
}

}
}