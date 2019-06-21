package com.planittesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddAccountPage extends BasePage{
	
	public AddAccountPage(WebDriver driver) {
	super(driver);

}
	
@FindBy(how=How.CSS, using ="input[name='cusid']")
WebElement customerIdEntry;

@FindBy(how=How.CSS, using ="select[name='selaccount']")
WebElement accountType;

@FindBy(how=How.CSS, using ="input[name='inideposit']")
WebElement initialDeposit;

@FindBy(how=How.CSS, using ="input[type='submit']")
WebElement submitbtn;

public void enterCustomerId()
{
	customerIdEntry.sendKeys("105455");
}

public void accountType(WebElement accountType)
{
	Select select = new Select(accountType);
			select.selectByValue("Current");
}

public void enterInitialDeposit()
{
	initialDeposit.sendKeys("1000");
}

public void clickSubmit()
{
	submitbtn.click();
}
	
public void createNewAccount()
{
	enterCustomerId();
	accountType(accountType);
	enterInitialDeposit();
	clickSubmit();
}
	
}