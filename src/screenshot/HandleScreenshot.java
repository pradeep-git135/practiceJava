package screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HandleScreenshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 TakesScreenshot ts = (TakesScreenshot)driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);          //takes scrnshot and stores in a virtual memory
		 File destination = new File("./screenshots/scrn1.png");
		 Files.copy(source, destination);        //copyies from virtual to physical memory
		 
//		 File virtualScrnshot = driver.findElement(By.id("id01")).getScreenshotAs(OutputType.FILE);	
		 

	}

}
