<%@page import="java.io.PrintWriter"%>
<%@page import="jsp.Book"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page A</title>
</head>
<body>

<%
request.setAttribute("username", "Satish");
request.setAttribute("userage", 24); 
request.setAttribute("userphone", 9856741235L);

Book b = new Book("Jk Rowling","Harry Potter",800.0);

request.setAttribute("myBook", b);

List<String> ls =Arrays.asList("Rose","Lily","Tulip");
request.setAttribute("myList", ls);


System.out.println("Page A");
PrintWriter pw = response.getWriter();
pw.println("<h1>Page A</h1>");
RequestDispatcher rd = request.getRequestDispatcher("pageB.jsp");
//rd.forward(request, response);
rd.include(request, response);

%>

</body>
</html>