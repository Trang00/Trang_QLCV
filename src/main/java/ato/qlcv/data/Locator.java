package ato.qlcv.data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Locator {
	//ĐĂNG NHẬP HỆ THỐNG
		public static final String UserName=".//*[@placeholder='Tên đăng nhập']";
		public static final String Password=".//*[@placeholder='Mật khẩu']";
		public static final String Submit=".//div[contains(text(),'Đăng nhập')]";
		public static final String DangNhapSai=".//label[contains(text(),'Đăng nhập không thành công')]";
		
	//TÀI LIỆU
		public static final String DanhMuc=".//span[contains(@class,'caret')]";
		public static final String TaiLieu=".//*[@id='navbar-mobile']/ul[1]/li/div/ul/li/div/ul/li[4]";
		
		public static final String ThemMoiTL="html/body/div[4]/div[1]/div/div[1]/div[2]/div[1]/div/div[1]";
		public static final String TLLableQLTaiLieu=".//*[@id='modal_tailieu']/div/div/div[1]/h3/b[1]";
		public static final String TLLableThemMoi=".//*[@id='modal_tailieu']/div/div/div[1]/h3/b[2]";
		public static final String TLSoTaiLieu=".//input[contains(@class,'form-control ng-pristine ng-untouched ng-valid ng-not-empty')]";
		
		public static final String C_TL_LoaiTL=".//*[@id='userForm']/div[2]/div/a/span";
		public static final String S_TL_LoaiTL=".//*[@id='userForm']/div[2]/div/div/div/input";
		
		public static final String C_TLViTri=".//*[@id='userForm']/div[3]/div/a/span";
		public static final String S_TLViTri=".//*[@id='userForm']/div[3]/div/div/div/input";
		
		public static final String C_TLNguoiSoan=".//*[@id='userForm']/div[4]/div/a/span";
		public static final String S_TLNguoiSoan=".//*[@id='userForm']/div[4]/div/div/div/input";
		
		public static final String C_TLNguoiKy=".//*[@id='userForm']/div[5]/div/a/span";
		public static final String S_TLNguoiKy=".//*[@id='userForm']/div[5]/div/div/div/input";
		
		public static final String C_TLBoPhan=".//*[@id='userForm']/div[6]/div/a/span";
		public static final String S_TLBoPhan=".//*[@id='userForm']/div[6]/div/div/div/input";
		
		public static final String C_TLKhachHang=".//*[@id='userForm']/div[7]/div/a/span";
		public static final String S_TLKhachHang=".//*[@id='userForm']/div[7]/div/div/div/input";
		
		public static final String Cb_TLTaiFile="//input[contains(@id,'File')]";
		
		public static final String TLTepDinhKem="//input[contains(@id,'File')]";
		public static final String Check_DungChung=".//*[@id='userForm']/div[9]/label/input";
		
		public static final String S_TLTieuDe=".//*[@id='userForm']/div[10]/input";
		public static final String S_TLnoiDung=".//*[@id='userForm']/div[11]/textarea";
		
		public static final String B_TLAddLuu=".//*[@id='modal_tailieu']/div/div/div[3]/div/div[1]";
		public static final String B_TLAddClose=".//*[@id='modal_tailieu']/div/div/div[3]/div/div[2]";
		
}
