<%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 09-12-2021
  Time: 07:30 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page isELIgnored="false" %>
<html>
<head>
    <title>New Form</title>
</head>
<body>
<div align="center">
    <h1>New/Edit Contact</h1>
    <%--@elvariable id="contact" type=""--%>
    <form:form action="save" method="post" modelAttribute="contact">
        <table cellpadding="5">
            <form:hidden path="id" />
        <tr>
            <td>Name</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><form:input path="address"/></td>
        </tr>
        <tr>
            <td>Phone</td>
            <td><form:input path="phone"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save"/></td>
        </tr>
        </table>
    </form:form>
</div>
</body>
</html>
