<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Form Data</title>
</head>
<body>

<%
String name = request.getParameter("user-name");
String age = request.getParameter("user-age");
String phone = request.getParameter("user-phone");

System.out.println(name+" "+age+" "+phone);
%>

</body>
</html>