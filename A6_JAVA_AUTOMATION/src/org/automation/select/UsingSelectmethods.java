package org.automation.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectmethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		WebElement dateDropDown = driver.findElement(By.id("day"));
		Select select = new Select(dateDropDown);
		//verifying date dropdown ie single select or multi select
		if(select.isMultiple())
			System.out.println("Multi-select dropdown");
		else
			System.out.println("Single-select dropdown");
		//fetching all the option of the date dropdown
		List<WebElement> allOption = select.getOptions();
		//selecting all the option 1 by 1 using selsectBy index() in loop
		for(int index = 0; index < allOption.size();index++)
		{
			Thread.sleep(250);
			select.selectByIndex(index);
		}
		
		
	}

}
