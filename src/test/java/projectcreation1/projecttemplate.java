package projectcreation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class projecttemplate {
	@Test
	public void projtemp() throws Exception {
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
		  driver.findElement(By.cssSelector("input[placeholder='Enter project name...']")).sendKeys("Project delete 1");
		  Thread.sleep(2000);
		  WebElement wb = driver.findElement(By.cssSelector("div[class='section-step step-1 active'] button[class='btn btn-success ']"));
		  wb.click(); // project creation
		  System.out.println("Project Created Successfully");
		  Thread.sleep(5000);
		  Actions actions = new Actions(driver);
		  WebElement menuOption = driver.findElement(By.xpath("//span[contains(text(),'Project delete 1')]")); // We have to delete all older projects
		  actions.moveToElement(menuOption).build().perform();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		  Thread.sleep(2000);
		  // driver.findElement()
	}
}
