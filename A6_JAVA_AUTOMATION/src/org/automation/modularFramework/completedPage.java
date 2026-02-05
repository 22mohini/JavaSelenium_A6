package org.automation.modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completedPage
{
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']") private WebElement
	 orderPlaceMsg;
	
	//Intialization
	public completedPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getOrderPlaceMsg() {
		return orderPlaceMsg;
	}
	
	

}
