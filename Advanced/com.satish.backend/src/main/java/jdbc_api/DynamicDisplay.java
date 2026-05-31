package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicDisplay {

	public static void main(String[] args) {
		
		String dbName = "student_db";
		String url = "jdbc:postgresql://localhost:5432/"+dbName;
		String user = "postgres";
		String password = "12345678";
		String driverPath = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverPath);
			
			Connection con = DriverManager.getConnection(url, user,password);
			
			String q1 = "SELECT * FROM student WHERE stuid= ?";
			PreparedStatement ps = con.prepareStatement(q1);
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter sid: ");
			int id = sc.nextInt();
			
			ps.setInt(1, id);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
           // rs.next();
            if(rs.next()) {
            	int sid = rs.getInt(1);
            	String sname = rs.getString(2);
            	double marks = rs.getDouble(3);
            	String email = rs.getString(4);
            	
            	System.out.println(sid+" "+sname+" "+marks+" "+email);
            } else {
            	System.out.println("No Data Found");
            }
			
			//--------------
			
            String q2 = "SELECT * FROM student WHERE semail= ?";
			PreparedStatement ps2 = con.prepareStatement(q2);
			
			 System.out.println("Enter Query 2 Detail ");
				System.out.println("Enter Email: ");
				String email = sc.next();
			
			ps2.setString(1, email);
            ps2.execute();
            
            ResultSet rs2 = ps2.getResultSet();
           // rs2.next();
            if(rs2.next()) {
            	int sid = rs2.getInt(1);
            	String sname = rs2.getString(2);
            	double marks = rs2.getDouble(3);
            	String semail = rs2.getString(4);
            	
            	System.out.println(sid+" "+sname+" "+marks+" "+semail);
            } else {
            	System.out.println("No Data Found");
            }
            
            System.out.println("All Querry Executed");
			
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
