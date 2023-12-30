package Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class Q8_2 
{
	public static void main(String[] args) throws InterruptedException
	{
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.facebook.com/");
	     Thread.sleep(2000);
	     
	     WebElement s1=driver.findElement(By.id("email"));
	     
	     Actions act=new Actions(driver);
	     Action a1=act.moveToElement(s1).click()
	    		  .keyDown(s1,Keys.SHIFT)
	    		  .sendKeys("Kinjal")
	    		  .keyUp(Keys.SHIFT)
	    		  .pause(1500)
	    		  .sendKeys(Keys.TAB)
	    		  .pause(1500)
	    		  .keyDown(Keys.SHIFT)
	    		  .sendKeys("password")
	    		  .keyUp(Keys.TAB)
	    		  .pause(1500)
	    		  .sendKeys(Keys.ENTER)
	    		  .pause(1000)
	    		  .build();
	     a1.perform();
	     Thread.sleep(1500);
	     driver.close();
	}
}	
	 
