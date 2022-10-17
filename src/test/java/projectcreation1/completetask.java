package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class completetask {
	@Test
	public void complete() throws InterruptedException {
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
		  Thread.sleep(5000);
		  Actions actions = new Actions(driver);
		  WebElement menuOption = driver.findElement(By.xpath("(//div[@class='task-overlay'])[1]")); 
		  actions.moveToElement(menuOption).build().perform();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='checkbox inverted always-tick']")).click();
		  System.out.println("Task completed successfully");
		  Thread.sleep(5000);
		  driver.close();
	}
}
