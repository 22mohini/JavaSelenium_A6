package org.automation.popuphandle;

import java.time.LocalDateTime;

public class UnderStandingDynamicXPath
{
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now();
		int date = ldt.getDayOfMonth();
		String monthtemp = ldt.getMonth().toString();
		String month = monthtemp.charAt(0)+monthtemp.substring(1).toLowerCase();
		System.out.println("//div[text()='"+month+"']/../..//span[text()='"+date+"']");
		
	}

}
