package com.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) {
		 
		String dbName = "second-jdbc-database";
		String url = "jdbc:postgresql://localhost:5432/"+dbName;
		String user = "postgres";
		String password = "12345678";
		String driverPath = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverPath);
			System.out.println("Driver Loaded");
			
			Connection con = DriverManager.getConnection(url, user,password);
			System.out.println("Connection Established");
			
			Statement st = con.createStatement();
			System.out.println("Statement Created");
			
			String q1 = "INSERT INTO employee values(101,'John Doe', 18000.00, 'john.doe@gmail.com', 'Male', 'Google')";
			String q2 = "INSERT INTO employee values(102,'Satish Kumar', 39981.00, 'satish@gmail.com', 'Male', 'Microsoft')";
			String q3 = "INSERT INTO employee values(103,'Sweta Singh', 28050.00, 'sweta@gmail.com', 'Female', 'Flipkart')";
			String q4 = "INSERT INTO employee values(104,'Rk Mishra', 24385.56, 'rk@gmail.com', 'Male', 'Amazon')";
			String q5 = "INSERT INTO employee values(105,'Akansha Sharma', 19008.96, 'akansha@gmail.com', 'Female', 'Apple')";
			String q6 = "INSERT INTO employee values(106,'John Doe', 27845.83, 'john@gmail.com', 'Male', 'TCS')";
			String q7 = "INSERT INTO employee values(107,'Sneha Agarwal', 25674.00, 'sneha@gmail.com', 'Female', 'Wipro')";
			
			st.execute(q1);
			st.execute(q2);
			st.execute(q3);
			st.execute(q4);
			st.execute(q5);
			st.execute(q6);
			st.execute(q7);
			System.out.println("Query Executed");
			
			st.close();
			System.out.println("Statement Closed");
			con.close();
			System.out.println("Connection Closed");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
