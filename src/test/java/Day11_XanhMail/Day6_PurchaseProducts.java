package Day11_XanhMail;

import static org.testng.Assert.assertEquals;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Day6_PurchaseProducts extends Setup_Day11 {
@Test
public void Day6(){
	//2. Click vào My account
	driver.findElement(By.xpath(Locator_Day11.C_MyAccount)).click();
	//3. Đăng nhập
	driver.findElement(By.xpath(Locator_Day11.S_EmailDN)).sendKeys(Constants_Day11.EmailDN);
	driver.findElement(By.xpath(Locator_Day11.S_PassDN)).sendKeys(Constants_Day11.PassDN);
	driver.findElement(By.xpath(Locator_Day11.C_Login)).click();
	//4.Chọn TV-> add Wishlist ( xác nhận sản phẩm trong wishlist
	driver.findElement(By.xpath(Locator_Day11.C_menuTV)).click();
	String LG=driver.findElement(By.xpath(Locator_Day11.G_LG)).getText();
	System.out.println("Sản phẩm: "+LG);
	
	driver.findElement(By.xpath(Locator_Day11.C_AddWishlistLG)).click();
	
	String LGChitiet=driver.findElement(By.xpath(Locator_Day11.G_LGChitiet)).getText();
	System.out.println("LG chi tiết:"+LGChitiet);
	
	try{
		assertEquals(LG, LGChitiet);
		System.out.println("Lấy đúng sản phẩm:"+LGChitiet);
	}catch(Exception e){
		e.printStackTrace();
	}
	// 5. Cho sản phẩm vào giỏ
	driver.findElement(By.xpath(Locator_Day11.C_AddToCart)).click();
	//6. Nhập thông tin giao hàng
	Select SeCountry=new Select(driver.findElement(By.xpath(Locator_Day11.Se_Country)));
	SeCountry.selectByValue(Constants_Day11.Country);
	
	Select SeState=new Select(driver.findElement(By.xpath(Locator_Day11.Se_State)));
	SeState.selectByValue(Constants_Day11.State);
	
	driver.findElement(By.xpath(Locator_Day11.S_ZIP)).sendKeys(Constants_Day11.ZIP);
	//8. Nhấn xác nhận thônng ttin giao hàng
	driver.findElement(By.xpath(Locator_Day11.C_Estimate)).click();
	//9.
	String FR="Flat Rate";
	String FlatRate=driver.findElement(By.xpath(Locator_Day11.G_FlatRate)).getText();
	System.out.println("Flat Rate:"+FlatRate);
	try{
		assertEquals(FR, FlatRate);
	}catch(Exception e){
		e.printStackTrace();
	}
	//10. Chọn phí vận chuyển, update phí vận thêm vào tổng tiền = click update total
	String FlatRateSo=driver.findElement(By.xpath(Locator_Day11.G_FlatRateSo)).getText();
	System.out.println("Flat Rate:"+FlatRateSo);
	
	driver.findElement(By.xpath(Locator_Day11.R_FlatRateSo)).click();//click radio
	driver.findElement(By.xpath(Locator_Day11.C_UpdateTotal)).click();//click Update total
	
	String Shipping=driver.findElement(By.xpath(Locator_Day11.G_Shipping)).getText();
	System.out.println("Shipping:"+Shipping);
	
	if(FlatRateSo.equals(Shipping)){
		System.out.println("Đúng giá ship:"+Shipping);
	}else{
		System.out.println("Không đúng giá ship");
	}
	//11. Xác nhận phí vận chuyển được thêm vào tổng tiền
	String SubTotal=driver.findElement(By.xpath(Locator_Day11.G_SubTotal)).getText();
	System.out.println("Tổng tiền hàng:"+SubTotal);
	
	String GrandTotal=driver.findElement(By.xpath(Locator_Day11.G_GrandTotal)).getText();
	System.out.println("Tổng tiền hàng+Ship:"+GrandTotal);
	
	String Ship = Shipping.substring(0, Shipping.length()-3);
	//System.out.println("Giá ship được cắt: " + Ship);
	String result0 = Ship.replaceAll("[,$]","");
	int ShipSo = Integer.parseInt(result0);
	//System.out.println("Dạng số ship:" + ShipSo);
		
	String str=SubTotal.substring(0, SubTotal.length()-3);// cắt 3 ký tự cuối
	//System.out.println(".....:"+str);
	String result = str.replaceAll("[,$]",""); // bỏ ký tự $ và dấu ,
	//System.out.println("ABC:"+result);
	int GiaS = Integer.parseInt(result);// chuyển thành dạng số
	//System.out.println("Tổng giá Dạng số:" + GiaS);
	
	String Tong = GrandTotal.substring(0, GrandTotal.length()-3);
	//System.out.println("Tổng Giá được cắt: " + Tong);
	String result1 = Tong.replaceAll("[,$]",""); // bỏ ký tự $ và dấu ,
	//System.out.println("Tổng giá cả ship:"+result1);
	int TongSo = Integer.parseInt(result1);
	//System.out.println("Tổng giá cả ship Dạng số:" + TongSo);
	
	int TotalLT=ShipSo+GiaS;
	System.out.println("Gía +Ship LÝ THUYẾT: "+TotalLT);
	if(TotalLT==TongSo){
		System.out.println("Xác nhận đúng giá đã + ship:"+TotalLT);
	}else{
		System.out.println("Không đúng đúng giá đã + ship!");
	}
	// 12.Click Proceed to checkout
	driver.findElement(By.xpath(Locator_Day11.C_ProceedCheckout)).click();
	//13.Enter Billing Information
	
}
}
