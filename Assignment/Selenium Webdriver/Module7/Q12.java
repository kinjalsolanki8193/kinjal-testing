package Module7;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Q12 
{
	WebDriver driver;
	@Before
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}	
	  
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("Kinjal");
		Thread.sleep(500);
		driver.findElement(By.id("pass")).sendKeys("kinjalchauhan");
		Thread.sleep(500);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	
	@After
	public void after() throws InterruptedException
	{
		driver.close();
	}
}

