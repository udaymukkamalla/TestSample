package com.planittesting.PageObjectModel;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.How;

public class BasePage {
	protected WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	

}
