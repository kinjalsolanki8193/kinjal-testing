package Module7;

import java.security.DomainCombiner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Q3_1
	{
	     public static void main(String[] args) throws InterruptedException
	     {
	    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("http://demo.automationtesting.in/Alerts.html");
			 Thread.sleep(1500);
			 
			 driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
			 Thread.sleep(1500);
			 
			 Alert a1=driver.switchTo().alert();
			 a1.accept();
			 Thread.sleep(1500);
			 driver.close();
	}
}
