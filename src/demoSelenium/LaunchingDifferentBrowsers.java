package demoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingDifferentBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launching firefox browser
//		System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://github.com/mozilla/geckodriver/releases");
		
//		
//		System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://github.com/mozilla/geckodriver/releases");
		
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("gmail.com");
		driver.get("https://github.com/mozilla/geckodriver/releases");
		driver.navigate().back();
		driver.navigate().forward();
		
		

	}

}
