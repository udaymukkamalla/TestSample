package com.planittesting.PageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SeleniumDatePickerPage extends BasePage {
	
	public SeleniumDatePickerPage(WebDriver driver) {
		super(driver);
	}

@FindBy(how=How.CSS, using ="input[name='bdaytime']")
WebElement dateAndTime;

public void enterDateAndTime()
{
	dateAndTime.sendKeys("12122000");
	dateAndTime.sendKeys(Keys.TAB);
	dateAndTime.sendKeys("0245PM");
}

}
