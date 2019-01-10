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
		
// KHÁCH HÀNG
		//THÊM MỚI KHÁCH HÀNG
		
		public static final String C_KH =".//*[@id='navbar-mobile']/ul[1]/li/div/ul/li/div/ul/li[6]/a";
		public static final String C_AddKH=".//*[@id='KhachHang']/div[2]/table/tbody/tr[1]/th[1]/a/i";
		public static final String I_MaKH=".//*[@id='Ma']";
		public static final String I_TenKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[3]/input";
		public static final String I_EmailKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[4]/input";
		public static final String I_DienThoaiKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[5]/input";
		public static final String I_DiaChiKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[6]/textarea";
		public static final String I_DiaChiGiaoHangKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[7]/textarea";
		public static final String I_CongTyKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[8]/textarea";
		public static final String I_TTNguoiDaiDien_KH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[10]/input";
		public static final String I_DThoaiNDDKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[11]/input";
		public static final String I_EmailNDDKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[12]/input";
		public static final String I_NguoiGDKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[14]/input";
		public static final String I_DienThoaiNGDKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[15]/input";
		public static final String I_EmailNGDKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[16]/input";
		public static final String S_LoaiKH="";
		public static final String S_NguonKH="";
		public static final String S_NVTaoKH="";
		public static final String S_NVPhuTrachKH="";
		public static final String I_GhiChuKH=".//*[@id='modal_khachhang']/div/div/div[2]/div/form/div[21]/textarea";
		
		public static final String B_AddKHLuu=".//*[@id='modal_khachhang']/div/div/div[3]/div/button";
		public static final String B_AddKHDong=".//*[@id='modal_khachhang']/div/div/div[3]/div/div";
		
}
