package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class customuser {
	@Test
	public void detailll() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	 
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://niftyuat.com/");
		  driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("ankit.k+test000@gortnm.in");
		  Thread.sleep(4000);
		  driver.findElement(By.id("login-password")).sendKeys("12345678");
		  Thread.sleep(2000);
	  	  driver.findElement(By.className("section-foot")).click();
	  	  Thread.sleep(15000);
	  	  driver.findElement(By.xpath("//div[@class='settings-compact-main']")).click();
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//button[@class='btn'])[2]")).click();
	  	  Thread.sleep(4000);
	  	  driver.findElement(By.xpath("//div[contains(text(),'Custom Roles & Permissions')]")).click();
	  	  driver.findElement(By.xpath("(//button[normalize-space()='Add Custom Role'])[1]")).click();
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//input[@id='doc-name'])[1]")).sendKeys("QA");
	  	  driver.findElement(By.xpath("(//button[@class='btn btn-success btn-has-loading'])[1]")).click();
	  	  driver.findElement(By.xpath("(//div[@class='checkbox dark'])[1]")).click();
	  	  Thread.sleep(5000);
	  	  driver.close();
	}
}
