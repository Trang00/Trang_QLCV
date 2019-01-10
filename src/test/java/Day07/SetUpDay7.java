package Day07;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SetUpDay7 {
	WebDriver driver;
	String baseUrl;
@BeforeMethod
	public void Setup7() {
		System.setProperty("Webdriver.Chrome.driver", Util_Day7.CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		baseUrl = Util_Day7.BASE_URL;
		driver.manage().timeouts().implicitlyWait(Util_Day7.WAIT_TIME, TimeUnit.SECONDS);
		driver.get(baseUrl + "/V4/");
		
/*
 		System.getProperty("Webdriver.Chrome.driver", ".//driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/V4/");
*/
	}
@Test(enabled=false)
	public void CS(){}
@AfterMethod
	public void Close(){
		driver.close();
	}
}
