package org.automation.testNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingTimeInTC 
{
	@Test(timeOut=3000)
    public void launTrimphTiger()
    {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.triumphmotorcycles.in/motorcycles/advanture/tiger");
    }
}
