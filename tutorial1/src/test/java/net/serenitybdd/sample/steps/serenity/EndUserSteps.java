package net.serenitybdd.sample.steps.serenity;

import net.serenitybdd.sample.pages.AllPartsAndAccessories;
import net.serenitybdd.sample.pages.CarAndTruckPartsPage;
import net.serenitybdd.sample.pages.DictionaryPage;
import net.serenitybdd.sample.pages.ElectricVehiclesPartsPage;
import net.serenitybdd.sample.pages.HomePage;
import net.serenitybdd.sample.pages.MotorsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    HomePage homepage;
    MotorsPage motorspage;
    AllPartsAndAccessories allpartsandaccessories;
    CarAndTruckPartsPage carandtruckpartspage;
    ElectricVehiclesPartsPage electricvehiclespartspage;
    
    
  @Step
  public void openURL() {
	  homepage.open();
  }

   //  @Step
	//public void verifyMotors() {
    	// homepage.verifyMotors();	
		
	//}
     
     @Step
     public void clickMotors() {
    	 homepage.clickMotors();
     }
     
    // @Step
     //public void verifyMotorCycles()
     //{
    	// motorspage.verifyMotorCycles();
     //}
     
     @Step
     public void clickMotorCycles() {
    	 motorspage.clickMotorCycles();
     }
     
     @Step
     public void clickPartsAndAccessories() {
    	 motorspage.clickPartsAndAccessories();
     }
     
     @Step
     public void clickAllPartsAndAccessories() {
    	 motorspage.clickAllPartsAndAccessories();
     }
     
     @Step
     public void clickCarAndRepairParts() {
    	 allpartsandaccessories.clickCarAndTruckParts();
     }
     
     @Step
     public void clickElectricCarAndTruckParts() {
    	 carandtruckpartspage.clickelectricVehicleParts();
     }
     
    @Step
    public void clickCarAndAccessorieslink() {
    	carandtruckpartspage.clickCarAndTruckAccessories();
    }
    
    @Step
    public void clickChevroletOption() {
    	electricvehiclespartspage.clickChevrolet();
    }
     
}