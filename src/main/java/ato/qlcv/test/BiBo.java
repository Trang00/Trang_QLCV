package ato.qlcv.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BiBo {
	WebDriver driver;
@Test
public void bobi(){
	driver = new ChromeDriver();
	driver.get("https://bibomart.com.vn/san-deal-0d.html");
	driver.findElement(By.xpath(".//*[@id='select-region-popup']/div[2]/div/div[2]/a[1]/span")).click();
	driver.findElement(By.xpath("html/body/div[5]/div[3]/a/img")).click();
	
	driver.findElement(By.xpath(".//*[@id='CustomerMiniGame_fullname']")).sendKeys("Trần Thị Huyền Trang");
	driver.findElement(By.xpath(".//*[@id='CustomerMiniGame_phone']")).sendKeys("0978221804");
	driver.findElement(By.xpath(".//*[@id='CustomerMiniGame_email']")).sendKeys("TrangHC0938@gmail.com");
	driver.findElement(By.xpath(".//*[@id='CustomerMiniGame_question1']")).sendKeys("Số 19 ngõ 68 Quan Nhân- Trung Hòa- Cầu Giấy- Hà Nội");
	driver.findElement(By.xpath(".//*[@id='register-deal']/div/div[6]/input")).click();
	
}
}
