package Day07;

import java.io.File;
import java.io.IOException;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;// thư viện shot 1.5.2

import javax.imageio.ImageIO;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day6_Screenshot_02 extends SetUpDay7 {
	String actualTitle, actualBoxtitle;
	String EXPECT_TITLE="Guru99 Bank Manager HomePage";
	String EXPECT_ERROR="User or Password is not valid";
	final int SCROLL_TIMEOUT = 30;
		
@Test( dataProvider="DataProvider",invocationCount=1, description="")
public void TC6_DataProvider_Screenshot(String uName, String uPass) throws Exception{
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(uName);
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(uPass);
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	try{
		Alert alt=driver.switchTo().alert();
		actualBoxtitle =alt.getText();
		
		if(actualBoxtitle.contains(EXPECT_ERROR)){
			System.out.println(" Test case Passed" );
			System.out.println("Thông báo lỗi: "+actualBoxtitle);
		}else{
			System.out.println(" Test case Failed" );
		}
	}catch(NoAlertPresentException Ex){
		actualTitle=driver.getTitle();
		if(actualTitle.contains(EXPECT_TITLE)){
			System.out.println("Login thành công" );
			String TC=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
			//Chụp ảnh màn hình login thành công lưu thành file
			screenshoot("loginPas");
			System.out.println(TC);
		}else{
			System.out.println(" Login lỗi" );
		}
	}
}
@DataProvider( name="DataProvider")
public Object[][] getUserPass (){
	return new Object[][]{{"mngr166619","UvugAsu"},{"invalid","valid"},{"valid","invalid"},{"invalid","invalid"}};
}
public void screenshoot(String name) throws IOException{
    Screenshot hxScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(SCROLL_TIMEOUT)).takeScreenshot(driver);
    ImageIO.write(hxScreenshot.getImage(),"JPG",new File("E:\\SELE\\QuanLyCV\\Image\\" + name + ".jpg"));
}
}
