<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 02-09-2022
  Time: 09:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email</title>
</head>
<body>
    <h3>Hi ${UserDetails.username}</h3>

    <h3>Send result to email</h3>
    <form:form action="process-email" method="post" modelAttribute="email">
        <label>Enter your email : </label>
        <form:input path="useremail"/>

        <button type="submit">Submit</button>
    </form:form>

</body>
</html>
