package demoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.get("http://demo.automationtesting.in/Static.html");

//		WebElement hoverelement = driver.findElement(By.id("mousehover"));
//		Point location = hoverelement.getLocation();
//		System.out.println( location.x +" , "+location.y);
//		int x = location.x;
//		int y = location.y;
		
//		scrollingwebpage to perticular element
//		JavascriptExecutor j = (JavascriptExecutor)driver;
//		j.executeScript("window.scrollBy("+location.x+","+location.y+")");
//		
		
//		mouse hovering on element
//		Actions a = new Actions(driver);
//		a.moveToElement(hoverelement).perform();
//		WebElement element = driver.findElement(By.xpath("//a[text() = 'Top']"));
//		a.moveToElement(element).perform();
//		element.click();
		
//		drog and drop
//		Thread.sleep(5000);
		Actions a = new Actions(driver);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement source = driver.findElement(By.xpath("src=\"logo.png\""));
		//wait.until(ExpectedConditions.visibilityOf(source));
//		Thread.sleep(5000);
		WebElement destination = driver.findElement(By.id("droparea"));
		a.dragAndDrop(source, destination).perform();
		Thread.sleep(3000);
		//driver.close();
		
	}

}
