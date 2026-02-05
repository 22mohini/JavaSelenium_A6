package org.capturingScreenshots;

import java.time.LocalDate;

public class FetchingCurrentTimeAndDate {

	



	public static void main(String[] args)
	{
		
		LocalDate ldt = LocalDate.now();
		String timestamp = ldt.toString().replace(':', '-');
		System.out.println(timestamp);

	}

}
