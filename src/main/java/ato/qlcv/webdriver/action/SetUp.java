package ato.qlcv.webdriver.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import utilities.Generator;
//import utilities.Links;
import ato.qlcv.data.*;
import ato.qlcv.page.LoginPage;

public class SetUp {
	
protected WebDriver driver;
LoginPage loginPage;

protected WebDriverWait wait; // Khoi tao
   
@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "E://SELE//driver//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		wait = new WebDriverWait(driver, 30);
		driver.get(Constants.DOMAIN);
		//loginPage = new LoginPage(driver, wait);
		//loginPage.navigeteWebApp();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

@AfterMethod
	public void tearDown() {
		driver.quit();//driver.close();
	}
}
