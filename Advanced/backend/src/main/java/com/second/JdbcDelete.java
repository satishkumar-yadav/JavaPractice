package com.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {

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
			
			String q1 = "DELETE FROM employee WHERE gender='Female'";
			
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
