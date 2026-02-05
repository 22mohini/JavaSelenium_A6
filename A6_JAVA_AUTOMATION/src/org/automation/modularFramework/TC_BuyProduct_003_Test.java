package org.automation.modularFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_BuyProduct_003_Test extends BaseTest
{
	@Test
	public void buyProductMethod() throws InterruptedException, EncryptedDocumentException, IOException 
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
		ShoppingcartPage scp =new ShoppingcartPage(driver);
		scp.getSmartPhoneCartItem().click();
		scp.getTermsOfServicesChechbox().click();
		scp.getCheckOutButton().click();
		String city = Flib.getWorkbookcellvalue("buyProductcreds", 1, 0);
		String address1 = Flib.getWorkbookcellvalue("buyProductcreds", 1, 1);
		//String pincode = Flib.getWorkbookcellvalue("buyProductcreds", 1, 2);
	 //  String contact = Flib.getWorkbookcellvalue("buyProductcreds", 1, 3);
		String pincode = Flib.getNumericCellValueMethod("buyProductcreds", 1, 2);
		String contact = Flib.getNumericCellValueMethod("buyProductcreds", 1, 3);
		
		int rn = Flib.generateRandomNo();
		String phoneNo = contact+rn;
		
	 //  System.out.println(pincode);
		//System.out.println(phoneNo);
		CheckOutPage cop = new CheckOutPage(driver);
		cop.buyProduct(city, address1, pincode, phoneNo);
		
		completedPage comp = new completedPage(driver);
		sa.assertEquals(comp.getOrderPlaceMsg().isDisplayed(),true ,"Product is not processed1");
	    sa.assertAll();
	}

}
