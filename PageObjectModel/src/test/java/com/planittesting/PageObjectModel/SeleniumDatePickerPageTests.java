package com.planittesting.PageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SeleniumDatePickerPageTests extends MasterTest{
	
@Test

public void selectDateAndTime() throws InterruptedException{
{
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.loginFunctionality();
	
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	homepage.clickSeleniumDropDown();
	
	HomePage homepage1 = PageFactory.initElements(driver, HomePage.class);
	homepage1.selectSeleniumDatePicker();
	
	SeleniumDatePickerPage seleniumdatepickerpage = PageFactory.initElements(driver, SeleniumDatePickerPage.class);
	seleniumdatepickerpage.enterDateAndTime();	
	}

}
}