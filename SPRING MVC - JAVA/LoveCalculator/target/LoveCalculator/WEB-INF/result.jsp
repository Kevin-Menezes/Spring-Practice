<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 23-08-2022
  Time: 02:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <h1 align="center">Love Calculator</h1><hr/>
    <p>${UserDetails.username} and ${UserDetails.crushname} are ${UserDetails.answer}</p>

<%--    <a href="/send-email">Send result to your email</a>--%>
    <a href="<c:url value="/send-email"/> ">Send result to your email</a>
</body>
</html>
