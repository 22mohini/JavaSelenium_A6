package org.automation.select;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectionMethodInOmayo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropDowmElement = driver.findElement(By.id("drop1"));
	Select select = new Select(dropDowmElement);
		//selectecting an option based on tag text or visible text
		
	//	select.selectByValue()
	}

	
		
		
	}


