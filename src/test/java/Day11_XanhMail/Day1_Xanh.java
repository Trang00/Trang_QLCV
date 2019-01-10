package Day11_XanhMail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Day1_Xanh extends Setup_Day11 {
	/*  

	Test Steps
	Step 1. Goto http://live.guru99.com/
	Step 2. Verify Title of the page
	Step 3. Click on ‘MOBILE’ menu
	Step 4. Verify Title of the page
	Step 5. In the list of all mobile , select ‘SORT BY’ dropdown as ‘name’
	Step 6. Verify all products are sorted by name
	*/
	@Test
	public void TC_Day1(){
		String Title=driver.getTitle();
		System.out.println("Tiêu đề trang web: "+Title);
		
		driver.findElement(By.xpath(Locator_Day11.B_MenuMOBIE)).click();//click MOBILE
		String TitleMOBI=driver.getTitle();
		System.out.println("Tiêu đề click vào MOBIE:"+TitleMOBI);
		
		Select se=new Select(driver.findElement(By.xpath(Locator_Day11.Se_SORTBY)));
		se.selectByVisibleText(Constants_Day11.SortBY);
		
		String addProduct=driver.findElement(By.xpath(Locator_Day11.All_items)).getText();
		System.out.println("Có tất cả: "+addProduct);
		
		}

}
