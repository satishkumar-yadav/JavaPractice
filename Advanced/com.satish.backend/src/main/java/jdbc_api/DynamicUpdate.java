package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicUpdate {

	public static void main(String[] args) {
		
		String dbName = "student_db";
		String url = "jdbc:postgresql://localhost:5432/"+dbName;
		String user = "postgres";
		String password = "12345678";
		String driverPath = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverPath);
			
			Connection con = DriverManager.getConnection(url, user,password);
			
			String q1 = "UPDATE student SET sname= ? WHERE stuid=?";
			PreparedStatement ps = con.prepareStatement(q1);
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter Name: ");
			String name = sc.next();
			
			ps.setInt(2, id);
			ps.setString(1, name);
			
			ps.execute();
			System.out.println("Update using q1 Completed");
			
			String q2 = "UPDATE student SET sname= ?, marks=? WHERE semail=?";
			PreparedStatement ps2 = con.prepareStatement(q2);
			
			System.out.println("Enter Data for Query 2 ");
			System.out.println("Enter Name: ");
			String sname = sc.next();
			System.out.println("Enter Marks: ");
			double marks = sc.nextDouble();
			System.out.println("Enter Email: ");
			String email = sc.next();
			
			ps2.setString(1, sname);
			ps2.setDouble(2, marks);
			ps2.setString(3, email);
			
			ps2.execute();
			System.out.println("Update using q2 Completed");
			
			ps.close();
			ps2.close();
			sc.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
