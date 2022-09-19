<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 24-08-2022
  Time: 02:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <style>
        .error{
            color: red;
            position: fixed;
            text-align: left;
            margin-left: 10px;
        }
    </style>
</head>
<body>
    <h1 align="center">Love Calculator</h1><hr/>

    <div align="center">
        <form:form action="process-registration" method="post" modelAttribute="UserRegistration">
            <label>User : </label>
            <form:input path="name"/>
            <form:errors path="name" cssClass="error"/>
            <br/><br/>

            <label>Username : </label>
            <form:input path="username"/>
            <form:errors path="username" cssClass="error"/>
            <br/><br/>

            <label>Password : </label>
            <form:password path="password"/>
            <form:errors path="password" cssClass="error"/>
            <br/><br/>

            <label>Country : </label>
            <form:select path="countryname">
                <form:option value="Ind">India</form:option>
                <form:option value="Usa">USA</form:option>
                <form:option value="Lon">London</form:option>
                <form:option value="Dub">Dubai</form:option>
            </form:select>
            <form:errors path="countryname" cssClass="error"/>
            <br/><br/>

            <label>Age : </label>
            <form:input path="age"/>
            <form:errors path="age" cssClass="error"/>
            <br/><br/>

            <label>Hobbies : </label>
            Sports<form:checkbox path="hobbies" value="sports"/>
            Singing<form:checkbox path="hobbies" value="singing"/>
            Dancing<form:checkbox path="hobbies" value="dancing"/>
            Drawing<form:checkbox path="hobbies" value="drawing"/>
            Travel<form:checkbox path="hobbies" value="travel"/>
            <form:errors path="hobbies" cssClass="error"/>
            <br/><br/>

            <label>Gender : </label>
            Male<form:radiobutton path="gender" value="male"/>
            Female<form:radiobutton path="gender" value="female"/>
            <form:errors path="gender" cssClass="error"/>
            <br/><br/>

            <div align="center">
                <label>Email : </label>
                <form:input path="usercommunication.email"/>
                <form:errors path="usercommunication.email" cssClass="error"/>
                <br/><br/>

                <label>Phone : </label>
                <form:input path="usercommunication.phone" placeholder="Eg. 91-945830253"/>
                <form:errors path="usercommunication.phone" cssClass="error"/>
                <br/><br/>
            </div>

            <button type="submit">Submit</button>

        </form:form>
    </div>

</body>
</html>
