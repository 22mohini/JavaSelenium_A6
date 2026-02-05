package org.pomRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
	//Declaration
	@FindBy(id="gender-male") private WebElement maleRadioButton;
	@FindBy(id = "gender-female") private WebElement femaleRadioButton;
  @FindBy(id = "FirstName") private WebElement firstNameTB;
  @FindBy(id = "Email") private WebElement emailTB;
  @FindBy(id = "Password") private WebElement passwordTB;
  @FindBy(id = "ConfirmPassword") private WebElement confirmpasswordTB;
  @FindBy(id = "register-button")private WebElement registerButton;
  
  //Initialization
  public RegisterPage(WebElement driver)
  {
	  PageFactory.initElements(driver, this);
  }
  //Declaration

  public WebElement getMaleRadioButton() {
	return maleRadioButton;
  }

  public WebElement getFemaleRadioButton() {
	return femaleRadioButton;
  }

  public WebElement getFirstNameTB() {
	return firstNameTB;
  }

  public WebElement getEmailTB() {
	return emailTB;
  }

  public WebElement getPasswordTB() {
	return passwordTB;
  }

  public WebElement getConfirmpasswordTB() {
	return confirmpasswordTB;
  }

  public WebElement getRegisterButton() {
	return registerButton;
  }
  
 
}