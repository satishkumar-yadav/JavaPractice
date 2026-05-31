package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchedQuery {

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
			
			//Insert Query
			String q1 ="INSERT INTO student VALUES(5,'Sk',98.00,'sk@gmail.com')";
			st.addBatch(q1);
			
			//Update Query
			String q2 = "UPDATE student SET sname='John Doe' WHERE semail='doe@gmail.com'";
			st.addBatch(q2);
			
			//Delete Query
			String q3 = "DELETE FROM student WHERE stuid=3";
			st.addBatch(q3);
			
			//Fetch Query
//			String q4 = "SELECT * FROM student";
//			st.addBatch(q4);
			
			// Batch Execution
			st.executeBatch();
			
//			ResultSet rs = st.getResultSet();
//			while(rs.next()) {
//				int id = rs.getInt(1);
//				String name = rs.getString(2);
//				double marks = rs.getDouble(3);
//				String email = rs.getString(4);
//				
//				System.out.println(id+" "+name+" "+marks+" "+email);
//			}
			
			System.out.println("Batch Executed");
			
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
