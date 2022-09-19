<%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 31-08-2022
  Time: 12:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bill Receipt</title>
</head>
<body>
    <h2 align="center">Bill</h2><hr>
    <h4>Bill against the credit card number ${BillDetails.card} amounted to ${BillDetails.amount}${BillDetails.currency.displayName} on ${BillDetails.date}</h4>


</body>
</html>
