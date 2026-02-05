package org.automation.basic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingAllBrowser {

	public static void main(String[] args) {
		WebDriver driver;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter The browser name that you want");
		String browserName=scanner.next();
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else {
			System.err.println("Invalid Browse");
		}
		}
		

}
