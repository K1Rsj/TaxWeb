<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 31.03.2018
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome</title>
  </head>
  <body>
    <h2>You are welcome!</h2>
    <br>
    <button onclick="window.location.href='${pageContext.request.contextPath}/app/inputIncome'">Input your income</button>
  <br>
    <button onclick="window.location.href='${pageContext.request.contextPath}/app/getAllUsers'">View all users</button>
  </body>
</html>
