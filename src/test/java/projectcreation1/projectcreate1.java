package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class projectcreate1 {
	WebDriver driver;
//  @BeforeTest
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
  	  Thread.sleep(5000);
  	  driver.close();
//  	  String actualUrl = driver.getCurrentUrl();
//  	  String expectedUrl = "https://gortnmtrur6.niftyuat.com/my/tasks";
//	  Assert.assertEquals(actualUrl, expectedUrl);
  }
//  	  if(wb) {
//  	  System.out.print("succesfully project creation");
//  	  }
//  	  else {
//  		System.out.print("Project creation failed");
//  	  }
//	  @AfterTest
//private void close() {
//	// TODO Auto-generated method stub
	
}
