package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataDeriveFromDB {
	public static void main(String[] args) throws Throwable {
	
//		 step 1 = register/load the database
		Driver driverref =  new Driver();
		DriverManager.registerDriver(driverref);
		
//		step 2 create connection with jdbc
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		
//		step 3 create sql statement
		Statement stmt = con.createStatement();
		String query = "select * from student_info";
		
//		step 4 ececute statement query
		ResultSet result = stmt.executeQuery(query);
		
		System.out.println("result of thr db are "+ result);
		
	
		
		while (result.next()) {
//			System.out.println(result.getInt(1)+"\t"+ result.getString(2)+"\t"+ result.getString(3)+"\t"+ result.getString(4));
//			System.out.println(result.getString(3));
			System.out.println(result.getInt(1) );
		}
	//step 5 close the DB connection
		con.close();
		
	}
//	com.mysql.cj.jdbc.result.ResultSetImpl@61df66b6
//	com.mysql.cj.jdbc.result.ResultSetImpl@59ce792e
//	
	
}
