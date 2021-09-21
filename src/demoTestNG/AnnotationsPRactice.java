package demoTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsPRactice {
	/*
	 * @BeforeSuite
	 * @BeforeTest
	 * @BeforeClass
	 * @BeforeMethod
	 * @AfterMethod
	 * @AfterClass
	 * @AfterTest
	 * @AfterSuite
	 */
	@BeforeSuite
	public void configBS() {
		System.out.println("connect to database");
	}
	
	@AfterSuite
	public void configAS() {
		System.out.println("close to Database");
	}
	
	@BeforeTest
	public void configBT() {
		System.out.println("Executing Before Test");
		}
	
	@AfterTest
	public void configAT() {
		System.out.println("Executing After Test");
	}
	
	@BeforeClass
	public void configBC() {
		System.out.println("Exceuting Before class");
	}
	
	
	@AfterClass
	public void configAC() {
		System.out.println("Executing After class");
	}
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Exceuting before method");
	}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Executing after method");
	}
	
	@Test(priority = 1, dependsOnMethods = "display2")
	public void display() {
		System.out.println("wellcome to testng1");
		Reporter.log("hello", false);
	}
	@Test(priority = 1)
	public void display1() {
		System.out.println("wellcome to testng2");
		Reporter.log("hello", false);
	}
	@Test
	public void display2() {
		System.out.println("wellcome to testng3");
		Reporter.log("hello", false);
	}
	

	
}
