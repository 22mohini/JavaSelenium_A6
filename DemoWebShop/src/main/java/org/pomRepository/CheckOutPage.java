package org.pomRepository;

import org.genericLib.SelectUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage 
{
	@FindBy (id="BillingNewAddress_CountryId") private WebElement billingAdressCountryDD;
	@FindBy(id="billing-address-select") private WebElement BillingAddressNewAddressDD;
	

	@FindBy(id = "BillingNewAddress_City") private WebElement cityTextBox;
	@FindBy(id="BillingNewAddress_Address1") private WebElement address1TB;
	@FindBy(id="BillingNewAddress_Address2") private WebElement address2TB;
    @FindBy(id="BillingNewAddress_ZipPostalCode") private WebElement pincodeTB;
    @FindBy(id="BillingNewAddress_PhoneNumber") private WebElement phneNumberTB;
    @FindBy(id="BillingNewAddress_FaxNumber") private WebElement faxNumberTB;
    @FindBy(xpath = "//input[@onclick='Billing.save()']") private WebElement billingAddressContinueButton;
    @FindBy(id = "shipping-address-select") private WebElement shippingAddressDD;
    @FindBy(xpath = "//input[@onclick='Shipping.save()']") private WebElement shippingAddressContinueButton;
    @FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")private WebElement shippingMethodContinueButton;
    @FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")private WebElement paymentMethodContinueButton;
    @FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfoContinueButton;
    @FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderContineuButton;
    
    public CheckOutPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getBillingAdressCountryDD() {
		return billingAdressCountryDD;
	}

	public WebElement getCityTextBox() {
		return cityTextBox;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public WebElement getAddress2TB() {
		return address2TB;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getPhneNumberTB() {
		return phneNumberTB;
	}

	public WebElement getFaxNumberTB() {
		return faxNumberTB;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressDD() {
		return shippingAddressDD;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderContineuButton() {
		return confirmOrderContineuButton;
	}
	public WebElement getBillingAddressNewAddressDD() {
		return BillingAddressNewAddressDD;
	}

    //Operational method /Bussiness logic
	public void buyProduct(String city , String address1, String pincode , String contact )
	{
		SelectUtility su = new SelectUtility();
		try
		{
			if(BillingAddressNewAddressDD.isDisplayed())
			{
				su.selectByVisibleTextMethod(BillingAddressNewAddressDD, " New Address");
			}
		}
		catch(Exception e)
		{
			su.selectByVisibleTextMethod(billingAdressCountryDD, "India");
		}
		su.selectByVisibleTextMethod(billingAdressCountryDD, "India"); //for handle dropdown
		cityTextBox.sendKeys(city);
		address1TB.sendKeys(address1);
		pincodeTB.sendKeys(pincode);
		phneNumberTB.sendKeys(contact);
		billingAddressContinueButton.click();
		shippingAddressContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInfoContinueButton.click();
		confirmOrderContineuButton.click();
		
	}


}
