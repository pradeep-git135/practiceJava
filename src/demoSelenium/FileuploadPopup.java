package demoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileuploadPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement element = driver.findElement(By.id("wdgt-file-upload"));
		
		Thread.sleep(4000);
//		File f = new File("./dataFile/ABRAR.pdf");
//		String absolutePath = f.getAbsolutePath();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
//		 driver.findElement(By.id("wdgt-file-upload")).sendKeys(absolutePath);
		 
		element.sendKeys("./dataFile/ABRAR.pdf");

		
//		handling file upload
//		StringSelection filepath = new StringSelection("C:\\Users\\Pradeep\\Downloads\\ABRAR.pdf");
//		Toolkit t = Toolkit.getDefaultToolkit();
//		Clipboard c = t.getSystemClipboard();
//		c.setContents(filepath, null);
//		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
