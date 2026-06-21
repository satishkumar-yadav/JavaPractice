<%@page import="java.sql.SQLException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp details:</title>
</head>
<body>
<% 
ResultSet rs =(ResultSet)request.getAttribute("emp"); 

try {
	while(rs.next()) {
	int id = rs.getInt(1);
	String name = rs.getString(2);
	String email = rs.getString(3);
	String password = rs.getString(4);
	double salary = rs.getDouble(5);
	
	String p ="Emp Id:"+id+", Name:"+name+", Email:"+email+", Password:"+password+", Salary:"+salary;
	System.out.println(p);
	
	PrintWriter pw = response.getWriter();
	pw.print("<h1>Employee Details are :</h1>");
	pw.print("<h1>"+p+"</h1>");
	
}
} catch (SQLException e) {

	e.printStackTrace();
} 

%>
</body>
</html>