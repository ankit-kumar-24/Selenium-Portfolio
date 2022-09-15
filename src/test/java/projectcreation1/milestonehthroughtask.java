package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class milestonehthroughtask {
	public void miletask() throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	 
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://niftyuat.com/");
	  driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("ankit.k+test000@gortnm.in");
	  Thread.sleep(4000);
	  driver.findElement(By.id("login-password")).sendKeys("12345678");
	  Thread.sleep(2000);
	  driver.findElement(By.className("section-foot")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='btn visible-on-hover nav-btn-add']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.cssSelector("input[placeholder='Enter project name...']")).sendKeys("Milestone creation 1");
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
	  System.out.println("Task Created Successfully");
	  Thread.sleep(5000);  // task creation
	  driver.findElement(By.xpath("//div[@class='task-overlay']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("div[class='control narrower'] div[class='popout-toggle']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Create a milestone')]")).click();
	  Thread.sleep(2000);
  	  driver.findElement(By.cssSelector("input[placeholder='e.g., Development']")).sendKeys("Test 1");
  	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@placeholder='Add a description...']")).sendKeys("Hello i am nifty user");
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
  	  System.out.println("Milestone created succesfully");
      Thread.sleep(5000);
  	  driver.close();
	}
}
