package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class invite_member {
	public void f() throws Exception {
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
	  	  driver.findElement(By.xpath("//button[@class='btn btn-action btn-colored']//*[name()='svg']")).click();
	  	  Thread.sleep(4000);
	  	  driver.findElement(By.xpath("(//input[@placeholder='email@example.com'])[1]")).sendKeys("ankit.k+d@gortnm.in");
	      Thread.sleep(3000);
	  	  driver.findElement(By.xpath("(//button[@class='btn btn-success btn-has-loading'][normalize-space()='Invite'])[1]")).click();
	  	  System.out.print("Invite member successfully");
	  	  Thread.sleep(10000);
          driver.close();
	}
}
	
