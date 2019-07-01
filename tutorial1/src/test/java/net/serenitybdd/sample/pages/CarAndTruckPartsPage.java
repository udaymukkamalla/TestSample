package net.serenitybdd.sample.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;

public class CarAndTruckPartsPage extends PageObject {
	
@FindBy(how=How.XPATH, using ="//a[contains(text(),'Electric Vehicle Parts')]")
WebElement electricVehicleParts;

@FindBy(how=How.XPATH, using ="//a[contains(text(),'Car & Truck Accessories')]")
WebElement carandtruckaccessories;

public void clickelectricVehicleParts() {
	electricVehicleParts.click();
}
public void clickCarAndTruckAccessories() {
	carandtruckaccessories.click();
	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
