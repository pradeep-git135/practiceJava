package demoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertandPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		driver.findElement(By.id("name")).sendKeys("pradeep");
		WebDriverWait wait = new WebDriverWait(driver, 10);
//		driver.findElement(By.id("alertbtn")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
////		driver.findElement(By.id("alertbtn")).click();
//		String alertText = driver.switchTo().alert().getText();
//		System.out.println(alertText);
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(5000);
//		
//		driver.findElement(By.id("name")).sendKeys("pradeep");
//		driver.findElement(By.id("confirmbtn")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		String confirmText1 = driver.switchTo().alert().getText();
//		System.out.println(confirmText1);
//		driver.switchTo().alert().accept();
		
		WebElement closebtn = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		wait.until(ExpectedConditions.visibilityOf(closebtn));
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		
	}

}
