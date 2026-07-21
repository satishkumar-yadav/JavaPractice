
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Reg Form</title>
</head>
<body>

 <!--  Declaration Tag -->
  <!--   <%!  String name="Satish";  public void eat(){  System.out.println("Eating"); }  %>  -->
    
    <!-- Scriplet Tag - for java code -->
     <%    long phoneno= 9835784329L;   System.out.println(phoneno);    eat();  %>

      <!--  Expression Tag for displaying data ResultSet rs =(ResultSet)request.getAttribute("emp") -->
      <h3>Name is: <%=name %></h3>

  <h2><%= "Hello World!" %></h2>
        <form action="validate">
           enter username: <input type="text" name="username">  <br> </br>
           enter password: <input type="password" name="password">  <br> </br>
           <a href="takeEmail.jsp" >Forget Password</a>
           <input type="submit" value="Login">
       </form>
</body>
</html>