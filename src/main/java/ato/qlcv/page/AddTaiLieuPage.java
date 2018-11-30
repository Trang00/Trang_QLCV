package ato.qlcv.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import ato.qlcv.data.Locator;
import ato.qlcv.webdriver.action.Commom;

public class AddTaiLieuPage extends Commom{

	public AddTaiLieuPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	public void inputUserName(String value){
		sendkeys(Locator.UserName, value);
	}
	public void inputPassword(String value){
		sendkeys(Locator.Password,value);
	}
	public void clickSignIn() {
		click(Locator.Submit);	
	}
	public void clickMenu() {
		click(Locator.DanhMuc);	
	}
	public void clickTaiLieu() {
		click(Locator.TaiLieu);	
	}
	public void clickAddTaiLieu() {
		click(Locator.ThemMoiTL);	
	}
	
	public  void  clickLoaiTL() {
		click(Locator.C_TL_LoaiTL);
	}
	public void inputLoaiTL(String value){
		senkeysEnter(Locator.S_TL_LoaiTL,value);
	}
	public void clickVitriTK(){
		click(Locator.C_TLViTri);
	}
	public void inputVitriTL(String value){
		senkeysEnter(Locator.S_TLViTri, value);
	}
	
	public void clickNguoiSoanTL(){
		click(Locator.C_TLNguoiSoan);
	}
	public void inputNguoiSoanTL(String value){
		senkeysEnter(Locator.S_TLNguoiSoan, value);
	}
	
	public void clickNguoiKyTL(){
		click(Locator.C_TLNguoiKy);
	}
	public void inputNguoiKyTL(String value) {
		senkeysEnter(Locator.S_TLNguoiKy, value);
	}
	
	public void clickBoPhanTL(){
		click(Locator.C_TLBoPhan);
	}
	public void inputBoPhanTL(String value){
		senkeysEnter(Locator.S_TLBoPhan, value);
	}
	
	public void clickKhachHangTL(){
		click(Locator.C_TLKhachHang);
	}
	public void inputKhachHangTL(String value){
		senkeysEnter(Locator.S_TLKhachHang, value);
	}
	
	public void inputFileTL(String value){
		sendkeys(Locator.Cb_TLTaiFile, value);
	}
	
	public void checkDungChung(){
		checkRemember(Locator.Check_DungChung);
	}
	
	public void inputTieudeTL(String value){
		sendkeys(Locator.S_TLTieuDe, value);
	}
	public void inputNoiDungTL(String value){
		sendkeys(Locator.S_TLnoiDung, value);
	}
	public void clickCloseTL(){
		click(Locator.B_TLAddClose);
	}
	public void clickLuuTL(){
		click(Locator.B_TLAddLuu);
	}
}
