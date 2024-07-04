package com.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_addToCartTC {

	ChromeDriver driver;
	@BeforeMethod
     public void BrowerLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void VerifyAddToCartTC001() throws Exception {
		//Verify
		String ExpectedUrl="https://www.saucedemo.com/";
		String ActualUrl=driver.getCurrentUrl();
		Assert.assertEquals(ActualUrl,ExpectedUrl);
		
		String filepath =System.getProperty("user.dir")+"\\TestData\\Data.xlsx";	
        FileInputStream fis=new FileInputStream(filepath);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    String Username= wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String password= wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		String Firstname= wb.getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
		String lastname= wb.getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();
		String Zipcode= wb.getSheet("sheet1").getRow(0).getCell(4).getStringCellValue(); 
	      Loginpom login=PageFactory.initElements(driver, Loginpom.class);
	      login.getUsername().sendKeys(Username);
	      login.getPassword().sendKeys(password);
	      login.getLoginBtn().click();
	      //verify
	      Inventorypom inventory=PageFactory.initElements(driver, Inventorypom.class);
	      boolean Value=inventory.getproduct().isDisplayed();
	      inventory.getAddtocartbtn().click();
	      inventory.getCartButton().click();
	      //verify cart page
	      String ExpectedCartUrl="https://www.saucedemo.com/cart.html";
		  String ActualCartUrl=driver.getCurrentUrl();
		 Assert.assertEquals(ActualCartUrl,ExpectedCartUrl);
		 inventory.getcheckoutbtn().click();
		 
		 Checkoutpom checkout=PageFactory.initElements(driver, Checkoutpom.class);
		 boolean checkValue=checkout.getInfo().isDisplayed();
		 checkout.getFirstname().sendKeys(Firstname);
		 checkout.getLastname().sendKeys(lastname);
		 checkout.getZipcode().sendKeys(Zipcode);
		 checkout.getContinuebtn().click();
		 boolean overviewValue=checkout.getoverview().isDisplayed();
		 checkout.getFinishbtn().click();
		 boolean thankyouValue=checkout.getthanksmsg().isDisplayed();
		 
	      

		
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
}
