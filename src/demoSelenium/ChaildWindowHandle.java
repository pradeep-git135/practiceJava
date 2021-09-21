package demoSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChaildWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumJava\\practiceSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String currentWh = driver.getWindowHandle();
		Set<String> whs = driver.getWindowHandles();
		
//		getting the text from all the windows
//		for (String wh : whs) {
//			driver.switchTo().window(wh);
//			System.out.println(driver.getTitle()); 
//		}
		
//		closing all the child browsers except parent
//		for (String wh : whs) {
//			driver.switchTo().window(wh);
//			if (!(wh.equals(currentWh))) {
//				driver.close();
//			}
////			System.out.println(driver.getTitle()); 
//		}

//		closing only the parent browser
		for (String wh : whs) {
			driver.switchTo().window(wh);
			driver.close();
	}

}
}
