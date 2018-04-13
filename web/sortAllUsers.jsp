<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 12.04.2018
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sorted users</title>
</head>
<body>
<table border=1>
    <thead>
    <tr>
        <th>User Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Income</th>
        <th>Sales</th>
        <th>Interest</th>
        <th>Gift</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}" /></td>
            <td><c:out value="${user.name}" /></td>
            <td><c:out value="${user.surname}" /></td>
            <td><c:out value="${user.income}" /></td>
            <td><c:out value="${user.sales}" /></td>
            <td><c:out value="${user.interest}" /></td>
            <td><c:out value="${user.gift}" /></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<button onclick="window.location.href='index.jsp'">Back to homepage</button></body>
</body>
</html>
