<%@page import="com.mvc.student.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students</title>
</head>
<body>

<%
List<Student> students = (List<Student>) request.getAttribute("students");
%>

  <table border="1"> 
     <tr>
         <th>ID </th>
         <th>Name </th>
         <th>Age </th>
         <th>Marks </th>
     </tr>
   <%
   for(Student s: students) {
   %>   
     <tr>
         <td><%= s.getId() %> </td>
         <td><%= s.getName() %> </td>
         <td><%= s.getAge() %> </td>
         <td><%= s.getMarks() %> </td>
     </tr>      
   <% } %>
  </table>

</body>
</html>