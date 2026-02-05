package org.automation.modularFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_BuyPhoneCover extends BaseTest
{
	@Test
	public void BuyPhoneCoverMethod()
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesLink().click();
		
		PhoneCover pc = new PhoneCover(driver);
		pc.getPhoneCoverAddToCartButton();
		
		CellPhonePage cpp = new CellPhonePage(driver);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(cpp.getProductAddectToCartMsg(), true, "Product is not added into cart!");
		
		bp.getShoppingCartLink().click();
		

	
	}
 
}
