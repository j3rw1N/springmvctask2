<%--
  Created by IntelliJ IDEA.
  User: j3rwin
  Date: 25-09-2019
  Time: 01:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="displayUser" method="POST">
    UserName : <input type="text" name="userName"/> <br><br>
    Password : <input type="password" name="pass"/> <br><br>
    <input type="submit" name="submit">
</form>

</body>
</html>
