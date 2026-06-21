package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcConnection {
    public static Connection connect() {
    	
    	String dbName = "employee-servlet-jdbc";
		String url = "jdbc:postgresql://localhost:5432/"+dbName;
		String user = "postgres";
		String password = "12345678";
		String driverPath = "org.postgresql.Driver";
		Connection con = null;
		
		try {
			
			Class.forName(driverPath);
			
			con = DriverManager.getConnection(url, user,password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(con !=null) return con;
		else {
			System.out.println("Connection not established");
			return con;
		}
    }
}
