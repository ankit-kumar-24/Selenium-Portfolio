package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class personal_task {
	@Test
	public void personaltaskk() throws InterruptedException {
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
	  	  driver.findElement(By.xpath("//button[@class='app-bar-btn btn btn-success btn-xsmall']")).click();
	  	  driver.findElement(By.xpath("(//div[contains(text(),'Personal Task')])[1]")).click();
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//div[@placeholder='Add a new task...'])[1]")).sendKeys("Task 1");
	  	  driver.findElement(By.xpath("(//div[@placeholder='Add a new task...'])[1]")).sendKeys(Keys.ENTER);
	  	  Thread.sleep(5000);
	  	  driver.close();
	}
}
