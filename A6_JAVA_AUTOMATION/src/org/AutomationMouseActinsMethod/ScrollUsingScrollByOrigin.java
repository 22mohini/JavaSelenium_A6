package org.AutomationMouseActinsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollUsingScrollByOrigin 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement target = driver.findElement(By.xpath("//span[text()='Resume writing']"));
		Actions action = new Actions(driver);
		ScrollOrigin scrollOrigin = ScrollOrigin.fromElement(target);
		action.scrollFromOrigin(scrollOrigin, 0, 250).perform();
		target.click();
		
		
		
	}

}
