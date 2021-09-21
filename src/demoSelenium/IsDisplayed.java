package demoSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://en-gb.facebook.com/");
////	    WebElement logo = driver.findElement(By.xpath("//img[@class=\'fb_logo _8ilh img\']"));
////	    System.out.println("txt inside the logo is "+logo.getAttribute("alt")); 
////	    boolean result = logo.isDisplayed();
////	    if (result == true) {
////	    	System.out.println("logo is displayed");
////		}
////	    
////	    WebElement emailTxtField = driver.findElement(By.id("email"));
////	    Point location = emailTxtField.getLocation();
////	    System.out.println("location of the element "+ location);
////	    
////	    Rectangle rect = emailTxtField.getRect();
////	    System.out.println("rect of an element is "+ rect);
////	    
////	    Dimension sizde = emailTxtField.getSize();
////	    System.out.println("size of an element is "+sizde);
////	    
//	    List<WebElement> links = driver.findElements(By.xpath("//a"));
//	    System.out.println("total no. of links present in links "+ links.size());
//	    
//	    for (WebElement link : links) {
//	    	if (link.getText().equals("Forgotten password?")) {
//	    		System.out.println("found the link");
//			}
////			System.out.println(link.getText());
//		}
//	    Thread.sleep(2000);
//	    driver.close();
	}
//
}
