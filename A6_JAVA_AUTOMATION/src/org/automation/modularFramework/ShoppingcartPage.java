package org.automation.modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ShoppingcartPage
{
	
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartPhoneCartItem;
	@FindBy(name = "updatecart") private WebElement updateCartButton;
	@FindBy(name = "continueshopping") private WebElement continueShoppingButton;
	@FindBy(id  = "termsofservice") private WebElement termsOfServicesChechbox;
	@FindBy(id  = "checkout") private WebElement checkOutButton;
	
	//initialization
	public ShoppingcartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	

	//Utilization
	public WebElement getSmartPhoneCartItem() {
		return smartPhoneCartItem;
	}


	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}


	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}


	public WebElement getTermsOfServicesChechbox() {
		return termsOfServicesChechbox;
	}


	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	//Operational/Method/Business Logic 
	
	public void removeSmartPhoneMethod() throws InterruptedException {
		smartPhoneCartItem.click();
		Thread.sleep(500);
		updateCartButton.click();
		
		
	}




	
	}
	


