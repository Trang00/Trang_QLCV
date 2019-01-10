package Day11_XanhMail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test123 extends Setup_Day11 {
	@Test
	public void Test012(){
		driver.findElement(By.xpath(Locator_Day11.C_menuTV)).click();
		String LG=driver.findElement(By.xpath(Locator_Day11.G_LG)).getText();
		System.out.println("Sản phẩm: "+LG);
		driver.findElement(By.xpath(Locator_Day11.C_AddWishlistLG)).click();
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Tranghc0938@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='send2']")).click();
		//String LGChitiet=driver.findElement(By.xpath("//a[contains(@title,'LG LCD')and contains(text(),'LG LCD')]")).getText();
		String LGChitiet=driver.findElement(By.xpath(".//*[@id='item_30233']/td[2]/h3/a")).getText();
		System.out.println("LG chi tiết:"+LGChitiet);
	}
}
