package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "Email") private WebElement loginEmailTB;
	@FindBy(id="Password") private WebElement loginPasswordTB;
	@FindBy(id="RememberMe") private WebElement loginRememberMeTB;
	@FindBy(linkText ="Forgot password?") private WebElement loginForgotPasswordTB;
	@FindBy(xpath ="//input[@value='Log in']") private WebElement loginButtonTB;
	
	

	//Declartion
	public WebElement getLoginEmailTB() {
		return loginEmailTB;
	}

	public WebElement getLoginPasswordTB() {
		return loginPasswordTB;
	}

	public WebElement getLoginRememberMeTB() {
		return loginRememberMeTB;
	}

	public WebElement getLoginForgotPasswordTB() {
		return loginForgotPasswordTB;
	}

	public WebElement getLoginButtonTB() {
		return loginButtonTB;
	}
	
	


}
