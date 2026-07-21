<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Password</title>
</head>
<body>
       <h2><%= "Update Password" %></h2>
        <form action="changePassword">
          <input type="hidden" name="id" value="${id}">  <br> </br>
           enter password: <input type="password" name="newPassword">  <br> </br>
           <input type="submit" value="Change Password">
       </form>
</body>
</html>