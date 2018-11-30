package ato.qlcv.webdriver.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	 WebDriver driver;
	 WebDriverWait wait;

	 public Page(WebDriver driver, WebDriverWait wait) {
	  this.driver = driver;
	  this.wait = wait;
	 }

	 public WebElement myGetElement(By locator) {
	  return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	 }
}
