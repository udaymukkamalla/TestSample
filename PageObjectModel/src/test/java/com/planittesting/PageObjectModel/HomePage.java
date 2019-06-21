package com.planittesting.PageObjectModel;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
	super(driver);

}
	
@FindBy(how=How.XPATH, using = "//a[contains(text(),'New Customer')]")
private WebElement NewCustomerLink;

@FindBy(how=How.XPATH, using ="//div[@class ='collapse navbar-collapse']//li[1]")
WebElement seleniumDropdown;

@FindBy(how=How.XPATH, using ="//a[contains(text(),'Selenium DatePicker Demo')]")
WebElement seleniumDatePicker;

@FindBy(how=How.XPATH, using ="//a[contains(text(),'New Account')]")
WebElement addAccount;

@FindBy(how=How.XPATH, using ="//a[contains(text(),'Customised Statement')]")
WebElement customizedStatementbtn;

public void clickNewCustomer() {
	NewCustomerLink.click();
}

public void clickAddAccount() {
	addAccount.click();
}

public void clickSeleniumDropDown()
{
	seleniumDropdown.click();
}

public void selectSeleniumDatePicker()
{
	seleniumDatePicker.click();
}


public void clickCustomizedStatement()
{
	customizedStatementbtn.click();
}	
	
}