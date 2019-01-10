package Day11_XanhMail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Setup_Day11 {
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		System.getProperty("Webdriver.Chrome.driver", Locator_Day11.CHROME_PATH);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Locator_Day11.BASE_URL);
	}
@AfterMethod
	public void Close() {
		driver.quit();
	}
}
