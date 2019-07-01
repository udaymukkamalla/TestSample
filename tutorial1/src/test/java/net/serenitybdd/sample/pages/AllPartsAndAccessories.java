package net.serenitybdd.sample.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;

public class AllPartsAndAccessories extends PageObject {
	
@FindBy(how=How.XPATH, using ="//section/ul/li[8]/a")
WebElement carAndTruckParts;

public void clickCarAndTruckParts()
{
	carAndTruckParts.click();
}


}
