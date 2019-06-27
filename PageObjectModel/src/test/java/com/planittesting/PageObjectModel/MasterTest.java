package com.planittesting.PageObjectModel;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.How;
import jxl.Sheet;
import jxl.Workbook;


public class MasterTest {

	protected WebDriver driver;
	
	@BeforeTest
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\umukkamalla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.get("https://opensource-demo.orangehrmlive.com");
		driver.get("http://demo.guru99.com/v4/");
	}
	
	

}
	

