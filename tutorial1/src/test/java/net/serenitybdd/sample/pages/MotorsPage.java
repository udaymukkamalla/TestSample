package net.serenitybdd.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;

public class MotorsPage extends PageObject{
	
	
	
@FindBy(how=How.XPATH, using ="//span[contains(text(),'Motorcycles')]")
WebElement motorcycles;

@FindBy(how=How.XPATH, using ="//span[contains(text(),'Parts & Accessories')]")
WebElement partsAndAccessories;

@FindBy(how=How.XPATH, using ="//a[contains(text(),'All Parts & Accessories')]")
WebElement allPartsAndAccessories;


public void verifyMotorCycles()
{
	motorcycles.getText();
}

public void clickMotorCycles()
{
	motorcycles.click();
}

public void clickPartsAndAccessories()
{
	partsAndAccessories.click();
}

public void clickAllPartsAndAccessories()
{
	allPartsAndAccessories.click();
}

}
