package ato.qlcv.test;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ato.qlcv.data.Constants;
import ato.qlcv.page.LoginPage;
import ato.qlcv.webdriver.action.Generator_Randum;
import ato.qlcv.webdriver.action.SetUp;
public class XLBangDong extends SetUp{
	LoginPage LoginPg;// Khoi tao
	Generator_Randum genLogin; // khoi tao randum login
	String Tieude="ATO Quản lý công việc";
@Test
	public void BangDong() throws ParseException {
		LoginPg = new LoginPage(driver, wait);
		LoginPg.inputUserName(Constants.userName);//loginPage.clear(Constants.password);
		LoginPg.inputPassword(Constants.password);
		LoginPg.clickSignIn();
		
		driver.findElement(By.xpath(".//span[contains(@class,'caret')]")).click();//Click menu
		driver.findElement(By.xpath(".//*[@id='navbar-mobile']/ul[1]/li/div/ul/li/div/ul/li[4]")).click();//click Tài liệu
		
        List  col = driver.findElements(By.xpath("html/body/div[4]/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/table/thead/tr/th"));
        System.out.println("Số cột của bảng là : " +col.size()); 
        //No.of rows 
        List  rows = driver.findElements(By.xpath("html/body/div[4]/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/table/tbody/tr/td[1]")); 
        System.out.println("Số hàng của bảng là : " + rows.size());
       
		WebElement tableRow = driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/table/tbody/tr[3]"));
        String rowtext = tableRow.getText();
		System.out.println("- Hàng thứ 3 của bàng : "+rowtext);
		    
		    //to get 3rd row's 2nd column data
		 WebElement cellIneed = driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]"));
		 String valueIneed = cellIneed.getText();
		 System.out.println("- Giá trị hàng thứ 3 cột thứ 2 là: " + valueIneed); 
		   
    }
}
