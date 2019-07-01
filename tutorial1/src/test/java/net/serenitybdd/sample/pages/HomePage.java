package net.serenitybdd.sample.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("http://www.ebay.com")
public class HomePage extends PageObject{
	
	
@FindBy(xpath = "(//a[contains(text(),'Motors')])[2]")
WebElement motors;

public void verifyMotors()
{
	motors.getText();
}

public void clickMotors()
{
	motors.click();
}

}
