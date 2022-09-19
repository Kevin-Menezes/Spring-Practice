<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 23-08-2022
  Time: 12:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>
        .error{
            color: red;
            position: fixed;
            text-align: left;
            margin-left: 10px;
        }
    </style>
    <script>

        function validateForm(){
            let name = document.getElementById("YourName").value;
            if (name.length <= 2){
                alert("Your name should have more than 2 characters!")
                return false;
            }

            let crush = document.getElementById("CrushName").value;
        }

    </script>
</head>
<body>
    <h1 align="center">Love Calculator</h1><hr/>

    <div align="center">
        <form:form action="process-form" method="post" modelAttribute="UserDetails">
            <label for="YourName">Your Name : </label>
            <form:input id="YourName" path="username"/>
            <form:errors path="username" cssClass="error"/>
            <br/><br/>

            <label for="CrushName">Crush Name : </label>
            <form:input id="CrushName" path="crushname"/>
            <form:errors path="crushname" cssClass="error"/>
            <br/><br/>

            <form:checkbox id="terms" path="termsCondition"/>I agree that this is just for fun
            <form:errors path="termsCondition" cssClass="error"/>
            <br/><br/>

            <button type="submit">Submit</button>
        </form:form>
    </div>

</body>
</html>
