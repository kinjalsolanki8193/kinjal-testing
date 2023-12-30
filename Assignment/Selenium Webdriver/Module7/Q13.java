package Module7;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Q13 
{
	WebDriver driver;
	@Before
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?hl=en-gb&ifkv=ASKXGp1MEn3lpu_dS2MpfQyWmb51UH_Q2mLUl9ZCiCAefC7_Y81BPtLmy5bKReAsEItbE1zu7aol&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("identifierId")).sendKeys("9104776261");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Passward")).sendKeys("9104776261");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
	}
	@After
	public void after()
	{
		driver.close();
		System.out.println("we cannot sign in google with the browswe which is controlled by automated software");
	}
}	
		

