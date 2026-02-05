package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage
{
	//Declaration
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']")
	private WebElement cellPhoneAddToCartbutton;
	@FindBy(xpath = "//p[contains(text(),'The product ')] ") private WebElement productAddectToCartMsg;
	//Initialization
	public CellPhonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCellPhoneAddToCartbutton() {
		return cellPhoneAddToCartbutton;
	}
	public WebElement getProductAddectToCartMsg() {
		return productAddectToCartMsg;
	}
	

}
