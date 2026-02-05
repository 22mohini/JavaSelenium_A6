package org.automation.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TofetchSelectAndUnselectOption {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/Bikes%20(1).html");
		WebElement dropDown = driver.findElement(By.id("Bikes"));
		Select select = new Select(dropDown);
		select.selectByIndex(4);
		select.selectByVisibleText("Hero Xpulse");
		select.selectByValue("yrx");
		//Logic to fetch all options
		List<WebElement> allOptions = select.getOptions();
		System.out.println();
		System.out.println("=========== Option=========");
		for(WebElement option : allOptions)
		{
			System.out.println(option.getText());
			
		}
		//logic to fetch selected options
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		System.out.println();
		System.out.println("=============selected Options========");
		for(WebElement option : selectedOptions)
		{
			System.out.println(option.getText());
			
		}
		
    // logic to get unselected options
		allOptions.removeAll(selectedOptions);
		System.out.println();
		System.out.println("=========unselected option=======");
		for(WebElement option : allOptions)
		{
			System.out.println(option.getText());
		}
		System.out.println();
		//fetcing first selected option
		System.out.println("first selected option:");
		System.out.println(select.getFirstSelectedOption().getText());
		
	}

}
