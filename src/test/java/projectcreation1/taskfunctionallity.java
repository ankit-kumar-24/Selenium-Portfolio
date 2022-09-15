package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class taskfunctionallity {
	@Test
	public void taskfunc() throws InterruptedException {
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
		  driver.findElement(By.xpath("//button[contains(text(),'Add a Task')]")).click(); // task creation
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='multi-line-input edit-panel-input empty']")).sendKeys("test1");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='btn btn-small btn-success']")).click();
		  System.out.println("User Create Task Sucessfully");
		  Thread.sleep(5000);  // task creation
		  driver.findElement(By.xpath("//div[@class='task-overlay']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("span[class='undefined'] span[class='action-text']")).click();
		  Thread.sleep(3000);
		  WebElement tc = driver.findElement(By.xpath("//div[@class='user-entry-body-main']"));
		  tc.click();	  
		  System.out.println("User Assigned Sucessfully");
		  Thread.sleep(5000); // Assignes
		  driver.findElement(By.xpath("//span[@class='placeholder action-text']")).click();
		  driver.findElement(By.cssSelector("div[aria-label='Choose Thursday, September 29th, 2022']")).click();
		  driver.findElement(By.xpath("//button[@class='btn btn-small btn-success']")).click();
		  System.out.println("Due Date Choose Successfullly"); // Due date
		  driver.findElement(By.cssSelector("input[placeholder='Set']")).sendKeys("10");
		  System.out.println("Sucessfully Input Story Point");
//		  String actualUrl = driver.getCurrentUrl();
// 	      String expectedUrl = "https://test000.niftyuat.com/";
//    	  Assert.assertEquals(actualUrl, expectedUrl);	  	
    	  Thread.sleep(5000);
    	  driver.close();
    	  
 }
}
