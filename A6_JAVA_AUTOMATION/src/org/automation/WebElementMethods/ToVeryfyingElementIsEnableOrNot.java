package org.automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVeryfyingElementIsEnableOrNot
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/omayo.blogspot.com");
		WebElement textBox1 = driver.findElement(By.id("textbox1"));
		System.out.println(textBox1.isEnabled()?"textBox1 is Enable":"textBox1 is Disable");
		WebElement textBox2 = driver.findElement(By.id("tb2"));
		System.out.println(textBox2.isEnabled()?"textBox2 is Enable":"textBox2 is Disable");
		
	}

}
