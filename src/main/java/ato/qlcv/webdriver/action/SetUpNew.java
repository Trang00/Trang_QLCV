package ato.qlcv.webdriver.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ato.qlcv.data.Constants;

public class SetUpNew {
	protected WebDriver driver;
	protected WebDriverWait wait;
	   
@BeforeMethod 
	public void setUp() throws Exception {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
			wait = new WebDriverWait(driver, 30);
			driver.get(Constants.DOMAIN);
			driver.findElement(By.xpath(".//*[@placeholder='Tên đăng nhập']")).sendKeys(Constants.userName);
			driver.findElement(By.xpath(".//*[@placeholder='Mật khẩu']")).sendKeys(Constants.password);
			driver.findElement(By.xpath(".//*[@id='l-login']/div[4]/div[2]/div")).click();
	}
@AfterMethod
	public void tearDown() {
			driver.quit();//driver.close();
	}
}
