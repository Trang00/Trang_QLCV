package Day07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day3 extends SetUpDay7{
	 /**
     * SS1: Enter valid userid & password 
     *      Expected: Login successful home page shown 
     * SS2: Enter invalid userid & valid password 
     * SS3: Enter valid userid & invalid password 
     * SS4: Enter invalid userid & invalid password 
     *      Expected: A pop-up “User or Password is not valid” is shown
     * 
     * @throws Exception
     */
	@Test
	public void TC_01_SaiPass() {
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(Util_Day7.USER_NAME);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("1");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(Util_Day7.WAIT_TIME, TimeUnit.SECONDS);
		String TB = driver.switchTo().alert().getText();
		System.out.println("Thông báo đăng nhập sai: " + TB);
		driver.switchTo().alert().accept();
	}
@Test
	public void TC_02_SaiUser() {
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("1");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(Util_Day7.PASSWD);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(Util_Day7.WAIT_TIME, TimeUnit.SECONDS);
		String TB = driver.switchTo().alert().getText();
		System.out.println("Thông báo đăng nhập sai: " + TB);
		driver.switchTo().alert().accept();
	}

@Test
	public void TC_03_SaiUP() {
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("1");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("1");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(Util_Day7.WAIT_TIME, TimeUnit.SECONDS);
		String TB = driver.switchTo().alert().getText();
		System.out.println("Thông báo đăng nhập sai: " + TB);
		driver.switchTo().alert().accept();
	}
}
