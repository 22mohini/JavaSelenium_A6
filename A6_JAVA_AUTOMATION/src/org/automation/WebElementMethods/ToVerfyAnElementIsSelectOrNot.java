package org.automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerfyAnElementIsSelectOrNot
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebElement penCheckBox = driver.findElement(By.xpath("//input[@value='Pen' and @name='accessories' ]"));
	 WebElement bookCheckBox = driver.findElement(By.xpath("//input[@value='Book' and @name='accessories' ]"));
	 System.out.println(penCheckBox.isSelected()?"pen Checkbox is selected":"pen Checkbox is not selected");
	 System.out.println(bookCheckBox.isSelected()?"Book checkbox is selected":"book checkbox is not selected");
	
}

}
