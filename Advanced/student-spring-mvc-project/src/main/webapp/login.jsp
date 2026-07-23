<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
      <h2><%= "Login" %></h2>
        <form action="login">
           enter email: <input type="text" name="email">  <br> </br>
           enter password: <input type="password" name="password">  <br> </br>
           <input type="submit" value="Login">
       </form>
       <a href="takeEmail.jsp" >Forget Password</a> 
       <a href="register.jsp" >Register</a> 
       <a href="students" >Show Students</a> 
       <a href="delete.jsp" >Delete Student</a> 
</body>
</html> 