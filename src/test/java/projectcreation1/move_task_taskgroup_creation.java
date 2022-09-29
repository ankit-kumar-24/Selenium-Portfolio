package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class move_task_taskgroup_creation {
	@Test
	public void customm() throws InterruptedException {
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
	  	  driver.findElement(By.cssSelector("input[placeholder='Enter project name...']")).sendKeys("Project creation");
	  	  Thread.sleep(2000);
	  	  WebElement wb = driver.findElement(By.cssSelector("div[class='section-step step-1 active'] button[class='btn btn-success ']"));
	  	  wb.click(); // project creation
	  	  System.out.println("Project Created Successfully");
	  	  Thread.sleep(5000);
          driver.findElement(By.xpath("//button[normalize-space()='+ Add Status']")).click();
          driver.findElement(By.xpath("(//div[@placeholder='Add status name…'])[1]")).sendKeys("QA");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[@class='btn btn-small btn-success']")).click();
          System.out.println("Task group created successfully");
          Thread.sleep(2000);
          Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[contains(text(),'Add a Task')]")).click(); // task creation
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='multi-line-input edit-panel-input empty']")).sendKeys("test1");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='btn btn-small btn-success']")).click();
		  System.out.println("User Create Task Sucessfully");
		  Thread.sleep(2000);
		  Actions actions = new Actions(driver);
		  WebElement menuOption = driver.findElement(By.xpath("//div[@class='task-overlay']")); // We have to delete all older task
		  actions.moveToElement(menuOption).build().perform();
		  driver.findElement(By.xpath("(//div[@class='task-actions-holder'])[1]")).click();
		  driver.findElement(By.xpath("//div[contains(text(),'Move task')]")).click();
		  driver.findElement(By.xpath("(//h5[normalize-space()='QA'])[1]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='btn btn-small btn-success']")).click();
		  System.out.println("Task moved to another task group");
		  Thread.sleep(5000);
		  driver.close();
	}
}
