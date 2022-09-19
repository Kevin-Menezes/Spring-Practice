<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 24-08-2022
  Time: 05:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Successful</title>
</head>
<body>
    <h1 align="center">Love Calculator</h1><hr/>
    <h3>The details entered by you are : </h3>

    User : ${UserRegistration.name}<br>
    Name : ${UserRegistration.username}<br>
    Password : ${UserRegistration.password}<br>
    Country : ${UserRegistration.countryname}<br>
    Age : ${UserRegistration.age}<br>
    Hobbies :
    <c:forEach var="temp" items="${UserRegistration.hobbies}">
        ${temp}
    </c:forEach><br/>
    Gender : ${UserRegistration.gender}<br>

    Email : ${UserRegistration.usercommunication.email}<br>

    Phone : ${UserRegistration.usercommunication.phone}

</body>
</html>
