package Module7;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Q8_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(1500);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
		
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(vacations).build();
		a1.perform();
		Thread.sleep(2000);
		Action a2=actions.moveToElement(hotels).build();
		a2.perform();
		Action a3=actions.moveToElement(home).build();
		a3.perform();
		driver.close();
	}
}	
		
		

