package com.planittesting.PageObjectModel;
import org.openqa.selenium.chrome.*;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPage extends BasePage{
	
	public NewCustomerPage(WebDriver driver) {
	super(driver);

}
	
@FindBy(how=How.XPATH, using ="//input[@name ='name']")
private WebElement customerName;

@FindBy(how=How.CSS, using ="tr:nth-child(5) input:nth-child(2)")
private WebElement gender;

@FindBy(how=How.CSS, using ="input#dob")
private WebElement dateOfBirth;

@FindBy(how=How.XPATH, using="//textarea[@name='addr']")
private WebElement address;

@FindBy(how=How.XPATH, using ="//input[@name='city']")
private WebElement city;

@FindBy(how=How.XPATH, using ="//input[@name='state']")
private WebElement state;

@FindBy(how=How.XPATH, using ="//input[@name='pinno']")
private WebElement pin;

@FindBy(how=How.XPATH, using ="//input[@name='telephoneno']")
private WebElement phoneNumber;

@FindBy(how=How.XPATH, using ="//input[@name='emailid']")
private WebElement email;

@FindBy(how=How.XPATH, using ="//input[@name='password']")
private WebElement password;

@FindBy(how=How.CSS, using ="input[name='sub']")
WebElement submitbtn;

@FindBy(how=How.XPATH, using ="//table[@id= 'customer']//p")
WebElement customerSuccessfulRegistration;

@FindBy(how=How.XPATH, using ="//a[contains(text(),'Continue')]")
WebElement continuebtnregistration;


public void enterCustomerName()
{
	customerName.sendKeys("testuser");
}

public void selectGender()
{
	gender.click();
}

public void dateOfBirth()
{
	dateOfBirth.sendKeys("12122000");
}

public void address()
{
	address.sendKeys("macquarie");
}

public void city()
{
	city.sendKeys("sydney");
}

public void state()
{
	state.sendKeys("NewSouthWales");
}

public void pinEntry()
{
	pin.sendKeys("211333");
}

public void mobileNumber()
{
	phoneNumber.sendKeys("0000000000");
}

public void email()
{
	email.sendKeys("testuser545@gmail.com");
}

public void password()
{
	password.sendKeys("Welcome@123");
}

public void clickSubmit()
{
	submitbtn.click();
}

public void clickContinueOnRegistration()
{
	continuebtnregistration.click();
}

public void enterAllNewCustomerDetails()
{
	enterCustomerName();
	selectGender();
	dateOfBirth();
	address();
	city();
	state();
	pinEntry();
	mobileNumber();
	email();
	password();
	clickSubmit();
	
}
	
}