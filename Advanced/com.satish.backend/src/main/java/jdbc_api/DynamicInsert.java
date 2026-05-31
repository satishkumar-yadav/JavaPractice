package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert {

	public static void main(String[] args) {
		
		String dbName = "student_db";
		String url = "jdbc:postgresql://localhost:5432/"+dbName;
		String user = "postgres";
		String password = "12345678";
		String driverPath = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverPath);
			
			Connection con = DriverManager.getConnection(url, user,password);
			
			String q = "INSERT INTO student VALUES(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(q);
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Enter Marks: ");
			double marks = sc.nextDouble();
			System.out.println("Enter Email: ");
			String email = sc.next();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, marks);
			ps.setString(4, email);
			
			ps.execute();
			
			System.out.println("Insertion Completed");
			
			ps.close();
			sc.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
