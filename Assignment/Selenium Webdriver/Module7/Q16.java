package Module7;

import static org.testng.Assert.fail;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Q16 
{
	WebDriver driver=null;
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&ec=GAlAwAE&hl=en_GB&service=accountsettings&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-1861442650%3A1703225350511026&theme=glif ");
		Thread.sleep(2000);
	}

  @Test
  @Parameters({"username","password"})
		  
  public void LoginButton(String username,String password) throws InterruptedException
  {
	  driver.findElement( By.name("identifier")).sendKeys(username);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("password")).sendKeys(password);
	  Thread.sleep(2000);
	  driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	  Thread.sleep(2000);
	  driver.findElement( By.className("VfPpkd-vQzf8d")).click();
	  Thread.sleep(2000);
	  if (driver.getCurrentUrl().equals("http://mail.google.com/main/u/0/#inbox"))
	  {
		  System.out.println("Test has been paused");
	  }
	  else
	  {
		  System.out.println("Test gets failed...");
		  fail("loginbutton failed");
	  }
  }
  @AfterTest
  public void afterTest()
  {
	  driver.close();
	  System.out.println("we cannot sign in google with the browser which is controlled  by automated software");
  }
} 
 
