<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 12.04.2018
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tax Calculator</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/app/calculateTax" name="taxes">
    <table border="1px" style = text-align:center>
        <tr>
            <td>Your name</td>
            <td><label>
                <input type="text" name="name">
            </label></td>
        </tr>
        <tr>
            <td>Your surname</td>
            <td><label>
                <input type="text" name="surname">
            </label></td>
        </tr>
        <tr>
            <td>Income</td>
            <td><label>
                <input type="text" name="income">
            </label></td>
        </tr>
        <tr>
            <td>Sales</td>
            <td><label>
                <input type="text" name="sales">
            </label></td>
        </tr>
        <tr>
            <td>Interest</td>
            <td><label>
                <input type="text" name="interest">
            </label></td>
        </tr>
        <tr>
            <td>Gift</td>
            <td><label>
                <input type="text" name="gift">
            </label></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Send"></td>
        </tr>
    </table>
</form>
</body>
</html>
