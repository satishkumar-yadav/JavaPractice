package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {

	public static void main(String[] args) {
		String dbName = "student_db";
		String url = "jdbc:postgresql://localhost:5432/"+dbName;
		String user = "postgres";
		String password = "12345678";
		String driverPath = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverPath);
			
			Connection con = DriverManager.getConnection(url, user,password);
			
			Statement st = con.createStatement();
			
			String q1 = "";
			String q2 = "";
			
			st.execute(q1);
			st.execute(q2);
			
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
