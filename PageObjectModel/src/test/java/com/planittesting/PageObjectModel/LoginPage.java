package com.planittesting.PageObjectModel;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	 
	public LoginPage(WebDriver driver) {
	super(driver);
}
	
	
@FindBy(how=How.XPATH, using ="//input[@name='uid']")
 WebElement username;

@FindBy(how=How.XPATH, using ="//input[@name='password']")
private WebElement password;

@FindBy(how=How.XPATH, using ="//input[@name = 'btnLogin']")
private WebElement loginbtn;

public void loginFunctionality() throws InterruptedException 
{
	Thread.sleep(3000);
	username.sendKeys("mngr202022");
	password.sendKeys("yhYhuhA");
	loginbtn.click();
}
	
}
