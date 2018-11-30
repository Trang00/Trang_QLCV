package ato.qlcv.test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class KiemTraLinkHong {
	private static WebDriver driver = null;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String homePage = "https://www.guru99.com";//https://www.zlti.com//http://192.168.2.18/http://qlcv.ato.vn
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get(homePage);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(!url.startsWith(homePage)){
                System.out.println("URL thuộc tên miền khác, bỏ qua nó - URL belongs to another domain, skipping it.");
                continue;
            }
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" -Là một liên kết bị hỏng- is a broken link");
                }
                else{
                    System.out.println(url+" - Là một liên kết hợp lệ - is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        driver.quit();

    }
}
/*Để kiểm tra các liên kết bị hỏng, bạn cần thực hiện các bước sau:

Thu thập tất cả các liên kết trong trang web dựa trên <a> thẻ.
Gửi yêu cầu HTTP cho liên kết và đọc mã phản hồi HTTP.
Tìm hiểu xem liên kết có hợp lệ hay bị hỏng dựa trên mã phản hồi HTTP.
Lặp lại điều này cho tất cả các liên kết được chụp.

URL sẽ luôn có trạng thái với 2xx hợp lệ. 
Có các mã trạng thái HTTP khác nhau có các mục đích khác nhau. 
Đối với yêu cầu không hợp lệ, trạng thái HTTP là 4xx và 5xx.
 */
