<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 03/04/17
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Internal Server Error</title>
</head>
<body>
<h2>Server Error</h2>
<ul>
    <li><%=exception.getClass() %></li>
    <li><%=exception.getMessage() %></li>
    <li><%=exception.printStackTrace() %></li>
</ul>
</body>
</html>
