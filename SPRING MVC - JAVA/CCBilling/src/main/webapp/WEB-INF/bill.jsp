<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 30-08-2022
  Time: 01:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Billing</title>
</head>
<body>
<h2 align="center">Bill</h2><hr>

<div align="center">
    <form:form action="process-bill" method="post" modelAttribute="BillDetails">
        <label>Credit Card</label>
        <form:input path="card"/>
        <form:errors path="card" cssClass="error"/><br><br>

        <label>Amount</label>
        <form:input path="amount"/>
        <form:errors path="amount" cssClass="error"/><br><br>

        <label>Currency</label>
        <form:input path="currency"/>
        <form:errors path="currency" cssClass="error"/><br><br>

        <label>Date</label>
        <form:input path="date"/>
        <form:errors path="date" cssClass="error"/><br><br>

        <button type="submit">Submit</button>

    </form:form>
</div>


</body>
</html>
