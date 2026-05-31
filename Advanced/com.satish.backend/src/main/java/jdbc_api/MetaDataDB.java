package jdbc_api;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaDataDB {

	public static void main(String[] args) {
		
		String dbName = "student_db";
		String url = "jdbc:postgresql://localhost:5432/"+dbName;
		String user = "postgres";
		String password = "12345678";
		String driverPath = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverPath);
			
			Connection con = DriverManager.getConnection(url, user,password);
			
			DatabaseMetaData metaData = con.getMetaData();
			
			System.out.println(metaData.getDatabaseProductName());
			System.out.println(metaData.getDatabaseProductVersion());
			System.out.println(metaData.getDriverName());
			System.out.println(metaData.getDriverVersion());
			System.out.println(metaData.getURL());
			System.out.println(metaData.getUserName());
			
			ResultSet rs = metaData.getTables("student_db", "public", "%", new String [] {"TABLE"});
			
			while(rs.next()) {
				System.out.println(rs.getString("TABLE_Name"));
			}
			
			System.out.println(" Executed");
			
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
