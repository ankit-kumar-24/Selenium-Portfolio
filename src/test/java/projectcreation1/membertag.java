package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class membertag {
	public void memtag() throws Exception {
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
	  	  wb.click();
	  	  System.out.println("Project created successfully");
	  	  Thread.sleep(5000);
	  	  driver.findElement(By.xpath("//div[normalize-space()='Dashboard']")).click();
	  	  Thread.sleep(2000);
	  	  Actions actions = new Actions(driver);
		  WebElement menuOption = driver.findElement(By.xpath("(//div[@class='user-preview-inner'])[2]")); 
		  actions.moveToElement(menuOption).build().perform();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//span[@class='placeholder-text'])[1]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='btn btn-link']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Type a name…']")).sendKeys("Test 1");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='btn btn-icon btn-small popout-close']")).click();
		  System.out.println("Tag created successfully");
		  Thread.sleep(5000);
		  driver.close();
	}
}
