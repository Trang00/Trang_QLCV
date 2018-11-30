package ato.qlcv.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ato.qlcv.data.Constants;
import ato.qlcv.page.LoginPage;
import ato.qlcv.webdriver.action.Generator_Randum;
import ato.qlcv.webdriver.action.SetUp;
import ato.qlcv.page.*;
import ato.qlcv.data.*;
import ato.qlcv.data.Locator;

public class AddTaiLieu extends SetUp{
	
	AddTaiLieuPage AddTL;// Khoi tao
	
@Test
	public void ThemMoiTL() throws Exception{

		AddTL = new AddTaiLieuPage(driver, wait);
		AddTL.inputUserName(Constants.userName);//loginPage.clear(Constants.password);
		AddTL.inputPassword(Constants.password);
		AddTL.clickSignIn();
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		AddTL.clickMenu();
		AddTL.clickTaiLieu();
		AddTL.clickAddTaiLieu();
		
		AddTL.clickLoaiTL();
		AddTL.inputLoaiTL(Constants.LoaiTL);
		
		AddTL.clickVitriTK();
		AddTL.inputVitriTL(Constants.ViTriTL);
		
		AddTL.clickNguoiSoanTL();
		AddTL.inputNguoiSoanTL(Constants.NguoiSoanTL);
		
		AddTL.clickNguoiKyTL();
		AddTL.inputNguoiKyTL(Constants.NguoiKyTL);
		
		AddTL.clickBoPhanTL();
		AddTL.inputBoPhanTL(Constants.BoPhanTL);
		
		AddTL.clickKhachHangTL();
		AddTL.inputKhachHangTL(Constants.KhachHangTL);
		
		AddTL.inputFileTL(Constants.FileTL);
		
		AddTL.checkDungChung();
	
		AddTL.inputTieudeTL(Constants.TieuDeTL);
		AddTL.inputNoiDungTL(Constants.NoiDungTl);
		
		AddTL.clickLuuTL();
		driver.navigate().to(driver.getCurrentUrl());//driver.navigate().refresh();
// câu lệnh enter trên bàn phím
		//Actions action = new Actions(driver);
        //action.sendKeys(Keys.RETURN);
       // action.perform();
}
}
