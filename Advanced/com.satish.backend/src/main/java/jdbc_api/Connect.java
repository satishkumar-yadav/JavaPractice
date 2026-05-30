package jdbc_api;

public class Connect {

	public static void main(String[] args) {
		
		String dbName = "student_db";
		String url = "jdbc:postgresql://localhost:5432"+dbName;
		String user = "postgres";
		String password = "12345678";
		String driverPath = "org.postgresql.Driver";
		
		try {
			//Loading class - throws ClassNotFoundException 
			Class.forName(driverPath);
			System.out.println("Connection established");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
