package Day07;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day5_DataProvider_02 extends SetUpDay7 {
	private WebDriver driver; // Selenium control driver
	private String baseUrl; // baseUrl of website Guru99
	/**
	 * create test data for testing The test data include set of username,
	 * password
	 * 
	 * @return
	 */
	@DataProvider(name = "GuruTest")
	public Object[][] testData() {
		
		Object[][] data = new Object[4][2];

		// 1st row
		data[0][0] = Util_Day7.USER_NAME;
		data[0][1] = Util_Day7.PASSWD;
		//2nd row
		data[1][0] = "invalid";
		data[1][1] = "valid";
		//3rd row
		data[2][0] = "valid";
		data[2][1] = "invalid";
		//4th row
		data[3][0] = "invalid";
		data[3][1] = "invalid";
		return data;
	}
	@BeforeMethod
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		baseUrl = Util_Day7.BASE_URL;
		driver.manage().timeouts().implicitlyWait(Util_Day7.WAIT_TIME, TimeUnit.SECONDS);
		driver.get(baseUrl + "/V4/");
	}

	/**
	 * Start Testing Test script 05 
	 * 1) Go to http://www.demo.guru99.com/V4/ 
	 * 2) Enter valid UserId 
	 * 3) Enter valid Password 
	 * 4) Click Login Expected
	 * result: Login successful home page shown Message shown Welcome
	 * <managerid>
	 * 
	 * @throws Exception
	 */

	@Test(dataProvider = "GuruTest")
	public void testCase05(String username, String password) throws Exception {
		String actualTitle;
		String actualBoxMsg;
	
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();

		 try{ 
		       	Alert alt = driver.switchTo().alert();
				actualBoxMsg = alt.getText(); // get content of the Alter Message
				alt.accept();
				 // Compare Error Text with Expected Error Value					
				assertEquals(actualBoxMsg,Util_Day7.EXPECT_ERROR);
			}    
		    catch (NoAlertPresentException Ex){ 
		    	// Get text displayes on login page 
				String pageText = driver.findElement(By.tagName("tbody")).getText();
				// Extract the dynamic text mngrXXXX on page		
				String[] parts = pageText.split(Util_Day7.PATTERN);
				String dynamicText = parts[1];
				// Check that the dynamic text is of pattern mngrXXXX
				// First 4 characters must be "mngr"
				assertTrue(dynamicText.substring(1, 5).equals(Util_Day7.FIRST_PATTERN));
				// remain stores the "XXXX" in pattern mngrXXXX
				String remain = dynamicText.substring(dynamicText.length() - 4);
				// Check remain string must be numbers;
				assertTrue(remain.matches(Util_Day7.SECOND_PATTERN));
	        } 
		}		
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}
