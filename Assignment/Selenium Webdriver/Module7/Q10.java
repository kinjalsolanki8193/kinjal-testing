package Module7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.getProperty("Webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        Thread.sleep(2000);
        
        List<WebElement>total_link=driver.findElements(By.tagName("a"));
        int count=total_link.size();
        System.out.println("The Total no.of links is "+count);
        
        for (int i=0; i<count; i++)
        {
        	System.out.println((i+1)+" ");
        	System.out.println(total_link.get(i).getText());
        }
        driver.close();
	}
}	
		

