package com.planittesting.PageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewCustomerPageTests extends MasterTest{


@Test
public void enterNewCustomerDetails() throws InterruptedException
{
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.loginFunctionality();
	
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	homepage.clickNewCustomer();
	
	NewCustomerPage newcustomerpage = PageFactory.initElements(driver, NewCustomerPage.class);
    newcustomerpage.enterAllNewCustomerDetails();
    newcustomerpage.clickContinueOnRegistration();

}

}
