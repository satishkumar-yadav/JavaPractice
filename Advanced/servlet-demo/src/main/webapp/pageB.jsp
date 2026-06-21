<%@page import="jsp.Book"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page B</title>
</head>
<body>
<%
      System.out.println("Page B");

//	Object name =req.getAttribute("username");   // req.getAttribute return type is obj
	String name =(String)request.getAttribute("username");
	int age =(Integer)request.getAttribute("userage");
	long phone =(Long)request.getAttribute("userphone");
	Book book =(Book)request.getAttribute("myBook");
	List<String> flowerName =(List)request.getAttribute("myList"); 
	
	String p = name+" "+age+" "+phone+" "+book+" "+flowerName;
	
	System.out.println(p);
	
	PrintWriter pw = response.getWriter();
	//pw.println("Dispatched to Page B");
	pw.println("<h1>"+p+"</h1>");

%>
</body>
</html>