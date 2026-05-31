package com.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
 
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
			
			String q1 = "UPDATE employee SET name='Deepak Mishra' WHERE id=104";
			String q2 = "UPDATE employee SET name='Bill Gates', email='gates2@outlook.com', salary=56892.75  WHERE id=106";
			String q3 = "UPDATE employee SET salary='52236.00' WHERE email='john.doe@gmail.com'";
			
			st.execute(q1);
			st.execute(q2);
			st.execute(q3);
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
