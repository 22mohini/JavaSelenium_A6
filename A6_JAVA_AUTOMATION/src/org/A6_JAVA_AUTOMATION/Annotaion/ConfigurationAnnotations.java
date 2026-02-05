package org.A6_JAVA_AUTOMATION.Annotaion;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
  @Test
  public void testCase1() {
	  Reporter.log("This is a @Test method", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is BeforeMethod", true);
  }
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("This is BeforeClass", true);
  }
  @BeforeTest
  public void beforeTest() {
	  Reporter.log("This is BeforeTest", true);
  }
  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("This is BeforeSuit", true);
  }  
	  @AfterSuite
    public void afterSuite() {
	  Reporter.log("This is AfterSuit", true);
	  
  }
  @AfterTest
  public void afterTest() {
	  Reporter.log("This is AfterTest", true);
  }
  @AfterClass
  public void afterClass() {
	  Reporter.log("This is AfterClass", true);
  }
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("AfterMethod", true);
  }
  
}
