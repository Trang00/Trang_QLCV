package ato.qlcv.test;

import org.testng.annotations.Test;

import ato.qlcv.page.AddKhachHangPage;
import ato.qlcv.webdriver.action.SetUpNew;

public class AddKhachHangTest extends SetUpNew {
	AddKhachHangPage AddKH;
@Test
public void AddKH() throws Exception{
	System.out.println("ABC");
	AddKH= new AddKhachHangPage(driver, wait);
	AddKH.clickMenu();
}
}

