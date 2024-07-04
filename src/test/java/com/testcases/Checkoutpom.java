package com.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Checkoutpom {

	
	
	 @FindBy(how=How.XPATH,using="//span[text()='Checkout: Your Information']") private WebElement information;
	 
	   @FindBy(how=How.XPATH,using="//input[@id='first-name']") private WebElement Firstname;
	   
	   @FindBy(how=How.XPATH,using="//input[@id='last-name']") private WebElement Lastname;
	   
	   @FindBy(how=How.XPATH,using="//input[@id='postal-code']") private WebElement Zipcode;
	   
	   @FindBy(how=How.XPATH,using="//input[@id='continue']") private WebElement continuebtn;
	   @FindBy(how=How.XPATH,using="//span[text()='Checkout: Overview']") private WebElement overviewmsg;
	
	   @FindBy(how=How.XPATH,using="//button[@id='finish']") private WebElement Finishbtn;
	   @FindBy(how=How.XPATH,using="//h2[text()='Thank you for your order!']") private WebElement thankyoumsg;
	
	   
	   public WebElement getInfo() {
			return information;
		}
	public WebElement getFirstname() {
		return Firstname;
	}
	
	public WebElement getLastname() {
		return Lastname;
	}
	
	public WebElement getZipcode() {
		return Zipcode;
	}
	
	public WebElement getoverview() {
		return overviewmsg;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	public WebElement getFinishbtn() {
		return Finishbtn;
	}
	public WebElement getthanksmsg() {
		return thankyoumsg;
	}
	
}
