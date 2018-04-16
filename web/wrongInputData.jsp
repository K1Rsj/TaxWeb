<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 12.04.2018
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wrong Data</title>
</head>
<body>
    <p>Your income data must consist only digits and your name and surname must consist only letters</p>
    <br>
    <p>Fields can't be empty</p>

    <button onclick="window.location.href='${pageContext.request.contextPath}/app/inputIncome'">Input your income</button>
</body>
</html>
