package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedBatchedQuery {

	public static void main(String[] args) {
		
		String dbName = "student_db";
		String url = "jdbc:postgresql://localhost:5432/"+dbName;
		String user = "postgres";
		String password = "12345678";
		String driverPath = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverPath);
			
			Connection con = DriverManager.getConnection(url, user,password);
			
			String querry = "INSERT INTO student VALUES(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(querry);
			
			//1st Row
			ps.setInt(1, 6);
			ps.setString(2, "Sweta");
			ps.setDouble(3, 86.00);
			ps.setString(4, "sweta@gmail.com");
			//add to batch
			ps.addBatch();
			
			//2nd Row
			ps.setInt(1, 7);
			ps.setString(2, "Sakshi");
			ps.setDouble(3, 76.00);
			ps.setString(4, "skshi@gmail.com");
			//add to batch
			ps.addBatch();
			
		    //executing complete batch
			ps.executeBatch();
			System.out.println("Batch Executed");
			
			ps.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
