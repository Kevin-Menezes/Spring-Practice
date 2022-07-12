<%@ page import="org.entities.Contact" %>
<%@ page import="java.util.List" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Manager Home</title>
</head>

<body>
<h1>Contact Manager Application</h1>

<div align="center">
    <h1>Contact List</h1>
    <h3><a href="new">New Contact</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>No.</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${ContactList}" var="contact" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${contact.name}</td>
                <td>${contact.email}</td>
                <td>${contact.address}</td>
                <td>${contact.phone}</td>
                <td>
                    <a href="edit?id=${contact.id}">Edit</a>&nbsp;&nbsp;
                    <a href="delete?id=${contact.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>

<%--        We can do it by the below thing also     --%>
<%--        <% List<Contact> c = (List<Contact>) request.getAttribute("ContactList"); %>--%>
<%--        <h4>Name is : ${ContactList}</h4>--%>
    </table>
</div>



</body>
</html>
