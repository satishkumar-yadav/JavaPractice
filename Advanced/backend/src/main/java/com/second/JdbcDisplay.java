package com.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDisplay {

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
			
			String q1 = "SELECT * FROM employee WHERE id=101";
			st.execute(q1);
			ResultSet rs = st.getResultSet();
			if(rs.next()) {
			   int id = rs.getInt(1);
			   String name = rs.getString("name");
			   double salary = rs.getDouble(3);
			   String email = rs.getString("email");
			   String gender = rs.getString("gender");
			   String company = rs.getString(6);
			   
			   System.out.println(id+" "+name+" "+salary+" "+email+" "+gender+" "+company);
			}
			else {
				System.out.println("No Data Found");
			}
			
			String q2 = "SELECT * FROM employee WHERE email='john@gmail.com'";
			st.execute(q2);
			ResultSet rs2 = st.getResultSet();
			if(rs2.next()) {
			   int id = rs2.getInt(1);
			   String name = rs2.getString("name");
			   double salary = rs2.getDouble(3);
			   String email = rs2.getString("email");
			   String gender = rs2.getString("gender");
			   String company = rs2.getString(6);
			   
			   System.out.println(id+" "+name+" "+salary+" "+email+" "+gender+" "+company);
			}
			else {
				System.out.println("No Data Found");
			}
			
			String q3 = "SELECT * FROM employee WHERE gender='Female'";
			st.execute(q3);
			ResultSet rs3 = st.getResultSet();
			while(rs3.next()) {
			   int id = rs3.getInt(1);
			   String name = rs3.getString("name");
			   double salary = rs3.getDouble(3);
			   String email = rs3.getString("email");
			   String gender = rs3.getString("gender");
			   String company = rs3.getString(6);
			   
			   System.out.println(id+" "+name+" "+salary+" "+email+" "+gender+" "+company);
			}
			
			String q4 = "SELECT * FROM employee";
			st.execute(q4);
			ResultSet rs4 = st.getResultSet();
			while(rs4.next()) {
			   int id = rs4.getInt(1);
			   String name = rs4.getString("name");
			   double salary = rs4.getDouble(3);
			   String email = rs4.getString("email");
			   String gender = rs4.getString("gender");
			   String company = rs4.getString(6);
			   
			   System.out.println(id+" "+name+" "+salary+" "+email+" "+gender+" "+company);
			}
			
			
			System.out.println("All Query Executed");
			
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
