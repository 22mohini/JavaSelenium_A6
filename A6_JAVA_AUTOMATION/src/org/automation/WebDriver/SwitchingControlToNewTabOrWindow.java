package org.automation.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingControlToNewTabOrWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("htttps//manamchocolate.com");
		//to open a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https//www.ferrerorocher.com/in/en/");
		//to open a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https//lepture.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("htttps//fantasiechocolate.com/");}
	

}
