package ato.qlcv.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ato.qlcv.data.Constants;
import ato.qlcv.page.LoginPage;
import ato.qlcv.webdriver.action.Generator_Randum;
import ato.qlcv.webdriver.action.SetUp;

public class LoginLapTest extends SetUp{
	
	LoginPage LoginPg;// Khoi tao
	Generator_Randum genLogin; // khoi tao randum login
	String Tieude="ATO Quản lý công việc";

@Test(dataProvider="UserPass", invocationCount=3, description="Testing loop for every testcase")
// Tính năng test TestNG là chạy lặp testcase n lần ( ở đây lặp 3 lần)
	public void LoginThanhCong(String uName,String uPass) throws Exception{

	driver.findElement(By.xpath(".//*[@placeholder='Tên đăng nhập']")).sendKeys(uName);
	driver.findElement(By.xpath(".//*[@placeholder='Mật khẩu']")).sendKeys(uPass);
	driver.findElement(By.xpath(".//*[@id='l-login']/div[4]/div[2]/div")).click();
		Assert.assertEquals(Tieude, driver.getTitle());
		
/*		
		String URL=driver.getCurrentUrl();
			System.out.println ("URL Curren:"+URL);
		String abcd=driver.getTitle();
			System.out.println ("Lấy tiêu đề trang:"+abcd);
			System.out.println("Tiêu đề:"+Tieude);
*/
	}
@DataProvider(name="UserPass")
public Object[][] getUserPass(){
	return new Object[][]{{"ATO125","123"},{"ATO1200","123"},{"ATO125","1230000"}};
}
}
