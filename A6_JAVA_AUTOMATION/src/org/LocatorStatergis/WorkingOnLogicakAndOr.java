package org.LocatorStatergis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnLogicakAndOr {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/XpathLogicalAnd.html");
         WebElement FirstName = driver.findElement(By.xpath("//input[@name=\"first\" or @id=\"f-name\"]"));
         FirstName.clear();
         FirstName.sendKeys("Mohini");
       WebElement radiobutton = driver.findElement(By.xpath("//input[@name='gender' and @value='F']"));
       radiobutton.click();
	

	}

}
