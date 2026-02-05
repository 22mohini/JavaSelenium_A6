package org.automation.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchSourceCode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.Google.Com");
		String SourceCode = driver.getPageSource();
		System.out.println(SourceCode);

	}

}
