package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class rollup {
	@Test
	public void rollupp() throws InterruptedException {
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
	  	  driver.findElement(By.xpath("//span[@class='btn visible-on-hover nav-btn-add']")).click();
	  	  Thread.sleep(5000);
	  	  driver.findElement(By.cssSelector("input[placeholder='Enter project name...']")).sendKeys("Rollup");
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
		  driver.findElement(By.xpath("//button[@class='btn btn-circle btn-xxsmall btn-simple btn-icon btn-colored']")).click();
		  driver.findElement(By.xpath("(//div[@class='item-inner'])[7]")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Give it a name…']")).sendKeys("Number");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[normalize-space()='Create field']")).click();
		  System.out.println("Number custom field created successfully");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//input[@placeholder='Set value...'])[1]")).sendKeys("20");
		  driver.findElement(By.xpath("(//input[@placeholder='Set value...'])[1]")).sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//button[@class='content-panel-control btn content-panel-close'])[2]")).click();
		  Thread.sleep(2000);
          driver.findElement(By.xpath("(//div[@class='dropdown-btn-element btn btn-icon btn-small'])[1]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//li[contains(@class,'dropdown-item')])[8]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//div[@class='item'])[3]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//div[normalize-space()='Dashboard'])[1]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//button[normalize-space()='Add Widgets'])[1]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//li[@class='pair-item'])[1]")).click();
          driver.findElement(By.xpath("(//div[@class='item'])[1]")).click();
          Thread.sleep(5000);
          driver.close();
	}
}
