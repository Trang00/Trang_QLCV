package ato.qlcv.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import ato.qlcv.data.Locator;
import ato.qlcv.webdriver.action.Commom;

public class AddKhachHangPage extends Commom {

	public AddKhachHangPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	public void clickMenu() {
		click(Locator.DanhMuc);	
	}

}
