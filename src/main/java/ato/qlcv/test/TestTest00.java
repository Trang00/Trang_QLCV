package ato.qlcv.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import ato.qlcv.webdriver.action.SetUp;


public class TestTest00  {
	static WebDriver driver;
	String uName, uPass;
	String DNLoi="Đăng nhập không thành công";
	String DND= "Phần mềm quản lý nhân sự HRM-4U";
	String tc = "Test case số";
@Test
	public  void TestLoginExcel() throws FilloException {
		
		Fillo fillo = new Fillo();
		Connection conn = fillo.getConnection("testData.xls");// tên file excel
		String query = "Select * from Data";// tên sheet trong file excel
		Recordset record = conn.executeQuery(query);
		List<String> name = new ArrayList<>();
		List<String> pass = new ArrayList<>();
		// thêm name và pass vào mảng
		while (record.next()) {
			name.add(record.getField("username"));// tên cột trong file excel
			pass.add(record.getField("password"));
		}
		// mỗi vị trí i, lấy name và pass ở 2 cột tương ứng
		for (int i = 0; i < name.size(); i++) {
			uName = name.get(i);
			uPass = pass.get(i);
			setup();
			dangnhap();
			try {
				String DNSai = driver.findElement(By.xpath(".//label[contains(text(),'Đăng nhập không thành công')]")).getText();
				if (DNSai.equals(DNLoi)){//assertEqual(String actual,String expected) , DNDung.contains(DND)
					System.out.println(tc + "[" + i + "]: Passed login không thành công");
				} else {
					System.out.println(tc + "[" + i + "]: Failed login không thành công, lỗi so sánh");
				}
			} catch (Exception Ex) {
				//actualTitle = driver.getTitle();// So sánh title thực tế với title mong đợi
				String DNDung =driver.findElement(By.linkText("Phần mềm quản lý nhân sự HRM-4U")).getText();
				System.out.println("Thông báo đúng:"+DNDung);
				if (DNDung.contains(DND)) {
					System.out.println(tc + "[" + i + "]: Login thành công");
				} else {
					System.out.println(tc + "[" + i + "]: Login được thành công nhưng lỗi so sánh ");
				}
			}
			
			driver.close();
	}
		record.close();// đóng kết nối
		conn.close();
	}
	private static void setup() {
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.2.18");
	}
	public void dangnhap(){
		//driver.findElement(By.xpath(".//*[@placeholder='Tên đăng nhập']")).clear();
		driver.findElement(By.xpath(".//*[@placeholder='Tên đăng nhập']")).sendKeys(uName);
		driver.findElement(By.xpath(".//*[@placeholder='Mật khẩu']")).sendKeys(uPass);
		driver.findElement(By.xpath(".//*[@id='l-login']/div[4]/div[2]/div")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
