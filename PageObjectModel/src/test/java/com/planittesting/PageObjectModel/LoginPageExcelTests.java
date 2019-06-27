package com.planittesting.PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageExcelTests extends MasterTest{
	
	@Test(dataProvider="inputWorkbook")
	public void loginDDT(String user, String pwd) throws InterruptedException
	{
		LoginPageExcel lp=new LoginPageExcel(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clickSubmit();				
		Thread.sleep(3000);		
						
	}
	
	@DataProvider(name="inputWorkbook")
	/*public String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/testData/LoginData.xlsx";
	
		int rownum=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j); //1, 0
			}
		}
		
		return logindata;
	
	}*/
	
	
	public boolean isAlertPresent()
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	
	

	
}
