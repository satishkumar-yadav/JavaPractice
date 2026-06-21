<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
    <h1 style="color:blue">Welcome to JSP</h1>
    
    <!--  Declaration Tag -->
    <%!
      String name="Satish";
      double height = 5.3;
      public void eat(){
    	  System.out.println("Eating");
      }
      public int add(int a, int b){
    	  return a+b;
      }
    %>
    
    <!-- Scriplet Tag -->
     <% 
       long phoneno= 9835784329L;
       System.out.println(phoneno);
       System.out.println(name);
       System.out.println(height);
       eat();
       System.out.println(add(10,20));
     %>

      <!--  Expression Tag -->
      <h3>Name is: <%=name %></h3>
       <h3>Height is: <%=height %></h3>
        <h3>Phone is: <%=phoneno %></h3>
         <h3>Sum is: <%=add(10,20) %></h3>
</body>
</html>