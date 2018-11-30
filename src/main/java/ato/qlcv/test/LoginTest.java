package ato.qlcv.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import ato.qlcv.data.Constants;
import ato.qlcv.page.LoginPage;
import ato.qlcv.webdriver.action.Generator_Randum;
import ato.qlcv.webdriver.action.SetUp;
public class LoginTest  extends SetUp{
	
	LoginPage LoginPg;// Khoi tao
	Generator_Randum genLogin; // khoi tao randum login
	String Tieude="ATO Quản lý công việc";
@Test
//@Test(dataProvider="", invocationCount=3, description="Testing loop for every testcase")
// Tính năng test TestNG là chạy lặp testcase n lần ( ở đây lặp 3 lần)
	public void LoginThanhCong() throws Exception{

		LoginPg = new LoginPage(driver, wait);
		LoginPg.inputUserName(Constants.userName);//loginPage.clear(Constants.password);
		LoginPg.inputPassword(Constants.password);
		LoginPg.clickSignIn();
		Assert.assertEquals(Tieude, driver.getTitle());
		
/*		
		String URL=driver.getCurrentUrl();
			System.out.println ("URL Curren:"+URL);
		String abcd=driver.getTitle();
			System.out.println ("Lấy tiêu đề trang:"+abcd);
			System.out.println("Tiêu đề:"+Tieude);
*/
	}
@Test(enabled = false)
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
