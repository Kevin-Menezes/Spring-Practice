<%--
  Created by IntelliJ IDEA.
  User: nivek
  Date: 27-01-2022
  Time: 10:43 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title><c:out value="${page}"></c:out></title>
</head>
<body>
<div class="container ">
    <h1 class="text-center mt-3">To Do Manager</h1>

<%--    Alert message  --%>
    <c:if test="${not empty msg}">
        <div class="alert alert-success">
            <b><c:out value="${msg}"></c:out></b>
        </div>
    </c:if>

    <div class="row mt-5">
        <div class="col-md-2">
            <div class="list-group">
                <a href="" class="list-group-item list-group-item-action active" aria-current="true">
                    Menu
                </a>
                <a href="<c:url value='/add'></c:url>" class="list-group-item list-group-item-action">Add ToDo</a>
                <a href="<c:url value='/home'></c:url>" class="list-group-item list-group-item-action">View ToDo</a>
            </div>
        </div>
        <div class="col-md-10">

            <%-- This is like else-if --%>
            <c:choose>
                <%-- If --%>
                <c:when test="${page=='home'}">
                    <h1 class="text-center">View ToDos</h1>

                    <%--Iterating through the list--%>
                    <c:forEach items="${todoslist}" var="t">

                        <div class="card mb-4">
                            <div class="card-body">
                                <h3><c:out value="${t.todoTitle}"></c:out></h3>
                                <p><c:out value="${t.todoContent}"></c:out> </p>
                            </div>
                        </div>

                    </c:forEach>

                </c:when>

                <%-- else if --%>
                <c:when test="${page=='add'}">
                    <h1 class="text-center">Add ToDos</h1>
                </c:when>

                <%-- else --%>
                <c:otherwise>
                    <h1 class="text-center">View ToDos</h1>

                    <c:forEach items="${todoslist}" var="t">

                        <div class="card mb-4">
                            <div class="card-body">
                                <h3><c:out value="${t.todoTitle}"></c:out></h3>
                                <p><c:out value="${t.todoContent}"></c:out> </p>
                            </div>
                        </div>

                    </c:forEach>

                </c:otherwise>
            </c:choose>

            <%--Form--%>
            <form action="saveTodo" method="post">

                <div class="form-group">
                    <input type="text" class="form-control" name="todoTitle" placeholder="Enter title"/>
                </div>

                <div class="form-group mt-4">
                    <textarea class="form-control" name="todoContent" placeholder="Enter your content" rows="4"></textarea>
                </div>

                <div class="container text-center mt-4">
                    <button class="btn btn-outline-success">Add Todo</button>
                </div>

            </form>

        </div>

    </div>
</div>








<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>
