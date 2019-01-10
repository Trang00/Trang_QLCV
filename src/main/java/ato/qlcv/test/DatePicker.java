package ato.qlcv.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePicker {
	WebDriver driver;
	WebElement dateWidget;
	List<WebElement> rows;
	List<WebElement> columns;
	List<String> list = Arrays.asList("January", "February", "March", "April",
			"May", "June", "July", "August", "September", "October",
			"November", "December");
 
	int expMonth;
	int expYear;
	String expDate = null;
	
	// Calendar Month and Year.
	String calMonth = null;
	String calYear = null;
	boolean dateNotFound;
 
	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver",
				".//driver//chromedriver.exe");
		driver = new ChromeDriver();
	}
 
	@Test
	public void testJQueryDatePicket() throws InterruptedException {
		driver.get("http://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("datepicker")).click();
		dateNotFound = true;
		// Set the date here. Eg: 11/01/2016.
		expMonth = 1;
		expYear = 2016;
		expDate = "11";
		while (dateNotFound) {
 
			calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			   calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			   if(list.indexOf(calMonth)+1 == expMonth && (expYear == Integer.parseInt(calYear)))
			   {
			    selectDate(expDate);
			    dateNotFound = false;
			   }
			   else if(list.indexOf(calMonth)+1 < expMonth && (expYear == Integer.parseInt(calYear)) || expYear > Integer.parseInt(calYear))
			   {
			    driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			   }
			   else if(list.indexOf(calMonth)+1 > expMonth && (expYear == Integer.parseInt(calYear)) || expYear < Integer.parseInt(calYear))
			   {
			    driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		Thread.sleep(3000);
	}
 
	public void selectDate(String date) {
		dateWidget = driver.findElement(By.id("ui-datepicker-div"));
		rows = dateWidget.findElements(By.tagName("tr"));
		columns = dateWidget.findElements(By.tagName("td"));
 
		for (WebElement cell : columns) {
			if (cell.getText().equals(date)) {
				cell.findElement(By.linkText(date)).click();
				break;
			}
		}
	}
 
	@AfterMethod
	public void tearDown() throws Exception {
 
		try {
			driver.close();
			Thread.sleep(3000);
		} catch (Exception b) {
			b.getMessage();
		}
		
	}
}
