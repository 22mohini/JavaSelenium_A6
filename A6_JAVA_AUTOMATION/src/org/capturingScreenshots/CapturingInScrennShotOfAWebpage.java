package org.capturingScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingInScrennShotOfAWebpage
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/");
		LocalDate ldt = LocalDate.now();

		String timestamp = ldt.toString().replace(':', '-');

		//step1
		TakesScreenshot ts =(TakesScreenshot)driver;
		//step2
		File src = ts.getScreenshotAs(OutputType.FILE);
		//step 3
		File dest = new File("./Errorshots/screenshot"+timestamp+".png");
		FileHandler.copy(src, dest);
		
	}

}
