package demoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement iframeExample = driver.findElement(By.xpath("//legend[text() = 'iFrame Example']"));
		 Point location = iframeExample.getLocation();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+location.x+", "+location.y+")");
		
		Thread.sleep(3000);
		
		WebElement iframe2 = driver.findElement(By.id("courses-iframe"));
		driver.switchTo().frame(iframe2);
		driver.findElement(By.xpath("//a[text() = 'Courses']")).click();

	}

}
