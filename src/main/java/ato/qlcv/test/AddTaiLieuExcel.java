package ato.qlcv.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import ato.qlcv.data.Constants;
import ato.qlcv.page.LoginPage;

public class AddTaiLieuExcel {
	// ArrayList dùng JavaSE-1.7, add thêm thư viện Fillo để dùng cho file excel
		//file excel để ngoài cùng thư mục gốc QuanlyCV
		static WebDriver driver;
		String uLoaiTL,uViTri,uNguoiSoan,uNguoiKy,uBoPhan,uKhachHang,uFile,uTieuDe,uNoiDung;
	
		String tc = "Test case số";
		String actualTitle, actualBoxtitle;
		
		String EXPECT_TITLE = "Quản lý tài liệu";
		String EXPECT_ERROR = "Yêu cầu chọn loại tài liệu!!!";
		
		static LoginPage LoginPg;
		static WebDriverWait wait; 
		/**
		 * @param args
		 * @throws FilloException
		 */
	@Test
		public  void TestAddTLExcel() throws FilloException {
			
			Fillo fillo = new Fillo();
			Connection conn = fillo.getConnection("testData.xls");// tên file excel
			String query = "Select * from AddTL";// tên sheet trong file excel
			Recordset record = conn.executeQuery(query);
			List<String> LoaiTL = new ArrayList<>();
			List<String> ViTriTL = new ArrayList<>();
			List<String> NguoiSoanTL = new ArrayList<>();
			List<String> NguoiKyTL = new ArrayList<>();
			List<String> BoPhanTL = new ArrayList<>();
			List<String> KhachHangTL = new ArrayList<>();
			List<String> FileTL = new ArrayList<>();
			List<String> TieuDeTL = new ArrayList<>();
			List<String> NoiDungTL = new ArrayList<>();
			// thêm name và pass vào mảng
			while (record.next()) {
				LoaiTL.add(record.getField("LoaiTL"));// tên cột trong file excel
				ViTriTL.add(record.getField("ViTri"));
				NguoiSoanTL.add(record.getField("NguoiSoan"));
				NguoiKyTL.add(record.getField("NguoiKy"));
				BoPhanTL.add(record.getField("BoPhan"));
				KhachHangTL.add(record.getField("KhachHang"));
				FileTL.add(record.getField("File"));
				TieuDeTL.add(record.getField("TieuDe"));
				NoiDungTL.add(record.getField("NoiDung"));
			}
			// mỗi vị trí i, lấy name và pass ở 2 cột tương ứng
			for (int i = 0; i < LoaiTL.size(); i++) {
				uLoaiTL = LoaiTL.get(i);
				uViTri = ViTriTL.get(i);
				uNguoiSoan = NguoiSoanTL.get(i);
				uNguoiKy = NguoiKyTL.get(i);
				uBoPhan = BoPhanTL.get(i);
				uKhachHang = KhachHangTL.get(i);
				uFile = FileTL.get(i);
				uTieuDe = TieuDeTL.get(i);
				uNoiDung = NoiDungTL.get(i);
			
				setup();
				dangnhap();
				try {
				    Alert alt = driver.switchTo().alert();
				    actualBoxtitle = alt.getText(); // lấy text của Alert
				    System.out.println(actualBoxtitle);
				    //alt.accept();
				    // So sánh lỗi thực tế với lỗi mong đợi
				    if (actualBoxtitle.contains(EXPECT_ERROR)) {
				    	System.out.println(tc + "[" + i + "]: Passed");
				    } else {
				    	System.out.println(tc + "[" + i + "]: Failed");
				    }
				  }catch (NoAlertPresentException Ex) {

				        actualTitle = driver.getTitle();
				        System.out.println("Thực tế:"+actualTitle);
				        System.out.println("Quản lý tài liệu");
				        // So sánh title thực tế với title mong đợi
				        if (actualTitle.contains(EXPECT_TITLE)) {
				        	System.out.println(tc + "[" + i + "]: Thêm mới tài liệu LỖI");

				        } else {
				        	 System.out.println(tc + "[" + i + "]: Thêm mới tài liệu thành công");
				         

				        }}

				driver.close();
		}
			record.close();// đóng kết nối
			conn.close();
		}
		private static void setup() {
			driver = new ChromeDriver();
			driver.get("http://192.168.2.18");
			driver.manage().window().maximize();
			driver.findElement(By.xpath(".//*[@placeholder='Tên đăng nhập']")).sendKeys("ATO125");
			driver.findElement(By.xpath(".//*[@placeholder='Mật khẩu']")).sendKeys("123");
			driver.findElement(By.xpath(".//div[contains(text(),'Đăng nhập')]")).click();
			//LoginPg = new LoginPage(driver, wait);
			//LoginPg.inputUserName(Constants.userName);//loginPage.clear(Constants.password);
			//LoginPg.inputPassword(Constants.password);
			//LoginPg.clickSignIn();
		}
		public void dangnhap(){
			driver.findElement(By.xpath(".//span[contains(@class,'caret')]")).click();//Click menu
			driver.findElement(By.xpath(".//*[@id='navbar-mobile']/ul[1]/li/div/ul/li/div/ul/li[4]")).click();//click Tài liệu
			driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div[1]/div[2]/div[1]/div/div[1]")).click();//click nut Them moi
			//String DL =driver.findElement(By.xpath(".//*[@id='userForm']/div[1]/input")).getText();
			//driver.findElement(By.xpath("//input[contains(@class,'form-control ng-pristine ng-untouched ng-valid ng-not-empty')]")).getText();
			driver.findElement(By.xpath(".//*[@id='userForm']/div[2]/div/a/span")).click();
			driver.findElement(By.xpath(".//*[@id='userForm']/div[2]/div/div/div/input")).sendKeys(uLoaiTL,Keys.RETURN);
		
			driver.findElement(By.xpath(".//*[@id='userForm']/div[3]/div/a/span")).click();
			driver.findElement(By.xpath(".//*[@id='userForm']/div[3]/div/div/div/input")).sendKeys(uViTri,Keys.RETURN);
			
			driver.findElement(By.xpath(".//*[@id='userForm']/div[4]/div/a/span")).click();
			driver.findElement(By.xpath(".//*[@id='userForm']/div[4]/div/div/div/input")).sendKeys(uNguoiSoan,Keys.RETURN);
			
			
			driver.findElement(By.xpath(".//*[@id='userForm']/div[5]/div/a/span")).click();
			driver.findElement(By.xpath(".//*[@id='userForm']/div[5]/div/div/div/input")).sendKeys(uNguoiKy,Keys.RETURN);
			
			driver.findElement(By.xpath(".//*[@id='userForm']/div[6]/div/a/span")).click();
			driver.findElement(By.xpath(".//*[@id='userForm']/div[6]/div/div/div/input")).sendKeys(uBoPhan,Keys.RETURN);
			
			driver.findElement(By.xpath(".//*[@id='userForm']/div[7]/div/a/span")).click();
			driver.findElement(By.xpath(".//*[@id='userForm']/div[7]/div/div/div/input")).sendKeys(uKhachHang,Keys.RETURN);
			
			//WebElement uploadBtn = driver.findElement(By.xpath("//input[contains(@id,'File')]"));	//Vị trí của upload button
			//uploadBtn .sendKeys("E:\\SELE\\QuanLyCV\\FileTest.txt");//Sendkey đường dẫn tuyệt đối của file muốn upload
			driver.findElement(By.xpath("//input[contains(@id,'File')]")).sendKeys(uFile);
			// Click on Checkbox
			driver.findElement(By.xpath(".//*[@id='userForm']/div[9]/label/input")).click();
			// Kiểm tra Checkbox sau khi click
			System.out.println("Ket qua cua IsSelected: "+ driver.findElement(By.xpath(".//*[@id='userForm']/div[9]/label/input")).isSelected());
			System.out.println("Ket qua cua IsEnabled: "+ driver.findElement(By.xpath(".//*[@id='userForm']/div[9]/label/input")).isEnabled());
			System.out.println("Ket qua cua IsDisplay: "+ driver.findElement(By.xpath(".//*[@id='userForm']/div[9]/label/input")).isDisplayed());
			////input[contains(@type,'checkbox')]
			driver.findElement(By.xpath(".//*[@id='userForm']/div[10]/input")).sendKeys(uTieuDe);
			driver.findElement(By.xpath(".//*[@id='userForm']/div[11]/textarea")).sendKeys(uNoiDung);
			
			//driver.findElement(By.xpath(".//*[@id='modal_tailieu']/div/div/div[3]/div/div[2]")).click();//close
			driver.findElement(By.xpath(".//*[@id='modal_tailieu']/div/div/div[3]/div/div[1]")).click();//luu
			driver.navigate().to(driver.getCurrentUrl());//driver.navigate().refresh();
		}
}
