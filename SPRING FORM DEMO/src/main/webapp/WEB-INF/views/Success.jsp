<%@ page import="org.springform.entities.Employee" %><%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 01-12-2021
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Form Submission</title>
</head>
<body>

<%--Normal form submittion--%>
<h1>Form Submitted Successfully</h1>
<p>${employee}</p><br>
<% Employee emp = (Employee) request.getAttribute("Employee"); %>
<p><%= emp %></p>

<%--File retrieval (Displaying the image)--%>
<h1>File Submittion</h1>
<h4>${msg}</h4>
<img src="${pageContext.request.contextPath}/resources/img/${filename}" alt="image"/>

<%--Intercept form--%>
<h1>Intercept form</h1>
<h4>Welcome! ${Username}!</h4>
</body>
</html>
