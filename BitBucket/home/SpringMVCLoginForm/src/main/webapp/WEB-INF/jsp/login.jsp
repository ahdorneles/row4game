<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 04/04/17
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>

<form:form method="post" modelAttribute="user">
    <p>Name: <form:input path="username"/></p>
    <form:errors path="username"  cssClass="error"/>
    <p>Password: <form:password path="password"  cssClass="error"/></p>
    <form:errors path="password" />
    <input type="submit" value="Login"/>
</form:form>
<div style="color:red">${error}</div>
</body>
</html>
