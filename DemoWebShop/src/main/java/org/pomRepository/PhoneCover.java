package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneCover
{
	@FindBy(xpath = "//a[text()='Phone Cover']/../..//input") private WebElement 
	PhoneCoverAddToCartButton;
	
	
	public PhoneCover(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPhoneCoverAddToCartButton() {
		return PhoneCoverAddToCartButton;
	}
	

}
