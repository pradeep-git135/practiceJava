package demoSelenium;

import java.io.InputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scanner {

	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter url");
		String url =  sc.nextLine();
		driver.get(url);

	}

}
