package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class portfoliocreation {
@Test
public void port() throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	 
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://niftyuat.com/");
	  driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("ankit.k+test000@gortnm.in");
	  Thread.sleep(4000);
	  driver.findElement(By.id("login-password")).sendKeys("12345678");
	  Thread.sleep(2000);
	  driver.findElement(By.className("section-foot")).click();
	  Thread.sleep(20000);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[normalize-space()='Create a Portfolio']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@placeholder='Enter name...']")).sendKeys("Portfolio creation");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='btn btn-success btn-has-loading']")).click();
	  System.out.println("Portfolio created successfully");
	  Thread.sleep(5000);
  	  driver.close();
 }
}
