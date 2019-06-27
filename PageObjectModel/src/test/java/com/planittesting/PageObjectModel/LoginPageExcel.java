package com.planittesting.PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPageExcel extends BasePage{
	public LoginPageExcel(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(how=How.XPATH, using ="//input[@name='uid']")
	 WebElement username;

	@FindBy(how=How.XPATH, using ="//input[@name='password']")
	private WebElement password;

	@FindBy(how=How.XPATH, using ="//input[@name = 'btnLogin']")
	private WebElement loginbtn;
	
	
	public void setUserName(String user) {
		username.sendKeys(user);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
    public void clickSubmit() {
    	loginbtn.click();
    }

}
