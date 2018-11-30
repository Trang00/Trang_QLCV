package ato.qlcv.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import ato.qlcv.data.Constants;
import ato.qlcv.data.Locator;
import ato.qlcv.webdriver.action.Commom;

public class LoginPage extends Commom {
	
//	LoginPage loginPage;
	WebDriver driver;
	
	//public LoginPage(WebDriver driver) {
	//	this.driver=driver;
		// TODO Auto-generated constructor stub
	//}
	//public void addANewPost(String User, String Pass){
	//	driver.findElement(By.xpath(TextB_TK)).sendKeys(Text_TK);
	//	driver.findElement(By.xpath(Button_TK)).click();
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	public  void navigeteWebApp(){
		open(Constants.DOMAIN);// tim den class Constants 
		//open("http://ltato.ddns.net/login");
	}
	public void inputUserName(String value){
		sendkeys(Locator.UserName, value);
	}
	public void inputPassword(String value){
		sendkeys(Locator.Password,value);
	}
	public void clickSignIn() {
		click(Locator.Submit);	
	}
	
	public void getMessage(String value) {
		getText(Locator.DangNhapSai, value);	
	}
	
	public void Login(){
		//loginPage.clear(Constants.userName);
		//System.out.println("Xin chao .............");
		//loginPage.inputUserName(Constants.userName);
		//loginPage.clear(Constants.password);
		//loginPage.inputPassword(Constants.password);// Thread.sleep(100);
		//loginPage.clickSignIn();
	}

}
