package org.automation.modularFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_AddToCart_001_Test extends BaseTest
{
	@Test
	public void addToCartMethod() throws InterruptedException
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesLink().click();
		
		CellPhonePage cp = new CellPhonePage(driver);
		cp.getCellPhoneAddToCartbutton().click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(cp.getProductAddectToCartMsg().isDisplayed(),true, "Product is not Added To Cart");
		Thread.sleep(4000);
		
		sa.assertAll();
	}
	

}
