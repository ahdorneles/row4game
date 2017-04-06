<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 04/04/17
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>Welcome: <c:out value="${userName}" /></h2>
<p></p>
<p></p>
<p></p>
<h2>List of Bootcamp Users:</h2>
<c:if test="${not empty users}">
    <ul>
        <c:forEach var="user" items="${users}">
            <li>${user.username} <strong>${user.function}</strong></li>
        </c:forEach>
    </ul>
</c:if>
