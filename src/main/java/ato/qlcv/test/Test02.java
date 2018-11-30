package ato.qlcv.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ato.qlcv.data.Constants;
import ato.qlcv.page.LoginPage;
import ato.qlcv.webdriver.action.Generator_Randum;
import ato.qlcv.webdriver.action.SetUp;
public class Test02  extends SetUp{
	
	LoginPage LoginPg;// Khoi tao
	Generator_Randum genLogin; // khoi tao randum login
	String Tieude="ATO Quản lý công việc";
@Test
	public void LoginThanhCong() throws Exception{

		LoginPg = new LoginPage(driver, wait);
		LoginPg.inputUserName(Constants.userName);//loginPage.clear(Constants.password);
		LoginPg.inputPassword(Constants.password);
		LoginPg.clickSignIn();

		driver.findElement(By.xpath(".//span[contains(@class,'caret')]")).click();//Click menu
		driver.findElement(By.xpath(".//*[@id='navbar-mobile']/ul[1]/li/div/ul/li/div/ul/li[4]")).click();//click Tài liệu
		System.out.println("TaiLieu");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div[1]/div[2]/div[1]/div/div[3]/div")).click();//click bộ lọc
		System.out.println("Bộ lọc");
		driver.findElement(By.xpath(".//*[@id='BoLoc']/div[1]/div/div[1]/a/span")).click();//click loại tl
		//driver.findElement(By.xpath(".//*[@id='BoLoc']/div[1]/div/div[1]/div/div/input")).sendKeys("Tài liệu kinh doanh",Keys.RETURN);
		driver.findElement(By.xpath(".//*[@id='userForm']/div[2]/div/div/ul/li[3]")).click();
		
		//Actions action = new Actions(driver);
        //action.sendKeys(Keys.RETURN);
       // action.perform();
	
		//driver.findElement(By.xpath(".//*[@id='BoLoc']/div[1]/div/div[1]/div/ul/li[3]")).click();
		
		
		//Select ABC = new Select(driver.findElement(By.xpath(".//*[@id='BoLoc']/div[1]/div/div[1]/a/span")));
		//ABC.selectByValue("number:2");
		
		//driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div[1]/div[2]/div[1]/div/div[1]")).click();
		//System.out.println("Them moi");
		
		// Select ABC = new Select(driver.findElement(By.xpath(".//select[contains(@ng-model,'item.LoaiTaiLieu')]")));
		// Select ABC = new Select(driver.findElement(By.xpath(".//select[contains(@class,'ng-pristine ng-untouched ng-valid ng-empty') and contains(@ng-model,'item.LoaiTaiLieu')]")));
		//Select ABC = new Select(driver.findElement(By.cssSelector(".//select[contains(@ng-model,'item.LoaiTaiLieu')]")));
		//Select ABC = new Select(driver.findElement(By.xpath(".//*[@id='userForm']/div[2]/select")));
			//ABC.selectByVisibleText("Tài liệu kỹ thuậ");
			//ABC.selectByIndex(1);
			
			
	 }
}
