package Day07;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day1 extends SetUpDay7{
	String Tittle="Guru99 Bank Manager HomePage";
	@Test
	public void Case_Day1(){
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr166619");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("UvugAsu");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		}
}
