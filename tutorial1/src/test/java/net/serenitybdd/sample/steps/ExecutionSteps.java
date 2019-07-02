	package net.serenitybdd.sample.steps;

import net.thucydides.core.annotations.Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.sample.pages.BasePage;
import net.serenitybdd.sample.pages.HomePage;
import net.serenitybdd.sample.pages.MotorsPage;
import net.serenitybdd.sample.steps.serenity.EndUserSteps;

public class ExecutionSteps {


	@Steps
    EndUserSteps anna;
    

    @Given("^the user is on the ebay home page$")
    public void givenTheUserIsOneeBayHomePage() {
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\umukkamalla\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	//driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	anna.openURL();
    	//anna.verifyMotors();
    }

    @When("^the user clicks on Motors button$")
    public void whenTheUserClicksMotorsButton() {
    	anna.clickMotors();
    }

    @Then("User clicks Motorcycles button")
    public void thenUserVerifiesMotorcyclesButton() {
    	//anna.verifyMotorCycles();
    	anna.clickMotorCycles();
        
    }
    
    @Then("User clicks on PartsAndAccessories link")
    public void thenUserClicksPartsAndAccessorieslink() {
    	anna.clickPartsAndAccessories();
    }
    
    @Then("User clicks on AllPartsAndAccessories link")
    public void thenUserClicksAllPartsAndAccessorieslink() {
    	anna.clickAllPartsAndAccessories();
    }
    
    @Then("User clicks on CarAndTruck Parts link")
    public void thenUserClicksOnCarAndTruckPartslink() {
    	anna.clickCarAndRepairParts();
    }
    
    @Then("User clicks on ElectricVehicleParts link")
    public void thenUserClicksOnElectricVehiclePartslink() {
    	anna.clickElectricCarAndTruckParts();
    }
    
    @Then("User clicks on CarAndAccessorie link")
    public void thenUserClicksOnCarAndAccessorieslink() {
    	anna.clickCarAndAccessorieslink();
    }
    
    @Then("User clicks on Chevrolet option")
    public void thenUserClicksOnChevroletOption() {
    	anna.clickChevroletOption();
    }

}
