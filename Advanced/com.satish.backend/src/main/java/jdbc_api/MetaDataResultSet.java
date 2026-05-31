package jdbc_api;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataResultSet {

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
			String q= "SELECT * FROM student";
			st.execute(q);
			
			ResultSet rs = st.getResultSet();
			ResultSetMetaData md = rs.getMetaData();
			
			//col count
			System.out.println(md.getColumnCount());
			
			//col name
			for(int i=1; i<=md.getColumnCount(); i++) System.out.print(md.getColumnName(i)+" ");
			
			System.out.println();
			//col type
			for(int i=1; i<=md.getColumnCount(); i++) System.out.print(md.getColumnTypeName(i)+" ");
			System.out.println();
			
			System.out.println(md.isCaseSensitive(1));
			
			System.out.println(" Executed");
			
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
