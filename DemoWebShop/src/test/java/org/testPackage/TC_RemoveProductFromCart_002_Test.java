package org.testPackage;

import org.genericLib.BaseTest;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonePage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingcartPage;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(org.genericLib.MyListner.class)
public class TC_RemoveProductFromCart_002_Test extends BaseTest
{
	@Test
	public void removeProductFromCartMethod() throws InterruptedException
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
		
		bp.getShoppingCartLink().click();
		
		ShoppingcartPage scp = new ShoppingcartPage(driver);
		scp.removeSmartPhoneMethod();
		try
		{
			if(scp.getSmartPhoneCartItem().isDisplayed())
			{
				Reporter.log("Product Is not Remove From Cart",true);
			}
		}
		catch(Exception e)
		{
			Reporter.log("Product is removed from cart!!",true);

		}
		sa.assertAll();
		
	}

}
