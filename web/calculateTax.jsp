<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 12.04.2018
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your tax</title>
</head>
<body>
    <table border="1">
        <tbody>
        <tr><th><c:out value="${user.name}" /><c:out value=" " /><c:out value="${user.surname}" /></th></tr>
        <tr><td>Your income tax is <c:out value="${user.income}" /></td></tr>
        <tr><td>Your sales tax is <c:out value="${user.sales}" /></td></tr>
        <tr><td>Your interest tax is <c:out value="${user.interest}" /></td></tr>
        <tr><td>Your gift tax is <c:out value="${user.gift}" /></td></tr>
        </tbody>
    </table>
    <br>
    <button onclick="window.location.href='${pageContext.request.contextPath}/app/getAllUsers'">View all users</button>
    <button onclick="window.location.href='${pageContext.request.contextPath}/app/inputIncome'">Add new user</button>
</body>
</html>
