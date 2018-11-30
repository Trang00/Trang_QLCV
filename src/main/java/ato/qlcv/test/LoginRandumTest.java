package ato.qlcv.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ato.qlcv.page.LoginPage;
import ato.qlcv.webdriver.action.Generator_Randum;
import ato.qlcv.webdriver.action.SetUp;

public class LoginRandumTest extends SetUp{
	
	LoginPage LoginPg;// Khoi tao
	Generator_Randum genLogin; // khoi tao randum login
	String Tieude="ATO Quản lý công việc";
	
@Test
	public void LoginRandum(){
		LoginPg=new LoginPage(driver,wait);//Từ class LoginTest, muốn sử dụng function ở class LoginPage, ta cần phải khởi tạo 1 Object của class đó.
		genLogin=new Generator_Randum();// Dùng cho lấy dữ liệu randum
		LoginPg.inputUserName(genLogin.User());
		LoginPg.inputPassword(genLogin.Pass());
		LoginPg.clickSignIn();
	
		String resultU = genLogin.User();
		String resultP = genLogin.Pass();
		System.out.println("Gen User:"+resultU);
		System.out.println("Gen pass:"+resultP);
		
		String DNLoi="Đăng nhập không thành công"; 
		String DNKTC=".//label[contains(text(),'Đăng nhập không thành công')]";
		String DNSai = driver.findElement(By.xpath(DNKTC)).getText();
		try { 
			assertEquals(DNLoi, DNSai); 
		  	} catch (Exception e) {
		  		e.printStackTrace(); 
	  }  
	  
}
}
