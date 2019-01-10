package Day07;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day2 extends SetUpDay7 {
	/*
	1)  Go to http://www.demo.guru99.com/V4/
    2) Enter valid UserId
    3) Enter valid Password
    4) Click Login
    5) Verify the Page Title after login
*/
String Tittle="Guru99 Bank Manager HomePage";
@Test
public void Case_Day2(){
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr166619");
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("UvugAsu");
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	String TittleCur=driver.getTitle();
	System.out.println("Tiêu đề lấy được: "+TittleCur);
	if(TittleCur.equals(Tittle)){
		System.out.println("Login thành công");
	}else{
		System.out.println("Login thất bại");
	}
	
}
}
