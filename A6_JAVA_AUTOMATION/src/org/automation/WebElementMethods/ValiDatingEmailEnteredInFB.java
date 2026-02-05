package org.automation.WebElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValiDatingEmailEnteredInFB {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String email = "Mohini@gmail.com";
		WebElement emailTextbox = driver.switchTo().activeElement();
		emailTextbox.clear();
		//fetching class attribute value
		System.out.println(emailTextbox.getAttribute("Class"));
		emailTextbox.sendKeys(email);
		String enteredemail = emailTextbox.getAttribute("value");
		if(email.equals(enteredemail))
			System.out.println("email has been Successfully entered");
		else
			System.err.println("email has notSuccessfully entered ");

	}

}
