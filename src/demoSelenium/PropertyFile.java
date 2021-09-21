package demoSelenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Pradeep\\Desktop\\data.property.txt");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty("usn");
		System.out.println(value);
		
		
//		p.store(null, value);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Pradeep\\Desktop\\data.property.txt");
		p.store(fos, value);
		p.setProperty("empid", "456");
		String value2 = p.getProperty("empid");
		System.out.println(value2);
	}

}
