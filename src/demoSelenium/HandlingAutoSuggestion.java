package demoSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("java");
//		List<WebElement> links = driver.findElements(By.xpath("//span[contains(text(), 'java')]"));
//		System.out.println("size of the links are "+links.size()); 
//		for (WebElement link : links) {
//			System.out.println(link.getText());
//		}
//		links.get(0).click();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class=\"Y5N33s\"]"));
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText()); 
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement web = driver.findElement(By.xpath("/a"));
//		wait.until(ExpectedConditions. (By.xpath("//span[]")));
		web.click();
		
		driver.close();

	}

}
