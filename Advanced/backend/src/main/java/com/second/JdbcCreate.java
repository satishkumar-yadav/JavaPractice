package com.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreate {
 
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
			
			String q1 = "CREATE TABLE employee(id int PRIMARY KEY, name VARCHAR(20), salary DECIMAL(7,2), email VARCHAR(30), gender VARCHAR(8), companyName VARCHAR(40))";
			
			st.execute(q1);
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
