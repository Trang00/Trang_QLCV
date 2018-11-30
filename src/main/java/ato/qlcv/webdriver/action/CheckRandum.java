package ato.qlcv.webdriver.action;

import java.util.Date;

import org.testng.annotations.Test;

public class CheckRandum {
@Test
	public void testGenerator(){
		Generator_Randum gen = new Generator_Randum();
		
		String result = gen.User();
		String result1 = gen.Pass();
		int result2 = gen.getTime();
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println("Time:" +result2);
		
		System.out.println("1: "+java.time.LocalDate.now()); 
		
		System.out.println("2: "+java.time.LocalDateTime.now()); 
		
		System.out.println("8: "+java.time.LocalTime.now()); 
		
		System.out.println("3: "+java.time.Clock.systemUTC().instant()); 
		
		Date date=java.util.Calendar.getInstance().getTime();  
		System.out.println("4: "+date);  
		
	}
}
