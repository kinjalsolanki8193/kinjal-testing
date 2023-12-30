package Module7;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Q15 
{
	WebDriver driver=null;
	@DataProvider(name="Kinjal")
	public Object[][] input()
	{
		return new Object[][] {{"9104776261","1234567834"},{"kinjal8193@gmail.com","kinju8193"},{"kinjalchauhan@gmail.com","kinjuch93"}};
	}
	@Test(dataProvider = "Kinjal")
    public void loginbutton(String username,String password) throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		if (driver.getTitle().equals("(20+)Facebook"))
		{
			System.out.println("Test has been passed...");
		}
		else
		{
			System.out.println("Test gets failed...");
		    fail("Loginbutton failed");
		}
		driver.findElement(By.cssSelector("input[style=\"height:40px;width:40px\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("xu06os2 x1ok221b")).click();
		Thread.sleep(2000);
		driver.close();
    }
}	
		
    
