package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataDeriveFromMysqlNonSelect {
	public static void main(String[] args) throws Throwable {
//		register driver
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
//		getconnect with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		
//		create statement
		Statement stat = con.createStatement();
		String query = "insert into student_info(regno, fname, midname, lname) values ('1', 'ram', 'gowda', 'hassan')";
		
		//executequery
		int result = stat.executeUpdate(query);
		
		if(result == 1) {
			System.out.println("successfully created");
		}
		else {
			System.out.println("error");

		}
//		close connection
		con.close();
	}

}
