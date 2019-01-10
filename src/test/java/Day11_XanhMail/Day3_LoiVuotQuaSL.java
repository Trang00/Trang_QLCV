package Day11_XanhMail;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day3_LoiVuotQuaSL extends Setup_Day11 {
	@Test
	public void Day3() {
		driver.findElement(By.xpath(Locator_Day11.B_MenuMOBIE)).click();// click mobie
		
		driver.findElement(By.xpath(Locator_Day11.B_AddToCart)).click();// Add to cart SONY
		
		driver.findElement(By.xpath(Locator_Day11.S_SL)).sendKeys(Constants_Day11.I_SL);
		driver.findElement(By.xpath(Locator_Day11.C_Update)).click();
		
		String TB = driver.findElement(By.xpath(Locator_Day11.G_TBSL)).getText();
		System.out.println("Thông báo vượt quá số lượng: " + TB);
		
		driver.findElement(By.xpath(Locator_Day11.C_EMPTYCART)).click();
		
		String TBtrong = driver.findElement(By.xpath(Locator_Day11.G_TBEmptyCart)).getText();
		System.out.println("Thông báo giỏ hàng rỗng:" + TBtrong);
	}
}
