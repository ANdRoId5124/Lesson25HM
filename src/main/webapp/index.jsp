<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/hello-servlet" method="post">
    Login:<br>
    <input type="text" name="login">
    <br>
    Password:<br>
    <input type="password" name="password">
    <br>
    <input type="submit" value="Login">
</form>
</body>
</html>