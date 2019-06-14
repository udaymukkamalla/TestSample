package StepDefinition;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Steps {
	protected WebDriver driver;



@Given("^user opens browser and launch application$")
public void launchBrowserAndApplication() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\umukkamalla\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/v4/");
}

@When("user enters \"([^\"]*)\" and \"([^\"]*)\"$" )
public void user_enters_username_and_password(String username,String password) {
	driver.findElement(By.name("uid")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
}

@Then("^user clicks on reset button$")
public void clickReset() {
	driver.findElement(By.name("btnReset")).click();
}

@Then("^user clicks on login button$")
public void clickLoginBtn() {
	driver.findElement(By.name("btnLogin")).click();
}
}