package Day07;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day5_DataProvider extends SetUpDay7{
	String actualTitle, actualBoxtitle;
	String EXPECT_TITLE="Guru99 Bank Manager HomePage";
	String EXPECT_ERROR="User or Password is not valid";
		
@Test( dataProvider="DataProvider",invocationCount=1, description="")
public void TC5_DataProvider(String uName, String uPass) throws Exception{
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
}
