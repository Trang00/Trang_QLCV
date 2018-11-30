package ato.qlcv.webdriver.action;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Commom extends Page {

	public  WebDriver driver;
	
	public Commom(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;
		

	}
	public void open(String url) {// mở trình duyệt
		driver.get(url);
	}

	public void click(String locator) {//
		myGetElement(By.xpath(locator)).click();

	}
	public void clear(String locator){
		myGetElement(By.xpath(locator)).clear();
	}

	public void sendkeys(String locator, String value) {
		myGetElement(By.xpath(locator)).sendKeys(value);
	}
	//input dữ liệu xong nhấn bàn phím Enter
	public void senkeysEnter(String locator, String value){
		myGetElement(By.xpath(locator)).sendKeys(value,Keys.RETURN);
	}
	
	// Alert PopUp
		public void alertClickOk() {
			driver.switchTo().alert().accept();// Hiển thị thông báo -> Nhấn nút OK
		}

		public void alertClickCancel() {
			driver.switchTo().alert().dismiss();//// Hiển thị thông báo -> Nhấn nút Cancel
		}
		
	public void getText(String locator, String value) {
		String message = driver.findElement(By.xpath(locator)).getText();
		System.out.println("Get Text:"+message);
	}
	
	public void getTitle(String value) {
		String messageTieuDe = driver.getTitle();
		System.out.println("Get Title:"+messageTieuDe);
	}
	
	public void checkRemember(String locator) {
		WebElement mydriver = myGetElement(By.xpath(locator));
		if (mydriver.isSelected() == false) {
			mydriver.click();
			System.out.println("Checkbox được tích");
		}else{
			System.out.println("Checkbox không được tích");
		}
	}
	
	public void selectByVisibleText(String locator, String value) {// Select Drop Dow
		Select EditSelect = new Select(driver.findElement(By.xpath(locator)));
		EditSelect.selectByVisibleText(value);
	}

}
