package ato.qlcv.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ato.qlcv.data.Constants;
import ato.qlcv.page.LoginPage;
import ato.qlcv.webdriver.action.Generator_Randum;
import ato.qlcv.webdriver.action.SetUp;

public class Test01 extends SetUp{
	
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
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div[1]/div[2]/div[1]/div/div[1]")).click();//click nut Them moi
		//String DL =driver.findElement(By.xpath(".//*[@id='userForm']/div[1]/input")).getText();
		//driver.findElement(By.xpath("//input[contains(@class,'form-control ng-pristine ng-untouched ng-valid ng-not-empty')]")).getText();
		driver.findElement(By.xpath(".//*[@id='userForm']/div[2]/div/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='userForm']/div[2]/div/div/div/input")).sendKeys("Tài liệu kinh doanh",Keys.RETURN);
	
		driver.findElement(By.xpath(".//*[@id='userForm']/div[3]/div/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='userForm']/div[3]/div/div/div/input")).sendKeys("Kho A Dãy 01, Tầng 01, Ô 01",Keys.RETURN);
		
		driver.findElement(By.xpath(".//*[@id='userForm']/div[4]/div/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='userForm']/div[4]/div/div/div/input")).sendKeys("Trần Thị Huyền Trang",Keys.RETURN);
		
		
		driver.findElement(By.xpath(".//*[@id='userForm']/div[5]/div/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='userForm']/div[5]/div/div/div/input")).sendKeys("Trần Thị Huyền Trang",Keys.RETURN);
		
		driver.findElement(By.xpath(".//*[@id='userForm']/div[6]/div/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='userForm']/div[6]/div/div/div/input")).sendKeys("P Lập trình",Keys.RETURN);
		
		driver.findElement(By.xpath(".//*[@id='userForm']/div[7]/div/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='userForm']/div[7]/div/div/div/input")).sendKeys("VPN",Keys.RETURN);
		
		//WebElement uploadBtn = driver.findElement(By.xpath("//input[contains(@id,'File')]"));	//Vị trí của upload button
		//uploadBtn .sendKeys("E:\\SELE\\QuanLyCV\\FileTest.txt");//Sendkey đường dẫn tuyệt đối của file muốn upload
		driver.findElement(By.xpath("//input[contains(@id,'File')]")).sendKeys("E:\\SELE\\QuanLyCV\\FileTest.txt");
		// Click on Checkbox
		driver.findElement(By.xpath(".//*[@id='userForm']/div[9]/label/input")).click();
		// Kiểm tra Checkbox sau khi click
		System.out.println("Ket qua cua IsSelected: "+ driver.findElement(By.xpath(".//*[@id='userForm']/div[9]/label/input")).isSelected());
		System.out.println("Ket qua cua IsEnabled: "+ driver.findElement(By.xpath(".//*[@id='userForm']/div[9]/label/input")).isEnabled());
		System.out.println("Ket qua cua IsDisplay: "+ driver.findElement(By.xpath(".//*[@id='userForm']/div[9]/label/input")).isDisplayed());
		////input[contains(@type,'checkbox')]
		driver.findElement(By.xpath(".//*[@id='userForm']/div[10]/input")).sendKeys("Tài liệu mới");
		driver.findElement(By.xpath(".//*[@id='userForm']/div[11]/textarea")).sendKeys("Tài liệu hướng dẫn sử dụng");
		
		//driver.findElement(By.xpath(".//*[@id='modal_tailieu']/div/div/div[3]/div/div[2]")).click();//close
		driver.findElement(By.xpath(".//*[@id='modal_tailieu']/div/div/div[3]/div/div[1]")).click();//luu
		driver.navigate().to(driver.getCurrentUrl());//driver.navigate().refresh();
		
		//Actions action = new Actions(driver);
        //action.sendKeys(Keys.RETURN);
       // action.perform();
}
}
