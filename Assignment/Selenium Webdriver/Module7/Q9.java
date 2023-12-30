package Module7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Q_9-W.A.J.Script How to handled Alert in selenium
//"http://demo.guru99.com/test/deletw_customer.php"



public class Q9 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Kinjal");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
		Thread.sleep(2000);
		
		Alert a1=driver.switchTo().alert();
		a1.accept();
		a1.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Kinjal");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
		Thread.sleep(2000);
		
		a1.dismiss();
		Thread.sleep(2000);
		driver.close();
	}
}	
		
	
