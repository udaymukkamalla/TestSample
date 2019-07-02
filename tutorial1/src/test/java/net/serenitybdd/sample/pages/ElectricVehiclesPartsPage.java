package net.serenitybdd.sample.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;

public class ElectricVehiclesPartsPage extends PageObject{
	
@FindBy(how=How.XPATH, using ="//p[contains(text(),'Chevrolet')]")
WebElement chevrolet;


public void clickChevrolet() {
	chevrolet.click();
}

}
