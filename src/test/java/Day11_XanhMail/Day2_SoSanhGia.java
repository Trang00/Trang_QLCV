package Day11_XanhMail;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day2_SoSanhGia extends Setup_Day11 {
	@Test
	public void Day2() {
		driver.findElement(By.xpath(Locator_Day11.B_MenuMOBIE)).click();// click menu mobile
		String SP = driver.findElement(By.xpath(Locator_Day11.TenSP)).getText();
		System.out.println("Tên sản phẩm :" + SP);
		
		String Gia = driver.findElement(By.xpath(Locator_Day11.GiaSP)).getText();
		System.out.println("Gia SP:" + Gia);
		
		driver.findElement(By.xpath(Locator_Day11.Click_SP)).click();
		String GiaCT = driver.findElement(By.xpath(Locator_Day11.GiaCT)).getText();
		System.out.println("Gía chi tiết cuả SP: " + GiaCT);
		
		if (Gia.equals(GiaCT)) {
			System.out.println("Gía bằng nhau và = " + GiaCT);
		} else {
			System.out.println("Giá không bằng nhau");
		}
		/*
		  try {
	        assertEquals(Gia,GiaCT); 
	      } catch (Exception e) {
	    	  e.printStackTrace();
	      }
		 */
		
		
	}
}
