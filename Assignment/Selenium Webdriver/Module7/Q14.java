package Module7;

/*
W.a. junit program to use parameterizes demo with multiple
*/


import java.sql.Driver;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class Q14 
{
	String password,username;
	
	public Q14(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	
	@Parameterized.Parameters
	public static Collection input ()
	{
		return Arrays.asList(new Object[][] {{"9104776261","kinjal8193"},{"kinju@8193","kinju@8193"},{"kkchauhan@8193","kkchauahn@8193"}});    
	}	
	WebDriver driver=null;
	@Before
	public void before () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
	}
	@Test
	public void test ()throws InterruptedException
	{
		driver.findElement(By.id("Email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("password");
		Thread.sleep(2000);
	}
	@After
	public void After()
	{
		driver.close();
	}
}
