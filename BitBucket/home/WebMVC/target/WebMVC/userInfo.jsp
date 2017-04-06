<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 03/04/17
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.academiadecodigo.bootcamp.User" %>
<%@ page isErrorPage="false" %>
<html>
<head>
    <title>Title</title>
    <% User user = (User) request.getAttribute("user"); %>
</head>
<body>
<h2>User Info</h2>
<ul>
    <h2>Welcome <%= user.getUsername() %></h2>
    <h2>Function:  <%= user.getFunction()%></h2>
</ul>

</body>
</html>
