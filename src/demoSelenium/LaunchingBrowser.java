package demoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class LaunchingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting the path for driver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//creating instance to open the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.selenium.dev/documentation/webdriver/browser_manipulation/#takescreenshot");
		
		//close the browser
//		driver.close();
		
		String title = driver.getTitle();
		System.out.println("title of the page is "+title);
		
		 String url = driver.getCurrentUrl();
		 System.out.println("url of the page "+url);
		
		 String pagesource = driver.getPageSource();
		 System.out.println(pagesource.length());
		 
		 JavascriptExecutor j = (JavascriptExecutor) driver;
		 
		 for (int i = 0; i < 6; i++) {
			 j.executeScript("window.scrollBy(0, 500)");
		}
		 driver.findElement(By.xpath("//span[text() = \'[ ACC4 ] hsafdgk -  Organization Information\']"));
		 
		 

	}

}
