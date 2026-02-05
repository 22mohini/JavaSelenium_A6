package org.automation.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleAndUrlOfficialPage {

	
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.fossil.com/");
			String title=driver.getTitle();
			System.out.println("Title:" +title);
			String URL = driver.getCurrentUrl();
			System.out.println("URL:" +URL);
			

			}

}
