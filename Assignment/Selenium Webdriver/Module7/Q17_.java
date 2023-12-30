package Module7;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Q17_ 
{
	WebDriver driver=null;
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
	}
	@Test
	@Parameters({"username","password"})
	public void Test (String username,String password) throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		if (driver.getTitle().equals("(20+)Facebook"))
		{
			System.out.println("Test has been passed....");
		}
		else
		{
			System.out.println("Trst gets failed....");
			fail("loginButton Failed");
		}
	}
	@AfterTest
	public void afterTest() throws InterruptedException
	{
		driver.findElement(By.cssSelector("input[style=\"height:40px;width:40px\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("xu06os2 xlok221b")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
