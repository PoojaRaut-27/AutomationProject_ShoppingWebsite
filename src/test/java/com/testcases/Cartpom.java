package com.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Cartpom {

	@FindBy(how=How.XPATH,using="//button[@id='checkout']") private WebElement CheckouttButton;

	public WebElement getCheckouttButton() {
		return CheckouttButton;
	}

	
}
