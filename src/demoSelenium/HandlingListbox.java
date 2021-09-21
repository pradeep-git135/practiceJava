package demoSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
		Select s =  new Select(listbox);
//		WebElement firstSelectedElement = s.getFirstSelectedOption();
//		System.out.println(firstSelectedElement.getText());
//		s.selectByIndex(1);
//		Thread.sleep(3000);
//		s.selectByValue("option2");
//		Thread.sleep(3000);
//		s.selectByVisibleText("Option3");
//		
//		boolean result = s.isMultiple();
//		System.out.println(result);
//		
//		WebElement rappedElement = s.getWrappedElement();
//		System.out.println(rappedElement.getText());
		
		List<WebElement> options = s.getOptions();
		
		System.out.println(options.size());
//		for (int i = 0; i < options.size(); i++) {
//			s.selectByIndex(i);
//		}
		for (int i = options.size()-1; i >= 0; i--) {
			s.selectByIndex(i);
			Thread.sleep(3000);
		}
	}
}
