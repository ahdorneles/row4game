<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head></head>
<body>
<h2>Please Insert User and Pass</h2>
<form method="post" action="">
    <p>
        Name: <input type="text" name="username"/>
    </p>
    <p>
        Password: <input type="password" name="password"/>
    </p>

    <p>
        <input type="submit" value="Login"/>
    </p>
    <c:out value="${message}" />
    <p></p>
</form>
</body>
</html>

