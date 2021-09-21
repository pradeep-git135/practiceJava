package demoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://demo.guru99.com/test/drag_drop.html");
//		WebElement source = driver.findElement(By.xpath("//a[text() = ' 5000 ']"));
//		WebElement destination = driver.findElement(By.xpath("//ol[@id=\'amt7\']//li[@class=\'placeholder\']"));
//		Actions a = new Actions(driver);
//		a.dragAndDrop(source, destination).perform();
//		Thread.sleep(3000);
		
//		demonstrating
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement clickelement = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		Actions a = new Actions(driver);
		a.contextClick(clickelement).perform();
		driver.findElement(By.xpath("//span[text() = 'Quit']")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		WebElement dblclick = driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"));
		a.doubleClick(dblclick).perform();;
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
		
		

	}

}
