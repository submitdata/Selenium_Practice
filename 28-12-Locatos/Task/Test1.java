package Selenium.Workspace;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Driver\\chromedriver.exe");
		//Object Instantiation
		
		WebDriver driver=new ChromeDriver();
		//Launching the web browser
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 WebElement fname = driver.findElement(By.id("firstName"));  
		 fname.sendKeys("Prakruti");
		 
		 WebElement lname = driver.findElement(By.id("lastName"));  
		 lname.sendKeys("Vyas");
		 
		 WebElement email = driver.findElement(By.id("userEmail"));  
		 email.sendKeys("prakruti.tops@gmail.com");
		 
	/*	 List<WebElement> gender = driver.findElements(By.name("gender"));
		 gender.get(1).click();*/
		 
		 WebElement Mnum = driver.findElement(By.id("userNumber"));  
		 Mnum.sendKeys("8849817263");
		 
		 
		 
		 WebElement cAddress = driver.findElement(By.id("currentAddress"));  
		 cAddress.sendKeys("Rajkot 1234");
		 
	}
}
