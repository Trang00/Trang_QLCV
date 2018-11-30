package ato.qlcv.webdriver.action;

import java.time.ZonedDateTime;
import java.util.Random;

public class Generator_Randum {// để tạo dummy data ( data theo thời gian tính theo mili giây)
	
	//String [] word={"Test","form","KM" ,"hàng", "ATO", "ATO125", "123"};
	String [] word={"ATO", "ATO125", "123"};
	public String User() {
		return RandomString();
	}
	public String Pass() {
		//return RandomString()+ "/Pass";
		return RandomString();
	}
	
	private String RandomString() {
		//String RandomString=word[CreateRandomNumber()]+"" + word[CreateRandomNumber()]+""+getTime();
		String RandomString=word[CreateRandomNumber()];
		return RandomString;
	}
	private int CreateRandomNumber() {
		Random ran=new Random();
		int x=ran.nextInt(word.length);
		return x;
	}
	
	public int getTime() {
		return (int) ZonedDateTime.now().toInstant().toEpochMilli(); // thời gian mili giây
	}
}
