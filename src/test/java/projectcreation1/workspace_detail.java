package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workspace_detail {
	@Test
	public void detailll() throws InterruptedException {
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
	  	  driver.findElement(By.xpath("//div[@class='settings-compact-main']")).click();
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//button[@class='btn'])[2]")).click();
	  	  Thread.sleep(4000);
	  	  driver.findElement(By.xpath("//span[normalize-space()='General Settings']")).click();
	  	  Thread.sleep(3000);
	  	  driver.findElement(By.xpath("(//span[contains(text(),'Edit')])[1]")).click();
	  	  Thread.sleep(3000);
	      driver.findElement(By.xpath("(//input[@id='edit-team-name'])[2]")).clear();
	      Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//input[@id='edit-team-name'])[2]")).sendKeys("workspacetesting2");
	  	  driver.findElement(By.xpath("(//button[normalize-space()='Update'])[1]")).click();
	  	  System.out.println("Team name updated");
	  	  Thread.sleep(5000);
	  	  driver.findElement(By.xpath("(//span[contains(text(),'Edit')])[2]")).click();
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//input[@id='edit-team-url'])[2]")).clear();
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//input[@id='edit-team-url'])[2]")).sendKeys("workspacetestin3");
	  	  Thread.sleep(2000);
	  	  driver.findElement(By.xpath("(//button[normalize-space()='Update'])[1]")).click();
	  	  System.out.println("Team URL updated");
	  	  Thread.sleep(5000);
	  	  driver.close();
	}
}
