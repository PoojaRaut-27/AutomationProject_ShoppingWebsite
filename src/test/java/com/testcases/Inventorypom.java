package com.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Inventorypom {

	 @FindBy(how=How.XPATH,using="//span[text()='Products']") private WebElement Product;
	 @FindBy(how=How.XPATH,using="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement Addtocartbtn;
	  
	 @FindBy(how=How.XPATH,using="//a[@class='shopping_cart_link']") private WebElement CartButton;
	 
	 @FindBy(how=How.XPATH,using="//button[@id='checkout']") private WebElement checkoutbtn;

	public WebElement getAddtocartbtn() {
		return Addtocartbtn;
	}

	

	public WebElement getCartButton() {
		return CartButton;
	}
	public WebElement getproduct() {
		return Product;
	}
	public WebElement getcheckoutbtn() {
		return checkoutbtn;
	}
	      
	   
}
