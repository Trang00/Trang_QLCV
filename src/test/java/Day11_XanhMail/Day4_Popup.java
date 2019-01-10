package Day11_XanhMail;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day4_Popup extends Setup_Day11 {
	/*      
	Test Steps:
	1. Goto http://live.guru99.com/
	2. Click on ‘MOBILE’ menu
	3. In mobile products list , click on ‘Add To Compare’ for 2 mobiles (Sony Xperia & Iphone)
	4. Click on ‘COMPARE’ button. A popup window opens
	5. Verify the pop-up window and check that the products are reflected in it
	   Heading "COMPARE PRODUCTS" with selected products in it.
	6. Close the Popup Windows
	*/
	@Test
	public void Day4() throws Exception {
		driver.findElement(By.xpath(Locator_Day11.B_MenuMOBIE)).click();// click
		
		String Sony=driver.findElement(By.xpath(Locator_Day11.G_SONY)).getText();
		System.out.println("SONY: "+Sony);
		driver.findElement(By.xpath(Locator_Day11.C_AddToCartSony)).click();//click sony
		String Iphone=driver.findElement(By.xpath(Locator_Day11.G_IPHONE)).getText();
		System.out.println("IPONE:"+Iphone);
		driver.findElement(By.xpath(Locator_Day11.C_AddToCartIphone)).click();//click iphone
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(Locator_Day11.B_Compare)).click();//Click COMPARE
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 //Thread.sleep(1000);
		//MỞ CỬA SỔ MỚI
		for(String handle:driver.getWindowHandles()){
			driver.switchTo().window(handle);
		}
		String Head="COMPARE PRODUCTS";
		String HeadCom=driver.findElement(By.xpath(Locator_Day11.G_HeadCompare)).getText();
		System.out.println("Tiêu đề trang so sánh:"+HeadCom);
		
		String PopSony=driver.findElement(By.xpath(Locator_Day11.G_SONYChitiet)).getText();
		System.out.println("SONY chi tiết:"+PopSony);
	
		String PopIphone=driver.findElement(By.xpath(Locator_Day11.G_IPHONEChitiet)).getText();
		System.out.println("IPHONE chi tiết: "+PopIphone);
		
		try{
			assertEquals(Head, HeadCom);
		}catch(Exception e){
			e.printStackTrace();
		}
	
		try{
			assertEquals(Sony, PopSony);
		}catch(Exception e){
			e.printStackTrace();
		}
		 
		try{
			assertEquals(Iphone, PopIphone);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Locator_Day11.B_Closepopup)).click();
		
		for(String handle:driver.getWindowHandles()){
			driver.switchTo().window(handle);
			
		}
		

	}
}
