package Day07;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Day3_DataExcel {
	/**
     * SS1: Enter valid userid & password 
     *      Expected: Login successful home page shown 
     * SS2: Enter invalid userid & valid password 
     * SS3: Enter valid userid & invalid password 
     * SS4: Enter invalid userid & invalid password 
     *      Expected: A pop-up “User or Password is not valid” is shown
     * 
     * @throws Exception
     */
	static WebDriver driver;
	String uName, uPass;
	String actualTitle, actualBoxtitle;
	String EXPECT_TITLE="Guru99 Bank Manager HomePage";
	String EXPECT_ERROR="User or Password is not valid";
	String tc="Test case số :";

	@Test
	public void TestLoginExcel() throws FilloException {
		Fillo fillo=new Fillo();
		Connection conn=fillo.getConnection("testData.xls");
		String query="Select*from DataDay7";
		Recordset record=conn.executeQuery(query);
		List<String> name=new ArrayList<>();
		List<String> pass=new ArrayList<>();
		while(record.next()){
			name.add(record.getField("username"));
			pass.add(record.getField("password"));
		}
		for(int i=0;i<name.size();i++){
			uName=name.get(i);
			uPass=pass.get(i);
			setup();
			dangnhap();
			try{
				Alert alt=driver.switchTo().alert();
				actualBoxtitle =alt.getText();
				System.out.println("Thông báo lỗi: "+actualBoxtitle);
				if(actualTitle.contains(EXPECT_ERROR)){
					System.out.println(tc+"["+i+"]: Passed" );
				}else{
					System.out.println(tc+"["+i+"]: Failed" );
				}
				
			}catch(NoAlertPresentException Ex){
				actualTitle=driver.getTitle();
				if(actualTitle.contains(EXPECT_TITLE)){
					System.out.println(tc+"["+i+"]:Login thành công" );
				}else{
					System.out.println(tc+"["+i+"]: Login lỗi" );
				}
				
			}
			driver.close();
			
		}
		record.close();
		conn.close();
	}
	private static void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
	}
	public void dangnhap(){
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(uName);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(uPass);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	}
}
