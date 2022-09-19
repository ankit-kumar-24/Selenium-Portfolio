package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class taskandsubtaskdelete {

  public void subtaskdel() throws Exception {
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
	  WebElement sub = driver.findElement(By.xpath("//div[@class='multi-line-input item-title empty']"));
	  sub.sendKeys("Test 1");
	  Thread.sleep(2000);
	  sub.sendKeys(Keys.ENTER);
	  System.out.println("Subtask Created Successfully");
	  Thread.sleep(5000);
	  Actions actions = new Actions(driver);
	  WebElement menuOption = driver.findElement(By.xpath("//div[@class='subtask-item can-edit']//div[@class='item-click-overlay']"));
	  actions.moveToElement(menuOption).build().perform();
  	  Thread.sleep(5000);
  	  driver.findElement(By.xpath("//span[@class='btn btn-square btn-xxxsmall btn-simple btn-icon item-click-action']")).click();
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
  	  System.out.println("Subtask deleted successfully");
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//span[@class='content-panel-simple-action-inner']")).click();
      Thread.sleep(2000);
  	  driver.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
  	  System.out.println("Task deleted successfully");
      Thread.sleep(5000);
  	  driver.close();
  }
} 
