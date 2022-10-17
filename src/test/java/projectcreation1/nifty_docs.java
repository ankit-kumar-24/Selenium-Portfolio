package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nifty_docs {
	@Test
	public void document() throws InterruptedException {
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
	  	  driver.findElement(By.xpath("//span[@class='btn visible-on-hover nav-btn-add']")).click();
	  	  Thread.sleep(5000);
	  	  driver.findElement(By.cssSelector("input[placeholder='Enter project name...']")).sendKeys("Task creation");
	  	  Thread.sleep(2000);
	  	  WebElement wb = driver.findElement(By.cssSelector("div[class='section-step step-1 active'] button[class='btn btn-success ']"));
	  	  wb.click();   // Project creation
	  	  System.out.println("User Create Project Sucessfully");
	  	  Thread.sleep(5000);
	  	  driver.findElement(By.xpath("(//div[@class='horizontal-nav-item'])[4]")).click();
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//button[@class='btn btn-medium btn-success'])[1]")).click();
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//li[@class='dropdown-item '])[1]")).click();
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("//input[@id='doc-name']")).sendKeys("Document 1");
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//button[@class='btn btn-success btn-has-loading'])[1]")).click();
	  	  Thread.sleep(3000);
	  	  driver.close();
	}
}
