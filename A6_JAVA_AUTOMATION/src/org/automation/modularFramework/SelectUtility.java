package org.automation.modularFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility
{
	// to select an option by its visible text
   public void selectByVisibleTextMethod(WebElement DropDownElement , String visibleText)
   {
	   Select sel = new Select(DropDownElement);
	   sel.selectByVisibleText(visibleText);
   }
}
