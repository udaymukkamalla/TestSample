package com.planittesting.PageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CustomizedStatementPageTests extends MasterTest {
	
@Test
public void getCustomizedStatementPage() throws InterruptedException{
{
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.loginFunctionality();
	
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	homepage.clickCustomizedStatement();
}

}}
