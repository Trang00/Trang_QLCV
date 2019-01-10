package Day11_XanhMail;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day5_AccountCreation extends Setup_Day11{
@Test
public void Day5() throws Exception{
	/*
1. Goto http://live.guru99.com/
2. Click on my account link
3. Click create account link and fill new user information except email ID
4. Click register
5. Veriffy registrantion is done
6. Go to TV menu
7. Add product in your wish list
8. Click SHARE WISHLIST
9. In next page enter Email and a message and click SHARE WHISHLIST
10. Check sishlist is shared
*/
	//Register
	driver.findElement(By.xpath(Locator_Day11.C_MyAccount)).click();
	driver.findElement(By.xpath(Locator_Day11.C_CreateAccount)).click();
	driver.findElement(By.xpath(Locator_Day11.S_FirstName)).sendKeys(Constants_Day11.FirstName);
	driver.findElement(By.xpath(Locator_Day11.S_MiddleName)).sendKeys(Constants_Day11.MiddleName);
	driver.findElement(By.xpath(Locator_Day11.S_LastName)).sendKeys(Constants_Day11.LastName);
	driver.findElement(By.xpath(Locator_Day11.S_Email)).sendKeys(Constants_Day11.Email);
	driver.findElement(By.xpath(Locator_Day11.S_Pass)).sendKeys(Constants_Day11.Pass);
	driver.findElement(By.xpath(Locator_Day11.S_ConfirmPass)).sendKeys(Constants_Day11.ConfirmPass);
	driver.findElement(By.xpath(Locator_Day11.C_Register)).click();
	
	String XacNhanDK=driver.findElement(By.xpath(Locator_Day11.G_XacNhanDK)).getText();
	System.out.println("Xác nhận đăng ký thực tế:"+XacNhanDK);
	String XacNhan="Hello,"+" "+Constants_Day11.FirstName+" "+Constants_Day11.MiddleName+" "+Constants_Day11.LastName+"!";
	System.out.println("Xác nhận lý thuyết:"+XacNhan);
	try{
		assertEquals(XacNhanDK, XacNhan);
	}catch(Exception e){
		e.printStackTrace();
	}
	Thread.sleep(1000);
	//menu TV -> Wishlist
	driver.findElement(By.xpath(Locator_Day11.C_menuTV)).click();
	String LG=driver.findElement(By.xpath(Locator_Day11.G_LG)).getText();
	System.out.println("Sản phẩm: "+LG);
	
	driver.findElement(By.xpath(Locator_Day11.C_AddWishlistLG)).click();
	
	String LGChitiet=driver.findElement(By.xpath(Locator_Day11.G_LGChitiet)).getText();
	System.out.println("LG chi tiết:"+LGChitiet);
	
	try{
		assertEquals(LG, LGChitiet);
	}catch(Exception e){
		e.printStackTrace();
	}
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath(Locator_Day11.B_ShareWishlist1)).click();
	driver.findElement(By.xpath(Locator_Day11.S_EmailTextarea)).sendKeys(Constants_Day11.Email);
	driver.findElement(By.xpath(Locator_Day11.S_MessTextagdrea)).sendKeys(Constants_Day11.Mess);
	driver.findElement(By.xpath(Locator_Day11.B_ShareWishlist2)).click();
	
	String CheckWishlist=driver.findElement(By.xpath(Locator_Day11.G_CheckWishlist)).getText();
	System.out.println("WishList Thành công: "+CheckWishlist);
	
	
}
}
