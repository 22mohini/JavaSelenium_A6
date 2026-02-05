package org.automation.WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeryfyingAlignment {
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("passContainer"));
		//fetching location of both elements
		 Dimension emailTBSize = emailTextBox.getSize();
		  Dimension passwordTBSize = passwordTextBox.getSize();
		  Point emailTBloc = emailTextBox.getLocation();
		 Point passwordTBLoc = passwordTextBox.getLocation();
		 
		 //verifying left alignment
		 if(emailTBloc.getX() == passwordTBLoc.getX())
			 System.out.println("left Alignment is proper");
		 else
			 System.out.println("left Alignment is not proper");
		 
		 //verifying overlaping issue
		 if(passwordTBLoc.getY() - (emailTBloc.getY()+emailTBSize.getHeight())>0)
			 System.out.println("element are not overlap");
		 else
			 System.out.println("element are overlap");
			 
		
		
	}

}
