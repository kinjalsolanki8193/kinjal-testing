package Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Q4 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.getProperty("Webdriver.chrome,driver","C:\\Users\\91910\\Desktop\\JAR FILE\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://accounts.google.com/ManageAccount?nc%3D1&dsh=S-486060631:1702616211531670&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en-gb&theme=glif&TL=AHNYTIRwjrW2EmIOCdKe67DM6-IlJk9Y1x1VuyHB-L2fINT-7Kl-n5RcEqrnc3mp");
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Kinjal");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Chauhan");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("day")).sendKeys("20");
		Thread.sleep(2000);
		Select select=new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("October");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1993");
		Thread.sleep(2000);
		Select select2=new Select(driver.findElement(By.id("gender")));
		select2.selectByVisibleText("Female");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		 
		driver.findElement(By.name("Username")).sendKeys("kinjalchauhan93");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("Passward")).sendKeys("kinjalchauhan8193");
		Thread.sleep(2000);
		driver.findElement(By.name("PaswardAgain")).sendKeys("kinjalchauhan1993");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		
		System.out.println("we cannot create account in google with automation tools");
		System.out.println("The error occurs of....'sorry,we could not create your Google Account...");
	}
}	
	