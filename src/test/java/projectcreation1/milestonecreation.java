package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class milestonecreation {
	WebDriver driver;
//  @BeforeTest
  public void mile() throws Exception {
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
  	  driver.findElement(By.cssSelector("input[placeholder='Enter project name...']")).sendKeys("Milestone creation");
  	  Thread.sleep(2000);
  	  WebElement wb = driver.findElement(By.cssSelector("div[class='section-step step-1 active'] button[class='btn btn-success ']"));
  	  wb.click();
  	  System.out.println("Project created successfully");
  	  Thread.sleep(5000);
  	  driver.findElement(By.xpath("//div[@data-text='Roadmap']")).click();
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//button[normalize-space()='+ Add a Milestone']")).click();
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
