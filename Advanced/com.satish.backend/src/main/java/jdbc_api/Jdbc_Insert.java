package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Insert {

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
			
			String q1 ="INSERT INTO student VALUES(1,'John',88.25,'john@gmail.com')";
			String q2 = "INSERT INTO student VALUES(2,'Doe',95.00,'doe@gmail.com')";
			String q3 = "INSERT INTO student VALUES(3,'Ram',99.00,'ram@gmail.com')";
		//	String q4 = "";
			
			st.execute(q1);
			st.execute(q2);
			st.execute(q3);
		//	st.execute(q4);
			
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
