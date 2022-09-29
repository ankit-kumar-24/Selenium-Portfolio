package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addtags {
	@Test
	public void tagss() throws InterruptedException {
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
	  	  driver.findElement(By.cssSelector("input[placeholder='Enter project name...']")).sendKeys("Task creation 1");
	  	  Thread.sleep(2000);
	  	  WebElement wb = driver.findElement(By.cssSelector("div[class='section-step step-1 active'] button[class='btn btn-success ']"));
	  	  wb.click(); // project creation
	  	  System.out.println("Project Created Successfully");
	  	  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[contains(text(),'Add a Task')]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='multi-line-input edit-panel-input empty']")).sendKeys("test1");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='btn btn-small btn-success']")).click();
		  Thread.sleep(5000);
		  System.out.println("Task Created Successfully");
		  driver.findElement(By.xpath("//div[@class='task-overlay']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//span[@class='action-text'][normalize-space()='Add'])[2]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//body[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/span[3]")).click();
		  Thread.sleep(2000);
		  System.out.println("Tag added successfully");
		  driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Type a name…']")).sendKeys("Test 1");
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
		  System.out.println("Tag created successfully");
		  driver.findElement(By.xpath("//button[@class='btn btn-icon btn-small popout-close']")).click();
		  Thread.sleep(3000);
		  driver.close();
	}
}
