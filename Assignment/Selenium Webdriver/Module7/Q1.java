package Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Q1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("A/BTesting")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.findElement(By.partialLinkText("A/B Test")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
